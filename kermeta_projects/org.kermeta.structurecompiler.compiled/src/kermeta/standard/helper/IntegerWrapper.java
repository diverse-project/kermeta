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

		java.lang.Boolean idIfCond_501 = false;
		idIfCond_501 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_501) {

			java.lang.Boolean idIfCond_502 = false;
			idIfCond_502 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_502) {

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

		java.lang.Boolean idIfCond_503 = false;
		idIfCond_503 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_503) {

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

		java.lang.Boolean idIfCond_504 = false;
		idIfCond_504 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_504) {

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

		java.lang.Boolean idIfCond_505 = false;
		idIfCond_505 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_505) {

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

		java.lang.Boolean idIfCond_506 = false;
		idIfCond_506 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_506) {

			java.lang.Boolean idIfCond_507 = false;
			idIfCond_507 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_507) {

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

		java.lang.Boolean idIfCond_508 = false;
		idIfCond_508 = kermeta.standard.helper.IntegerWrapper.equals(other, 0);

		if (idIfCond_508) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_509 = false;
		idIfCond_509 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_509) {

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
	public static <G> java.lang.Integer div(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_510 = false;
		idIfCond_510 = kermeta.standard.helper.IntegerWrapper.equals(other, 0);

		if (idIfCond_510) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.DivisionByZero")));

		}

		java.lang.Boolean idIfCond_511 = false;
		idIfCond_511 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_511) {

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
	public static <G> java.lang.Integer compareTo(

	java.lang.Integer self, java.lang.Integer other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_512 = false;
		idIfCond_512 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_512) {

			java.lang.Boolean idIfCond_513 = false;
			idIfCond_513 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_513) {

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

		java.lang.Boolean idIfCond_514 = false;
		idIfCond_514 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_514) {

			java.lang.Boolean idIfCond_515 = false;
			idIfCond_515 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_515) {

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

		java.lang.Boolean idIfCond_516 = false;
		idIfCond_516 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_516) {

			java.lang.Boolean idIfCond_517 = false;
			idIfCond_517 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_517) {

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

		java.lang.Boolean idIfCond_518 = false;
		idIfCond_518 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass("java.lang.Integer"));

		if (idIfCond_518) {

			java.lang.Boolean idIfCond_519 = false;
			idIfCond_519 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(other).equals(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Double"));

			if (idIfCond_519) {

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

		java.lang.Boolean idIfCond_520 = false;
		idIfCond_520 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"property.getType()"));

		if (idIfCond_520) {

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

	java.lang.Integer self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getClassDefinition();

		java.lang.Boolean idIfCond_521 = false;
		idIfCond_521 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_521) {

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft106 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_522 = false;
				while (!idLoopCond_522) {
					idLoopCond_522 = it_ft106.isOff();
					if (idLoopCond_522) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.language.structure.Property p = it_ft106.next();

						kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.get(self, p);

						java.lang.Boolean idIfCond_523 = false;
						idIfCond_523 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_523) {

							kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											v,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.standard.Collection<kermeta.language.structure.Object>")));

							java.lang.Boolean idIfCond_524 = false;
							idIfCond_524 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.IntegerWrapper
													.isLower(c.size(), p
															.getLower()),
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

							if (idIfCond_524) {

								if (true)
									throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
											((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("kermeta.exceptions.ConstraintViolatedInv")));

							}

						} else {

							java.lang.Boolean idIfCond_525 = false;
							idIfCond_525 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.IntegerWrapper
													.equals(p.getLower(), 1),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(v));

							if (idIfCond_525) {

								if (true)
									throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
											((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("kermeta.exceptions.ConstraintViolatedInv")));

							}

						}

						//End of the Inlining of the lambda expression: func

					}
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

		java.lang.Boolean idIfCond_526 = false;
		idIfCond_526 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_526) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_527 = false;
				while (!idLoopCond_527) {
					idLoopCond_527 = it_ft107.isOff();
					if (idLoopCond_527) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.language.structure.Property subObj = it_ft107
								.next();

						java.lang.Boolean idIfCond_528 = false;
						idIfCond_528 = subObj.getIsComposite();

						if (idIfCond_528) {

							java.lang.Boolean idIfCond_529 = false;
							idIfCond_529 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_529) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, subObj);

								//Beginning of the Inlining of the function type: each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft108 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_530 = false;
									while (!idLoopCond_530) {
										idLoopCond_530 = it_ft108.isOff();
										if (idLoopCond_530) {
										} else {

											//Beginning of the Inlining of the lambda expression: func
											kermeta.language.structure.Object aSubObjInstances = it_ft108
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances);
											//End of the Inlining of the lambda expression: func

										}
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
			}

			//End of the Inlining of the function type: each

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

		java.lang.Boolean idIfCond_531 = false;
		idIfCond_531 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass("type"));

		if (idIfCond_531) {

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
