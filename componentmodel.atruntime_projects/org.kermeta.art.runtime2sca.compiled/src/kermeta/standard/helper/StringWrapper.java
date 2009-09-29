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

		java.lang.Boolean idIfCond_1 = false;
		idIfCond_1 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_1) {

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
	public static <G> java.lang.String cleanName(

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

		result = kermeta.standard.helper.StringWrapper.replace(self, " ", "");

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

		java.lang.Boolean idIfCond_2 = false;
		idIfCond_2 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_2) {

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

		java.lang.Boolean idIfCond_3 = false;
		idIfCond_3 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_3) {

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

		java.lang.Boolean idIfCond_4 = false;
		idIfCond_4 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_4) {

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

		java.lang.Boolean idIfCond_5 = false;
		idIfCond_5 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_5) {

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

		java.lang.Boolean idIfCond_6 = false;
		idIfCond_6 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_6) {

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

		java.lang.Boolean idIfCond_7 = false;
		idIfCond_7 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(
								kermeta.standard.helper.StringWrapper
										.size(self), 1)));

		if (idIfCond_7) {

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

		java.lang.Boolean idIfCond_8 = false;
		idIfCond_8 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_8) {

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

		java.lang.Boolean idIfCond_9 = false;
		idIfCond_9 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_9) {

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

		java.lang.Boolean idIfCond_10 = false;
		idIfCond_10 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_10) {

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

		java.lang.Boolean idIfCond_11 = false;
		idIfCond_11 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_11) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(self,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_12 = false;
			//BIft:andThen

			java.lang.Boolean result_ft1 = null;

			java.lang.Boolean idIfCond_13 = false;
			idIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_13) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp1 = null;

				result_ft1 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft1 = false;
			}

			//CEC
			idIfCond_12 = result_ft1;
			//EIft:andThen

			if (idIfCond_12) {

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

		java.lang.Boolean idIfCond_14 = false;
		idIfCond_14 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_14) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_15 = false;
				while (!idLoopCond_15) {
					idLoopCond_15 = it_ft2.isOff();
					if (idLoopCond_15) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp2 = it_ft2
								.next();

						//BIft:exists

						java.lang.Boolean result_ft3 = null;

						java.lang.Boolean test_ft3 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp2.getTag()).iterator();
							java.lang.Boolean idLoopCond_17 = false;
							while (!idLoopCond_17) {
								idLoopCond_17 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft3.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft3, false));
								if (idLoopCond_17) {
								} else {

									java.lang.Boolean result_lambda_ft3 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp3 = it_ft3
											.next();

									result_lambda_ft3 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp3.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft3 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft3, result_lambda_ft3);
								}
							}
						}

						result_ft3 = test_ft3;
						//EIft:exists
						java.lang.Boolean idIfCond_16 = false;
						idIfCond_16 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft3),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp2.getIsDerived()));

						if (idIfCond_16) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp2);

							java.lang.Boolean idIfCond_18 = false;
							//BIft:andThen

							java.lang.Boolean result_ft4 = null;

							java.lang.Boolean idIfCond_19 = false;
							idIfCond_19 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_19) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp4 = null;

								result_ft4 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft4 = false;
							}

							//CEC
							idIfCond_18 = result_ft4;
							//EIft:andThen

							if (idIfCond_18) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_20 = false;
								idIfCond_20 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp2
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp2
																		.getUpper()));

								if (idIfCond_20) {

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
																							p_lbdExp2
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_21 = false;
								idIfCond_21 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp2.getLower());

								if (idIfCond_21) {

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
																							p_lbdExp2
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_22 = false;
								idIfCond_22 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp2
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_22) {

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
																							p_lbdExp2
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

		java.lang.Boolean idIfCond_23 = false;
		idIfCond_23 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_23) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_24 = false;
				while (!idLoopCond_24) {
					idLoopCond_24 = it_ft5.isOff();
					if (idLoopCond_24) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp5 = it_ft5
								.next();

						java.lang.Boolean idIfCond_25 = false;
						idIfCond_25 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp5.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp5
														.getIsDerived()));

						if (idIfCond_25) {

							java.lang.Boolean idIfCond_26 = false;
							idIfCond_26 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp5)));

							if (idIfCond_26) {

								java.lang.Boolean idIfCond_27 = false;
								//BIft:exists

								java.lang.Boolean result_ft6 = null;

								java.lang.Boolean test_ft6 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft6 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp5))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_28 = false;
									while (!idLoopCond_28) {
										idLoopCond_28 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft6.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft6,
																		false));
										if (idLoopCond_28) {
										} else {

											java.lang.Boolean result_lambda_ft6 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp6 = it_ft6
													.next();

											java.lang.Boolean idIfCond_29 = false;
											idIfCond_29 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp6,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_29) {

												result_lambda_ft6 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp6,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft6 = false;
											}

											//EIle:func

											test_ft6 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft6,
															result_lambda_ft6);
										}
									}
								}

								result_ft6 = test_ft6;

								//CEC
								idIfCond_27 = result_ft6;
								//EIft:exists

								if (idIfCond_27) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp5),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft7 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_30 = false;
										while (!idLoopCond_30) {
											idLoopCond_30 = it_ft7.isOff();
											if (idLoopCond_30) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp7 = it_ft7
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp7);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp5));
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

}
