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

		java.lang.Boolean idIfCond_827 = false;
		idIfCond_827 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_827) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getCallOnVoidTarget())));

		} else {

			org.kermeta.compil.runtime.helper.basetypes.StringUtil.append(self,
					other);
		}

	}

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

		java.lang.Boolean idIfCond_828 = false;
		idIfCond_828 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_828) {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.plus(
											self,
											kermeta.standard.helper.StringWrapper
													.toString(other)),
							"java.lang.String");
		} else {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.plus(self, other), "java.lang.String");
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

		kermeta.standard.Sequence<java.lang.String> set_infos = ((kermeta.standard.Sequence<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = ((kermeta.utils.Hashtable<java.lang.String, java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getHashtable()));

		set_infos = kermeta.standard.helper.StringWrapper.split(self, " ");

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft183 = set_infos
					.iterator();
			java.lang.Boolean idLoopCond_829 = false;
			while (!idLoopCond_829) {
				idLoopCond_829 = it_ft183.isOff();
				if (idLoopCond_829) {
				} else {

					//BIle:func
					java.lang.String i_lbdExp183 = it_ft183.next();

					kermeta.standard.Sequence<java.lang.String> tmp_set_infos = kermeta.standard.helper.StringWrapper
							.split(i_lbdExp183, "=");

					java.lang.Boolean idIfCond_830 = false;
					idIfCond_830 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(tmp_set_infos.size(), 2);

					if (idIfCond_830) {

						java.lang.Boolean idIfCond_831 = false;
						idIfCond_831 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tmp_set_infos
												.elementAt(0)));

						if (idIfCond_831) {

							java.lang.Boolean idIfCond_832 = false;
							idIfCond_832 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_832) {

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

		java.lang.Boolean idIfCond_833 = false;
		idIfCond_833 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_833) {

			result = false;
		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.equals(self, other), "java.lang.Boolean");
		}

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

		result = (java.lang.Double) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toReal(self), "java.lang.Double");

		java.lang.Boolean idIfCond_834 = false;
		idIfCond_834 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_834) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getStringFormatException())));

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

		java.lang.Boolean idIfCond_835 = false;
		idIfCond_835 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.contains(result,
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\"", EQUALS_NULL_STR), "\"")));

		if (idIfCond_835) {

			result = kermeta.standard.helper.StringWrapper.replace(result,
					EQUALS_NULL_STR, " == null");
		}

		java.lang.Boolean idIfCond_836 = false;
		idIfCond_836 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.contains(result,
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\"", DOUBLE_SEMICOLON), "\"")));

		if (idIfCond_836) {

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

		kermeta.standard.Sequence<java.lang.String> set_str = kermeta.standard.helper.StringWrapper
				.split(self, "\\.");

		java.lang.Integer inc_seg = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft184 = set_str
					.iterator();
			java.lang.Boolean idLoopCond_837 = false;
			while (!idLoopCond_837) {
				idLoopCond_837 = it_ft184.isOff();
				if (idLoopCond_837) {
				} else {

					//BIle:func
					java.lang.String seg_lbdExp184 = it_ft184.next();

					java.lang.Boolean idIfCond_838 = false;
					idIfCond_838 = kermeta.standard.helper.IntegerWrapper
							.isLower(inc_seg,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_str.size(), 1));

					if (idIfCond_838) {

						result = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, seg_lbdExp184), ".");
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toBoolean(self), "java.lang.Boolean");

		java.lang.Boolean idIfCond_839 = false;
		idIfCond_839 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_839) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getStringFormatException())));

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

		java.lang.Boolean idIfCond_840 = false;
		idIfCond_840 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_840) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.CallOnVoidTarget) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getCallOnVoidTarget())));

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.compareTo(self, other),
							"java.lang.Integer");
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.contains(self, str1), "java.lang.Boolean");

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

		java.lang.Boolean idIfCond_841 = false;
		idIfCond_841 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						context.getValueTypeMapping()).contains(self);

		if (idIfCond_841) {

			result = true;
		}

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

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.indexOf(self, str), "java.lang.Integer");

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

		java.lang.Boolean idIfCond_842 = false;
		idIfCond_842 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(
								kermeta.standard.helper.StringWrapper
										.size(self), 1)));

		if (idIfCond_842) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringIndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getStringIndexOutOfBound())));

		} else {

			result = (java.lang.Character) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.elementAt(self, index),
							"java.lang.Character");
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.size(self), "java.lang.Integer");

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

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.replace(self, str1, str2), "java.lang.String");

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

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toUpperCase(self), "java.lang.String");

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

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toInteger(self), "java.lang.Integer");

		java.lang.Boolean idIfCond_843 = false;
		idIfCond_843 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_843) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringFormatException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getStringFormatException())));

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

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.toLowerCase(self), "java.lang.String");

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String substring(

	java.lang.String self, java.lang.Integer startIndex,
			java.lang.Integer endIndex

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

		java.lang.Boolean idIfCond_844 = false;
		idIfCond_844 = kermeta.standard.helper.BooleanWrapper
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
														endIndex,
														kermeta.standard.helper.StringWrapper
																.size(self))),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(endIndex, startIndex));

		if (idIfCond_844) {

			result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.StringUtil
									.substring(self, startIndex, endIndex),
							"java.lang.String");
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.StringIndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getStringIndexOutOfBound())));

		}

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
	public static <G> kermeta.standard.Sequence<java.lang.String> split(

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

		kermeta.standard.Sequence<java.lang.String> result = null;

		result = (kermeta.standard.Sequence<java.lang.String>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.StringUtil
								.split(self, delimiter),
						"kermeta.standard.Sequence<java.lang.String>");

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

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.equalsSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(self), cl);

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

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(self),
						"kermeta.language.structure.Class");

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

		java.lang.Boolean idIfCond_845 = false;
		idIfCond_845 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_845) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(self,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_846 = false;
			//BIft:andThen

			java.lang.Boolean result_ft185 = null;

			java.lang.Boolean idIfCond_847 = false;
			idIfCond_847 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_847) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp185 = null;

				result_ft185 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft185 = false;
			}

			//CEC
			idIfCond_846 = result_ft185;
			//EIft:andThen

			if (idIfCond_846) {

				org.kermeta.compil.runtime.helper.language.ObjectUtil.set(self,
						property, v);
			} else {

				kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
								.getIncompatibleTypeError()));

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

		java.lang.Boolean idIfCond_848 = false;
		idIfCond_848 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_848) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft186 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_849 = false;
				while (!idLoopCond_849) {
					idLoopCond_849 = it_ft186.isOff();
					if (idLoopCond_849) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp186 = it_ft186
								.next();

						//BIft:exists

						java.lang.Boolean result_ft187 = null;

						java.lang.Boolean test_ft187 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft187 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp186.getTag()).iterator();
							java.lang.Boolean idLoopCond_851 = false;
							while (!idLoopCond_851) {
								idLoopCond_851 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft187.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft187,
																false));
								if (idLoopCond_851) {
								} else {

									java.lang.Boolean result_lambda_ft187 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp187 = it_ft187
											.next();

									result_lambda_ft187 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp187.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft187 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft187, result_lambda_ft187);
								}
							}
						}

						result_ft187 = test_ft187;
						//EIft:exists
						java.lang.Boolean idIfCond_850 = false;
						idIfCond_850 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft187),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp186.getIsDerived()));

						if (idIfCond_850) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp186);

							java.lang.Boolean idIfCond_852 = false;
							//BIft:andThen

							java.lang.Boolean result_ft188 = null;

							java.lang.Boolean idIfCond_853 = false;
							idIfCond_853 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_853) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp188 = null;

								result_ft188 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft188 = false;
							}

							//CEC
							idIfCond_852 = result_ft188;
							//EIft:andThen

							if (idIfCond_852) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_854 = false;
								idIfCond_854 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp186
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp186
																		.getUpper()));

								if (idIfCond_854) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

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
																							p_lbdExp186
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_855 = false;
								idIfCond_855 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp186
												.getLower());

								if (idIfCond_855) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

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
																							p_lbdExp186
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_856 = false;
								idIfCond_856 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp186
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_856) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

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
																							p_lbdExp186
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

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getOID(self), "java.lang.Integer");

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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(self, type.getClass().getName()),
						"java.lang.Boolean");

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

		java.lang.Boolean idIfCond_857 = false;
		idIfCond_857 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_857) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(self)
									.getTypeDefinition(),
							"kermeta.language.structure.ClassDefinition");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft189 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_858 = false;
				while (!idLoopCond_858) {
					idLoopCond_858 = it_ft189.isOff();
					if (idLoopCond_858) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp189 = it_ft189
								.next();

						java.lang.Boolean idIfCond_859 = false;
						idIfCond_859 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp189.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp189
														.getIsDerived()));

						if (idIfCond_859) {

							java.lang.Boolean idIfCond_860 = false;
							idIfCond_860 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp189)));

							if (idIfCond_860) {

								java.lang.Boolean idIfCond_861 = false;
								//BIft:exists

								java.lang.Boolean result_ft190 = null;

								java.lang.Boolean test_ft190 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft190 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp189))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_862 = false;
									while (!idLoopCond_862) {
										idLoopCond_862 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft190.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft190,
																		false));
										if (idLoopCond_862) {
										} else {

											java.lang.Boolean result_lambda_ft190 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp190 = it_ft190
													.next();

											java.lang.Boolean idIfCond_863 = false;
											idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp190,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_863) {

												result_lambda_ft190 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp190,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft190 = false;
											}

											//EIle:func

											test_ft190 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft190,
															result_lambda_ft190);
										}
									}
								}

								result_ft190 = test_ft190;

								//CEC
								idIfCond_861 = result_ft190;
								//EIft:exists

								if (idIfCond_861) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp189),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft191 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_864 = false;
										while (!idLoopCond_864) {
											idLoopCond_864 = it_ft191.isOff();
											if (idLoopCond_864) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp191 = it_ft191
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp191);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp189));
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isSet(self, property), "java.lang.Boolean");

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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isFrozen(self), "java.lang.Boolean");

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

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.hashcode(self), "java.lang.Integer");

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

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getContainingResource(self),
						"kermeta.persistence.Resource");

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

		java.lang.Boolean idIfCond_865 = false;
		idIfCond_865 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_865) {

			result = self;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getTypeCastError())));

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
