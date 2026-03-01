package Stack.video4;

import java.util.Stack;

public class maximal_rectangle_leetcode {
    class Solution {

        public int Area(int[] arr) {
            int n=arr.length;
            Stack<Integer> st=new Stack<Integer>();
            int[] nse=new int[n];
            nse[n-1]=n; //
            st.push(n-1);
            for(int i=n-2;i>=0;i--){
                while(st.size()>0 && arr[st.peek()]>=arr[i])st.pop();
                if(st.size()==0)nse[i]=n;
                else nse[i]=st.peek();
                st.push(i);
            }

            while(st.size()!=0)st.pop();

            int[] pse=new int[n];
            pse[0]=-1;
            st.push(0);
            for(int i=0;i<n;i++){
                while(st.size()>0 && arr[st.peek()]>=arr[i])st.pop();
                if(st.size()==0)pse[i]=-1;
                else pse[i]=st.peek();
                st.push(i);
            }

            int maxArea=0;
            for(int i=0;i<n;i++){
                int area=arr[i]*(nse[i]-pse[i]-1);
                maxArea=Math.max(maxArea,area);
            }
            return maxArea;
        }

        public int maximalRectangle(char[][] arr) {

            int[][] matrix=new int[arr.length][arr[0].length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]=='1')matrix[i][j]=1;
                    else matrix[i][j]=0;
                }
            }


            int m=matrix.length;
            int n=matrix[0].length;

            for(int i=1;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==1)matrix[i][j]+=matrix[i-1][j];
                }
            }

            int max=0;
            for(int[] row:matrix){
                int area=Area(row);
                max=Math.max(max,area);
            }

            return max;
        }
    }
}
