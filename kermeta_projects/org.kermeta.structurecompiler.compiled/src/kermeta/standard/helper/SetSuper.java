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

		G result_ft282 = null;

		G elem_ft282 = null;

		result_ft282 = null;

		{

			kermeta.standard.Iterator<G> it_ft282 = self.iterator();
			java.lang.Boolean idLoopCond_1220 = false;
			while (!idLoopCond_1220) {
				idLoopCond_1220 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft282.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft282, null));
				if (idLoopCond_1220) {
				} else {

					elem_ft282 = it_ft282.next();

					java.lang.Boolean idIfCond_1221 = false;
					//BIle:detector
					G e_lbdExp282 = elem_ft282;

					idIfCond_1221 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp282, element);
					//EIle:detector

					if (idIfCond_1221) {

						result_ft282 = elem_ft282;
					}

				}
			}
		}

		//CE
		elem = result_ft282;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_1222 = false;
		idIfCond_1222 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1222) {

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

		java.lang.Boolean idIfCond_1223 = false;
		idIfCond_1223 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1223) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
