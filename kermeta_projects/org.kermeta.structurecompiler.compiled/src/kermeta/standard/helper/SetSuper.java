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

		G result_ft250 = null;

		G elem_ft250 = null;

		result_ft250 = null;

		{

			kermeta.standard.Iterator<G> it_ft250 = self.iterator();
			java.lang.Boolean idLoopCond_1060 = false;
			while (!idLoopCond_1060) {
				idLoopCond_1060 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft250.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft250, null));
				if (idLoopCond_1060) {
				} else {

					elem_ft250 = it_ft250.next();

					java.lang.Boolean idIfCond_1061 = false;
					//BIle:detector
					G e_lbdExp250 = elem_ft250;

					idIfCond_1061 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp250, element);
					//EIle:detector

					if (idIfCond_1061) {

						result_ft250 = elem_ft250;
					}

				}
			}
		}

		//CE
		elem = result_ft250;
		//EIft:detect

		java.lang.Boolean idIfCond_1062 = false;
		idIfCond_1062 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_1062) {

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

		java.lang.Boolean idIfCond_1063 = false;
		idIfCond_1063 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1063) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
