package kermeta.standard.helper;

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

		java.lang.Boolean idIfCond_862 = false;
		idIfCond_862 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_862) {

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

		java.lang.Boolean idIfCond_863 = false;
		idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_863) {

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

		java.lang.Boolean idIfCond_864 = false;
		idIfCond_864 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_864) {

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

		java.lang.Boolean idIfCond_865 = false;
		idIfCond_865 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_865) {

			java.lang.Boolean idIfCond_866 = false;
			idIfCond_866 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_866) {

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

		java.lang.Boolean idIfCond_867 = false;
		idIfCond_867 = kermeta.standard.helper.RealWrapper.equals(other,
				kermeta.standard.helper.IntegerWrapper.toReal(0));

		if (idIfCond_867) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_868 = false;
		idIfCond_868 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_868) {

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

		java.lang.Boolean idIfCond_869 = false;
		idIfCond_869 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_869) {

			java.lang.Boolean idIfCond_870 = false;
			idIfCond_870 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_870) {

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
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Double self, kermeta.language.structure.Class cl

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

		java.lang.Boolean idIfCond_871 = false;
		idIfCond_871 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_871) {

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

	java.lang.Double self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getterClassDefinition();

		java.lang.Boolean idIfCond_872 = false;
		idIfCond_872 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_872) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft193 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_873 = false;
				while (!idLoopCond_873) {
					idLoopCond_873 = it_ft193.isOff();
					if (idLoopCond_873) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp193 = it_ft193
								.next();

						//BIft:exists

						java.lang.Boolean result_ft194 = null;

						java.lang.Boolean test_ft194 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp193.getTag()).iterator();
							java.lang.Boolean idLoopCond_875 = false;
							while (!idLoopCond_875) {
								idLoopCond_875 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft194.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft194,
																false));
								if (idLoopCond_875) {
								} else {

									java.lang.Boolean result_lambda_ft194 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp194 = it_ft194
											.next();

									result_lambda_ft194 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp194.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft194 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft194, result_lambda_ft194);
								}
							}
						}

						result_ft194 = test_ft194;
						//EIft:exists
						java.lang.Boolean idIfCond_874 = false;
						idIfCond_874 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft194),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp193.getIsDerived()));

						if (idIfCond_874) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, p_lbdExp193);

							java.lang.Boolean idIfCond_876 = false;
							//BIft:andThen

							java.lang.Boolean result_ft195 = null;

							java.lang.Boolean idIfCond_877 = false;
							idIfCond_877 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_877) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp195 = null;

								result_ft195 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft195 = false;
							}

							//CEC
							idIfCond_876 = result_ft195;
							//EIft:andThen

							if (idIfCond_876) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_878 = false;
								idIfCond_878 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp193
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp193
																		.getUpper()));

								if (idIfCond_878) {

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
																							p_lbdExp193
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_879 = false;
								idIfCond_879 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp193
												.getLower());

								if (idIfCond_879) {

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
																							p_lbdExp193
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_880 = false;
								idIfCond_880 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp193
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_880) {

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
																							p_lbdExp193
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
	public static <G> void checkAllInvariants(

	java.lang.Double self

	) {

		java.lang.Boolean idIfCond_881 = false;
		idIfCond_881 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_881) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_882 = false;
				while (!idLoopCond_882) {
					idLoopCond_882 = it_ft196.isOff();
					if (idLoopCond_882) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp196 = it_ft196
								.next();

						java.lang.Boolean idIfCond_883 = false;
						idIfCond_883 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp196.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp196
														.getIsDerived()));

						if (idIfCond_883) {

							java.lang.Boolean idIfCond_884 = false;
							idIfCond_884 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							prop_lbdExp196))
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
																							prop_lbdExp196))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_884) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, prop_lbdExp196);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft197 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_885 = false;
									while (!idLoopCond_885) {
										idLoopCond_885 = it_ft197.isOff();
										if (idLoopCond_885) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp197 = it_ft197
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp197);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, prop_lbdExp196));
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
	public static <G> void freeze(

	java.lang.Double self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

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
	public static <G> kermeta.language.structure.Object asType(

	kermeta.language.structure.Object self,
			kermeta.language.structure.Class type

	) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_886 = false;
		idIfCond_886 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type);

		if (idIfCond_886) {

			result = self;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.TypeCastError")));

		}

		return result;

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
