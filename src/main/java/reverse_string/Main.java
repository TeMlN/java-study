package reverse_string;

public class Main {
    public static void main(String[] args) {
        String solution = solution("qmit-word");
        System.out.println(solution);
    }

    static String solution(String word) {
        String[] split = word.split("");
        String result = "";

        for (int i = split.length-1; i >= 0; i--) {
            result += split[i];
        }

        return result;
    }
}
