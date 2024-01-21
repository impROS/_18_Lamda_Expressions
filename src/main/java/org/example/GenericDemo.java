package org.example;

public class GenericDemo {
    public static void main(String[] args) {

        AnyFunc<String> reverse = str -> {

            String result = "";

            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };


        AnyFunc<Integer> factorial = integer -> {

            int result = 1;

            for (int i = 1; i <= integer; i++)
                result = i * result;

            return result;
        };

        System.out.println(factorial.func(5));
        System.out.println(reverse.func("reverse"));

    }
}
