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

		G result_ft248 = null;

		G elem_ft248 = null;

		result_ft248 = null;

		{

			kermeta.standard.Iterator<G> it_ft248 = self.iterator();
			java.lang.Boolean idLoopCond_1079 = false;
			while (!idLoopCond_1079) {
				idLoopCond_1079 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft248.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft248, null));
				if (idLoopCond_1079) {
				} else {

					elem_ft248 = it_ft248.next();

					java.lang.Boolean idIfCond_1080 = false;
					//BIle:detector
					G e_lbdExp248 = elem_ft248;

					idIfCond_1080 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp248, element);
					//EIle:detector

					if (idIfCond_1080) {

						result_ft248 = elem_ft248;
					}

				}
			}
		}

		//CE
		elem = result_ft248;
		//EIft:detect

		java.lang.Boolean idIfCond_1081 = false;
		idIfCond_1081 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_1081) {

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

		java.lang.Boolean idIfCond_1082 = false;
		idIfCond_1082 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_1082) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
