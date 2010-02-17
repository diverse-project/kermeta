/* $Id: TypeMatchChecker.java,v 1.16 2009-01-23 15:52:03 moha Exp $
 * Project : Kermeta io
 * File : TypeMatchChecker.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 14 Nov. 2006
 * Authors : 
 *		Jim Steel
 *
 * Modification date : 12 Nov. 2008
 * Authors : 
 * 		Naouel Moha
 */

package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.ModelTypeHelper;

//import com.sun.net.ssl.internal.ssl.Debug;

/**
 * Evaluate whether a model type is a match for another, and determine the
 * binding of their types.
 * 
 * The main method returns a boolean, indicating whether the match is valid. If
 * it is, the pairwise type matching may be accessed as a hashtable. If not,
 * then the errors which result in the non-match may be accessed as a list.
 * 
 * @author jsteel
 * 
 */
public class TypeMatchChecker {

	final static public Log internalLog = LogConfigurationHelper
			.getLogger("TypeMatchChecker");
	private Collection<Binding> candidates;
	private Collection<Dependency> dependencies;
	private ModelType required;
	private ModelType provided;
	private Collection<Class> required_classes;

	private boolean isRequired(
			fr.irisa.triskell.kermeta.language.structure.Class cls) {
		SimpleType simp = new SimpleType(cls);
		for (Class req : required_classes) {
			if (simp.equals(new SimpleType(req))) {
				return true;
			}
		}
		return false;
	}

	private Collection<Class> provided_classes;
	private Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> result_match;
	private List<TypeDoesNotMatchError> errors;
	// Naouel
	private List<String> debugMsg;

	/**
	 * @deprecated
	 * @param required
	 * @param provided
	 * @param initialBindings
	 * @return
	 */
	public static Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> match(
			ModelType required,
			ModelType provided,
			Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> initialBindings) {
		TypeMatchChecker matcher = new TypeMatchChecker(required, provided);
		matcher.buildCandidates(initialBindings);
		matcher.processCandidates();
		matcher.evaluateCandidates();
		if (matcher.getErrors().isEmpty()) {
			Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> result;
			result = new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>();
			for (Binding b : matcher.getCandidates()) {
				result.put(b.getFrom(), b.getTo());
			}
			return result;
		} else {
			// TODO do something with the errors!
			return null;
		}
	}

	public TypeMatchChecker(ModelType required, ModelType provided) {
		this.required = required;
		this.provided = provided;
		dependencies = new HashSet<Dependency>();
		errors = new ArrayList<TypeDoesNotMatchError>();
		// Naouel
		debugMsg = new ArrayList<String>();
	}

	public boolean matches(
			Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> initialBindings) {
		// TODO Optimise here for identity and basetype matching...
		buildCandidates(initialBindings);
		processCandidates();
		evaluateCandidates();
		if (getErrors().isEmpty()) {
			// Hashtable<fr.irisa.triskell.kermeta.language.structure.Class,
			// fr.irisa.triskell.kermeta.language.structure.Class> result;
			result_match = new Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class>();
			for (Binding b : getCandidates()) {
				result_match.put(b.getFrom(), b.getTo());
			}
			// System.err.println("------ " +
			// provided.getTypeDefinition().getName() + " <# " +
			// required.getTypeDefinition().getName() + "-----------");
			return true;
		} else {
			// Naouel : code �crit par Didier pour d�bugger
			IOPlugin.internalLog
					.error("Macth error : trying to display initialBindings");
			for (fr.irisa.triskell.kermeta.language.structure.Class c : initialBindings
					.keySet()) {
				IOPlugin.internalLog.error("   initialBinding : " + c.getName()
						+ "->" + initialBindings.get(c).getName());
			}
			return false;
		}

	}

	public void buildCandidates(
			Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> initialBindings) {

		candidates = new HashSet<Binding>();

		// Get a list of all the virtual types from the required model type
		required_classes = TypeMatchChecker.getContainedTypes(required);
		provided_classes = TypeMatchChecker.getContainedTypes(provided);

		for (Class req : required_classes) {
			// first check if its bound in initialBindings
			boolean bound = false;
			// We can't just do a get() on initialBindings because it uses
			// instances of Class
			// that are semantically equal to those in required/provided_types
			// but not equals(),
			// since the method is not overriden on Class. So, we have to
			// iterate and evaluate
			// using the TypeEqualityChecker.
			for (Entry<Class, Class> ent : initialBindings.entrySet()) {
				if (TypeEqualityChecker.equals(ent.getKey(), req)) {
					if (bound) {
						throw new Error("Duplicate initial binding for "
								+ ent.getKey().getName()
								+ " in model type match of "
								+ provided.getName() + " against "
								+ required.getName());
					}
					bound = true;
					boolean found = false;
					for (Type prov : provided_classes) {
						if (TypeEqualityChecker
								.equals(ent.getValue(), provided)) {
							if (found) {
								throw new Error(
										"Very unexpected error while type matching: the model type has the 'same' type twice!!!");
							}
							candidates.add(new Binding((Class) prov,
									(Class) req));
							found = true;
						}
					}
					if (!found) {
						throw new Error("Unable to find type binding "
								+ ((Class) ent.getValue()).getName()
								+ " in model type match of "
								+ provided.getName() + " against "
								+ required.getName());
					}
				}
			}
			if (!bound) {
				// All possibilities into the candidates list!
				for (Type prov : provided_classes) {
					if (!(prov instanceof DataType)) {
						candidates.add(new Binding((Class) prov, (Class) req));
					}
				}
			}
		}

	}

	public void processCandidates() {
		// Because I'm doing horrible things to the candidates collection during
		// this method,
		// I can't use for-each or Iterator iteration, so I'm going to make a
		// copy of the initial
		// collection and iterate over that while changing the real one.
		Collection<Binding> initial_candidates = new HashSet<Binding>(
				candidates);
		for (Binding b : initial_candidates) {
			if (candidates.contains(b)) {
				boolean fail = false;
				Collection<Dependency> new_deps = new HashSet<Dependency>();
				SimpleType r_type = new SimpleType(b.getFrom());
				SimpleType p_type = new SimpleType(b.getTo());
				String rdef = b.getFrom().getTypeDefinition().getName();
				String pdef = b.getTo().getTypeDefinition().getName();
				debugMsg.clear();
				debugMsg.add("Required type: <" + r_type + ">");
				debugMsg.add("Provided type: <" + p_type + ">");
				debugMsg.add("--------------------------------------------------------------------");
				for (CallableProperty r_prop : (ArrayList<CallableProperty>) r_type
						.callableProperties()) {
					// moha : Nov 2008
					// Avant : CallableProperty p_prop = p_type.getPropertyByName(r_prop.getName());
					// BEGIN modification	 
					CallableProperty p_prop = null;
					String valueRenameTag = null;

					valueRenameTag = TypeMatchChecker.getValueRenameTag(r_prop);

					if (valueRenameTag == null) {
						p_prop = p_type.getPropertyByName(r_prop.getName());
					} else {
						Map<String, String> elemsTag = ModelTypeHelper.getElemsValueRenameTag(valueRenameTag);
						if (elemsTag.containsKey(this.provided.getName())) {
							String newNameTag = elemsTag.get(this.provided
									.getName());
							p_prop = p_type.getPropertyByName(newNameTag);
						} else {
							p_prop = p_type.getPropertyByName(r_prop.getName());
						}
					}
					// END modification
					
					debugMsg.add(">> Required property: " + r_prop.property + "");
					if (p_prop == null) {
						debugMsg.add("   provided property: null");
					} else {
						debugMsg.add("   provided property: " + p_prop.property);
					}
					// Optimisation
					if (r_prop.equals(p_prop)) {
						// Hate to use continue, but the alternative is a
						// nuisance
						continue;
					}
					if (p_prop == null) {
						// Check names
						debugMsg.add("   ----------- (p_prop == null)");
						debugMsg.add("      r_prop.getName() : " + r_prop.getName()
								+ "\n");
						fail = true;
					} else if (!multiplicityMatch(p_prop.property,
							r_prop.property)) {
						// check multiplicities
						debugMsg
								.add("   ----------- (!TypeMatchChecker.multiplicityMatch(p_prop.property, r_prop.property))"
										+ "\n");
						fail = true;
					} else if (!r_prop.property.isIsReadOnly()
							&& p_prop.property.isIsReadOnly()) {
						// readonlies can't match writables
						debugMsg
								.add("   ----------- (!r_prop.property.isIsReadOnly() && p_prop.property.isIsReadOnly())"
										+ "\n");
						fail = true;
					} else if (p_prop.property.isIsComposite() != r_prop.property
							.isIsComposite()) {
						// TODO For the moment, insist on identical containment
						debugMsg
								.add("   ----------- (p_prop.property.isIsComposite() != r_prop.property.isIsComposite())"
										+ "\n");
						fail = true;
					} else if (!fail && (r_prop.property.getOpposite() != null)) {
						if (null == p_prop.property.getOpposite()) {
							// Oneway properties don't match associations (fails
							// mutual membership guarantee)
							debugMsg
									.add("   ----------- (!fail && (r_prop.property.getOpposite() != null)) { if (null == p_prop.property.getOpposite()) {"
											+ "\n");
							fail = true;
						} else if (!p_prop.property
								.getOpposite()
								.getName()
								.equals(r_prop.property.getOpposite().getName())) {
							// Not just enough to be an association, have to be
							// the same association
							debugMsg
									.add("   ----------- (!fail && (r_prop.property.getOpposite() != null)) { if (!p_prop.property.getOpposite().getName().equals(r_prop.property.getOpposite().getName()))"
											+ "\n");
							fail = true;
						}
					}
					if (!fail
							&& (r_prop.getProperty().getType() instanceof DataType)) {
						// TODO For the moment, insist on identical enums, could
						// virtualize them at some point
						// TODO Need to test whether this is sufficient for
						// primitive types
						if (!TypeEqualityChecker.equals(r_prop.getProperty()
								.getType(), p_prop.getProperty().getType())) {
							debugMsg
									.add("   ----------- (!fail && (r_prop.getProperty().getType() instanceof DataType)) { if (!TypeEqualityChecker.equals(r_prop.getProperty().getType(), p_prop.getProperty().getType()))"
											+ "\n");
							fail = true;
						}
						// The absence of a proper .equals() on Class is the
						// bane of my already-miserable existence
					} else if (!fail
							&& isRequired((Class) r_prop.getProperty()
									.getType())) {
						// Need to make prop_type_binding
						Class p_propType = (Class) p_prop.getProperty()
								.getType();
						Class r_propType = (Class) r_prop.getProperty()
								.getType();
						Binding prop_type_binding = new Binding(p_propType,
								r_propType);
						if (!candidates.contains(prop_type_binding)) {
							// Naouel : Look for all subclasses of p_prop in the
							// candidates that are binded with r_prop
							Collection<Binding> bindWithSubclasses = buildBindingWithSubclasses(
									b, r_propType, p_propType);
							if (bindWithSubclasses.isEmpty()) {
								debugMsg
										.add("   ----------- (!fail && isRequired((Class) r_prop.getProperty().getType())) { if (!candidates.contains(prop_type_binding)) }");
								debugMsg
										.add("      r_prop.getProperty().getType(): "
												+ r_prop.getProperty().getType());
								debugMsg.add("      Binding prop_type_binding: "
										+ prop_type_binding
										+ "\n");
								fail = true;
							} else {
								for (Binding bindSubClass : bindWithSubclasses) {
									new_deps.add(new SimpleDependency(b,
											bindSubClass));
								}
							}
						} else {
							new_deps.add(new SimpleDependency(b,
									prop_type_binding));
						}
					} else if (!fail) {
						// Its just a normal class - need subtyping - use the
						// TypeConformanceChecker
						if (!TypeConformanceChecker.conforms(r_prop
								.getProperty().getType(), p_prop.getProperty()
								.getType())) {
							debugMsg
									.add("   ----------- (!fail) { if (!TypeConformanceChecker.conforms(r_prop.getProperty().getType(), p_prop.getProperty().getType())) } "
											+ "\n");
							fail = true;
						}
					}
				}
				// If its already failed on the properties, don't bother
				// torturing ourselves on the operations
				if (!fail) {
					for (CallableOperation r_op : (ArrayList<CallableOperation>) r_type
							.callableOperations(null)) {
						CallableOperation p_op = p_type.getOperationByName(r_op
								.getName(), null);
						// must calculate the isRequired separatlety because the
						// type may be not a class (ex: funtiontype ...)
						boolean isClassRequired = false;
						if (r_op.getType(null).getFType() instanceof Class)
							isClassRequired = isRequired((Class) r_op.getType(
									null).getFType());
						if (r_op.equals(p_op)) {
							// Hate to use continue, but the alternative is a
							// nuisance
							continue;
						}
						if (null == p_op) {
							// Check names
							debugMsg.add("   ----------- (null == p_op) {" + "\n");
							fail = true;
						} else if (!multiplicityMatch(p_op.operation,
								r_op.operation)) {
							// Check multiplicity of return types
							debugMsg
									.add("   ----------- (!TypeMatchChecker.multiplicityMatch(p_op.operation, r_op.operation,debugMsg)) "
											+ "\n");
							fail = true;
						} else if (p_op.getReturnType().getFType() instanceof DataType) {
							// TODO Could virtualize enums in future
							// TODO Test whether this is ok for primitives
							if (p_op.getReturnType() != r_op.getReturnType()) {
								debugMsg
										.add("   ----------- (p_op.getReturnType().getFType() instanceof DataType)"
												+ "\n");
								fail = true;
							}
						} else if (!fail && isClassRequired) {
							Binding op_type_binding = new Binding((Class) p_op
									.getType(null).getFType(), (Class) r_op
									.getType(null).getFType());
							if (!candidates.contains(op_type_binding)) {
								debugMsg.add("   ----------- (!fail && isClassRequired)"
										+ "\n");
								fail = true;
							} else {
								new_deps.add(new SimpleDependency(b,
										op_type_binding));
							}
						} else if (!fail) {
							// Just a normal class - subtype check
							if (!TypeConformanceChecker.conforms(r_op.getType(
									null).getFType(), p_op.getType(null)
									.getFType())) {
								debugMsg
										.add("   ----------- (!fail) { if (!TypeConformanceChecker.conforms(r_op.getType(null).getFType(), p_op.getType(null).getFType())) }"
												+ "\n");
								fail = true;
							}
						}
						// If its died on the return type, don't bother with
						// parameters
						if (!fail) {
							// Check that there are the right number of
							// parameters
							if (p_op.getOperation().getOwnedParameter().size() != r_op
									.getOperation().getOwnedParameter().size()) {
								debugMsg
										.add("   ----------- (p_op.getOperation().getOwnedParameter().size() != r_op.getOperation().getOwnedParameter().size()) "
												+ "\n");
								fail = true;
							} else {
								// TODO Fix for virtual types?
								for (int i = 0; i < r_op.getOperation()
										.getOwnedParameter().size(); i++) {
									Parameter r_param = (Parameter) r_op
											.getOperation().getOwnedParameter()
											.get(i);
									Parameter p_param = (Parameter) p_op
											.getOperation().getOwnedParameter()
											.get(i);
									if (!multiplicityMatch(r_param, p_param)) {
										// This is contravariance!
										debugMsg
												.add("   ----------- (!TypeMatchChecker.multiplicityMatch(r_param, p_param, debugMsg)) "
														+ "\n");
										fail = true;
									} else if (r_param.getType() instanceof DataType) {
										if (p_param.getType() != r_op
												.getReturnType()) {
											debugMsg
													.add("   ----------- (r_param.getType() instanceof DataType) { if (p_param.getType() != r_op.getReturnType()) }"
															+ "\n");
											fail = true;
										}
									
									// manage default operations added at execution time
									// when the provided class overwrites those operations
									// (like "equals()", "isInstance()",...)
									} else {
										Collection<Class> p_param_subclasses = TypeMatchChecker
												.getSubclassesOf(
														(Class) p_param
																.getType(),
														provided_classes);
										Collection<Binding> subcandidates = new HashSet<Binding>();
										for (Binding subcand : candidates) {
											// Types match
											if (TypeEqualityChecker.equals(
													subcand.getFrom(), r_param
															.getType())
													&& TypeEqualityChecker
															.equals(
																	subcand
																			.getTo(),
																	p_param
																			.getType())) {
												subcandidates.add(subcand);
											}
											// A subtype matches
											for (Class sub : p_param_subclasses) {
												if (TypeEqualityChecker.equals(
														subcand.getFrom(),
														(Class) r_param
																.getType())
														&& TypeEqualityChecker
																.equals(
																		subcand
																				.getTo(),
																		sub)) {
													subcandidates.add(subcand);
												}
											}
										}
										if (subcandidates.isEmpty()) {
											// There are no instantiable
											// subtypes
											debugMsg
													.add("   ----------- (subcandidates.isEmpty())");
											debugMsg.add("      required operation: " + r_op.getOperation().getName() 
													+ " - required parameter: " + r_param.getName() + " type: " + r_param.getType());
											debugMsg.add("      provided operation: " + p_op.getOperation().getName() 
													+ " - provided parameter: " + r_param.getName() + " type: " + r_param.getType()
													+ "\n");
											fail = true;
										} else {
											new_deps
													.add(new DisjunctiveDependency(
															b, subcandidates));
										}
									}
								}
							}
						}
					}
				}
				if (fail) {
					// System.err.println("Disproving " + b);
					disprove(b);
					System.out
							.println("########################################");
					for (int i = 0; i < debugMsg.size(); i++) {
						System.out.println(debugMsg.get(i));
					}
//					System.out
//							.println("\n");
				} else {
					dependencies.addAll(new_deps);
				}
			} else {
				// This should never happen, but if it does then it's safe to do
				// nothing
			}
		}
	}
	
	

	/**
	 * Get in a String the value associated to a rename tag. 
	 * For example : @rename "UmlMT=packagedElement kermetaMT=ownedTypeDefinition" 
	 *               attribute ownedClass : set MyClass[0..*]
	 * 
	 * Result : "UmlMT=packagedElement kermetaMT=ownedTypeDefinition"
	 * 
	 * @author moha
	 * @since 01/12/2008
	 * 
	 * @param CallableProperty r_prop
	 * @return String
	 */
	private static String getValueRenameTag(CallableProperty r_prop) {

		String valueRenameTag = null;

		for (Tag tag : r_prop.getProperty().getTag()) {
			if (tag.getName().equals("rename")) {
				valueRenameTag = tag.getValue();
				return valueRenameTag;
			}
		}
		// case for aspect, look in the context of the owning class if there is
		// another with the same name
		ClassDefinition classDefinition = r_prop.getProperty().getOwningClass();

		KermetaUnit kermetaUnit = KermetaUnitHelper
				.getKermetaUnitFromObject(classDefinition);
		EList<TypeDefinition> aspectList = kermetaUnit.getAspects().get(
				classDefinition);
		if (aspectList != null) {
			for (TypeDefinition aspect : aspectList) {
				if (aspect instanceof ClassDefinition) {
					List<Property> props = KermetaModelHelper.ClassDefinition
							.getAllProperties((ClassDefinition) aspect);
					for (Property otherProperty : props) {
						if (otherProperty.getName().equals(
								r_prop.getProperty().getName())) {
							for (Tag tag : otherProperty.getTag()) {
								if (tag.getName().equals("rename")) {
									valueRenameTag = tag.getValue();
									return valueRenameTag;
								}
							}
						}
					}
				}
			}
		}

		return valueRenameTag;
	}
	

	public void evaluateCandidates() {
		// First, rule out any duplicates due to subclassing
		Iterator<Binding> b_iter = candidates.iterator();
		while (b_iter.hasNext()) {
			Binding b = b_iter.next();
			boolean hasSuper = false;
			SimpleType simp_from = new SimpleType(b.getFrom());
			SimpleType simp_to = new SimpleType(b.getTo());
			for (Binding sup : candidates) {
				if (!b.equals(sup)
						&& simp_from.equals(new SimpleType(sup.getFrom()))) {
					if ((new SimpleType(sup.getTo())).isSubTypeOf(simp_to)) {
						hasSuper = true;
					}
				}
			}
			if (hasSuper) {
				b_iter.remove();
			}
		}

		for (Class req : required_classes) {
			int match_count = 0;
			SimpleType simp = new SimpleType(req);
			for (Binding b : candidates) {
				if (simp.equals(new SimpleType(b.getFrom()))) {
					match_count++;
				}
			}
			if (match_count == 0) {
				errors.add(new TypeDoesNotMatchError("Model type '"
						+ provided.getName() + "' does not match model type '"
						+ required.getName()
						+ "': no match for required class '"
						+ req.getTypeDefinition().getName() + "'."));
				internalLog.error("Model type '" + provided.getName()
						+ "' does not match model type '" + required.getName()
						+ "': no match for required class '"
						+ req.getTypeDefinition().getName() + "'.");
				for (Binding b : candidates) {
					internalLog.error(" a possible canditate was : "
							+ b.getFrom().getName() + " -> "
							+ b.getTo().getName());
				}
			} else if (match_count > 1) {
				errors.add(new TypeDoesNotMatchError("Model type '"
						+ provided.getName() + "' does not match model type '"
						+ required.getName()
						+ "': ambiguous match for required class '"
						+ req.getTypeDefinition().getName() + "'."));
				for (Binding b : candidates) {
					internalLog.debug("Model type '" + provided.getName()
							+ "' does not match model type '"
							+ required.getName()
							+ "': ambiguous match for required class '"
							+ req.getTypeDefinition().getName() + "'.");
					Class c = b.getFrom();
					SimpleType st = new SimpleType(c);
					if (simp.equals(st)) {
						internalLog.debug("req="
								+ simp.getTypeDefinition().getName()
								+ ", proposed binding: from "
								+ st.getTypeDefinition().getName() + " to "
								+ b.getTo().getTypeDefinition().getName());
						match_count++;
					}
				}
			}
		}
	}

	private void disprove(Binding b) {
		// Can't use fancy java5 for, or even iterators, because there's a
		// strong possibility of
		// the collection changing while we iterate, either from within the loop
		// or from an on-call
		// of disprove
		// System.err.println(" -- Disproving" + b);
		Iterator<Dependency> dep_iter = new HashSet<Dependency>(dependencies)
				.iterator();
		while (dep_iter.hasNext()) {
			Dependency d = dep_iter.next();
			if (dependencies.contains(d) && d.disprove(b)) {
				// System.err.println(d);
				if (candidates.contains(d.getConclusion())) {
					candidates.remove(d.getConclusion());
					// We've been here, done this already
					this.disprove(d.getConclusion());
				}
				dependencies.remove(d);
			}
		}
		candidates.remove(b);
	}

	public class Binding {
		private fr.irisa.triskell.kermeta.language.structure.Class from;
		private fr.irisa.triskell.kermeta.language.structure.Class to;

		public Binding(fr.irisa.triskell.kermeta.language.structure.Class to,
				fr.irisa.triskell.kermeta.language.structure.Class from) {
			this.from = from;
			this.to = to;
		}

		/**
		 * @return the from
		 */
		public fr.irisa.triskell.kermeta.language.structure.Class getFrom() {
			return from;
		}

		/**
		 * @return the to
		 */
		public fr.irisa.triskell.kermeta.language.structure.Class getTo() {
			return to;
		}

		public boolean equals(Object b) {
			if (super.equals(b)) {
				return true;
			}
			if (b instanceof Binding) {
				// return (TypeEqualityChecker.equals(from, ((Binding)
				// b).getFrom()) && TypeEqualityChecker.equals(to, ((Binding)
				// b).getTo()));
				return (from.equals(((Binding) b).getFrom()) && to
						.equals(((Binding) b).getTo()));
			}
			return false;
			// return (from.equals(b.getFrom()) && to.equals(b.getTo()));
		}

		/**
		 * Bindings that are equal() should have the same hashcode
		 */
		public int hashCode() {
			int code = 11;
			code += 37 * (null == from ? 0 : from.hashCode());
			code += 37 * (null == from ? 0 : to.hashCode());
			return code;
		}

		/**
		 * Useful for debug!
		 */
		public String toString() {
			return ("[" + from.getTypeDefinition().getName() + ", "
					+ to.getTypeDefinition().getName() + "]");
		}
	}

	private abstract class Dependency {
		private Binding conclusion;

		public Dependency(Binding concl) {
			this.conclusion = concl;
		}

		/**
		 * @return the conclusion
		 */
		public Binding getConclusion() {
			return conclusion;
		}

		/**
		 * Given that b is a binding that is false, is the dependency disproven?
		 * 
		 * @param b
		 * @return
		 */
		public abstract boolean disprove(Binding b);
	}

	private class SimpleDependency extends Dependency {
		private Binding premise;

		public SimpleDependency(Binding concl, Binding premise) {
			super(concl);
			this.premise = premise;
		}

		public boolean disprove(Binding b) {
			return b.equals(premise);
		}

		public String toString() {
			return premise.toString() + " --> " + getConclusion().toString();
		}
	}

	private class DisjunctiveDependency extends Dependency {
		private Collection<Binding> premises;

		public DisjunctiveDependency(Binding concl, Collection<Binding> premises) {
			super(concl);
			this.premises = premises;
		}

		public boolean disprove(Binding b) {
			if (premises.contains(b)) {
				premises.remove(b);
			}
			return premises.isEmpty();
		}

		public String toString() {
			StringBuffer result = new StringBuffer();
			if (premises.size() == 1) {
				result.append(premises.toArray()[0].toString());
			} else {
				result.append("( ");
				for (Binding b : premises) {
					result.append(b.toString() + ", ");
				}
				result.append(" )");
			}
			result.append(" --> " + getConclusion());
			return result.toString();
		}
	}

	/**
	 * @description Verify if there exists in the candidates list, a binding
	 *              between r_prop and a subclass of p_prop if yes, build a
	 *              binding between r_prop and the subclass Special case : if
	 *              the classes targeted by b.getTo() and p_propType are
	 *              distinct
	 * @author Naouel Moha
	 * @date 2008/11/12
	 * 
	 * @return Collection<Binding> : bindings between r_prop and all subclasses
	 *         of p_prop
	 */
	private Collection<Binding> buildBindingWithSubclasses(Binding b,
			Class r_propType, Class p_propType) {
		ClassDefinition r_classDef = (ClassDefinition) r_propType
				.getTypeDefinition();
		ClassDefinition p_classDef = (ClassDefinition) p_propType
				.getTypeDefinition();

		Boolean distinctClasses = false;

		if (b.getTo().equals(p_propType)) {
			distinctClasses = true;
		} else {
			distinctClasses = false;
		}

		Collection<Binding> bindWithSubclasses = new HashSet<Binding>();

		for (Binding subcand : candidates) {
			Boolean isSubClass = false;
			Boolean distinctSubClass = false;

			Class cFrom = subcand.getFrom();
			ClassDefinition cFromClassDef = (ClassDefinition) cFrom
					.getTypeDefinition();

			if (r_classDef.equals(cFromClassDef)) {
				Class cTo = subcand.getTo();
				ClassDefinition cToClassDef = (ClassDefinition) cTo
						.getTypeDefinition();

				isSubClass = ClassDefinitionHelper.isSuperClassOfByName(
						p_classDef, cToClassDef);
				
				if (b.getTo().equals(cTo)) {
					distinctSubClass = true;
				} else {
					distinctSubClass = false;
				}
				
				if (isSubClass && (distinctClasses==distinctSubClass)) {
					bindWithSubclasses.add(new Binding(cTo, r_propType));
				}
			}
		}
		return bindWithSubclasses;
	}

	/**
	 * @return the errors
	 */
	public List<TypeDoesNotMatchError> getErrors() {
		return errors;
	}

	/**
	 * @return the candidates
	 */
	public Collection<Binding> getCandidates() {
		return candidates;
	}

	// Naouel : I add the parameter debugMsg
	private boolean multiplicityMatch(MultiplicityElement provided,
			MultiplicityElement required) {
//		debugMsg.add("\n\n# Begin # multiplicityMatch: \n");
		// debugMsg.add("  ElemProvided: " + provided + "\n" +
		// "  ElemRequired: " + required + "\n");

		// Singles must match singles
		if ((required.getUpper() == 1) && (provided.getUpper() != 1)) {
			debugMsg
					.add("   ----------- ((required.getUpper() == 1) && (provided.getUpper() != 1))"
							+ "\n");
			debugMsg.add("      ElemRequired  : " + required + "\n" +
						"      ElemProvided  : " + provided + "\n");
			return false;
		}
		// Multiples must match multiples
		if ((required.getUpper() != 1) && (provided.getUpper() == 1)) {
			debugMsg
					.add("   ----------- ((required.getUpper() != 1) && (provided.getUpper() == 1))"
							+ "\n");
			debugMsg.add("      ElemRequired  : " + required + "\n" +
						"      ElemProvided  : " + provided + "\n");
			return false;
		}
		// Unbounded means any smaller upper bound (except upper bound = 1) will
		// fit
		if (required.getUpper() == -1) {
			if (provided.getUpper() == 1) {
				// not accepted because in this case, code written for
				// collection won't work
				debugMsg
						.add("   ----------- (required.getUpper() == -1) { if (provided.getUpper() == 1) "
								+ "\n");
				debugMsg.add("      ElemRequired  : " + required + "\n" +
							"      ElemProvided  : " + provided + "\n");
				return false;
			}
		} else {
			// If the required is upper-bounded, the provided must have a lesser
			// bound (in order that the 'subtype' be a subset)
			if (provided.getUpper() != -1) {
				if (provided.getUpper() > required.getUpper()) {
					debugMsg
							.add("   -----------  (provided.getUpper() != -1) { if (provided.getUpper() > required.getUpper()) "
									+ "\n");
					debugMsg.add("      ElemRequired  : " + required + "\n" +
								"      ElemProvided  : " + provided + "\n");
					return false;
				}
			} else if (required.getUpper() != -1) {
				// if provided is unbound, only unbound required are ok
				debugMsg
						.add("   ----------- (required.getUpper() != -1) " + "\n");
				debugMsg.add("      ElemRequired  : " + required + "\n" +
							"      ElemProvided  : " + provided + "\n");
				return false;
			}
		}
		// Higher lower bound is acceptable
		if (provided.getLower() < required.getLower()) {
			debugMsg.add("   ----------- (provided.getLower() < required.getLower()) "
					+ "\n");
			debugMsg.add("      ElemRequired  : " + required + "\n" +
						"      ElemProvided  : " + provided + "\n");
			return false;
		}
		// insist on identical uniqueness
		if (provided.isIsUnique() != required.isIsUnique()) {
			debugMsg
					.add("   ----------- (provided.isIsUnique() != required.isIsUnique()) "
							+ "\n");
			debugMsg.add("      ElemRequired  : " + required + "\n" +
						"      ElemProvided  : " + provided + "\n");
			return false;
		}
		// an ordered provided can match an unordered required, other case are
		// rejected
		if (required.getUpper() != 1) {
			if (required.isIsOrdered() && !provided.isIsOrdered()) {
				debugMsg
						.add("   ----------- (required.getUpper() != 1) { (required.isIsOrdered() && !provided.isIsOrdered()) }"
								+ "\n");
				debugMsg.add("      ElemRequired  : " + required + "\n" +
							"      ElemProvided  : " + provided + "\n");
				return false;
			}
		}
//		debugMsg.add("\n\n# End # multiplicityMatch: \n");
		return true;
	}

	/**
	 * Return the set of types contained by a model type definition, as given by
	 * substituting the unbound type parameters on class definitions with those
	 * from the model type.
	 * 
	 * @param mtype
	 * @param binding
	 * @return
	 */
	protected static Collection<Class> getContainedTypes(ModelType mtype) {
		ArrayList<Class> result = new ArrayList<Class>();

		// Get a handle on how the model type is type-parameterized, in order to
		// pass the bindings down
		// to any parameterized classes that use the same bindings...
		// TODO This part is dodgy, and we all hope it never gets used.
		// Hashtable<ObjectTypeVariable, Type> mtbinding =
		// TypeVariableEnforcer.getTypeVariableBinding(mtype);
		// Hashtable<String,ObjectTypeVariable> mtvarnames = new
		// Hashtable<String,ObjectTypeVariable>();
		// Iterator<ObjectTypeVariable> mtvars = mtbinding.keySet().iterator();
		// while (mtvars.hasNext()) {
		// ObjectTypeVariable mtvar = mtvars.next();
		// mtvarnames.put(mtvar.getName(), mtvar);
		// }
		StructureFactory struct_factory = StructurePackageImpl.init()
				.getStructureFactory();

		Iterator<TypeDefinition> tdefs = mtype.getIncludedTypeDefinition()
				.iterator();
		while (tdefs.hasNext()) {
			TypeDefinition tdef = tdefs.next();
			if (tdef instanceof DataType) {
				// Don't add datatypes - just assume they will be the same
				// types...
				// result.add((DataType) tdef);
			} else if (tdef instanceof ClassDefinition) {
				ClassDefinition cdef = (ClassDefinition) tdef;
				fr.irisa.triskell.kermeta.language.structure.Class new_class = struct_factory
						.createClass();
				new_class.setTypeDefinition(cdef);
				if (!cdef.getTypeParameter().isEmpty()) {
					throw new Error("Generic class " + cdef.getName()
							+ " found in model type " + mtype.getName());
				}
				// Hashtable cbinding = new Hashtable<ObjectTypeVariable,
				// Type>();
				// Iterator<ObjectTypeVariable> cdefvars =
				// cdef.getTypeParameter().iterator();
				// while (cdefvars.hasNext()) {
				// ObjectTypeVariable ctvar = cdefvars.next();
				// //find the model type definition's variable with the same
				// name
				// ObjectTypeVariable mtvar = mtvarnames.get(ctvar.getName());
				// if (mtvar == null) {
				// throw new Error("Unbound type variable on class " +
				// cdef.getName() + " in model type " + mtype.getName());
				// }
				// cbinding.put(ctvar, mtbinding.get(mtvar));
				// TypeVariableBinding pbinding =
				// struct_factory.createTypeVariableBinding();
				// pbinding.setVariable(ctvar);
				// // FIXME: Do I need to call getBoundType here?
				// pbinding.setType(mtbinding.get(mtvar));
				// new_class.getTypeParamBinding().add(pbinding);
				// }
				result.add(new_class);
			} else {
				throw new Error("Unrecognised TypeDefinition " + tdef.getName()
						+ " in model type " + mtype.getName());
			}
		}
		return result;
	}

	private static Collection<Class> getSubclassesOf(Class cls,
			Collection<Class> fromList) {
		Collection<Class> result = new HashSet<Class>();
		SimpleType simp = new SimpleType(cls);
		for (Class sub_cls : fromList) {
			SimpleType simp_sub = new SimpleType(sub_cls);
			if (simp_sub.isSubTypeOf(simp)) {
				result.add(sub_cls);
			}
		}
		return result;
	}

	/**
	 * @return the result_match
	 */
	public Hashtable<fr.irisa.triskell.kermeta.language.structure.Class, fr.irisa.triskell.kermeta.language.structure.Class> getResultMatch() {
		return result_match;
	}

}
