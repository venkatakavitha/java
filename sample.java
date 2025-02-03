// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 import java.util.Scanner;
class Main { 

    public static void main(String[] args) {
        // Call function to get year from user
        int year = getYearFromUser();
        
        // Call function to check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Function to get the year from the user
    public static int getYearFromUser() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year: ");
        String input = myObj.nextLine();  // Read input as a string
        return Integer.parseInt(input);  // Convert the input string to an integer
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, but not by 100, unless it is divisible by 400
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}