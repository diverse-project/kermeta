package kermeta.standard.helper;

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

		java.lang.Boolean idIfCond_863 = false;
		idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"java.lang.Character"));

		if (idIfCond_863) {

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
	public static <G> java.lang.Integer compareTo(

	java.lang.Character self, java.lang.Character other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_864 = false;
		idIfCond_864 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_864) {

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
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Character self, kermeta.language.structure.Class cl

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

		java.lang.Boolean idIfCond_865 = false;
		idIfCond_865 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_865) {

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

	java.lang.Character self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getterClassDefinition();

		java.lang.Boolean idIfCond_866 = false;
		idIfCond_866 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_866) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_867 = false;
				while (!idLoopCond_867) {
					idLoopCond_867 = it_ft198.isOff();
					if (idLoopCond_867) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp198 = it_ft198
								.next();

						//BIft:exists

						java.lang.Boolean result_ft199 = null;

						java.lang.Boolean test_ft199 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp198.getTag()).iterator();
							java.lang.Boolean idLoopCond_869 = false;
							while (!idLoopCond_869) {
								idLoopCond_869 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft199.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft199,
																false));
								if (idLoopCond_869) {
								} else {

									java.lang.Boolean result_lambda_ft199 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp199 = it_ft199
											.next();

									result_lambda_ft199 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp199.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft199 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft199, result_lambda_ft199);
								}
							}
						}

						result_ft199 = test_ft199;
						//EIft:exists
						java.lang.Boolean idIfCond_868 = false;
						idIfCond_868 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft199),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp198.getIsDerived()));

						if (idIfCond_868) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, p_lbdExp198);

							java.lang.Boolean idIfCond_870 = false;
							//BIft:andThen

							java.lang.Boolean result_ft200 = null;

							java.lang.Boolean idIfCond_871 = false;
							idIfCond_871 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_871) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp200 = null;

								result_ft200 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft200 = false;
							}

							//CEC
							idIfCond_870 = result_ft200;
							//EIft:andThen

							if (idIfCond_870) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_872 = false;
								idIfCond_872 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp198
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp198
																		.getUpper()));

								if (idIfCond_872) {

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
																							p_lbdExp198
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_873 = false;
								idIfCond_873 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp198
												.getLower());

								if (idIfCond_873) {

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
																							p_lbdExp198
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_874 = false;
								idIfCond_874 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp198
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_874) {

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
																							p_lbdExp198
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
	public static <G> void checkAllInvariants(

	java.lang.Character self

	) {

		java.lang.Boolean idIfCond_875 = false;
		idIfCond_875 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_875) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft201 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_876 = false;
				while (!idLoopCond_876) {
					idLoopCond_876 = it_ft201.isOff();
					if (idLoopCond_876) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp201 = it_ft201
								.next();

						java.lang.Boolean idIfCond_877 = false;
						idIfCond_877 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp201.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp201
														.getIsDerived()));

						if (idIfCond_877) {

							java.lang.Boolean idIfCond_878 = false;
							idIfCond_878 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							prop_lbdExp201))
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
																							prop_lbdExp201))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_878) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, prop_lbdExp201);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft202 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_879 = false;
									while (!idLoopCond_879) {
										idLoopCond_879 = it_ft202.isOff();
										if (idLoopCond_879) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp202 = it_ft202
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp202);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, prop_lbdExp201));
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
	public static <G> void freeze(

	java.lang.Character self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

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
	public static <G> kermeta.language.structure.Object asType(

	kermeta.language.structure.Object self,
			kermeta.language.structure.Class type

	) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_880 = false;
		idIfCond_880 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type);

		if (idIfCond_880) {

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
