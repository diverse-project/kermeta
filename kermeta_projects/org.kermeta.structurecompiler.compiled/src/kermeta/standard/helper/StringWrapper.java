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

		java.lang.Boolean idIfCond_829 = false;
		idIfCond_829 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_829) {

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

		java.lang.String result = null;

		java.lang.Boolean idIfCond_830 = false;
		idIfCond_830 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_830) {

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
	public static <G> java.lang.Boolean equals(

	java.lang.String self, java.lang.String other

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_831 = false;
		idIfCond_831 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(other),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("java.lang.String"));

		if (idIfCond_831) {

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

			kermeta.standard.Iterator<java.lang.String> it_ft191 = set_infos
					.iterator();
			java.lang.Boolean idLoopCond_832 = false;
			while (!idLoopCond_832) {
				idLoopCond_832 = it_ft191.isOff();
				if (idLoopCond_832) {
				} else {

					//BIle:func
					java.lang.String i_lbdExp191 = it_ft191.next();

					kermeta.standard.OrderedSet<java.lang.String> tmp_set_infos = kermeta.standard.helper.StringWrapper
							.split(i_lbdExp191, "=");

					java.lang.Boolean idIfCond_833 = false;
					idIfCond_833 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(tmp_set_infos.size(), 2);

					if (idIfCond_833) {

						java.lang.Boolean idIfCond_834 = false;
						idIfCond_834 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tmp_set_infos
												.elementAt(0)));

						if (idIfCond_834) {

							java.lang.Boolean idIfCond_835 = false;
							idIfCond_835 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_835) {

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

		java.lang.Double result = null;

		result = (java.lang.Double) org.kermeta.compil.runtime.helper.basetypes.StringUtil
				.toReal(self);

		java.lang.Boolean idIfCond_836 = false;
		idIfCond_836 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_836) {

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

		java.lang.Boolean idIfCond_837 = false;
		idIfCond_837 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_837) {

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

		java.lang.String result = null;

		result = "";

		kermeta.standard.OrderedSet<java.lang.String> set_str = kermeta.standard.helper.StringWrapper
				.split(self, "\\.");

		java.lang.Integer inc_seg = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft192 = set_str
					.iterator();
			java.lang.Boolean idLoopCond_838 = false;
			while (!idLoopCond_838) {
				idLoopCond_838 = it_ft192.isOff();
				if (idLoopCond_838) {
				} else {

					//BIle:func
					java.lang.String seg_lbdExp192 = it_ft192.next();

					java.lang.Boolean idIfCond_839 = false;
					idIfCond_839 = kermeta.standard.helper.IntegerWrapper
							.isLower(inc_seg,
									kermeta.standard.helper.IntegerWrapper
											.minus(set_str.size(), 1));

					if (idIfCond_839) {

						result = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, seg_lbdExp192), ".");
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
	public static <G> java.lang.Boolean isValueType(

	java.lang.String self, km2ecore.KM2EcoreContext context

	) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_840 = false;
		idIfCond_840 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						context.getValueTypeMapping()).contains(self);

		if (idIfCond_840) {

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

		java.lang.Boolean idIfCond_841 = false;
		idIfCond_841 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(other);

		if (idIfCond_841) {

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

		java.lang.Boolean idIfCond_843 = false;
		idIfCond_843 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_843) {

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
														subStringSize,
														kermeta.standard.helper.StringWrapper
																.size(self))),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(subStringSize, startIndex));

		if (idIfCond_844) {

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
	public static <G> java.lang.Boolean isKindOf(

	java.lang.String self, kermeta.language.structure.Class cl

	) {

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

		java.lang.Boolean idIfCond_845 = false;
		idIfCond_845 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_845) {

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

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(self).getterClassDefinition();

		java.lang.Boolean idIfCond_846 = false;
		idIfCond_846 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_846) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft193 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_847 = false;
				while (!idLoopCond_847) {
					idLoopCond_847 = it_ft193.isOff();
					if (idLoopCond_847) {
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
							java.lang.Boolean idLoopCond_849 = false;
							while (!idLoopCond_849) {
								idLoopCond_849 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft194.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft194,
																false));
								if (idLoopCond_849) {
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
						java.lang.Boolean idIfCond_848 = false;
						idIfCond_848 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft194),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp193.getIsDerived()));

						if (idIfCond_848) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(self, p_lbdExp193);

							java.lang.Boolean idIfCond_850 = false;
							//BIft:andThen

							java.lang.Boolean result_ft195 = null;

							java.lang.Boolean idIfCond_851 = false;
							idIfCond_851 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_851) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp195 = null;

								result_ft195 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
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
							idIfCond_850 = result_ft195;
							//EIft:andThen

							if (idIfCond_850) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_852 = false;
								idIfCond_852 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp193
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp193
																		.getUpper()));

								if (idIfCond_852) {

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
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_853 = false;
								idIfCond_853 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp193
												.getLower());

								if (idIfCond_853) {

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
																	.toStringSwitcher(self)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_854 = false;
								idIfCond_854 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp193
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_854) {

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

		java.lang.Boolean idIfCond_855 = false;
		idIfCond_855 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self, null);

		if (idIfCond_855) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(self);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClassSwitcher(self).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_856 = false;
				while (!idLoopCond_856) {
					idLoopCond_856 = it_ft196.isOff();
					if (idLoopCond_856) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp196 = it_ft196
								.next();

						java.lang.Boolean idIfCond_857 = false;
						idIfCond_857 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp196.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp196
														.getIsDerived()));

						if (idIfCond_857) {

							java.lang.Boolean idIfCond_858 = false;
							idIfCond_858 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp196)));

							if (idIfCond_858) {

								java.lang.Boolean idIfCond_859 = false;
								//BIft:exists

								java.lang.Boolean result_ft197 = null;

								java.lang.Boolean test_ft197 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft197 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					self,
																					prop_lbdExp196))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_860 = false;
									while (!idLoopCond_860) {
										idLoopCond_860 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft197.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft197,
																		false));
										if (idLoopCond_860) {
										} else {

											java.lang.Boolean result_lambda_ft197 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp197 = it_ft197
													.next();

											java.lang.Boolean idIfCond_861 = false;
											idIfCond_861 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp197,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_861) {

												result_lambda_ft197 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp197,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft197 = false;
											}

											//EIle:func

											test_ft197 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft197,
															result_lambda_ft197);
										}
									}
								}

								result_ft197 = test_ft197;

								//CEC
								idIfCond_859 = result_ft197;
								//EIft:exists

								if (idIfCond_859) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getSwitcher(self, prop_lbdExp196);

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft198 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_862 = false;
										while (!idLoopCond_862) {
											idLoopCond_862 = it_ft198.isOff();
											if (idLoopCond_862) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp198 = it_ft198
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp198);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(self,
															prop_lbdExp196));
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
						.equalsSwitcher(self, element));

		return result;

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

		java.lang.Boolean idIfCond_863 = false;
		idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(self, type);

		if (idIfCond_863) {

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
