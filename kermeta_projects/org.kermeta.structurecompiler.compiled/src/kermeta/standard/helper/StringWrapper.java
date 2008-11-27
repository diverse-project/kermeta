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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		java.lang.Boolean idIfCond_961 = false;
		idIfCond_961 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_961) {

			result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.String> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.plus(
											self,
											kermeta.standard.helper.StringWrapper
													.toString(other)));
		} else {

			result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.String> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.plus(self, other));
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean idIfCond_962 = false;
		idIfCond_962 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_962) {

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
	public static <G> java.lang.Boolean equals(

	java.lang.String self, java.lang.String other

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

		java.lang.Boolean idIfCond_963 = false;
		idIfCond_963 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_963) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.Boolean> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.equals(self, other));
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> kermeta.utils.Hashtable<java.lang.String, java.lang.String> getPropertyInfos(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		kermeta.utils.Hashtable<java.lang.String, java.lang.String> result = null;

		kermeta.standard.OrderedSet<java.lang.String> set_infos = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<java.lang.String>"));

		kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = ((kermeta.utils.Hashtable<java.lang.String, java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.Hashtable<java.lang.String, java.lang.String>"));

		set_infos = kermeta.standard.helper.StringWrapper.split(self, " ");

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft215 = set_infos
					.iterator();
			java.lang.Boolean idLoopCond_964 = false;
			while (!idLoopCond_964) {
				idLoopCond_964 = it_ft215.isOff();
				if (idLoopCond_964) {
				} else {

					//BIle:func
					java.lang.String i_lbdExp215 = it_ft215.next();

					kermeta.standard.OrderedSet<java.lang.String> tmp_set_infos = kermeta.standard.helper.StringWrapper
							.split(i_lbdExp215, "=");

					java.lang.Boolean idIfCond_965 = false;
					idIfCond_965 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(tmp_set_infos.size(), 2);

					if (idIfCond_965) {

						java.lang.Boolean idIfCond_966 = false;
						idIfCond_966 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tmp_set_infos
												.elementAt(0)));

						if (idIfCond_966) {

							java.lang.Boolean idIfCond_967 = false;
							idIfCond_967 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(tmp_set_infos
																	.elementAt(1))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															tmp_set_infos
																	.elementAt(1),
															""));

							if (idIfCond_967) {

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
	public static <G> java.lang.Double toReal(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		result = (java.lang.Double) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Double> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toReal(self));

		java.lang.Boolean idIfCond_968 = false;
		idIfCond_968 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_968) {

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
	public static <G> java.lang.String normalizeStatement(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		java.lang.String EQUALS_NULL_STR = ".equals(null)";

		java.lang.String DOUBLE_SEMICOLON = ";;";

		result = self;

		java.lang.Boolean idIfCond_969 = false;
		idIfCond_969 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.contains(result,
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\"", EQUALS_NULL_STR), "\"")));

		if (idIfCond_969) {

			result = kermeta.standard.helper.StringWrapper.replace(result,
					EQUALS_NULL_STR, " == null");
		}

		java.lang.Boolean idIfCond_970 = false;
		idIfCond_970 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.contains(result,
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\"", DOUBLE_SEMICOLON), "\"")));

		if (idIfCond_970) {

			result = kermeta.standard.helper.StringWrapper.replace(result,
					DOUBLE_SEMICOLON, ";");
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String replaceExtension(

	java.lang.String self, java.lang.String new_extension

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		result = "";

		kermeta.standard.OrderedSet<java.lang.String> set_str = kermeta.standard.helper.StringWrapper
				.split(self, "\\.");

		java.lang.Integer inc_seg = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft216 = set_str
					.iterator();
			java.lang.Boolean idLoopCond_971 = false;
			while (!idLoopCond_971) {
				idLoopCond_971 = it_ft216.isOff();
				if (idLoopCond_971) {
				} else {

					//BIle:func
					java.lang.String seg_lbdExp216 = it_ft216.next();

					java.lang.Boolean idIfCond_972 = false;
					idIfCond_972 = kermeta.standard.helper.IntegerWrapper
							.isLower(inc_seg,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_str.size(), 1));

					if (idIfCond_972) {

						result = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, seg_lbdExp216), ".");
					}

					inc_seg = kermeta.standard.helper.IntegerWrapper.plus(
							inc_seg, 1);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = kermeta.standard.helper.StringWrapper.plus(result,
				new_extension);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean toBoolean(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toBoolean(self));

		java.lang.Boolean idIfCond_973 = false;
		idIfCond_973 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_973) {

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
	public static <G> java.lang.Integer compareTo(

	java.lang.String self, java.lang.String other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_974 = false;
		idIfCond_974 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_974) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.CallOnVoidTarget")));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.Integer> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.compareTo(self, other));
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isValueType(

	java.lang.String self, km2ecore.KM2EcoreContext context

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_975 = false;
		idIfCond_975 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						context.getValueTypeMapping()).contains(self);

		if (idIfCond_975) {

			result = true;
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.contains(self, str1));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer indexOf(

	java.lang.String self, java.lang.String str

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.indexOf(self, str));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Character elementAt(

	java.lang.String self, java.lang.Integer index

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Character result = null;

		java.lang.Boolean idIfCond_976 = false;
		idIfCond_976 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(
								kermeta.standard.helper.StringWrapper
										.size(self), 1)));

		if (idIfCond_976) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringIndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.StringIndexOutOfBound")));

		} else {

			result = (java.lang.Character) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.Character> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.elementAt(self, index));
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String capName(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

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
	public static <G> java.lang.Integer size(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.size(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String replace(

	java.lang.String self, java.lang.String str1, java.lang.String str2

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.replace(self, str1, str2));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toUpperCase(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toUpperCase(self));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer toInteger(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toInteger(self));

		java.lang.Boolean idIfCond_977 = false;
		idIfCond_977 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_977) {

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toLowerCase(self));

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.String result = null;

		java.lang.Boolean idIfCond_978 = false;
		idIfCond_978 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_978) {

			result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<java.lang.String> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.substring(self, startIndex, subStringSize));
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		kermeta.standard.OrderedSet<java.lang.String> result = null;

		result = (kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.standard.OrderedSet<java.lang.String>> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.split(self, delimiter));

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String toString(

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.toString((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

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

	java.lang.String self

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

	java.lang.String self, kermeta.language.structure.Property property,
			java.lang.String element

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

		java.lang.Boolean idIfCond_979 = false;
		idIfCond_979 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_979) {

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

	java.lang.String self

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

		java.lang.Boolean idIfCond_980 = false;
		idIfCond_980 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_980) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_981 = false;
				while (!idLoopCond_981) {
					idLoopCond_981 = it_ft217.isOff();
					if (idLoopCond_981) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp217 = it_ft217
								.next();

						//BIft:exists

						java.lang.Boolean result_ft218 = null;

						java.lang.Boolean test_ft218 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp217.getTag()).iterator();
							java.lang.Boolean idLoopCond_983 = false;
							while (!idLoopCond_983) {
								idLoopCond_983 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft218.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft218,
																false));
								if (idLoopCond_983) {
								} else {

									java.lang.Boolean result_lambda_ft218 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp218 = it_ft218
											.next();

									result_lambda_ft218 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp218.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft218 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft218, result_lambda_ft218);
								}
							}
						}

						result_ft218 = test_ft218;
						//EIft:exists
						java.lang.Boolean idIfCond_982 = false;
						idIfCond_982 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft218),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp217.getIsDerived()));

						if (idIfCond_982) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp217);

							java.lang.Boolean idIfCond_984 = false;
							//BIft:andThen

							java.lang.Boolean result_ft219 = null;

							java.lang.Boolean idIfCond_985 = false;
							idIfCond_985 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_985) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp219 = null;

								result_ft219 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft219 = false;
							}

							//CEC
							idIfCond_984 = result_ft219;
							//EIft:andThen

							if (idIfCond_984) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_986 = false;
								idIfCond_986 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp217
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp217
																		.getUpper()));

								if (idIfCond_986) {

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
																							p_lbdExp217
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_987 = false;
								idIfCond_987 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp217
												.getLower());

								if (idIfCond_987) {

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
																							p_lbdExp217
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_988 = false;
								idIfCond_988 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp217
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_988) {

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
																							p_lbdExp217
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

	java.lang.String self

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

	java.lang.String self

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

	java.lang.String self, kermeta.language.structure.Type type

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

	java.lang.String self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkAllInvariants((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Boolean idIfCond_989 = false;
		idIfCond_989 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_989) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft220 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_990 = false;
				while (!idLoopCond_990) {
					idLoopCond_990 = it_ft220.isOff();
					if (idLoopCond_990) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp220 = it_ft220
								.next();

						java.lang.Boolean idIfCond_991 = false;
						idIfCond_991 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp220.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp220
														.getIsDerived()));

						if (idIfCond_991) {

							java.lang.Boolean idIfCond_992 = false;
							idIfCond_992 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp220)));

							if (idIfCond_992) {

								java.lang.Boolean idIfCond_993 = false;
								//BIft:exists

								java.lang.Boolean result_ft221 = null;

								java.lang.Boolean test_ft221 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft221 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp220))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_994 = false;
									while (!idLoopCond_994) {
										idLoopCond_994 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft221.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft221,
																		false));
										if (idLoopCond_994) {
										} else {

											java.lang.Boolean result_lambda_ft221 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp221 = it_ft221
													.next();

											java.lang.Boolean idIfCond_995 = false;
											idIfCond_995 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp221,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_995) {

												result_lambda_ft221 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp221,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft221 = false;
											}

											//EIle:func

											test_ft221 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft221,
															result_lambda_ft221);
										}
									}
								}

								result_ft221 = test_ft221;

								//CEC
								idIfCond_993 = result_ft221;
								//EIft:exists

								if (idIfCond_993) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp220));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft222 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_996 = false;
										while (!idLoopCond_996) {
											idLoopCond_996 = it_ft222.isOff();
											if (idLoopCond_996) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp222 = it_ft222
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp222);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp220));
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

	java.lang.String self, kermeta.language.structure.Property property

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

	java.lang.String self, kermeta.language.structure.Property property

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

	java.lang.String self

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

	java.lang.String self

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

	java.lang.String self, java.lang.String element

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

	java.lang.String self, kermeta.language.structure.Property property

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

	java.lang.String self

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

	java.lang.String self

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

	java.lang.String self

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

		java.lang.Boolean idIfCond_997 = false;
		idIfCond_997 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_997) {

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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
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

	java.lang.String self, java.lang.String other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
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

	java.lang.String self, java.lang.String other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
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

	java.lang.String self, java.lang.String other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.isGreater(self
				.compareTo(other), 0);

		return result;

	}

}
