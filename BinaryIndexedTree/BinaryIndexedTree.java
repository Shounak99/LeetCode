package BinaryIndexedTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryIndexedTree {

    public static int construct(int[] arr,int start,int end,int index,int[] indexedTree){
       if(start==end){
           indexedTree[index]=arr[start];
           return arr[start];
       }
       int mid=(end+start)/2;
       indexedTree[index]=construct(arr,start,mid,2*index+1,indexedTree)+construct(arr,mid+1,end,2*index+2,indexedTree);
        return indexedTree[index];
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,4,2,5,6};
        int[] indexedTree=new int[4*arr.length];
        construct(arr,0,arr.length-1,0,indexedTree);
        for(int i=0;i<indexedTree.length;i++){
            System.out.println(indexedTree[i]);
        }
    }
}
