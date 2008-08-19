package kermeta.standard.helper;

import org.kermeta.compil.runtime.helper.basetypes.CollectionUtil;

/**
 *
 * @generated
 */
public class CharacterWrapper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean equals(

	java.lang.Character self, java.lang.Character other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_119 = false;
		idIfCond_119 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"java.lang.Character"));

		if (idIfCond_119) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
					.equals(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer compareTo(

	java.lang.Character self, java.lang.Character other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_120 = false;
		idIfCond_120 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_120) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.CallOnVoidTarget")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
					.compareTo(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.Character self

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
				.toString(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isSet(

	java.lang.Character self, kermeta.language.structure.Property property

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

	java.lang.Character self, kermeta.language.structure.Class cl

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

	java.lang.Character self, kermeta.language.structure.Property property

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

	java.lang.Character self

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

	java.lang.Character self, kermeta.language.structure.Property property,
			java.lang.Character element

	) {

		java.lang.Boolean idIfCond_121 = false;
		idIfCond_121 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"property.getType()"));

		if (idIfCond_121) {

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

	java.lang.Character self

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

	java.lang.Character self

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

	java.lang.Character self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getClassDefinition();

		java.lang.Boolean idIfCond_122 = false;
		idIfCond_122 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_122) {

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_123 = false;
			while (!idLoopCond_123) {
				idLoopCond_123 = it_ft21.isOff();
				;
				if (idLoopCond_123) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property p = it_ft21.next();

					kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.get(self, p);

					java.lang.Boolean idIfCond_124 = false;
					idIfCond_124 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_124) {

						kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										v,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.standard.Collection<kermeta.language.structure.Object>")));

						java.lang.Boolean idIfCond_125 = false;
						idIfCond_125 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_125) {

							if (true)
								throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
										((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.exceptions.ConstraintViolatedInv")));

						}

					} else {

						java.lang.Boolean idIfCond_126 = false;
						idIfCond_126 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.IntegerWrapper
												.equals(p.getLower(), 1),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(v));

						if (idIfCond_126) {

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

	java.lang.Character self

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

	java.lang.Character self, java.lang.Character element

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

	java.lang.Character self, kermeta.language.structure.Property property

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(self,
				property);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer oid(

	java.lang.Character self

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

	java.lang.Character self

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

	java.lang.Character self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.Character self

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

	java.lang.Character self, kermeta.language.structure.Type type

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

		java.lang.Boolean idIfCond_127 = false;
		idIfCond_127 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass("type"));

		if (idIfCond_127) {

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

	java.lang.Character self

	) {

		java.lang.Boolean idIfCond_128 = false;
		idIfCond_128 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_128) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_129 = false;
			while (!idLoopCond_129) {
				idLoopCond_129 = it_ft22.isOff();
				;
				if (idLoopCond_129) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property subObj = it_ft22.next();

					java.lang.Boolean idIfCond_130 = false;
					idIfCond_130 = subObj.getIsComposite();

					if (idIfCond_130) {

						java.lang.Boolean idIfCond_131 = false;
						idIfCond_131 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_131) {

							kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

							subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, subObj);

							//Beginning of the Inlining of the function type: each

							kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft23 = subObjInstances
									.iterator();
							java.lang.Boolean idLoopCond_132 = false;
							while (!idLoopCond_132) {
								idLoopCond_132 = it_ft23.isOff();
								;
								if (idLoopCond_132) {
								} else {

									//Beginning of the Inlining of the lambda expression: func
									kermeta.language.structure.Object aSubObjInstances = it_ft23
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

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLower(

	java.lang.Character self, java.lang.Character other

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

	java.lang.Character self, java.lang.Character other

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

	java.lang.Character self, java.lang.Character other

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

	java.lang.Character self, java.lang.Character other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreater(self
				.compareTo(other), 0);

		return result;

	}

}
