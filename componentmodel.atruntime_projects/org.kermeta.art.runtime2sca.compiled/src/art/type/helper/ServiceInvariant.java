package art.type.helper;

/**
 *
 * @generated
 */
public class ServiceInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_11536626__validService(

	art.type.Service self

	) {
		java.lang.Boolean result = false;

		java.lang.Boolean res = true;

		{
			try {
				((kermeta.io.FileIO) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.io.IoPackage.eINSTANCE.getFileIO()))
						.readTextFile(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														"C:/work/dev/diva/src/",
														kermeta.standard.helper.StringWrapper
																.replace(
																		self
																				.getName(),
																		".",
																		"/")),
										".java"));
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5) {
				boolean caught_5 = false;
				if (ex_switcher_5.getRealException() instanceof kermeta.exceptions.FileNotFoundException) {
					caught_5 = true;
					kermeta.exceptions.FileNotFoundException e = (kermeta.exceptions.FileNotFoundException) ex_switcher_5
							.getRealException();
					res = false;
				}
				if (!caught_5) {
					throw ex_switcher_5;
				}

			}
		}

		result = res;

		return result;
	}

}
