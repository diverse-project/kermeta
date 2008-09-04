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

		//Beginning of the Inlining of the function type: eachOwnedElement

		//Beginning of the Inlining of the function type: each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft202 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_869 = false;
			while (!idLoopCond_869) {
				idLoopCond_869 = it_ft202.isOff();
				if (idLoopCond_869) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Tag o = it_ft202.next();

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Tag p = o_ft202;

					java.lang.Boolean idIfCond_870 = false;
					idIfCond_870 = kermeta.standard.helper.StringWrapper
							.equals(p.getDeprecated(), "");

					if (idIfCond_870) {

						p.applyPass2(context);
					}

					//End of the Inlining of the lambda expression: func

					//End of the Inlining of the lambda expression: func

				}
			}
		}

		//End of the Inlining of the function type: each

		//End of the Inlining of the function type: eachOwnedElement

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void super_applyPass2BehaviorJava(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		//Beginning of the Inlining of the function type: eachOwnedElement

		//Beginning of the Inlining of the function type: each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft204 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_871 = false;
			while (!idLoopCond_871) {
				idLoopCond_871 = it_ft204.isOff();
				if (idLoopCond_871) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Tag o = it_ft204.next();

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Tag p = o_ft204;

					p.applyPass2BehaviorJava(context);
					//End of the Inlining of the lambda expression: func

					//End of the Inlining of the lambda expression: func

				}
			}
		}

		//End of the Inlining of the function type: each

		//End of the Inlining of the function type: eachOwnedElement

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
