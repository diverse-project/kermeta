package art.instance.helper;

/**
 *
 * @generated
 */
public class CompositeInstanceInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_18545478__completeDelegationBindings(

	art.instance.CompositeInstance self

	) {
		java.lang.Boolean result = false;

		//BIft:select

		kermeta.standard.Sequence<art.type.Port> result_ft105 = null;

		art.type.Port elem_ft105 = null;

		result_ft105 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							self.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_386 = false;
			while (!idLoopCond_386) {
				idLoopCond_386 = it_ft105.isOff();
				if (idLoopCond_386) {
				} else {

					elem_ft105 = it_ft105.next();

					java.lang.Boolean idIfCond_387 = false;
					//BIle:selector
					art.type.Port p_lbdExp105 = elem_ft105;

					idIfCond_387 = kermeta.standard.helper.BooleanWrapper
							.not(p_lbdExp105.getIsOptional());
					//EIle:selector

					if (idIfCond_387) {

						result_ft105.add(elem_ft105);
					}

				}
			}
		}

		//EIft:select
		//BIft:forAll

		java.lang.Boolean result_ft102 = null;

		java.lang.Boolean test_ft102 = true;

		{

			kermeta.standard.Iterator<art.type.Port> it_ft102 = result_ft105
					.iterator();
			java.lang.Boolean idLoopCond_383 = false;
			while (!idLoopCond_383) {
				idLoopCond_383 = it_ft102.isOff();
				if (idLoopCond_383) {
				} else {

					java.lang.Boolean result_lambda_ft102 = null;
					//BIle:func
					art.type.Port p_lbdExp102 = it_ft102.next();

					//BIft:exists

					java.lang.Boolean result_ft103 = null;

					java.lang.Boolean test_ft103 = false;

					{

						kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.DelegationBinding> convertAsOrderedSet(
										self.getDelegation()).iterator();
						java.lang.Boolean idLoopCond_384 = false;
						while (!idLoopCond_384) {
							idLoopCond_384 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft103.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft103, false));
							if (idLoopCond_384) {
							} else {

								java.lang.Boolean result_lambda_ft103 = null;
								//BIle:func
								art.instance.DelegationBinding b_lbdExp103 = it_ft103
										.next();

								//BIft:exists

								java.lang.Boolean result_ft104 = null;

								java.lang.Boolean test_ft104 = false;

								{

									kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<art.instance.ComponentInstance> convertAsOrderedSet(
													self.getSubComponent())
											.iterator();
									java.lang.Boolean idLoopCond_385 = false;
									while (!idLoopCond_385) {
										idLoopCond_385 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft104.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft104,
																		false));
										if (idLoopCond_385) {
										} else {

											java.lang.Boolean result_lambda_ft104 = null;
											//BIle:func
											art.instance.ComponentInstance sub_lbdExp104 = it_ft104
													.next();

											result_lambda_ft104 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.equalsSwitcher(b_lbdExp103
															.getExported(),
															p_lbdExp102);
											//EIle:func

											test_ft104 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft104,
															result_lambda_ft104);
										}
									}
								}

								result_ft104 = test_ft104;
								//EIft:exists
								result_lambda_ft103 = result_ft104;

								//EIle:func

								test_ft103 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft103, result_lambda_ft103);
							}
						}
					}

					result_ft103 = test_ft103;
					//EIft:exists
					result_lambda_ft102 = result_ft103;

					//EIle:func

					test_ft102 = kermeta.standard.helper.BooleanWrapper.and(
							test_ft102, result_lambda_ft102);
				}
			}
		}

		result_ft102 = test_ft102;
		//EIft:forAll
		result = result_ft102;

		return result;
	}

}
