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
	public static <G> java.lang.Boolean equals(

	java.lang.Double self, java.lang.Double other

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

		java.lang.Boolean idIfCond_94 = false;
		idIfCond_94 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_94) {

			java.lang.Boolean idIfCond_95 = false;
			idIfCond_95 = org.kermeta.compil.runtime.helper.language.ClassUtil
					.equalsSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(other),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_95) {

				result = kermeta.standard.helper.RealWrapper
						.equals(
								self,
								kermeta.standard.helper.IntegerWrapper
										.toReal(((java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														other,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"java.lang.Integer")))));
			} else {

				result = false;
			}

		} else {

			result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.equals(self, other), "java.lang.Boolean");
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double plus(

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_96 = false;
		idIfCond_96 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_96) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getVoidOperandError())));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.plus(self, other), "java.lang.Double");
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_97 = false;
		idIfCond_97 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_97) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getVoidOperandError())));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.times(self, other), "java.lang.Double");
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_98 = false;
		idIfCond_98 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_98) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getVoidOperandError())));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.minus(self, other), "java.lang.Double");
		}

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double uminus(

	java.lang.Double self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		result = kermeta.standard.helper.RealWrapper.minus(
				kermeta.standard.helper.IntegerWrapper.toReal(0), self);

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Integer toInteger(

	java.lang.Double self

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.RealUtil
								.toInteger(self), "java.lang.Integer");

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Double div(

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Double result = null;

		java.lang.Boolean idIfCond_99 = false;
		idIfCond_99 = kermeta.standard.helper.RealWrapper.equals(other,
				kermeta.standard.helper.IntegerWrapper.toReal(0));

		if (idIfCond_99) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.DivisionByZero) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getDivisionByZero())));

		}

		java.lang.Boolean idIfCond_100 = false;
		idIfCond_100 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_100) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.VoidOperandError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getVoidOperandError())));

		} else {

			result = (java.lang.Double) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.div(self, other), "java.lang.Double");
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
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);
		}
		//End of the protection

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_101 = false;
		idIfCond_101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.Double"));

		if (idIfCond_101) {

			java.lang.Boolean idIfCond_102 = false;
			idIfCond_102 = org.kermeta.compil.runtime.helper.language.ClassUtil
					.equalsSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(other),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"java.lang.Integer"));

			if (idIfCond_102) {

				result = kermeta.standard.helper.RealWrapper
						.compareTo(
								self,
								kermeta.standard.helper.IntegerWrapper
										.toReal(((java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														other,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"java.lang.Integer")))));
			} else {

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							((kermeta.standard.NotComparableException) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(kermeta.standard.StandardPackage.eINSTANCE
											.getNotComparableException())));

			}

		} else {

			result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.basetypes.RealUtil
									.compareTo(self, other),
							"java.lang.Integer");
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
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			return (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.toString((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.RealUtil
								.toString(self), "java.lang.String");

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean isLowerOrEqual(

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
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

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
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

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
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

	java.lang.Double self, java.lang.Double other

	) {
		//Protection of the following code
		if (self == null) {
			kermeta.exceptions.CallOnVoidTarget exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
					.createCallOnVoidTarget();
			exp.setMessage("Initialize the Real expression");
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
	public static <G> java.lang.Boolean isInstanceOf(

	java.lang.Double self, kermeta.language.structure.Type type

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

	java.lang.Double self

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

	java.lang.Double self

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

	java.lang.Double self

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

	java.lang.Double self

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

	java.lang.Double self, java.lang.Double element

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

		java.lang.Boolean idIfCond_103 = false;
		idIfCond_103 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_103) {

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

	java.lang.Double self, kermeta.language.structure.Class cl

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

	java.lang.Double self, kermeta.language.structure.Property property

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

	java.lang.Double self, kermeta.language.structure.Property property

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

	java.lang.Double self, kermeta.language.structure.Property property,
			java.lang.Double element

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

		java.lang.Boolean idIfCond_104 = false;
		idIfCond_104 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_104) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(self,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_105 = false;
			//BIft:andThen

			java.lang.Boolean result_ft22 = null;

			java.lang.Boolean idIfCond_106 = false;
			idIfCond_106 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_106) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp22 = null;

				result_ft22 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft22 = false;
			}

			//CEC
			idIfCond_105 = result_ft22;
			//EIft:andThen

			if (idIfCond_105) {

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

	java.lang.Double self

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

	java.lang.Double self

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

	java.lang.Double self

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

		java.lang.Boolean idIfCond_107 = false;
		idIfCond_107 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_107) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_108 = false;
				while (!idLoopCond_108) {
					idLoopCond_108 = it_ft23.isOff();
					if (idLoopCond_108) {
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
							java.lang.Boolean idLoopCond_110 = false;
							while (!idLoopCond_110) {
								idLoopCond_110 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft24.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft24,
																false));
								if (idLoopCond_110) {
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
						java.lang.Boolean idIfCond_109 = false;
						idIfCond_109 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft24),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp23.getIsDerived()));

						if (idIfCond_109) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp23);

							java.lang.Boolean idIfCond_111 = false;
							//BIft:andThen

							java.lang.Boolean result_ft25 = null;

							java.lang.Boolean idIfCond_112 = false;
							idIfCond_112 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_112) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp25 = null;

								result_ft25 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
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
							idIfCond_111 = result_ft25;
							//EIft:andThen

							if (idIfCond_111) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_113 = false;
								idIfCond_113 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp23
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp23
																		.getUpper()));

								if (idIfCond_113) {

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
																							p_lbdExp23
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_114 = false;
								idIfCond_114 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp23
												.getLower());

								if (idIfCond_114) {

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
																							p_lbdExp23
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_115 = false;
								idIfCond_115 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp23
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_115) {

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
																							p_lbdExp23
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

	java.lang.Double self

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

	java.lang.Double self, kermeta.language.structure.Property property

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

	java.lang.Double self

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

	java.lang.Double self

	) {
		//Protection of the following code
		if (self == null
				|| ((java.lang.Object) self) instanceof kermeta.language.structure.Object) {
			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkAllInvariants((kermeta.language.structure.Object) ((java.lang.Object) self));
		}
		//End of the protection

		java.lang.Boolean idIfCond_116 = false;
		idIfCond_116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_116) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_117 = false;
				while (!idLoopCond_117) {
					idLoopCond_117 = it_ft26.isOff();
					if (idLoopCond_117) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp26 = it_ft26
								.next();

						java.lang.Boolean idIfCond_118 = false;
						idIfCond_118 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp26.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp26
														.getIsDerived()));

						if (idIfCond_118) {

							java.lang.Boolean idIfCond_119 = false;
							idIfCond_119 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp26)));

							if (idIfCond_119) {

								java.lang.Boolean idIfCond_120 = false;
								//BIft:exists

								java.lang.Boolean result_ft27 = null;

								java.lang.Boolean test_ft27 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft27 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp26))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_121 = false;
									while (!idLoopCond_121) {
										idLoopCond_121 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft27.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft27,
																		false));
										if (idLoopCond_121) {
										} else {

											java.lang.Boolean result_lambda_ft27 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp27 = it_ft27
													.next();

											java.lang.Boolean idIfCond_122 = false;
											idIfCond_122 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp27,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_122) {

												result_lambda_ft27 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp27,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft27 = false;
											}

											//EIle:func

											test_ft27 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft27,
															result_lambda_ft27);
										}
									}
								}

								result_ft27 = test_ft27;

								//CEC
								idIfCond_120 = result_ft27;
								//EIft:exists

								if (idIfCond_120) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(self,
																	prop_lbdExp26),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft28 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_123 = false;
										while (!idLoopCond_123) {
											idLoopCond_123 = it_ft28.isOff();
											if (idLoopCond_123) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp28 = it_ft28
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp28);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp26));
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

	public static Boolean equals(Double real, Integer other) {
		return org.kermeta.compil.runtime.helper.basetypes.RealUtil.equals(
				real, other);
	}

	public static Integer compareTo(Double real, Integer other) {
		return org.kermeta.compil.runtime.helper.basetypes.RealUtil.compareTo(
				real, other);
	}

}
