package Recursion.recursonLevel1;

import java.util.ArrayList;

public class linearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,49,5,5};
//        System.out.println(search(arr,49 , 0));
//        searchallOccurence(arr, 5, 0);
//        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findallIndex(arr, 5, 0,list ));
    }


    static int search(int[] arr, int target, int index){
        if (index > arr.length-1){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }
        return search(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void  searchallOccurence(int[] arr, int target, int index){
        if (index > arr.length-1){
            return;
        }
        if (target == arr[index]){
            list.add(index);
        }
        searchallOccurence(arr, target, index+1);
    }





    static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index > arr.length-1){
            return list;
        }
        if (target == arr[index]){
            list.add(index);
        }
        return findallIndex(arr, target, index+1, list);
    }
}
