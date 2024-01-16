package stack;

public class Main {
    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push('q');
        arrayStack.push('m');
        arrayStack.push('i');
        arrayStack.push('t');

        System.out.println(arrayStack.stack);

        arrayStack.pop();

        System.out.println(arrayStack.stack);

        System.out.println(arrayStack.isEmpty());

        arrayStack.clear();

        System.out.println(arrayStack.stack);

        arrayStack.push('q');
        arrayStack.push('m');
        arrayStack.push('i');
        arrayStack.push('t');

        System.out.println(arrayStack.peek());
    }
}
