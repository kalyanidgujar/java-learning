class StringMethodExample
{
	public static void main(String[] args) {
		String name1="Kartik";
		String name2="Kanchana";
		String name3="komala";
		String name4="";

		String convertedCaps=name1.toUpperCase();
		System.out.println(convertedCaps);

		int length=name3.length();
		System.out.println(length);

		char singleCharacter=name1.charAt(2);
		System.out.println(singleCharacter);

		String mergedNames=name1.concat(name2);
        System.out.println(mergedNames);

		String multipleChars=name2.substring(5,8);
		System.out.println(multipleChars);

		String singleCharacter2=name3.substring(0,1);
		System.out.println(singleCharacter2);

		boolean emptyOrNot=name4.isEmpty();
		System.out.println(emptyOrNot);


	}
}