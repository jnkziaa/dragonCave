import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class dragonCave {
    public static void main(String[] args) {
        //opening prompt
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("\nWhich cave will you go into? Please enter 1 or 2 : \n\n");

        Scanner in = new Scanner(System.in);
        int userInput = classUserInput(in);

        String opt1 = "\n\nYou approach the cave... \nIt is dark and spooky... \n" + //option 1 prompt
                "A large dragon jumps out in front of you! He opens his jaws and... \n" +
                "Gobbles you down in one bite!";
        String opt2 = "\n\nYou approach the cave... \nIt is dark and spooky... \n" + //option 2 prompt
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Vomits a mouthful of treasure to share with you.";

        String output = userInput == 1 ? opt1 : opt2; //it's generally safe that only 1 or 2 got to this point

        System.out.println(output);

        System.exit(0);

    }

    public static int classUserInput(Scanner in) {
        int input;
        while (true){
            try {
                input = in.nextInt(); //grab the user input
                if(input == 1 || input == 2){ //if it's 1 or 2 then break
                    return input;
                }

            }
            catch (NoSuchElementException e){ //catch if strings or characters are inserted then loopback instead of crashing
                System.out.println("\nStrings cannot be accepted!");
                in.nextLine(); //consume that input and try again
            }

            System.out.println("\nPlease only choose between 1 or 2: ");

        }
    }
}
