package Arrays_ArrayList;

public class MaxmMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,23,5,6,8};
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
    }

    static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}

