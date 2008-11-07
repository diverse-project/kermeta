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

		G result_ft257 = null;

		G elem_ft257 = null;

		result_ft257 = null;

		{

			kermeta.standard.Iterator<G> it_ft257 = self.iterator();
			java.lang.Boolean idLoopCond_1123 = false;
			while (!idLoopCond_1123) {
				idLoopCond_1123 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft257.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft257, null));
				if (idLoopCond_1123) {
				} else {

					elem_ft257 = it_ft257.next();

					java.lang.Boolean idIfCond_1124 = false;
					//BIle:detector
					G e_lbdExp257 = elem_ft257;

					idIfCond_1124 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp257, element);
					//EIle:detector

					if (idIfCond_1124) {

						result_ft257 = elem_ft257;
					}

				}
			}
		}

		//CE
		elem = result_ft257;
		//EIft:detect

		java.lang.Boolean idIfCond_1125 = false;
		idIfCond_1125 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1125) {

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

		java.lang.Boolean idIfCond_1126 = false;
		idIfCond_1126 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1126) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
