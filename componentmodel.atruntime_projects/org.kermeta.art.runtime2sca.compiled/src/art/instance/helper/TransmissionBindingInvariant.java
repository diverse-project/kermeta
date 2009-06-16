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
	public static java.lang.Boolean checkInvariant_17429499__wellFormedTransmissionBinding(

	art.instance.TransmissionBinding self

	) {
		java.lang.Boolean result = false;

		//BIft:andThen

		java.lang.Boolean result_ft108 = null;

		java.lang.Boolean idIfCond_390 = false;
		idIfCond_390 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self.getClient(), null);

		if (idIfCond_390) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp108 = null;

			result_ft108 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(self.getServer(), null);
			//EIle:right

		} else {

			result_ft108 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft107 = null;

		java.lang.Boolean idIfCond_389 = false;
		idIfCond_389 = result_ft108;

		if (idIfCond_389) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp107 = null;

			result_ft107 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(
							self.getClient().getRole(),
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.convertAsObject(self.getServer().getRole()));
			//EIle:right

		} else {

			result_ft107 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft106 = null;

		java.lang.Boolean idIfCond_388 = false;
		idIfCond_388 = result_ft107;

		if (idIfCond_388) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp106 = null;

			result_ft106 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(self.getClient().getService(), self
							.getServer().getService());
			//EIle:right

		} else {

			result_ft106 = false;
		}

		//EIft:andThen
		result = result_ft106;

		return result;
	}

}
