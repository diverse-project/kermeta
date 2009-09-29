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
	public static java.lang.Boolean checkInvariant_23638157__completeDelegationBindings(

	art.instance.CompositeInstance self

	) {
		java.lang.Boolean result = false;

		//BIft:select

		kermeta.standard.Sequence<art.type.Port> result_ft120 = null;

		art.type.Port elem_ft120 = null;

		result_ft120 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							self.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_417 = false;
			while (!idLoopCond_417) {
				idLoopCond_417 = it_ft120.isOff();
				if (idLoopCond_417) {
				} else {

					elem_ft120 = it_ft120.next();

					java.lang.Boolean idIfCond_418 = false;
					//BIle:selector
					art.type.Port p_lbdExp120 = elem_ft120;

					idIfCond_418 = kermeta.standard.helper.BooleanWrapper
							.not(p_lbdExp120.getIsOptional());
					//EIle:selector

					if (idIfCond_418) {

						result_ft120.add(elem_ft120);
					}

				}
			}
		}

		//EIft:select
		//BIft:forAll

		java.lang.Boolean result_ft117 = null;

		java.lang.Boolean test_ft117 = true;

		{

			kermeta.standard.Iterator<art.type.Port> it_ft117 = result_ft120
					.iterator();
			java.lang.Boolean idLoopCond_414 = false;
			while (!idLoopCond_414) {
				idLoopCond_414 = it_ft117.isOff();
				if (idLoopCond_414) {
				} else {

					java.lang.Boolean result_lambda_ft117 = null;
					//BIle:func
					art.type.Port p_lbdExp117 = it_ft117.next();

					//BIft:exists

					java.lang.Boolean result_ft118 = null;

					java.lang.Boolean test_ft118 = false;

					{

						kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft118 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.DelegationBinding> convertAsOrderedSet(
										self.getDelegation()).iterator();
						java.lang.Boolean idLoopCond_415 = false;
						while (!idLoopCond_415) {
							idLoopCond_415 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft118.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft118, false));
							if (idLoopCond_415) {
							} else {

								java.lang.Boolean result_lambda_ft118 = null;
								//BIle:func
								art.instance.DelegationBinding b_lbdExp118 = it_ft118
										.next();

								//BIft:exists

								java.lang.Boolean result_ft119 = null;

								java.lang.Boolean test_ft119 = false;

								{

									kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft119 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<art.instance.ComponentInstance> convertAsOrderedSet(
													self.getSubComponent())
											.iterator();
									java.lang.Boolean idLoopCond_416 = false;
									while (!idLoopCond_416) {
										idLoopCond_416 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft119.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft119,
																		false));
										if (idLoopCond_416) {
										} else {

											java.lang.Boolean result_lambda_ft119 = null;
											//BIle:func
											art.instance.ComponentInstance sub_lbdExp119 = it_ft119
													.next();

											result_lambda_ft119 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.equalsSwitcher(b_lbdExp118
															.getExported(),
															p_lbdExp117);
											//EIle:func

											test_ft119 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft119,
															result_lambda_ft119);
										}
									}
								}

								result_ft119 = test_ft119;
								//EIft:exists
								result_lambda_ft118 = result_ft119;

								//EIle:func

								test_ft118 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft118, result_lambda_ft118);
							}
						}
					}

					result_ft118 = test_ft118;
					//EIft:exists
					result_lambda_ft117 = result_ft118;

					//EIle:func

					test_ft117 = kermeta.standard.helper.BooleanWrapper.and(
							test_ft117, result_lambda_ft117);
				}
			}
		}

		result_ft117 = test_ft117;
		//EIft:forAll
		result = result_ft117;

		return result;
	}

}
