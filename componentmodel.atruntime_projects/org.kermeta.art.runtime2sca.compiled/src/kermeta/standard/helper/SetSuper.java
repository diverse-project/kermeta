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

		G result_ft120 = null;

		G elem_ft120 = null;

		result_ft120 = null;

		{

			kermeta.standard.Iterator<G> it_ft120 = self.iterator();
			java.lang.Boolean idLoopCond_410 = false;
			while (!idLoopCond_410) {
				idLoopCond_410 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft120.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft120, null));
				if (idLoopCond_410) {
				} else {

					elem_ft120 = it_ft120.next();

					java.lang.Boolean idIfCond_411 = false;
					//BIle:detector
					G e_lbdExp120 = elem_ft120;

					idIfCond_411 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp120, element);
					//EIle:detector

					if (idIfCond_411) {

						result_ft120 = elem_ft120;
					}

				}
			}
		}

		//CE
		elem = result_ft120;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_412 = false;
		idIfCond_412 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_412) {

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

		java.lang.Boolean idIfCond_413 = false;
		idIfCond_413 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_413) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
