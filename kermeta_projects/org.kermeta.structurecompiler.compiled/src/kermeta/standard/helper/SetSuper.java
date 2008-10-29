package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class SetSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> void super_remove(

	kermeta.standard.Set self, G element

	) {

		G elem = null;
		//BIft:detect

		G result_ft256 = null;

		G elem_ft256 = null;

		result_ft256 = null;

		{

			kermeta.standard.Iterator<G> it_ft256 = self.iterator();
			java.lang.Boolean idLoopCond_1114 = false;
			while (!idLoopCond_1114) {
				idLoopCond_1114 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft256.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft256, null));
				if (idLoopCond_1114) {
				} else {

					elem_ft256 = it_ft256.next();

					java.lang.Boolean idIfCond_1115 = false;
					//BIle:detector
					G e_lbdExp256 = elem_ft256;

					idIfCond_1115 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp256, element);
					//EIle:detector

					if (idIfCond_1115) {

						result_ft256 = elem_ft256;
					}

				}
			}
		}

		//CE
		elem = result_ft256;
		//EIft:detect

		java.lang.Boolean idIfCond_1116 = false;
		idIfCond_1116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1116) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					self, elem);
		}

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void super_add(

	kermeta.standard.Set self, G element

	) {

		java.lang.Boolean idIfCond_1117 = false;
		idIfCond_1117 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1117) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
