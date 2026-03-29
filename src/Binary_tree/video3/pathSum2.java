package Binary_tree.video3;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        dfs(root, ans, arr, targetSum);
        return ans;
    }
    void dfs(TreeNode root,List<List<Integer>> ans,List<Integer> arr,int rSum){
        if(root==null)return;           //rSum means remaining sum


        arr.add(root.val); //1st add if satisfied then will be added to ans other wise atlast will be removed
        rSum-=root.val;

        if(root.left==null && root.right==null && rSum==0){
            ans.add(new ArrayList<>(arr));  //here we are creating a new aaraylist having all the values same with arr for deep copying other heap memory object
        }
        else{
            dfs(root.left,ans,arr,rSum);
            dfs(root.right,ans,arr,rSum);
        }

        arr.remove(arr.size()-1);
    }
}