package Binary_tree.video3;

import java.util.ArrayList;

class Node {
    Node left;
    Node right;
    int data;

    Node(int val) {
        this.data = val;
    }
}

public class tree_boundry_gfg {
    class Solution {
        ArrayList<Integer> boundaryTraversal(Node root) {
            // code here
            ArrayList<Integer> ans =new ArrayList<>();
            ans.add(root.data);
            if(root.left==null && root.right==null)return ans;
            leftBoundry(root.left,ans);
            bottomBoundry(root,ans);
            rightBoundry(root.right,ans);
            return ans;
        }

        void leftBoundry(Node root, ArrayList<Integer> ans){
            if(root==null)return;
            if(root.left==null && root.right==null)return;
            ans.add(root.data);
            if(root.left==null)leftBoundry(root.right,ans);
            else leftBoundry(root.left,ans);
            return;
        }
        void rightBoundry(Node root, ArrayList<Integer> ans){
            if(root==null)return;
            if(root.left==null && root.right==null)return;
            if(root.right==null)rightBoundry(root.left,ans);
            else rightBoundry(root.right,ans);
            ans.add(root.data);
            return;
        }
        void bottomBoundry(Node root, ArrayList<Integer> ans){
            if(root==null)return;
            if(root.left==null && root.right==null)ans.add(root.data);
            bottomBoundry(root.left,ans);
            bottomBoundry(root.right,ans);
            return;
        }
    }
}
