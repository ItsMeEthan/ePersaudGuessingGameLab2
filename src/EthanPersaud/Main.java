package EthanPersaud;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int secretNumber;
        secretNumber = (15);
        Scanner input=new Scanner(System.in);
        System.out.println("Hello Try and guess my number fool!");
        int guess= input.nextInt();
        if(guess==secretNumber)
        {
            System.out.println("you got it right the answer is: "+ secretNumber);
        }
        while(guess != secretNumber)
        {
                System.out.println("Oh that is not right try again :3");
                input.nextInt();
        }
    }

    public static void happy(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int upperLimit = 100;
        int lowerLimit = 1;
        String myAnswer = "";

        do {
            randNum = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            System.out.println("I think it's " + randNum);
            myAnswer = in.nextLine();

            if(myAnswer.equals("tl")) {  //too low
                lowerLimit = randNum + 1;
            }
            else if(myAnswer.equals("th")) { // too high
                upperLimit = randNum - 1;
            }
        }while(!myAnswer.equals("y"));

        in.close();
        System.out.println("YAAAY! :D");
    }
}
}
