package Stack.video3;

import java.util.ArrayList;
import java.util.Stack;

public class stock_span_problem {
    class Solution {
        public ArrayList<Integer> calculateSpan(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                // Pop while current price >= price at stack's top index
                while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    ans[i] = i + 1;       // No greater element on left → span = i+1
                } else {
                    ans[i] = i - st.peek(); // Span = distance to nearest greater element
                }

                st.push(i);
            }

            ArrayList<Integer> result = new ArrayList<>();
            for (int val : ans) result.add(val);
            return result;
        }
    }
}
