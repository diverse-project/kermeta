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

		G result_ft264 = null;

		G elem_ft264 = null;

		result_ft264 = null;

		{

			kermeta.standard.Iterator<G> it_ft264 = self.iterator();
			java.lang.Boolean idLoopCond_1159 = false;
			while (!idLoopCond_1159) {
				idLoopCond_1159 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft264.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft264, null));
				if (idLoopCond_1159) {
				} else {

					elem_ft264 = it_ft264.next();

					java.lang.Boolean idIfCond_1160 = false;
					//BIle:detector
					G e_lbdExp264 = elem_ft264;

					idIfCond_1160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp264, element);
					//EIle:detector

					if (idIfCond_1160) {

						result_ft264 = elem_ft264;
					}

				}
			}
		}

		//CE
		elem = result_ft264;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1161 = false;
		idIfCond_1161 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1161) {

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

		java.lang.Boolean idIfCond_1162 = false;
		idIfCond_1162 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1162) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
