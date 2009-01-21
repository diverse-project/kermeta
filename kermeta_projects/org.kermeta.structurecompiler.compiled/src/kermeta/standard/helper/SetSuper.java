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

		G result_ft265 = null;

		G elem_ft265 = null;

		result_ft265 = null;

		{

			kermeta.standard.Iterator<G> it_ft265 = self.iterator();
			java.lang.Boolean idLoopCond_1148 = false;
			while (!idLoopCond_1148) {
				idLoopCond_1148 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft265.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft265, null));
				if (idLoopCond_1148) {
				} else {

					elem_ft265 = it_ft265.next();

					java.lang.Boolean idIfCond_1149 = false;
					//BIle:detector
					G e_lbdExp265 = elem_ft265;

					idIfCond_1149 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp265, element);
					//EIle:detector

					if (idIfCond_1149) {

						result_ft265 = elem_ft265;
					}

				}
			}
		}

		//CE
		elem = result_ft265;
		//EIft:detect

		java.lang.Boolean idIfCond_1150 = false;
		idIfCond_1150 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1150) {

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

		java.lang.Boolean idIfCond_1151 = false;
		idIfCond_1151 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1151) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
