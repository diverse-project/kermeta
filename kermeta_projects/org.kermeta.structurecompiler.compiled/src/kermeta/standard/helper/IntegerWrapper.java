package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class IntegerWrapper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLower(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_126 = false;
		idIfCond_126 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_126) {

			java.lang.Boolean idIfCond_127 = false;
			idIfCond_127 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_127) {

				result = org.kermeta.compil.runtime.helper.basetypes.RealUtil
						.isLower(kermeta.standard.helper.IntegerWrapper
								.toReal(self), other);
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.isLower(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer plus(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_128 = false;
		idIfCond_128 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_128) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.plus(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer mult(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_129 = false;
		idIfCond_129 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_129) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.times(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer minus(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_130 = false;
		idIfCond_130 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_130) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.minus(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean equals(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_131 = false;
		idIfCond_131 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_131) {

			java.lang.Boolean idIfCond_132 = false;
			idIfCond_132 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_132) {

				result = kermeta.standard.helper.RealWrapper.equals(
						kermeta.standard.helper.IntegerWrapper.toReal(self),
						other);
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.equals(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer mod(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_133 = false;
		idIfCond_133 = kermeta.standard.helper.IntegerWrapper.equals(other, 0);

		if (idIfCond_133) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_134 = false;
		idIfCond_134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_134) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.mod(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer div(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_135 = false;
		idIfCond_135 = kermeta.standard.helper.IntegerWrapper.equals(other, 0);

		if (idIfCond_135) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_136 = false;
		idIfCond_136 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_136) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.VoidOperandError")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.div(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double toReal(

	java.lang.Integer self

	) {

		java.lang.Double result = null;

		result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
				.toReal(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer compareTo(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_137 = false;
		idIfCond_137 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_137) {

			java.lang.Boolean idIfCond_138 = false;
			idIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_138) {

				result = kermeta.standard.helper.RealWrapper.compareTo(
						kermeta.standard.helper.IntegerWrapper.toReal(self),
						other);
			} else {

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							((kermeta.standard.NotComparableException) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("kermeta.standard.NotComparableException")));

			}

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.compareTo(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isGreater(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_139 = false;
		idIfCond_139 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_139) {

			java.lang.Boolean idIfCond_140 = false;
			idIfCond_140 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_140) {

				result = org.kermeta.compil.runtime.helper.basetypes.RealUtil
						.isGreater(kermeta.standard.helper.IntegerWrapper
								.toReal(self), other);
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.isGreater(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isGreaterOrEqual(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_141 = false;
		idIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_141) {

			java.lang.Boolean idIfCond_142 = false;
			idIfCond_142 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_142) {

				result = org.kermeta.compil.runtime.helper.basetypes.RealUtil
						.isGreaterOrEqual(
								kermeta.standard.helper.IntegerWrapper
										.toReal(self), other);
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.isGreaterOrEqual(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer uminus(

	java.lang.Integer self

	) {

		java.lang.Integer result = null;

		result = kermeta.standard.helper.IntegerWrapper.minus(0, self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.Integer self

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
				.toString(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLowerOrEqual(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_143 = false;
		idIfCond_143 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_143) {

			java.lang.Boolean idIfCond_144 = false;
			idIfCond_144 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_144) {

				result = org.kermeta.compil.runtime.helper.basetypes.RealUtil
						.isLowerOrEqual(kermeta.standard.helper.IntegerWrapper
								.toReal(self), other);
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.IntegerUtil
					.isLowerOrEqual(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isKindOf(

	java.lang.Integer self, kermeta.language.structure.Class cl

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

	java.lang.Integer self

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

	java.lang.Integer self, kermeta.language.structure.Property property,
			java.lang.Integer element

	) {

		java.lang.Boolean idIfCond_145 = false;
		idIfCond_145 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_145) {

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

	java.lang.Integer self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getterClassDefinition();

		java.lang.Boolean idIfCond_146 = false;
		idIfCond_146 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_146) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_147 = false;
				while (!idLoopCond_147) {
					idLoopCond_147 = it_ft23.isOff();
					if (idLoopCond_147) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp23 = it_ft23
								.next();

						//BIft:exists

						java.lang.Boolean result_ft24 = null;

						java.lang.Boolean test_ft24 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp23.getTag()).iterator();
							java.lang.Boolean idLoopCond_149 = false;
							while (!idLoopCond_149) {
								idLoopCond_149 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft24.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft24,
																false));
								if (idLoopCond_149) {
								} else {

									java.lang.Boolean result_lambda_ft24 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp24 = it_ft24
											.next();

									result_lambda_ft24 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp24.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft24 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft24, result_lambda_ft24);
								}
							}
						}

						result_ft24 = test_ft24;
						//EIft:exists
						java.lang.Boolean idIfCond_148 = false;
						idIfCond_148 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft24),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp23.getIsDerived()));

						if (idIfCond_148) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, p_lbdExp23);

							java.lang.Boolean idIfCond_150 = false;
							//BIft:andThen

							java.lang.Boolean result_ft25 = null;

							java.lang.Boolean idIfCond_151 = false;
							idIfCond_151 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_151) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp25 = null;

								result_ft25 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft25 = false;
							}

							//CEC
							idIfCond_150 = result_ft25;
							//EIft:andThen

							if (idIfCond_150) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_152 = false;
								idIfCond_152 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp23
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp23
																		.getUpper()));

								if (idIfCond_152) {

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
																							p_lbdExp23
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_153 = false;
								idIfCond_153 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp23
												.getLower());

								if (idIfCond_153) {

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
																							p_lbdExp23
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_154 = false;
								idIfCond_154 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp23
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_154) {

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
																							p_lbdExp23
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

	java.lang.Integer self

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

	java.lang.Integer self

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

	java.lang.Integer self, kermeta.language.structure.Type type

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

	java.lang.Integer self

	) {

		java.lang.Boolean idIfCond_155 = false;
		idIfCond_155 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_155) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_156 = false;
				while (!idLoopCond_156) {
					idLoopCond_156 = it_ft26.isOff();
					if (idLoopCond_156) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp26 = it_ft26
								.next();

						java.lang.Boolean idIfCond_157 = false;
						idIfCond_157 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp26.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp26
														.getIsDerived()));

						if (idIfCond_157) {

							java.lang.Boolean idIfCond_158 = false;
							idIfCond_158 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							prop_lbdExp26))
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
																							prop_lbdExp26))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_158) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, prop_lbdExp26);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft27 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_159 = false;
									while (!idLoopCond_159) {
										idLoopCond_159 = it_ft27.isOff();
										if (idLoopCond_159) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp27 = it_ft27
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp27);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, prop_lbdExp26));
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

	java.lang.Integer self, kermeta.language.structure.Property property

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

	java.lang.Integer self, kermeta.language.structure.Property property

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

	java.lang.Integer self

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

	java.lang.Integer self

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

	java.lang.Integer self, java.lang.Integer element

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

	java.lang.Integer self, kermeta.language.structure.Property property

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(self,
				property);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object container(

	java.lang.Integer self

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

	java.lang.Integer self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.Integer self

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

		java.lang.Boolean idIfCond_160 = false;
		idIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type);

		if (idIfCond_160) {

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
