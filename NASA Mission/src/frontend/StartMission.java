package frontend;

import backend.CheckFuelForMission;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartMission {

    public static void main(String[] args) throws InterruptedException {

        short mission = 0;
        boolean rightMission = false;
        String name;

        System.out.println("************************************************************************");
        System.out.println("*** Welcome to a new NASA Mission towards the deep and unknown space ***");
        System.out.println("************************************************************************");

        Thread.sleep(1500);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPlease, enter your name: ");
        name = scanner.nextLine();
        Thread.sleep(1000);
        if (name.equals(""
        )) {
            name = "anonymous";
        }
        System.out.printf("Welcome to this mission, %s!\n", name);

        System.out.println("\nNASA welcome and propose you one of the following missions: ");
        System.out.println("1. Apollo 11: from Earth to Moon and back, all included");
        System.out.println("2. Mission on Mars: from Earth to Mars and back, all inclusive (sun cream included)");
        System.out.println("3. Passenger ship: from Earth to Moon, then from Moon to Mars and back at home, from Mars to Earth (without passing back to Moon)");
        System.out.println("4. I changed idea... I forget to buy the cigarettes... See you next time");
        System.out.print("\nPlease, choose one of above proposed option that you'd like perform: ");

        do {
            try {
                mission = scanner.nextShort();
                if (mission < 1 || mission > 4) {
                    System.out.println("The selection performed (" + mission + ") is not valid. Please, select one of option above proposed");
                } else if (mission == 4) {
                    System.out.printf("Thanks for your partecipation %s. We'll wait you for the next time. Notwithstanding your leaving you'll the get the bill of 100$ for the expenses of the spatial base at home in the next days", name);
                    System.exit(0);
                } else {
                    rightMission = true;
                }
            } catch (InputMismatchException imEx) {
                System.out.println("The selection performed is not valid. If you want to go home, please select the suitable option and we'll continue to be good friends");
                scanner.next();
            }
        } while(!rightMission);

        Thread.sleep(500);
        System.out.print("Checking if there is places available");
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println("Congratulations: you choosen the mission number #" + mission);

        System.out.printf("Well %s, you will start soon for the spatial mission selected\n", name);

        CheckFuelForMission.getFuel(mission);
    }
}