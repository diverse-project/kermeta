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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1071 = false;
			while (!idLoopCond_1071) {
				idLoopCond_1071 = it_ft247.isOff();
				if (idLoopCond_1071) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp247 = it_ft247
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp246 = o_lbdExp247;

					java.lang.Boolean idIfCond_1072 = false;
					idIfCond_1072 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp246.getDeprecated(), "");

					if (idIfCond_1072) {

						p_lbdExp246.applyPass2(context);
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
