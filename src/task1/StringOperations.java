package task1;

public class StringOperations {

    public static void main(String args[]) {

        String initial = " this is a long string";

        System.out.println(
                "Does it contain word 'long': " +
                        initial.contains("long")
        );

        System.out.println(
                "Length of string is: " +
                        initial.length()
        );

        System.out.println(
                "3-rd letter is: " +
                        initial.charAt(2)
        );
    }

}
