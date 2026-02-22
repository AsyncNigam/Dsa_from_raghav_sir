package Stack;

import java.util.Stack;

public class remove_consequetive_characters {
    public String removeConsecutiveCharacter(String s) {
        // code here
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty())st.push(ch);
            else{
                char top=st.peek();
                if(top!=ch)st.push(ch);
            }
        }

        String str="";
        Stack<Character> st2=new Stack<Character>();
        while(st.size()!=0)st2.push(st.pop());
        while(st2.size()!=0)str=str+(char)st2.pop();

        return str;
    }
}
