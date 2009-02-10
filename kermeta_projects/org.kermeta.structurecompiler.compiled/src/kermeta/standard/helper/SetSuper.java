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

		G result_ft266 = null;

		G elem_ft266 = null;

		result_ft266 = null;

		{

			kermeta.standard.Iterator<G> it_ft266 = self.iterator();
			java.lang.Boolean idLoopCond_1169 = false;
			while (!idLoopCond_1169) {
				idLoopCond_1169 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft266.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft266, null));
				if (idLoopCond_1169) {
				} else {

					elem_ft266 = it_ft266.next();

					java.lang.Boolean idIfCond_1170 = false;
					//BIle:detector
					G e_lbdExp266 = elem_ft266;

					idIfCond_1170 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp266, element);
					//EIle:detector

					if (idIfCond_1170) {

						result_ft266 = elem_ft266;
					}

				}
			}
		}

		//CE
		elem = result_ft266;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1171 = false;
		idIfCond_1171 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1171) {

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

		java.lang.Boolean idIfCond_1172 = false;
		idIfCond_1172 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1172) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
