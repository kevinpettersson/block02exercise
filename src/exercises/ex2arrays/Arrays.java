package exercises.ex2arrays;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Arrays {

    static int[] arr = new int[5];
    static String int_str = new String();
    static String[] int_arr = new String[5];
    static Scanner sc = new Scanner(System.in);

    /* The input functions */
    public static int[] getArrayOfIntsFromUser() {

        System.out.println("Write 5 integers with space between and press Enter: ");
        int_str = sc.nextLine();
        int_arr = int_str.split(" ");

        for (int i = 0; i < int_arr.length; i++) {
            arr[i] = Integer.valueOf(int_arr[i]);
        }
        return arr;
    }

    public static int getValueFromUser() {
        System.out.println("Write a value to find: ");
        int value = sc.nextInt();

        return value;
    }

    /* The output functions */
    public static void printIndexToUser(int the_index, int the_value) {
        System.out.println("The " + the_value + " found at index " + the_index);
    }

    public static void printNotFoundToUser(int the_value) {
        System.out.println("Value not found in the so no index found.");
    }

    public static void printResultToUser(int the_index, int the_value) {



    }


    /* The Algorithm */
    public static int findIndexOfValue(int[] a_list, int a_value) {

        for (int i = 0; i < a_list.length; i++) {
            if (a_value == a_list[i]) {
                return i;
            }
        }
        return 0;
    }

    /* The top-level behavior */
    public static void listBasicsProgram() {
        // INPUT
        int[] theList = getArrayOfIntsFromUser();
        int theValue = getValueFromUser();
        // PROCESS
        int theIndex = findIndexOfValue(theList, theValue);
        // OUTPUT
        printResultToUser(theIndex, theValue);
    }


    /* Required way to make module executable */
    public static void main(String[] args) {
        listBasicsProgram();
    }
}
