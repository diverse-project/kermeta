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
		//Beginning of the Inlining of the function type: detect

		G result_ft205 = null;

		G elem_ft205 = null;

		result_ft205 = null;

		{

			kermeta.standard.Iterator<G> it_ft205 = self.iterator();
			java.lang.Boolean idLoopCond_878 = false;
			while (!idLoopCond_878) {
				idLoopCond_878 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft205.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft205, null));
				if (idLoopCond_878) {
				} else {

					elem_ft205 = it_ft205.next();

					java.lang.Boolean idIfCond_879 = false;
					//Beginning of the Inlining of the lambda expression: detector
					G e = elem_ft205;

					idIfCond_879 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e, element);
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_879) {

						result_ft205 = elem_ft205;
					}

				}
			}
		}

		//callElement
		elem = result_ft205;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_880 = false;
		idIfCond_880 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_880) {

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

		java.lang.Boolean idIfCond_881 = false;
		idIfCond_881 = kermeta.standard.helper.BooleanWrapper.not(self
				.contains(element));

		if (idIfCond_881) {

			kermeta.standard.helper.CollectionSuper.super_add(self, element);
		}

	}

}
