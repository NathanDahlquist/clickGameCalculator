import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean done = false;

        System.out.print("For every click, the change that the count will reset goes up by one percent. This " +
                "program calculates the probability of getting any specified amount of clicks without failing.");
        do {
            double clickProb = 1;
            double resetNumerator = 100;
            int clickCount = SafeInput.getInt(pipe, "How many button clicks would you like to calculate " +
                    "the probability for?");
            for (int i = 0; i < clickCount; i++) {
                clickProb = clickProb * (resetNumerator/100);
                resetNumerator = resetNumerator - 1;
            }
            clickProb = clickProb * 100;
            System.out.printf("The chance to get %d clicks is %.20f%%",clickCount,clickProb);
            done = SafeInput.getYNConfirm(pipe,"Would you like to continue?");
        }while (!done);
    }
}
