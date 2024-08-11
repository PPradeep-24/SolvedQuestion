/* 
Problem statement:
You have been given an integer array/list (ARR) of size 'N'. 
It only contains 0s, 1s, and 2s. Write a solution to sort this array/list.
Note: Try to solve the problem in 'Single Scan'. 
'Single Scan' refers to iterating over the array/list just once, 
or to put it in other words, you will be visiting each element in the array/list just once.
*/

// SOLVED BY USING DUTCH NATIONAL FLAG ALGORITHM PROPOSED BY EDSGER DIJKSTRA

import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0;
        int mid=0;
        int high=(arr.length)-1;

        while(mid<=high){
            switch(arr[mid]){
                case 0:
                swap(arr,low++,mid++);
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(arr,mid,high--);
                break;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}