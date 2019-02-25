package study.thirdpracticaltask.checknumbers;

public class NumbersChecker {

    public static boolean checkNumbersTheSame(final int a, final int b, final int c){
        return a == b && a == c;
    }

    public static boolean checkNumbersAreDifferent(final int a, final int b, final int c){
        return a != b && a != c;
    }

}
