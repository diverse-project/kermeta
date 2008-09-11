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

		G result_ft206 = null;

		G elem_ft206 = null;

		result_ft206 = null;

		{

			kermeta.standard.Iterator<G> it_ft206 = self.iterator();
			java.lang.Boolean idLoopCond_932 = false;
			while (!idLoopCond_932) {
				idLoopCond_932 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft206.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft206, null));
				if (idLoopCond_932) {
				} else {

					elem_ft206 = it_ft206.next();

					java.lang.Boolean idIfCond_933 = false;
					//BIle:detector
					G e_lbdExp206 = elem_ft206;

					idIfCond_933 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp206, element);
					//EIle:detector

					if (idIfCond_933) {

						result_ft206 = elem_ft206;
					}

				}
			}
		}

		//CE
		elem = result_ft206;
		//EIft:detect

		java.lang.Boolean idIfCond_934 = false;
		idIfCond_934 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_934) {

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

		java.lang.Boolean idIfCond_935 = false;
		idIfCond_935 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_935) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
