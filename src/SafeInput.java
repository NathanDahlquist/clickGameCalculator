import java.util.Scanner;

public class SafeInput {
    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        int retVal = 0;
        String trash = "";
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You entered the invalid input: " + trash);
            }
        } while (!done);
        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean done = false;
        boolean retVal = false;
        String trash = "";
        String answer = "";
        do {
            answer = SafeInput.getNonZeroLenString(pipe, prompt);
            if (answer.equalsIgnoreCase("y")) {
                done = true;
            } else if (answer.equalsIgnoreCase("n")) {
                done = true;
                retVal = true;
            } else {
                System.out.println("You have entered an invalid input");
            }
        } while (!done);
        return retVal;
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        boolean done = false;
        String retVal = "";
        do {
            System.out.println("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.equals("")) {
                System.out.println("Please try again");
            } else {
                done = true;
            }
        } while (!done);
        return retVal;
    }
}
