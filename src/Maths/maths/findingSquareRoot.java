package Maths.maths;

public class findingSquareRoot {
    public static void main(String[] args) {
        int n = 20;
//        System.out.println(SquareRoot(n, 2));
        System.out.printf("%.4f", SquareRoot(20, 2));

    }

    static double SquareRoot(int n, int precision){
        int start = 0;
        int end = n;
        double root = 0;

        while (start<=end){
            int mid = start + (end-start)/2;
            if ( mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                end = mid - 1;
//                root = end;
            }
            else {
                start = mid + 1;
                root = mid;
            }
        }

        System.out.println(root);
        double incr = 0.01;
       {
            while (root*root<=n){
                root = root + incr;
            }
            root = root - incr;
//            incr = incr/10;
        }
        return root;
    }
}
