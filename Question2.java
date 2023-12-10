public class Question2 {
    public static void main(String[] args) {
        double[] arr1 = {2.5,1.2,3.3,4.7};
        double[] arr2 = {10.3,4.2,6.6,2.1};
        double result = findMedian(arr1, arr2);
        System.out.printf("%.3f\n",result);
    }

    static double findMedian(double[] arr1, double[] arr2) {
        int position1;
        int position2;
        int arrLength = arr1.length + arr2.length;
        double[] newArr = new double[arrLength];

        for(int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i] = arr2[i];
        }

        for(int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - i - 1; j++) {
                if (newArr[j] > newArr[j+1]) {
                    double temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                }
            }
        }

        if(arrLength % 2 != 0) {
            return newArr[((arrLength + 1) / 2) - 1];
        } else {
            position1 = (arrLength / 2);
            position2 = (arrLength / 2) + 1;
            return (newArr[position1 - 1] + newArr[position2 - 1]) / 2;
        }
    }
}
