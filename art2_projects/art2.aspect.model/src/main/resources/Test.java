
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String params[] = new String[3];
		params[0] = "/art2.aspect.model/src/main/resources/distart.xmi";
		params[1] = "/art2.aspect.model/src/main/resources/distart_woven.xmi";
		params[2] = "/art2.aspect.model/src/main/resources/AspectTest.drl";
		SmartAdaptersDrools.main(params);
	}

}
