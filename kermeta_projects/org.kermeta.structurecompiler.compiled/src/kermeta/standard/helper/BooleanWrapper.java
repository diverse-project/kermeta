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

		java.lang.Boolean idIfCond_809 = false;
		idIfCond_809 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Boolean"));

		if (idIfCond_809) {

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
	public static <G> java.lang.String toString(

	java.lang.Boolean self

	) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_810 = false;
		idIfCond_810 = self;

		if (idIfCond_810) {

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
				.getMetaClass(self).equals(cl);

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

		java.lang.Boolean idIfCond_811 = false;
		idIfCond_811 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_811) {

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
	public static <G> void checkInvariants(

	java.lang.Boolean self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getterClassDefinition();

		java.lang.Boolean idIfCond_812 = false;
		idIfCond_812 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_812) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft183 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_813 = false;
				while (!idLoopCond_813) {
					idLoopCond_813 = it_ft183.isOff();
					if (idLoopCond_813) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp183 = it_ft183
								.next();

						//BIft:exists

						java.lang.Boolean result_ft184 = null;

						java.lang.Boolean test_ft184 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft184 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp183.getTag()).iterator();
							java.lang.Boolean idLoopCond_815 = false;
							while (!idLoopCond_815) {
								idLoopCond_815 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft184.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft184,
																false));
								if (idLoopCond_815) {
								} else {

									java.lang.Boolean result_lambda_ft184 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp184 = it_ft184
											.next();

									result_lambda_ft184 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp184.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft184 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft184, result_lambda_ft184);
								}
							}
						}

						result_ft184 = test_ft184;
						//EIft:exists
						java.lang.Boolean idIfCond_814 = false;
						idIfCond_814 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft184),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp183.getIsDerived()));

						if (idIfCond_814) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, p_lbdExp183);

							java.lang.Boolean idIfCond_816 = false;
							//BIft:andThen

							java.lang.Boolean result_ft185 = null;

							java.lang.Boolean idIfCond_817 = false;
							idIfCond_817 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_817) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp185 = null;

								result_ft185 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft185 = false;
							}

							//CEC
							idIfCond_816 = result_ft185;
							//EIft:andThen

							if (idIfCond_816) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_818 = false;
								idIfCond_818 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp183
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp183
																		.getUpper()));

								if (idIfCond_818) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp183
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_819 = false;
								idIfCond_819 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp183
												.getLower());

								if (idIfCond_819) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp183
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_820 = false;
								idIfCond_820 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp183
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_820) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp183
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

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

		java.lang.Boolean idIfCond_821 = false;
		idIfCond_821 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_821) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft186 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_822 = false;
				while (!idLoopCond_822) {
					idLoopCond_822 = it_ft186.isOff();
					if (idLoopCond_822) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp186 = it_ft186
								.next();

						java.lang.Boolean idIfCond_823 = false;
						idIfCond_823 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp186.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp186
														.getIsDerived()));

						if (idIfCond_823) {

							java.lang.Boolean idIfCond_824 = false;
							idIfCond_824 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							prop_lbdExp186))
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
																							prop_lbdExp186))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_824) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, prop_lbdExp186);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft187 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_825 = false;
									while (!idLoopCond_825) {
										idLoopCond_825 = it_ft187.isOff();
										if (idLoopCond_825) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp187 = it_ft187
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp187);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, prop_lbdExp186));
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

		java.lang.Boolean idIfCond_826 = false;
		idIfCond_826 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type);

		if (idIfCond_826) {

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
