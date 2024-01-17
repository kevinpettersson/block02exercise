package exercises.ex2arrays;


import java.util.Scanner;

public class Arrays {

    static int[] arr = new int[5];
    static String int_str;
    static String[] int_arr = new String[5];
    static Scanner sc = new Scanner(System.in);

    /* The input functions */
    public static int[] getArrayOfIntsFromUser() {

        System.out.println("Write 5 integers with space between and press Enter: ");
        int_str = sc.nextLine();
        int_arr = int_str.split(" ");

        for (int i = 0; i < int_arr.length; i++) {
            arr[i] = Integer.parseInt(int_arr[i]);
        }
        return arr;
    }

    public static int getValueFromUser() {
        System.out.println("Write a value to find: ");

        return sc.nextInt();
    }

    /* The output functions */
    public static void printNotFoundToUser(int the_value) {
        System.out.println(the_value + " not found in the array so no index found.");
    }

    public static void printResultToUser(int the_index, int the_value) {
        System.out.println("The value " + the_value + " found at index " + the_index);
    }


    /* The Algorithm */
    public static int findIndexOfValue(int[] a_list, int a_value) {

        for (int i = 0; i < a_list.length; i++) {
            if (a_value == a_list[i]) {
                return i;
            }
        }
        return -1;
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
