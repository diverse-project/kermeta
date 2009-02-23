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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft263 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1151 = false;
			while (!idLoopCond_1151) {
				idLoopCond_1151 = it_ft263.isOff();
				if (idLoopCond_1151) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp263 = it_ft263
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp262 = o_lbdExp263;

					java.lang.Boolean idIfCond_1152 = false;
					idIfCond_1152 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp262.getDeprecated(), "");

					if (idIfCond_1152) {

						p_lbdExp262.applyPass2(context);
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
