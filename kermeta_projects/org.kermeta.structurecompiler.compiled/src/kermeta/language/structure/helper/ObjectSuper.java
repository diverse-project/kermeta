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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft255 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1104 = false;
			while (!idLoopCond_1104) {
				idLoopCond_1104 = it_ft255.isOff();
				if (idLoopCond_1104) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp255 = it_ft255
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp254 = o_lbdExp255;

					java.lang.Boolean idIfCond_1105 = false;
					idIfCond_1105 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp254.getDeprecated(), "");

					if (idIfCond_1105) {

						p_lbdExp254.applyPass2(context);
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
