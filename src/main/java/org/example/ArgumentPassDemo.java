package org.example;

public class ArgumentPassDemo {
    static String operation(Func fc, String s) {

        return fc.func(s);

    }


    public static void main(String[] args) {

        String inputStr = "Java Lambda Expression";
        String outputStr;


        System.out.println("Input: " + inputStr);

        //** Uppercase
        outputStr = operation(str -> str.toUpperCase(), inputStr);

        System.out.println("Uppercase: " + outputStr);

        //** End uppercase

        //** Remove spaces
        outputStr = operation(str -> {

            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {

                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            }

            return result;

        }, inputStr);

        System.out.println("Removed spaces: " + outputStr);
        //** End remove spaces

        //** Reverse
        Func reverse = (str) -> {

            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Reversed: " + operation(reverse, inputStr));
        //** End reverse
    }
}
