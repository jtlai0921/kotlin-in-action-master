package ch02.note;

import java.util.Random;

public class StatementVsExpression {

    public static void main(String[] args) {
        boolean b = new Random().nextBoolean();
//        String res = null;
//        if (b) res = "true";
//        else res = "false";

        String res = b ? "true" : "false";
    }
}
