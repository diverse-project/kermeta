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
		//Protection of the following code
		if (self == null || other == null) {
			return self == other;
		}

		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equals(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							other);
		}
		//End of the protection

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_940 = false;
		idIfCond_940 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"java.lang.Character"));

		if (idIfCond_940) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.Boolean> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
									.equals(self, other));
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Character expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_941 = false;
		idIfCond_941 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_941) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.CallOnVoidTarget")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.Integer> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
									.compareTo(self, other));
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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.toString((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.CharacterUtil
								.toString(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Character self, kermeta.language.structure.Class cl

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isKindOf(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							cl);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(self).equals(cl);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Class getMetaClass(

	java.lang.Character self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<kermeta.language.structure.Class> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(self));

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.set(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							property, element);
		}
		//End of the protection

		java.lang.Boolean idIfCond_942 = false;
		idIfCond_942 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_942) {

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
																							.toStringSwitcher(self)),
																	" to "),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toStringSwitcher(element)),
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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(self).getterClassDefinition();

		java.lang.Boolean idIfCond_943 = false;
		idIfCond_943 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_943) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_944 = false;
				while (!idLoopCond_944) {
					idLoopCond_944 = it_ft209.isOff();
					if (idLoopCond_944) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp209 = it_ft209
								.next();

						//BIft:exists

						java.lang.Boolean result_ft210 = null;

						java.lang.Boolean test_ft210 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp209.getTag()).iterator();
							java.lang.Boolean idLoopCond_946 = false;
							while (!idLoopCond_946) {
								idLoopCond_946 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft210.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft210,
																false));
								if (idLoopCond_946) {
								} else {

									java.lang.Boolean result_lambda_ft210 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp210 = it_ft210
											.next();

									result_lambda_ft210 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp210.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft210 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft210, result_lambda_ft210);
								}
							}
						}

						result_ft210 = test_ft210;
						//EIft:exists
						java.lang.Boolean idIfCond_945 = false;
						idIfCond_945 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft210),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp209.getIsDerived()));

						if (idIfCond_945) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp209);

							java.lang.Boolean idIfCond_947 = false;
							//BIft:andThen

							java.lang.Boolean result_ft211 = null;

							java.lang.Boolean idIfCond_948 = false;
							idIfCond_948 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_948) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp211 = null;

								result_ft211 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft211 = false;
							}

							//CEC
							idIfCond_947 = result_ft211;
							//EIft:andThen

							if (idIfCond_947) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_949 = false;
								idIfCond_949 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp209
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp209
																		.getUpper()));

								if (idIfCond_949) {

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
																							p_lbdExp209
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_950 = false;
								idIfCond_950 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp209
												.getLower());

								if (idIfCond_950) {

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
																							p_lbdExp209
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_951 = false;
								idIfCond_951 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp209
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_951) {

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
																							p_lbdExp209
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoid((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.oid((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getOID(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isInstanceOf(

	java.lang.Character self, kermeta.language.structure.Type type

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							type);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(self, type.getClass().getName()));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void checkAllInvariants(

	java.lang.Character self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkAllInvariants((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Boolean idIfCond_952 = false;
		idIfCond_952 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_952) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(self)
									.getTypeDefinition());

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft212 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_953 = false;
				while (!idLoopCond_953) {
					idLoopCond_953 = it_ft212.isOff();
					if (idLoopCond_953) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp212 = it_ft212
								.next();

						java.lang.Boolean idIfCond_954 = false;
						idIfCond_954 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp212.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp212
														.getIsDerived()));

						if (idIfCond_954) {

							java.lang.Boolean idIfCond_955 = false;
							idIfCond_955 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp212)));

							if (idIfCond_955) {

								java.lang.Boolean idIfCond_956 = false;
								//BIft:exists

								java.lang.Boolean result_ft213 = null;

								java.lang.Boolean test_ft213 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft213 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp212))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_957 = false;
									while (!idLoopCond_957) {
										idLoopCond_957 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft213.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft213,
																		false));
										if (idLoopCond_957) {
										} else {

											java.lang.Boolean result_lambda_ft213 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp213 = it_ft213
													.next();

											java.lang.Boolean idIfCond_958 = false;
											idIfCond_958 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp213,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_958) {

												result_lambda_ft213 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp213,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft213 = false;
											}

											//EIle:func

											test_ft213 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft213,
															result_lambda_ft213);
										}
									}
								}

								result_ft213 = test_ft213;

								//CEC
								idIfCond_956 = result_ft213;
								//EIft:exists

								if (idIfCond_956) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp212));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft214 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_959 = false;
										while (!idLoopCond_959) {
											idLoopCond_959 = it_ft214.isOff();
											if (idLoopCond_959) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp214 = it_ft214
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp214);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp212));
								}

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isSet(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							property);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isSet(self, property));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object get(

	java.lang.Character self, kermeta.language.structure.Property property

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.get(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							property);
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isFrozen((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isFrozen(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer hashcode(

	java.lang.Character self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.hashcode((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.hashcode(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isNotEqual(

	java.lang.Character self, java.lang.Character element

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							element);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(self, element));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void unset(

	java.lang.Character self, kermeta.language.structure.Property property

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.unset(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							property);
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.freeze((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.Character self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containingResource((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<kermeta.persistence.Resource> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getContainingResource(self));

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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (kermeta.language.structure.Object) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							type);
		}
		//End of the protection

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_960 = false;
		idIfCond_960 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_960) {

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Character expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Character expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Character expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Character expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreater(self
				.compareTo(other), 0);

		return result;

	}

}
