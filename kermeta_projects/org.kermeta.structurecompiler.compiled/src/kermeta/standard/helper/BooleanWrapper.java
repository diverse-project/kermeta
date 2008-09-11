package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class BooleanWrapper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean not(

	java.lang.Boolean self

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.BooleanUtil
				.not(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean xor(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.BooleanWrapper.and(self,
						kermeta.standard.helper.BooleanWrapper.not(other)),
				kermeta.standard.helper.BooleanWrapper
						.and(kermeta.standard.helper.BooleanWrapper.not(self),
								other));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean equals(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_617 = false;
		idIfCond_617 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Boolean"));

		if (idIfCond_617) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.BooleanUtil
					.equals(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean or(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.BooleanUtil
				.or(self, other);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean implies(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper
								.not(kermeta.standard.helper.BooleanWrapper
										.and(self, other)), self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean nand(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.BooleanWrapper.and(self, other));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.Boolean self

	) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_618 = false;
		idIfCond_618 = self;

		if (idIfCond_618) {

			result = "true";
		} else {

			result = "false";
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean and(

	java.lang.Boolean self, java.lang.Boolean other

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.BooleanUtil
				.and(self, other);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Boolean self, kermeta.language.structure.Class cl

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
	public static <G> kermeta.language.structure.Class getMetaClass(

	java.lang.Boolean self

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

	java.lang.Boolean self, kermeta.language.structure.Property property,
			java.lang.Boolean element

	) {

		java.lang.Boolean idIfCond_619 = false;
		idIfCond_619 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"property.getType()"));

		if (idIfCond_619) {

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
									"\\."));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void checkInvariants(

	java.lang.Boolean self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getClassDefinition();

		java.lang.Boolean idIfCond_620 = false;
		idIfCond_620 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_620) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft131 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_621 = false;
				while (!idLoopCond_621) {
					idLoopCond_621 = it_ft131.isOff();
					if (idLoopCond_621) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp131 = it_ft131
								.next();

						kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.get(self, p_lbdExp131);

						java.lang.Boolean idIfCond_622 = false;
						idIfCond_622 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_622) {

							kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											v,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.standard.Collection<kermeta.language.structure.Object>")));

							java.lang.Boolean idIfCond_623 = false;
							idIfCond_623 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.IntegerWrapper
													.isLower(c.size(),
															p_lbdExp131
																	.getLower()),
											kermeta.standard.helper.BooleanWrapper
													.and(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isNotEqual(
																			p_lbdExp131
																					.getUpper(),
																			kermeta.standard.helper.IntegerWrapper
																					.uminus(1)),
															kermeta.standard.helper.IntegerWrapper
																	.isGreater(
																			c
																					.size(),
																			p_lbdExp131
																					.getUpper())));

							if (idIfCond_623) {

								if (true)
									throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
											((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("kermeta.exceptions.ConstraintViolatedInv")));

							}

						} else {

							java.lang.Boolean idIfCond_624 = false;
							idIfCond_624 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.IntegerWrapper
													.equals(p_lbdExp131
															.getLower(), 1),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(v));

							if (idIfCond_624) {

								if (true)
									throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
											((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("kermeta.exceptions.ConstraintViolatedInv")));

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.checkInvariants(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isVoid(

	java.lang.Boolean self

	) {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer oid(

	java.lang.Boolean self

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
	public static <G> java.lang.Boolean isInstanceOf(

	java.lang.Boolean self, kermeta.language.structure.Type type

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
	public static <G> void checkAllInvariants(

	java.lang.Boolean self

	) {

		java.lang.Boolean idIfCond_625 = false;
		idIfCond_625 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_625) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_626 = false;
				while (!idLoopCond_626) {
					idLoopCond_626 = it_ft132.isOff();
					if (idLoopCond_626) {
					} else {

						//BIle:func
						kermeta.language.structure.Property subObj_lbdExp132 = it_ft132
								.next();

						java.lang.Boolean idIfCond_627 = false;
						idIfCond_627 = subObj_lbdExp132.getIsComposite();

						if (idIfCond_627) {

							java.lang.Boolean idIfCond_628 = false;
							idIfCond_628 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							subObj_lbdExp132))
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
																							subObj_lbdExp132))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_628) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, subObj_lbdExp132);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft133 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_629 = false;
									while (!idLoopCond_629) {
										idLoopCond_629 = it_ft133.isOff();
										if (idLoopCond_629) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp133 = it_ft133
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp133);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, subObj_lbdExp132));
							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isSet(

	java.lang.Boolean self, kermeta.language.structure.Property property

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
	public static <G> kermeta.language.structure.Object get(

	java.lang.Boolean self, kermeta.language.structure.Property property

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
	public static <G> java.lang.Boolean isFrozen(

	java.lang.Boolean self

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

	java.lang.Boolean self

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
	public static <G> java.lang.Boolean isNotEqual(

	java.lang.Boolean self, java.lang.Boolean element

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
	public static <G> kermeta.language.structure.Object container(

	java.lang.Boolean self

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

	java.lang.Boolean self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void unset(

	java.lang.Boolean self, kermeta.language.structure.Property property

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(self,
				property);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.Boolean self

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
	public static <G> kermeta.language.structure.Object asType(

	kermeta.language.structure.Object self,
			kermeta.language.structure.Class type

	) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_630 = false;
		idIfCond_630 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass("type"));

		if (idIfCond_630) {

			result = self;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.TypeCastError")));

		}

		return result;

	}

}
