package kermeta.language.structure.helper;

/**
 *
 * @generated
 */
public class ObjectSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> void super_applyPass2(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft281 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1212 = false;
			while (!idLoopCond_1212) {
				idLoopCond_1212 = it_ft281.isOff();
				if (idLoopCond_1212) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp281 = it_ft281
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp280 = o_lbdExp281;

					java.lang.Boolean idIfCond_1213 = false;
					idIfCond_1213 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp280.getDeprecated(), "");

					if (idIfCond_1213) {

						p_lbdExp280.applyPass2(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String super_createBehaviorJava(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		java.lang.String result = null;

		result = "";

		return result;

	}

}
