package Stack.video3;

import java.util.Stack;

public class Next_greater_element2 {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            Stack<Integer> st=new Stack<Integer>();
            int n=nums.length;
            int[] ans=new int[n];

            for(int i=n-1;i>=0;i--){
                st.push(nums[i]);
            }

            for(int i=n-1;i>=0;i--){
                while(st.size()!=0 && nums[i]>=st.peek())st.pop();
                if(st.size()==0)ans[i]=-1;
                else ans[i]=st.peek();
                st.push(nums[i]);
            }
            return ans;
        }
    }
}
