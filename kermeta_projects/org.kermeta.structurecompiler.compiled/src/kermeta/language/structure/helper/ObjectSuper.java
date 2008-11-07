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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft256 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1115 = false;
			while (!idLoopCond_1115) {
				idLoopCond_1115 = it_ft256.isOff();
				if (idLoopCond_1115) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp256 = it_ft256
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp255 = o_lbdExp256;

					java.lang.Boolean idIfCond_1116 = false;
					idIfCond_1116 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp255.getDeprecated(), "");

					if (idIfCond_1116) {

						p_lbdExp255.applyPass2(context);
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
