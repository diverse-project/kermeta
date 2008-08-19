package kermeta.standard.helper;

import org.kermeta.compil.runtime.helper.basetypes.CollectionUtil;

/**
 *
 * @generated
 */
public class RealWrapper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double plus(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_98 = false;
		idIfCond_98 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_98) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.plus(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double mult(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_99 = false;
		idIfCond_99 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_99) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.times(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double minus(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_100 = false;
		idIfCond_100 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_100) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.minus(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer toInteger(

	java.lang.Double self

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.RealUtil
				.toInteger(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double uminus(

	java.lang.Double self

	) {

		java.lang.Double result = null;

		result = kermeta.standard.helper.RealWrapper.minus(
				kermeta.standard.helper.IntegerWrapper.toReal(0), self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean equals(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_101 = false;
		idIfCond_101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_101) {

			java.lang.Boolean idIfCond_102 = false;
			idIfCond_102 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_102) {

				result = kermeta.standard.helper.RealWrapper
						.equals(
								self,
								kermeta.standard.helper.IntegerWrapper
										.toReal(((java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														other,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"java.lang.Integer")))));
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.equals(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double div(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_103 = false;
		idIfCond_103 = kermeta.standard.helper.RealWrapper.equals(other,
				kermeta.standard.helper.IntegerWrapper.toReal(0));

		if (idIfCond_103) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_104 = false;
		idIfCond_104 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_104) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.div(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer compareTo(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_105 = false;
		idIfCond_105 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_105) {

			java.lang.Boolean idIfCond_106 = false;
			idIfCond_106 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_106) {

				result = kermeta.standard.helper.RealWrapper
						.compareTo(
								self,
								kermeta.standard.helper.IntegerWrapper
										.toReal(((java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														other,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"java.lang.Integer")))));
			} else {

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							((kermeta.standard.NotComparableException) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.standard.NotComparableException")));

			}

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.RealUtil
					.compareTo(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.Double self

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RealUtil
				.toString(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLower(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isLower(self
				.compareTo(other), 0);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isGreaterOrEqual(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(self
				.compareTo(other), 0);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLowerOrEqual(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(self
				.compareTo(other), 0);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isGreater(

	java.lang.Double self, java.lang.Double other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreater(self
				.compareTo(other), 0);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isSet(

	java.lang.Double self, kermeta.language.structure.Property property

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isSet(self, property);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Double self, kermeta.language.structure.Class cl

	) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).equals(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("cl"));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object get(

	java.lang.Double self, kermeta.language.structure.Property property

	) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(
				self, property);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Class getMetaClass(

	java.lang.Double self

	) {

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void set(

	java.lang.Double self, kermeta.language.structure.Property property,
			java.lang.Double element

	) {

		java.lang.Boolean idIfCond_107 = false;
		idIfCond_107 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"property.getType()"));

		if (idIfCond_107) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(self,
					property, element);
		} else {

			kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.IncompatibleTypeError"));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													"IncompatibleTypeError : Cannot set property ",
																													property
																															.getName()),
																									" of object "),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.toString(self)),
																	" to "),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toString(element)),
									"."));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isFrozen(

	java.lang.Double self

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isFrozen(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer hashcode(

	java.lang.Double self

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.hashcode(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void checkInvariants(

	java.lang.Double self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getClassDefinition();

		java.lang.Boolean idIfCond_108 = false;
		idIfCond_108 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_108) {

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_109 = false;
			while (!idLoopCond_109) {
				idLoopCond_109 = it_ft18.isOff();
				;
				if (idLoopCond_109) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property p = it_ft18.next();

					kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.get(self, p);

					java.lang.Boolean idIfCond_110 = false;
					idIfCond_110 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(v)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													v,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.standard.Collection<kermeta.language.structure.Object>")));

					if (idIfCond_110) {

						kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										v,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.standard.Collection<kermeta.language.structure.Object>")));

						java.lang.Boolean idIfCond_111 = false;
						idIfCond_111 = kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.IntegerWrapper
												.isLower(c.size(), p.getLower()),
										kermeta.standard.helper.BooleanWrapper
												.and(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqual(
																		p
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)),
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		c
																				.size(),
																		p
																				.getUpper())));

						if (idIfCond_111) {

							if (true)
								throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
										((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.exceptions.ConstraintViolatedInv")));

						}

					} else {

						java.lang.Boolean idIfCond_112 = false;
						idIfCond_112 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.IntegerWrapper
												.equals(p.getLower(), 1),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(v));

						if (idIfCond_112) {

							if (true)
								throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
										((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.exceptions.ConstraintViolatedInv")));

						}

					}

					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

		}

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.checkInvariants(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isVoid(

	java.lang.Double self

	) {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isNotEqual(

	java.lang.Double self, java.lang.Double element

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(self, element));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void unset(

	java.lang.Double self, kermeta.language.structure.Property property

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(self,
				property);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer oid(

	java.lang.Double self

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getOID(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object container(

	java.lang.Double self

	) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void freeze(

	java.lang.Double self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.Double self

	) {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getContainingResource(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isInstanceOf(

	java.lang.Double self, kermeta.language.structure.Type type

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type.getClass().getName());

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object asType(

	kermeta.language.structure.Object self,
			kermeta.language.structure.Class type

	) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_113 = false;
		idIfCond_113 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass("type"));

		if (idIfCond_113) {

			result = self;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.TypeCastError")));

		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void checkAllInvariants(

	java.lang.Double self

	) {

		java.lang.Boolean idIfCond_114 = false;
		idIfCond_114 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_114) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_115 = false;
			while (!idLoopCond_115) {
				idLoopCond_115 = it_ft19.isOff();
				;
				if (idLoopCond_115) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property subObj = it_ft19.next();

					java.lang.Boolean idIfCond_116 = false;
					idIfCond_116 = subObj.getIsComposite();

					if (idIfCond_116) {

						java.lang.Boolean idIfCond_117 = false;
						idIfCond_117 = kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.StringWrapper
												.equals(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClass(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.get(
																						self,
																						subObj))
																.getTypeDefinition()
																.getName(),
														"ReflectiveSequence"),
										kermeta.standard.helper.StringWrapper
												.equals(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClass(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.get(
																						self,
																						subObj))
																.getTypeDefinition()
																.getName(),
														"ReflectiveCollection"));

						if (idIfCond_117) {

							kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

							subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, subObj);

							//Beginning of the Inlining of the function type: each

							kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft20 = subObjInstances
									.iterator();
							java.lang.Boolean idLoopCond_118 = false;
							while (!idLoopCond_118) {
								idLoopCond_118 = it_ft20.isOff();
								;
								if (idLoopCond_118) {
								} else {

									//Beginning of the Inlining of the lambda expression: func
									kermeta.language.structure.Object aSubObjInstances = it_ft20
											.next();

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariants(aSubObjInstances);
									//End of the Inlining of the lambda expression: func

								}
							}
							//End of the Inlining of the function type: each

						} else {

							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.get(self, subObj));
						}

					}

					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

		}

	}

	public static Boolean equals(Double real, Integer other) {
		return org.kermeta.compil.runtime.helper.basetypes.RealUtil.equals(
				real, other);
	}

	public static Integer compareTo(Double real, Integer other) {
		return org.kermeta.compil.runtime.helper.basetypes.RealUtil.compareTo(
				real, other);
	}

}
