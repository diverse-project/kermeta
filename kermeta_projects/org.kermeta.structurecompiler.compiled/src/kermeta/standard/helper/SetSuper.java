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

		G result_ft258 = null;

		G elem_ft258 = null;

		result_ft258 = null;

		{

			kermeta.standard.Iterator<G> it_ft258 = self.iterator();
			java.lang.Boolean idLoopCond_1129 = false;
			while (!idLoopCond_1129) {
				idLoopCond_1129 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft258.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft258, null));
				if (idLoopCond_1129) {
				} else {

					elem_ft258 = it_ft258.next();

					java.lang.Boolean idIfCond_1130 = false;
					//BIle:detector
					G e_lbdExp258 = elem_ft258;

					idIfCond_1130 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp258, element);
					//EIle:detector

					if (idIfCond_1130) {

						result_ft258 = elem_ft258;
					}

				}
			}
		}

		//CE
		elem = result_ft258;
		//EIft:detect

		java.lang.Boolean idIfCond_1131 = false;
		idIfCond_1131 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_1131) {

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

		java.lang.Boolean idIfCond_1132 = false;
		idIfCond_1132 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1132) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
