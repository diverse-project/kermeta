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
	public static java.lang.Boolean checkInvariant_14337398__wellFormedDelegationBinding(

	art.instance.DelegationBinding self

	) {
		java.lang.Boolean result = false;

		//BIft:andThen

		java.lang.Boolean result_ft126 = null;

		java.lang.Boolean idIfCond_424 = false;
		idIfCond_424 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(self.getExported(), null);

		if (idIfCond_424) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp126 = null;

			result_ft126 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(self.getSource(), null);
			//EIle:right

		} else {

			result_ft126 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft125 = null;

		java.lang.Boolean idIfCond_423 = false;
		idIfCond_423 = result_ft126;

		if (idIfCond_423) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp125 = null;

			result_ft125 = kermeta.standard.helper.StringWrapper.equals(self
					.getExported().getRole(), self.getSource().getRole());
			//EIle:right

		} else {

			result_ft125 = false;
		}

		//EIft:andThen
		//BIft:andThen

		java.lang.Boolean result_ft124 = null;

		java.lang.Boolean idIfCond_422 = false;
		idIfCond_422 = result_ft125;

		if (idIfCond_422) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object b_lbdExp124 = null;

			result_ft124 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(self.getExported().getService(), self
							.getSource().getService());
			//EIle:right

		} else {

			result_ft124 = false;
		}

		//EIft:andThen
		result = result_ft124;

		return result;
	}

}
