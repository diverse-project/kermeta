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
	public static <G> java.lang.String super_createBehaviorJava(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		java.lang.String result = null;

		result = "";

		return result;

	}

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft265 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1161 = false;
			while (!idLoopCond_1161) {
				idLoopCond_1161 = it_ft265.isOff();
				if (idLoopCond_1161) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp265 = it_ft265
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp264 = o_lbdExp265;

					java.lang.Boolean idIfCond_1162 = false;
					idIfCond_1162 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp264.getDeprecated(), "");

					if (idIfCond_1162) {

						p_lbdExp264.applyPass2(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

}
