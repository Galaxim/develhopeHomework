package it.develhope.exercise3;

public class main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.println("K");
        System.out.println("B");
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        System.out.println("23");
        System.out.println(false);
        System.out.println("675.27");
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        int myAge = 23;
        boolean hadLaunch = false;
        double launchPrice = 675.27;
        System.out.print("My age=");
        System.out.println(myAge);
        System.out.print("I had launch=");
        System.out.println(hadLaunch);
        System.out.print("My launch price=");
        System.out.println(launchPrice);
    }
}
