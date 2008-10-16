package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class OrderedCollectionSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> void super_addAt(

	kermeta.standard.OrderedCollection self, java.lang.Integer index, G element

	) {

		java.lang.Boolean idIfCond_1073 = false;
		idIfCond_1073 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index, self
						.size()));

		if (idIfCond_1073) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
				.addAt(self, index, element);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean super_equals(

	kermeta.standard.OrderedCollection self,
			kermeta.language.structure.Object element

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_1074 = false;
		idIfCond_1074 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_1074) {

			java.lang.Boolean idIfCond_1075 = false;
			idIfCond_1075 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.OrderedCollection<G>"),
							element);

			if (idIfCond_1075) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) element;

				java.lang.Boolean idIfCond_1076 = false;
				idIfCond_1076 = kermeta.standard.helper.IntegerWrapper.equals(
						self.size(), collection.size());

				if (idIfCond_1076) {

					kermeta.standard.Iterator<G> selfIterator = self.iterator();

					kermeta.standard.Iterator<G> collectionIterator = collection
							.iterator();

					java.lang.Boolean difference = false;

					kermeta.standard.helper.IntegerWrapper.equals(1, 1);
					java.lang.Boolean idLoopCond_1077 = false;
					while (!idLoopCond_1077) {
						idLoopCond_1077 = kermeta.standard.helper.BooleanWrapper
								.or(kermeta.standard.helper.BooleanWrapper.or(
										selfIterator.isOff(),
										collectionIterator.isOff()), difference);
						if (idLoopCond_1077) {
						} else {

							java.lang.Boolean idIfCond_1078 = false;
							idIfCond_1078 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(selfIterator.next(),
													collectionIterator.next()));

							if (idIfCond_1078) {

								difference = true;
							}

						}
					}

					isEqual = kermeta.standard.helper.BooleanWrapper
							.not(difference);
				}

			}

		}

		result = isEqual;

		return result;

	}

}
