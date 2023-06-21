import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        String playB;
        String playA;
        boolean playAgain;
        playAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (playAgain) {
            System.out.print("Player A, enter your play (R, P, or S): ");
            playA = scanner.nextLine().toUpperCase();

            // Validate input for Player A
            if (!playA.equals("R") && !playA.equals("P") && !playA.equals("S")) {
                System.out.println("Invalid input. Please enter R, P, or S.");
                continue;
            }

            System.out.print("Player B, enter your play (R, P, or S): ");
            playB = scanner.nextLine().toUpperCase();

            // Validate input for Player B
            if (!playB.equals("R") && !playB.equals("P") && !playB.equals("S")) {
                System.out.println("Invalid input. Please enter R, P, or S.");
                continue;
            }


            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie R X R");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else { // playB is Scissors
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie P X P");
                } else { // playB is Scissors
                    System.out.println("Scissors cut Paper. Player B wins!");
                }
            } else { // playA is Scissors
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper. Player A wins!");
                } else { // playB is Scissors
                    System.out.println("It's a tie S X S");
                }
            }

            System.out.println("Do you want to play again? [Y/N]: ");
            String playAgainChoice = scanner.nextLine().toUpperCase();

            if (!playAgainChoice.equals("Y")) {
                System.out.println("Do you want to terminate? [Y/N]: ");
                String terminateChoice = scanner.nextLine().toUpperCase();

                if (terminateChoice.equals("Y")) {
                    playAgain = false;
                }
            }
        }

        scanner.close();
    }
}