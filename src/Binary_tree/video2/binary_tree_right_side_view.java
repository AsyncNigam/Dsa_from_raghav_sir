package Binary_tree.video2;

import java.util.*;

public class binary_tree_right_side_view {

//     this is approach 3 , if level of any root> arraylist size then add other wise update
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans=new ArrayList<Integer>();
            view(root,0,ans);
            return ans;
        }
        void view(TreeNode root,int level,List<Integer> ans){
            if(root==null)return ;
            if(level>=ans.size())ans.add(root.val);
            else ans.set(level,root.val);
            view(root.left,level+1,ans);
            view(root.right,level+1,ans);
        }
    }
}
