package Queue.video2;

import java.util.LinkedList;
import java.util.Queue;

public class Rearrange_queue_gfg {
    class Solution {
        public void rearrangeQueue(Queue<Integer> q) {
            // code here
            if (q == null || q.size() <= 2) {
                return;
            }
            Queue<Integer> q2 = new LinkedList<>();

            int n=q.size();
            for(int i=1;i<=n/2;i++){
                q2.add(q.remove());
            }

            while(q2.size()>0){

                q.add(q2.remove());
                q.add(q.remove());
            }


        }
    }

}
