/* Implementation of Kermeta base type Numeric */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Numeric {

	// Implementation of method compareTo called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Numeric::compareTo(other)
	public static KermetaObject compareTo(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObject("kermeta::standard::Integer");
		double self_v = getNumericValue(self).doubleValue();
		double param0_v = getNumericValue(param0).doubleValue();
		if (self_v > param0_v) Integer.setValue(result, 1);
		else if (self_v == param0_v) Integer.setValue(result, 0);
		else Integer.setValue(result, -1);
		return result;
	}

	public static Number getNumericValue(KermetaObject numeric) {
		if (!numeric.getData().containsKey("NumericValue")) numeric.getData().put("NumericValue", new java.lang.Integer(0));
		return ((java.lang.Number)numeric.getData().get("NumericValue"));
	}

}
/* END OF FILE */
