class DuckNumber
{
	public static void main(String[] args) {
		 String num = "1012"; // Example number as a string

        boolean isDuckNumber = false;

        // Check if '0' is present in the number but not as the first character
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                isDuckNumber = true;
                break;
            }
        }

        if (isDuckNumber) {
            System.out.println(num + " is a Duck Number");
        } else {
            System.out.println(num + " is Not a Duck Number");
        }
    }
}
	