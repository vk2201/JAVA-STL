package com.javastl;

import java.util.Stack;

public class StackStl {
    public static void main(String[] args) {

        //stack extends vector and vector implements list
        Stack<String>  st = new Stack<String>();

        // .push()  TC - O(1)
        st.push("vishal");
        st.push("kumar");
        System.out.println(st);

        //.pop()   TC - O(1)
        st.pop();
        System.out.println(st);

        //.peek()    TC - O(1)
        //gives top element or last element added
        System.out.println(st.peek());

        for(String str : st) {
            System.out.println(str);
        }
    }
}
