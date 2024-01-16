package stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack implements CustomStack {

    List<Character> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        boolean empty = stack.isEmpty();
        return empty;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(char item) {
        stack.add(item);
    }

    @Override
    public char pop() {
        Character character = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return character;
    }

    @Override
    public char peek() {
        return stack.get(stack.size()-1);
    }

    @Override
    public void clear() {
        stack.removeAll(stack);
    }

}
