public class StringManipulation {
	public String trimAndConcat(String str1, String str2) {
		String newString = str1.trim() + str2.trim();
		return newString;
	}
	public Integer getIndexOrNull(String aStr, char aChar) {
		Integer value = aStr.indexOf(aChar);
		return value;
	}
	public Integer getIndexOrNull(String mainStr, String subStr) {
		Integer location = mainStr.indexOf(subStr);
		return location;
	}
	public String concatSubstring(String firstStr, Integer start, Integer end, String secondStr) {
		String thirdStr = firstStr.substring(start, end);
		String complete = thirdStr + secondStr;
		return complete;
	}
}