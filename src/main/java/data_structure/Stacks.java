package data_structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Stacks {

    /**
     * stack.empty() 스택이 비어있으면 true, 비어 있지 않으면 false 반환 (boolean)
     * stack.peek() 스택의 제일 상단에 위치한 요소를 반환함
     * stack.pop() 스택의 제일 상단의 있는 요소를 반환하고 삭제함
     * stack.push() 스택의 제일 상단의 있는 요소에 push()의 argument 값을 삽입 (값이 바뀌는게 아닌 추가)
     * stack.search() search()의 argument 값을 스택에서 찾아서 값이 존재하는 index 를 알려줌 index 의 위치를 계산하는 기준은 최상단에서 부터 0이 아닌 1부터 시작함
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("*** peek() ***");
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("=========================================");
        System.out.println("*** pop() ***");
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("=========================================");
        System.out.println("*** push() ***");
        System.out.println("stack.push(40) = " + stack.push(40));
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("=========================================");
        System.out.println("*** search() ***");
        System.out.println("stack.search(10) = " + stack.search(10));
        System.out.println("stack.search(20) = " + stack.search(20));
        System.out.println("stack.search(40) = " + stack.search(40));
        System.out.println("=========================================");
        System.out.println("*** empty() ***");
        System.out.println("stack.empty() = " + stack.empty());
        System.out.println("=========================================");
        System.out.println("*** other function() ***");
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.contains(40) = " + stack.contains(40));
    }
}
