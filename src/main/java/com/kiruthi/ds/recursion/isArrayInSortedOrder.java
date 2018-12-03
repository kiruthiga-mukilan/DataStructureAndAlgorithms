package com.kiruthi.ds.recursion;

public class isArrayInSortedOrder {


    static int isArrayInSortedOrder(int[] A, int index){
        if(index == 1 ){
            return 1;
        }
        return A[index-1]<A[index-2]?0:isArrayInSortedOrder(A,index-1);
    }
    public static void main(String[] args) {
        System.out.println(isArrayInSortedOrder.isArrayInSortedOrder(new int[]{1,2,3,4,5},5));
    }
}
