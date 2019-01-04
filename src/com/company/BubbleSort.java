package com.company;

public class BubbleSort {
    public static void swap(int[] arr, int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void bubbleSort(int[] arr){
        int n=1;
        while(n>0){
            n=0;
            for(int x=0;x<arr.length-1;x++){
                if(arr[x]>arr[x+1]){
                    swap(arr,arr[x],arr[x+1]);
                    n++;
                }
            }
        }
    }
}
