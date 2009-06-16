package art.instance.helper;

/**
 *
 * @generated
 */
public class DelegationBindingInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_7402671__wellFormedDelegationBinding(

	art.instance.DelegationBinding self

	) {
		java.lang.Boolean result = false;

		//BIft:andThen

		java.lang.Boolean result_ft111 = null;

		java.lang.Boolean idIfCond_393 = false;
		idIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self.getExported(), null);

		if (idIfCond_393) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp111 = null;

			result_ft111 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(self.getSource(), null);
			//EIle:right

		} else {

			result_ft111 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft110 = null;

		java.lang.Boolean idIfCond_392 = false;
		idIfCond_392 = result_ft111;

		if (idIfCond_392) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp110 = null;

			result_ft110 = kermeta.standard.helper.StringWrapper.equals(self
					.getExported().getRole(), self.getSource().getRole());
			//EIle:right

		} else {

			result_ft110 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft109 = null;

		java.lang.Boolean idIfCond_391 = false;
		idIfCond_391 = result_ft110;

		if (idIfCond_391) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp109 = null;

			result_ft109 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(self.getExported().getService(), self
							.getSource().getService());
			//EIle:right

		} else {

			result_ft109 = false;
		}

		//EIft:andThen
		result = result_ft109;

		return result;
	}

}
