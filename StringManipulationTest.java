public class StringManipulationTest {
	public static void main(String[] args) {
		StringManipulation iD = new StringManipulation();
		String combineTrim = iD.trimAndConcat("   Hello    ", "   World");
		Integer findChar = iD.getIndexOrNull("Thanks", "a");
		Integer findStr = iD.getIndexOrNull("Fantastic", "tast");
		String combineTwo = iD.concatSubstring("Elementary", 3, 5, "Happy");
		System.out.println(combineTrim);
		System.out.println(findChar);
		System.out.println(findStr);
		System.out.println(combineTwo);
	}
}