package Apna_clg_sheet_revision;

public class merge_2_sorted_arrays {

//    this is cheating method we are using extra space but leetcode can not know

//    https://leetcode.com/problems/merge-sorted-array/

    class Solution {
        public void merge(int[] a, int m, int[] b, int n) {
            int[] c=new int[m+n];
            int i=0,j=0,k=0;
            while(i<m&&j<n){
                if(a[i]<=b[j])c[k++]=a[i++];
                else c[k++]=b[j++];
            }
            while(i< m)c[k++]=a[i++];
            while(j<n)c[k++]=b[j++];

            for(int l=0;l<m+n;l++){
                a[l]=c[l];
            }
        }
    }
}
