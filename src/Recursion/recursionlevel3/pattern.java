package Recursion.recursionlevel3;

public class pattern {
    public static void main(String[] args) {
        fun2(4,0);

    }


    static void fun2(int row, int col){
        if (row == 0){
            return;
        }
        if (row > col){
            System.out.print("*");
            fun2(row, col + 1);
        } else {
            System.out.println();
            fun2(row -1, 0);
        }
    }


    static void fun(int row, int col){
        if (row == 0){
            return;
        }
        if (col<row){
            fun(row,col+1);
            System.out.print("*");
        } else {
            fun(row - 1, 0);
            System.out.println();
        }
    }
}
