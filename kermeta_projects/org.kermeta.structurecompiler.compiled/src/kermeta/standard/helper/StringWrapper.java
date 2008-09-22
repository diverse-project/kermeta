package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class StringWrapper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String plus(

	java.lang.String self, java.lang.String other

	) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1 = false;
		idIfCond_1 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_1) {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.plus(self, kermeta.standard.helper.StringWrapper
							.toString(other));
		} else {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.plus(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void append(

	java.lang.String self, java.lang.String other

	) {

		java.lang.Boolean idIfCond_2 = false;
		idIfCond_2 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_2) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.CallOnVoidTarget")));

		} else {

			org.kermeta.compil.runtime.helper.basetypes.StringUtil.append(self,
					other);
		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.utils.Hashtable<java.lang.String, java.lang.String> getPropertyInfos(

	java.lang.String self

	) {

		kermeta.utils.Hashtable<java.lang.String, java.lang.String> result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_infos = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<java.lang.String>"));

		kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = ((kermeta.utils.Hashtable<java.lang.String, java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.Hashtable<java.lang.String, java.lang.String>"));

		set_infos = kermeta.standard.helper.StringWrapper.split(self, " ");

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft1 = set_infos
					.iterator();
			java.lang.Boolean idLoopCond_3 = false;
			while (!idLoopCond_3) {
				idLoopCond_3 = it_ft1.isOff();
				if (idLoopCond_3) {
				} else {

					//BIle:func
					java.lang.String i_lbdExp1 = it_ft1.next();

					kermeta.standard.OrderedSet<java.lang.String> tmp_set_infos = kermeta.standard.helper.StringWrapper
							.split(i_lbdExp1, "=");

					java.lang.Boolean idIfCond_4 = false;
					idIfCond_4 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(tmp_set_infos.size(), 2);

					if (idIfCond_4) {

						java.lang.Boolean idIfCond_5 = false;
						idIfCond_5 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(tmp_set_infos.elementAt(0)));

						if (idIfCond_5) {

							java.lang.Boolean idIfCond_6 = false;
							idIfCond_6 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(tmp_set_infos
																	.elementAt(1))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(tmp_set_infos
															.elementAt(1), ""));

							if (idIfCond_6) {

								map_infos.put(tmp_set_infos.elementAt(0),
										tmp_set_infos.elementAt(1));
							}

						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

		result = map_infos;

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean equals(

	java.lang.String self, java.lang.String other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_7 = false;
		idIfCond_7 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_7) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.equals(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String normalizeStatement(

	java.lang.String self

	) {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(
				kermeta.standard.helper.StringWrapper.replace(self, " == null",
						" == null"), ";", ";");

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double toReal(

	java.lang.String self

	) {

		java.lang.Double result = null;

		result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toReal(self);

		java.lang.Boolean idIfCond_8 = false;
		idIfCond_8 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_8) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringFormatException")));

		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean toBoolean(

	java.lang.String self

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toBoolean(self);

		java.lang.Boolean idIfCond_9 = false;
		idIfCond_9 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_9) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringFormatException")));

		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String replaceExtension(
    
      java.lang.String self
    , 
      java.lang.String new_extension
    
  ) {
    
java.lang.String result = null;

  result = "";

  kermeta.standard.OrderedSet<java.lang.String> set_str = kermeta.standard.helper.StringWrapper.split(self, "\\.");

  java.lang.Integer inc_seg = 0;

  //BIft:each

  
{

  kermeta.standard.Iterator<java.lang.String> it_ft2 = set_str.iterator();
  java.lang.Boolean idLoopCond_10 = false;
  while( !idLoopCond_10 ) {
  idLoopCond_10 = it_ft2.isOff();
  if ( idLoopCond_10 ) {
  } else {

  //BIle:func
java.lang.String seg_lbdExp2 = it_ft2.next();

  java.lang.Boolean idIfCond_11 = false;
  idIfCond_11 = kermeta.standard.helper.IntegerWrapper.isLower(inc_seg, kermeta.standard.helper.IntegerWrapper.minus(set_str.size(), 1));

  if( idIfCond_11 ) {

  result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, seg_lbdExp2), ".");
}


  inc_seg = kermeta.standard.helper.IntegerWrapper.plus(inc_seg, 1);
//EIle:func

}
  }
}

//EIft:each


  result = kermeta.standard.helper.StringWrapper.plus(result, new_extension);

return result;

  }

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isValueType(

	java.lang.String self, km2ecore.KM2EcoreContext context

	) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_12 = false;
		idIfCond_12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						context.getValueTypeMapping()).contains(self);

		if (idIfCond_12) {

			result = true;
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer compareTo(

	java.lang.String self, java.lang.String other

	) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_13 = false;
		idIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(other);

		if (idIfCond_13) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.CallOnVoidTarget")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.compareTo(self, other);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean contains(

	java.lang.String self, java.lang.String str1

	) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.contains(self, str1);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer indexOf(

	java.lang.String self, java.lang.String str

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.indexOf(self, str);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Character elementAt(

	java.lang.String self, java.lang.Integer index

	) {

		java.lang.Character result = null;

		java.lang.Boolean idIfCond_14 = false;
		idIfCond_14 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(
								kermeta.standard.helper.StringWrapper
										.size(self), 1)));

		if (idIfCond_14) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringIndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringIndexOutOfBound")));

		} else {

			result = (java.lang.Character) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.elementAt(self, index);
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer size(

	java.lang.String self

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.size(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String capName(

	java.lang.String self

	) {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper
						.toUpperCase(kermeta.standard.helper.StringWrapper
								.substring(self, 0, 1)),
				kermeta.standard.helper.StringWrapper.substring(self, 1,
						kermeta.standard.helper.StringWrapper.size(self)));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String replace(

	java.lang.String self, java.lang.String str1, java.lang.String str2

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.replace(self, str1, str2);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toUpperCase(

	java.lang.String self

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toUpperCase(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer toInteger(

	java.lang.String self

	) {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toInteger(self);

		java.lang.Boolean idIfCond_15 = false;
		idIfCond_15 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_15) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringFormatException")));

		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toLowerCase(

	java.lang.String self

	) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toLowerCase(self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String substring(

	java.lang.String self, java.lang.Integer startIndex,
			java.lang.Integer subStringSize

	) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_16 = false;
		idIfCond_16 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.IntegerWrapper
																.isGreaterOrEqual(
																		startIndex,
																		0),
														kermeta.standard.helper.IntegerWrapper
																.isLowerOrEqual(
																		startIndex,
																		kermeta.standard.helper.StringWrapper
																				.size(self))),
										kermeta.standard.helper.IntegerWrapper
												.isLowerOrEqual(
														subStringSize,
														kermeta.standard.helper.StringWrapper
																.size(self))),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(subStringSize, startIndex));

		if (idIfCond_16) {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringUtil
					.substring(self, startIndex, subStringSize);
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringIndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringIndexOutOfBound")));

		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.standard.OrderedSet<java.lang.String> split(

	java.lang.String self, java.lang.String delimiter

	) {

		kermeta.standard.OrderedSet<java.lang.String> result = null;

		result = (kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.split(self, delimiter);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.String self

	) {

		java.lang.String result = null;

		result = self;

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isKindOf(

	java.lang.String self, kermeta.language.structure.Class cl

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

	java.lang.String self

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

	java.lang.String self, kermeta.language.structure.Property property,
			java.lang.String element

	) {

		java.lang.Boolean idIfCond_17 = false;
		idIfCond_17 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_17) {

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

	java.lang.String self

	) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(self).getterClassDefinition();

		java.lang.Boolean idIfCond_18 = false;
		idIfCond_18 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_18) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_19 = false;
				while (!idLoopCond_19) {
					idLoopCond_19 = it_ft3.isOff();
					if (idLoopCond_19) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp3 = it_ft3
								.next();

						//BIft:exists

						java.lang.Boolean result_ft4 = null;

						java.lang.Boolean test_ft4 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft4 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp3.getTag()).iterator();
							java.lang.Boolean idLoopCond_21 = false;
							while (!idLoopCond_21) {
								idLoopCond_21 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft4.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft4,
																false));
								if (idLoopCond_21) {
								} else {

									java.lang.Boolean result_lambda_ft4 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp4 = it_ft4
											.next();

									result_lambda_ft4 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp4.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft4 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft4, result_lambda_ft4);
								}
							}
						}

						result_ft4 = test_ft4;
						//EIft:exists
						java.lang.Boolean idIfCond_20 = false;
						idIfCond_20 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft4),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp3.getIsDerived()));

						if (idIfCond_20) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(self, p_lbdExp3);

							java.lang.Boolean idIfCond_22 = false;
							//BIft:andThen

							java.lang.Boolean result_ft5 = null;

							java.lang.Boolean idIfCond_23 = false;
							idIfCond_23 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_23) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp5 = null;

								result_ft5 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft5 = false;
							}

							//CEC
							idIfCond_22 = result_ft5;
							//EIft:andThen

							if (idIfCond_22) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_24 = false;
								idIfCond_24 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp3
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp3
																		.getUpper()));

								if (idIfCond_24) {

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
																							p_lbdExp3
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_25 = false;
								idIfCond_25 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp3.getLower());

								if (idIfCond_25) {

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
																							p_lbdExp3
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_26 = false;
								idIfCond_26 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp3
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_26) {

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
																							p_lbdExp3
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

	java.lang.String self

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

	java.lang.String self

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

	java.lang.String self, kermeta.language.structure.Type type

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

	java.lang.String self

	) {

		java.lang.Boolean idIfCond_27 = false;
		idIfCond_27 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(self, null);

		if (idIfCond_27) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_28 = false;
				while (!idLoopCond_28) {
					idLoopCond_28 = it_ft6.isOff();
					if (idLoopCond_28) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp6 = it_ft6
								.next();

						java.lang.Boolean idIfCond_29 = false;
						idIfCond_29 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp6.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp6
														.getIsDerived()));

						if (idIfCond_29) {

							java.lang.Boolean idIfCond_30 = false;
							idIfCond_30 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							self,
																							prop_lbdExp6))
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
																							prop_lbdExp6))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_30) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(self, prop_lbdExp6);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft7 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_31 = false;
									while (!idLoopCond_31) {
										idLoopCond_31 = it_ft7.isOff();
										if (idLoopCond_31) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp7 = it_ft7
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp7);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(self, prop_lbdExp6));
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

	java.lang.String self, kermeta.language.structure.Property property

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

	java.lang.String self, kermeta.language.structure.Property property

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

	java.lang.String self

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

	java.lang.String self

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

	java.lang.String self, java.lang.String element

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

	java.lang.String self, kermeta.language.structure.Property property

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(self,
				property);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.language.structure.Object container(

	java.lang.String self

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

	java.lang.String self

	) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(self);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.persistence.Resource containingResource(

	java.lang.String self

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

		java.lang.Boolean idIfCond_32 = false;
		idIfCond_32 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(self, type);

		if (idIfCond_32) {

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

	java.lang.String self, java.lang.String other

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

	java.lang.String self, java.lang.String other

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

	java.lang.String self, java.lang.String other

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

	java.lang.String self, java.lang.String other

	) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreater(self
				.compareTo(other), 0);

		return result;

	}

}
