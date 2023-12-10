public class Question3 {
    public static void main(String[] args) {
        String[] arr = {"0", "a", ".", "-5E7", "2e+8", "2e2e"};
        boolean[] result = isNumeric(arr);

        System.out.print("{");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");

        System.out.println();
    }

    static boolean[] isNumeric(String[] arr) {
        boolean[] result = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            try {
                Double.parseDouble(arr[i]);
                result[i] = true;
            } catch (NumberFormatException e) {
                result[i] = false;
            }
        }

        return result;
        
    }
}
