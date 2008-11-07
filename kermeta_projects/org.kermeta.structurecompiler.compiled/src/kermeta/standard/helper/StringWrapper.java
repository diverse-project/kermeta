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

		java.lang.Boolean idIfCond_686 = false;
		idIfCond_686 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_686) {

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

		java.lang.Boolean idIfCond_687 = false;
		idIfCond_687 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_687) {

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
	public static <G> java.lang.Boolean equals(

	java.lang.String self, java.lang.String other

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equals(
							(kermeta.language.structure.Object) ((java.lang.Object) self),
							other);
		}
		//End of the protection

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_688 = false;
		idIfCond_688 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_688) {

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

			kermeta.standard.Iterator<java.lang.String> it_ft153 = set_infos
					.iterator();
			java.lang.Boolean idLoopCond_689 = false;
			while (!idLoopCond_689) {
				idLoopCond_689 = it_ft153.isOff();
				if (idLoopCond_689) {
				} else {

					//BIle:func
					java.lang.String i_lbdExp153 = it_ft153.next();

					kermeta.standard.OrderedSet<java.lang.String> tmp_set_infos = kermeta.standard.helper.StringWrapper
							.split(i_lbdExp153, "=");

					java.lang.Boolean idIfCond_690 = false;
					idIfCond_690 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(tmp_set_infos.size(), 2);

					if (idIfCond_690) {

						java.lang.Boolean idIfCond_691 = false;
						idIfCond_691 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tmp_set_infos
												.elementAt(0)));

						if (idIfCond_691) {

							java.lang.Boolean idIfCond_692 = false;
							idIfCond_692 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_692) {

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

		result = kermeta.standard.helper.StringWrapper.replace(
				kermeta.standard.helper.StringWrapper.replace(self, ".equals(null)",
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

		java.lang.Boolean idIfCond_693 = false;
		idIfCond_693 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_693) {

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

			kermeta.standard.Iterator<java.lang.String> it_ft154 = set_str
					.iterator();
			java.lang.Boolean idLoopCond_694 = false;
			while (!idLoopCond_694) {
				idLoopCond_694 = it_ft154.isOff();
				if (idLoopCond_694) {
				} else {

					//BIle:func
					java.lang.String seg_lbdExp154 = it_ft154.next();

					java.lang.Boolean idIfCond_695 = false;
					idIfCond_695 = kermeta.standard.helper.IntegerWrapper
							.isLower(inc_seg,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_str.size(), 1));

					if (idIfCond_695) {

						result = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, seg_lbdExp154), ".");
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

		java.lang.Boolean idIfCond_696 = false;
		idIfCond_696 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_696) {

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

		java.lang.Boolean idIfCond_697 = false;
		idIfCond_697 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_697) {

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

		java.lang.Boolean idIfCond_698 = false;
		idIfCond_698 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						context.getValueTypeMapping()).contains(self);

		if (idIfCond_698) {

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

		java.lang.Boolean idIfCond_699 = false;
		idIfCond_699 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(
								kermeta.standard.helper.StringWrapper
										.size(self), 1)));

		if (idIfCond_699) {

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

		java.lang.Boolean idIfCond_700 = false;
		idIfCond_700 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_700) {

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

		java.lang.Boolean idIfCond_701 = false;
		idIfCond_701 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_701) {

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

		java.lang.Boolean idIfCond_702 = false;
		idIfCond_702 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_702) {

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

		java.lang.Boolean idIfCond_703 = false;
		idIfCond_703 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_703) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_704 = false;
				while (!idLoopCond_704) {
					idLoopCond_704 = it_ft155.isOff();
					if (idLoopCond_704) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp155 = it_ft155
								.next();

						//BIft:exists

						java.lang.Boolean result_ft156 = null;

						java.lang.Boolean test_ft156 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft156 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp155.getTag()).iterator();
							java.lang.Boolean idLoopCond_706 = false;
							while (!idLoopCond_706) {
								idLoopCond_706 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft156.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft156,
																false));
								if (idLoopCond_706) {
								} else {

									java.lang.Boolean result_lambda_ft156 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp156 = it_ft156
											.next();

									result_lambda_ft156 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp156.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft156 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft156, result_lambda_ft156);
								}
							}
						}

						result_ft156 = test_ft156;
						//EIft:exists
						java.lang.Boolean idIfCond_705 = false;
						idIfCond_705 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft156),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp155.getIsDerived()));

						if (idIfCond_705) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp155);

							java.lang.Boolean idIfCond_707 = false;
							//BIft:andThen

							java.lang.Boolean result_ft157 = null;

							java.lang.Boolean idIfCond_708 = false;
							idIfCond_708 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_708) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp157 = null;

								result_ft157 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft157 = false;
							}

							//CEC
							idIfCond_707 = result_ft157;
							//EIft:andThen

							if (idIfCond_707) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_709 = false;
								idIfCond_709 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp155
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp155
																		.getUpper()));

								if (idIfCond_709) {

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
																							p_lbdExp155
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_710 = false;
								idIfCond_710 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp155
												.getLower());

								if (idIfCond_710) {

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
																							p_lbdExp155
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_711 = false;
								idIfCond_711 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp155
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_711) {

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
																							p_lbdExp155
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

		java.lang.Boolean idIfCond_712 = false;
		idIfCond_712 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_712) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft158 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_713 = false;
				while (!idLoopCond_713) {
					idLoopCond_713 = it_ft158.isOff();
					if (idLoopCond_713) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp158 = it_ft158
								.next();

						java.lang.Boolean idIfCond_714 = false;
						idIfCond_714 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp158.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp158
														.getIsDerived()));

						if (idIfCond_714) {

							java.lang.Boolean idIfCond_715 = false;
							idIfCond_715 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp158)));

							if (idIfCond_715) {

								java.lang.Boolean idIfCond_716 = false;
								//BIft:exists

								java.lang.Boolean result_ft159 = null;

								java.lang.Boolean test_ft159 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft159 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp158))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_717 = false;
									while (!idLoopCond_717) {
										idLoopCond_717 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft159.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft159,
																		false));
										if (idLoopCond_717) {
										} else {

											java.lang.Boolean result_lambda_ft159 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp159 = it_ft159
													.next();

											java.lang.Boolean idIfCond_718 = false;
											idIfCond_718 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp159,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_718) {

												result_lambda_ft159 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp159,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft159 = false;
											}

											//EIle:func

											test_ft159 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft159,
															result_lambda_ft159);
										}
									}
								}

								result_ft159 = test_ft159;

								//CEC
								idIfCond_716 = result_ft159;
								//EIft:exists

								if (idIfCond_716) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp158));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft160 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_719 = false;
										while (!idLoopCond_719) {
											idLoopCond_719 = it_ft160.isOff();
											if (idLoopCond_719) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp160 = it_ft160
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp160);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp158));
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

		java.lang.Boolean idIfCond_720 = false;
		idIfCond_720 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_720) {

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
