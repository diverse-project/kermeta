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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft264 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1140 = false;
			while (!idLoopCond_1140) {
				idLoopCond_1140 = it_ft264.isOff();
				if (idLoopCond_1140) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp264 = it_ft264
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp263 = o_lbdExp264;

					java.lang.Boolean idIfCond_1141 = false;
					idIfCond_1141 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp263.getDeprecated(), "");

					if (idIfCond_1141) {

						p_lbdExp263.applyPass2(context);
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
