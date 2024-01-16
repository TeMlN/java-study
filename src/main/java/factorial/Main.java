package factorial;

public class Main {

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    static int factorial(int index) {


        if (index == 1) return index;
        else return factorial(index - 1) * index;

    }

}
