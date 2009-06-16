package art.instance.helper;

/**
 *
 * @generated
 */
public class ComponentInstanceInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_2921254__completeTransmissionBindings(

	art.instance.ComponentInstance self

	) {
		java.lang.Boolean result = false;

		//BIft:select

		kermeta.standard.Sequence<art.type.Port> result_ft96 = null;

		art.type.Port elem_ft96 = null;

		result_ft96 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							self.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_375 = false;
			while (!idLoopCond_375) {
				idLoopCond_375 = it_ft96.isOff();
				if (idLoopCond_375) {
				} else {

					elem_ft96 = it_ft96.next();

					java.lang.Boolean idIfCond_376 = false;
					//BIle:selector
					art.type.Port p_lbdExp96 = elem_ft96;

					idIfCond_376 = kermeta.standard.helper.BooleanWrapper.and(
							kermeta.standard.helper.BooleanWrapper
									.not(p_lbdExp96.getIsOptional()),
							kermeta.standard.helper.StringWrapper.equals(
									p_lbdExp96.getRole(), "client"));
					//EIle:selector

					if (idIfCond_376) {

						result_ft96.add(elem_ft96);
					}

				}
			}
		}

		//EIft:select
		//BIft:forAll

		java.lang.Boolean result_ft94 = null;

		java.lang.Boolean test_ft94 = true;

		{

			kermeta.standard.Iterator<art.type.Port> it_ft94 = result_ft96
					.iterator();
			java.lang.Boolean idLoopCond_373 = false;
			while (!idLoopCond_373) {
				idLoopCond_373 = it_ft94.isOff();
				if (idLoopCond_373) {
				} else {

					java.lang.Boolean result_lambda_ft94 = null;
					//BIle:func
					art.type.Port p_lbdExp94 = it_ft94.next();

					//BIft:exists

					java.lang.Boolean result_ft95 = null;

					java.lang.Boolean test_ft95 = false;

					{

						kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.TransmissionBinding> convertAsOrderedSet(
										self.getBinding()).iterator();
						java.lang.Boolean idLoopCond_374 = false;
						while (!idLoopCond_374) {
							idLoopCond_374 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft95.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft95, false));
							if (idLoopCond_374) {
							} else {

								java.lang.Boolean result_lambda_ft95 = null;
								//BIle:func
								art.instance.TransmissionBinding b_lbdExp95 = it_ft95
										.next();

								result_lambda_ft95 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equalsSwitcher(b_lbdExp95.getClient(),
												p_lbdExp94);
								//EIle:func

								test_ft95 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft95, result_lambda_ft95);
							}
						}
					}

					result_ft95 = test_ft95;
					//EIft:exists
					result_lambda_ft94 = result_ft95;

					//EIle:func

					test_ft94 = kermeta.standard.helper.BooleanWrapper.and(
							test_ft94, result_lambda_ft94);
				}
			}
		}

		result_ft94 = test_ft94;
		//EIft:forAll
		result = result_ft94;

		return result;
	}

}
