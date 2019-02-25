package study.taskthree.numberrevers;

public class NumberReverser {

    public static int reverseNumber(final int a){
        StringBuilder sb = new StringBuilder(String.valueOf(a)).reverse();
        int result = Integer.valueOf(sb.toString());
        return result;
    }

}
