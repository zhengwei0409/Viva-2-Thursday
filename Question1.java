public class Question1 {

    public static void main(String[] args) {
        System.out.println(isValidPassword("#ABcd1234"));
    }

    static boolean isValidPassword(String password) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for(int i = 0; i < password.length(); i++){
            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(character)) {
                lowerCaseCount++;
            } else if (Character.isDigit(character)) {
                digitCount++;
            } else if ((character >= '!' && character <= '/') || (character >= ':' && character <= '@') || (character >= '[' && character <= '`') || (character >= '{' && character <= '~')) {
                specialCharCount++;
            }
        }

        if (password.length() >= 8 && upperCaseCount > 0 && lowerCaseCount > 0 && digitCount >= 3 && specialCharCount == 1) {
            return true;
        } else {
            return false;
        }
    }
}