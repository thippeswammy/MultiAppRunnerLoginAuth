import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class HandCricket {
    int score1, score2;
    boolean target = false;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public HandCricket() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        score1 = 0;
        score2 = 0;
        System.out.println(" Welcome to HandCricket Game ");
        System.out.println(" *************************** ");
        System.out.print(" Are you ready to Play? (y/n) : >>> ");
        if (!br.readLine().equalsIgnoreCase("y")) System.exit(0);
        System.out.println("\n Unlimited balls...");
        System.out.println(" Results will be displayed at last...");
        System.out.print(" Press enter... >>> ");
        br.readLine();
        String repeat = "y";

        while (repeat.equalsIgnoreCase("Y")) {
            HandCricket obj = new HandCricket();
            System.out.println("\n Its Toss Time ");

            System.out.println(" What will you take ?");

            System.out.print(" Enter : Head OR Tail >>> ");
            String uface = br.readLine();
            String cface;

            Random rand = new Random();

            boolean flag = rand.nextBoolean();

            if (flag)
                cface = "head";
            else
                cface = "tail";

            if (uface.equalsIgnoreCase(cface)) {
                System.out.println("\n Congrats! You have Won the Toss ");
                System.out.print(" Press enter... >>> ");
                br.readLine();
                System.out.println("\n What would you like to do ");
                System.out.print(" Enter : Bat or Ball ? >>> ");
                String choice = br.readLine();
                choice = choice.toLowerCase();

                switch (choice) {
                    case "bat":
                        obj.bat();
                        obj.ball();
                        obj.result();
                        break;

                    case "ball":
                        obj.ball();
                        obj.bat();
                        obj.result();
                        break;

                    default:
                        System.out.println(" Wrong option! ");
                }
            } else {
                System.out.println("\n Oh! you have lost the toss");
                System.out.println(" Computer has decided to Bat first... \n");
                obj.ball();
                obj.bat();
                obj.result();
            }

            System.out.print(" Do you want to play one more time? say (y/n) >>> ");
            repeat = br.readLine();
        }
        System.exit(0);
    }

    void bat() throws IOException {
        System.out.println("\n You are Batting now... ");
        System.out.println(" Input any number from 1 to 6 ");
        System.out.println(" If Your number is same as Computer number then you are Out!");
        System.out.print(" Are you ready to Bat? Press enter... >>> ");
        br.readLine();

        while (true) {
            System.out.print("\n Enter your number : >>> ");
            int u = Integer.parseInt(br.readLine());

            Random rand = new Random();

            int c = rand.nextInt(6) + 1;

            System.out.println(" Computer number is : " + c);

            if (u == c) {
                System.out.println("\n Oh! You are Out ");
                System.out.println(" Press enter... >>> ");
                System.out.println(" Your Total Score is  " + score1 + "\n");
                break;
            } else if (u > 6 || u < 0) {
                wrong();
            } else if (u != c) {
                score1 = score1 + u;
                if (target && score1 > score2)
                    return;

                System.out.println("\n<<<<<<<<<<<<<<< Your Current Score is " + score1 + ">>>>>>>>>>>>>>>");
            }
        }
        target = !target;
    }

    void ball() throws IOException {
        System.out.println("\n You are Bolling & Computer is Batting ");
        System.out.println(" Press enter...  ");
        br.readLine();

        while (true) {
            System.out.print("\n Enter your number : ");
            int user_input = Integer.parseInt(br.readLine());

            Random rand = new Random();

            int computer_input = rand.nextInt(6) + 1;

            System.out.println(" Computer number is : " + computer_input);

            if (computer_input == user_input) {
                System.out.println("\n Computer is Out ");
                System.out.println(" Press enter... ");
                br.readLine();
                System.out.println(" Computer Total Score is  " + score2 + "\n");
                break;
            } else if (user_input > 6 || user_input < 0) {
                wrong();
            } else if (computer_input != user_input) {
                score2 = score2 + computer_input;

                if (target && score2 > score1)
                    return;

                System.out.println("\n<<<<<<<<<<<<<<< Computer Current Score is  " + score2 + ">>>>>>>>>>>>>>>");
            }
        }
        target = !target;
    }

    void wrong() throws IOException {
        System.out.println("\n Invalid Input ");
        System.out.println(" You have tried to cheat! ");
        System.out.println(" Game Over, press enter... ");
        br.readLine();
        System.exit(0);
    }

    void result() {
        System.out.println("\n Its Result Time ");
        System.out.println(" *************** ");

        if (score1 < score2) {
            int diff = score2 - score1;
            System.out.println(" Computer Won by " + diff + " Runs ");
        } else if (score1 > score2) {
            int diff = score1 - score2;
            System.out.println(" Congratulations! you Won by " + diff + " Runs ");
        } else
            System.out.println(" Its Tie ");

        System.out.println("\n");
    }
}
