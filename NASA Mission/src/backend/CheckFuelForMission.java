package backend;

import utility.Constants;

public class CheckFuelForMission {

    public static void getFuel(short mission) {

        int weight = 0;

        switch (mission) {
            case 1:
                System.out.println("\n" + Constants.SS1);
                System.out.println(Constants.PATH1);
                System.out.println(Constants.WOE + Constants.WOE1 + Constants.KG);
                weight = Constants.WOE1;
                weight = Landing.getFuelForLandingToEarth(weight);
                weight += Launch.getFuelForLaunchFromMoon(Constants.WOE1+weight);
                weight += Landing.getFuelForLandingToMoon(Constants.WOE1+weight);
                weight += Launch.getFuelForLaunchFromEarth(Constants.WOE1+weight);
                break;
            case 2:
                System.out.println("\n" + Constants.SS2);
                System.out.println(Constants.PATH2);
                System.out.println(Constants.WOE + Constants.WOE2 + Constants.KG);
                weight = Constants.WOE2;
                weight = Landing.getFuelForLandingToEarth(weight);
                weight += Launch.getFuelForLaunchFromMars(Constants.WOE2+weight);
                weight += Landing.getFuelForLandingToMars(Constants.WOE2+weight);
                weight += Launch.getFuelForLaunchFromEarth(Constants.WOE2+weight);
                break;
            case 3:
                System.out.println("\n" + Constants.SS3);
                System.out.println(Constants.PATH3);
                System.out.println(Constants.WOE + Constants.WOE3 + Constants.KG);
                weight = Constants.WOE3;
                weight = Landing.getFuelForLandingToEarth(weight);
                weight += Launch.getFuelForLaunchFromMars(Constants.WOE3+weight);
                weight += Landing.getFuelForLandingToMars(Constants.WOE3+weight);
                weight += Launch.getFuelForLaunchFromMoon(Constants.WOE3+weight);
                weight += Landing.getFuelForLandingToMoon(Constants.WOE3+weight);
                weight += Launch.getFuelForLaunchFromEarth(Constants.WOE3+weight);
                break;
        }

        System.out.println("Weight of fuel: " + weight + " kg");
    }
}