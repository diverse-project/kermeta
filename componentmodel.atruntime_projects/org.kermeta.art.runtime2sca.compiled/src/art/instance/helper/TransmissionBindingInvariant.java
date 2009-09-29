package art.instance.helper;

/**
 *
 * @generated
 */
public class TransmissionBindingInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_4823066__wellFormedTransmissionBinding(

	art.instance.TransmissionBinding self

	) {
		java.lang.Boolean result = false;

		//BIft:andThen

		java.lang.Boolean result_ft123 = null;

		java.lang.Boolean idIfCond_421 = false;
		idIfCond_421 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self.getClient(), null);

		if (idIfCond_421) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp123 = null;

			result_ft123 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(self.getServer(), null);
			//EIle:right

		} else {

			result_ft123 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft122 = null;

		java.lang.Boolean idIfCond_420 = false;
		idIfCond_420 = result_ft123;

		if (idIfCond_420) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp122 = null;

			result_ft122 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(
							self.getClient().getRole(),
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.convertAsObject(self.getServer().getRole()));
			//EIle:right

		} else {

			result_ft122 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft121 = null;

		java.lang.Boolean idIfCond_419 = false;
		idIfCond_419 = result_ft122;

		if (idIfCond_419) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp121 = null;

			result_ft121 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(self.getClient().getService(), self
							.getServer().getService());
			//EIle:right

		} else {

			result_ft121 = false;
		}

		//EIft:andThen
		result = result_ft121;

		return result;
	}

}
