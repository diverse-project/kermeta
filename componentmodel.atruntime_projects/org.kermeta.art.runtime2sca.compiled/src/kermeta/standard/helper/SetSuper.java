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

		G result_ft127 = null;

		G elem_ft127 = null;

		result_ft127 = null;

		{

			kermeta.standard.Iterator<G> it_ft127 = self.iterator();
			java.lang.Boolean idLoopCond_431 = false;
			while (!idLoopCond_431) {
				idLoopCond_431 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft127.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft127, null));
				if (idLoopCond_431) {
				} else {

					elem_ft127 = it_ft127.next();

					java.lang.Boolean idIfCond_432 = false;
					//BIle:detector
					G e_lbdExp127 = elem_ft127;

					idIfCond_432 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp127, element);
					//EIle:detector

					if (idIfCond_432) {

						result_ft127 = elem_ft127;
					}

				}
			}
		}

		//CE
		elem = result_ft127;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_433 = false;
		idIfCond_433 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_433) {

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

		java.lang.Boolean idIfCond_434 = false;
		idIfCond_434 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_434) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
