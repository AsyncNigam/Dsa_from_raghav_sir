package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_04_house_robber {
//     brute force approach is by taking and skipping but this recursive code will become time limit exceeded

//    class Solution {
//        public int rob(int[] nums) {
//            return amount(nums,0);
//        }
//        int amount(int[] nums,int i){
//            if(i>=nums.length)return 0;
//
//            int take=nums[i]+amount(nums,i+2);
//            int skip=amount(nums,i+1);
//
//            return Math.max(take,skip);
//        }
//    }

//    with meoisation
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }
    int amount(int[] nums,int i,int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+amount(nums,i+2,dp);
        int skip=amount(nums,i+1,dp);

        return dp[i]=Math.max(take,skip);
    }
}
}
