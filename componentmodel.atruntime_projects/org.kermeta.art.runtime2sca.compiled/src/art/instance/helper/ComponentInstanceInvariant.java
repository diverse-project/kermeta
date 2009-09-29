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
	public static java.lang.Boolean checkInvariant_13695096__mandatoryClientPortBound(

	art.instance.ComponentInstance self

	) {
		java.lang.Boolean result = false;

		//BIft:select

		kermeta.standard.Sequence<art.type.Port> result_ft111 = null;

		art.type.Port elem_ft111 = null;

		result_ft111 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.type.Port> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.type.Port> convertAsOrderedSet(
							self.getType().getPort()).iterator();
			java.lang.Boolean idLoopCond_406 = false;
			while (!idLoopCond_406) {
				idLoopCond_406 = it_ft111.isOff();
				if (idLoopCond_406) {
				} else {

					elem_ft111 = it_ft111.next();

					java.lang.Boolean idIfCond_407 = false;
					//BIle:selector
					art.type.Port p_lbdExp111 = elem_ft111;

					idIfCond_407 = kermeta.standard.helper.BooleanWrapper.and(
							kermeta.standard.helper.BooleanWrapper
									.not(p_lbdExp111.getIsOptional()),
							kermeta.standard.helper.StringWrapper.equals(
									p_lbdExp111.getRole(), "client"));
					//EIle:selector

					if (idIfCond_407) {

						result_ft111.add(elem_ft111);
					}

				}
			}
		}

		//EIft:select
		//BIft:forAll

		java.lang.Boolean result_ft109 = null;

		java.lang.Boolean test_ft109 = true;

		{

			kermeta.standard.Iterator<art.type.Port> it_ft109 = result_ft111
					.iterator();
			java.lang.Boolean idLoopCond_404 = false;
			while (!idLoopCond_404) {
				idLoopCond_404 = it_ft109.isOff();
				if (idLoopCond_404) {
				} else {

					java.lang.Boolean result_lambda_ft109 = null;
					//BIle:func
					art.type.Port p_lbdExp109 = it_ft109.next();

					//BIft:exists

					java.lang.Boolean result_ft110 = null;

					java.lang.Boolean test_ft110 = false;

					{

						kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft110 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.TransmissionBinding> convertAsOrderedSet(
										self.getBinding()).iterator();
						java.lang.Boolean idLoopCond_405 = false;
						while (!idLoopCond_405) {
							idLoopCond_405 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft110.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft110, false));
							if (idLoopCond_405) {
							} else {

								java.lang.Boolean result_lambda_ft110 = null;
								//BIle:func
								art.instance.TransmissionBinding b_lbdExp110 = it_ft110
										.next();

								result_lambda_ft110 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equalsSwitcher(
												b_lbdExp110.getClient(),
												p_lbdExp109);
								//EIle:func

								test_ft110 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft110, result_lambda_ft110);
							}
						}
					}

					result_ft110 = test_ft110;
					//EIft:exists
					result_lambda_ft109 = result_ft110;

					//EIle:func

					test_ft109 = kermeta.standard.helper.BooleanWrapper.and(
							test_ft109, result_lambda_ft109);
				}
			}
		}

		result_ft109 = test_ft109;
		//EIft:forAll
		result = result_ft109;

		return result;
	}

}
