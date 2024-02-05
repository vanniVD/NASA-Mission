package backend;

import utility.Constants;

public class Launch {

    // Formula for launch
    // mass * gravity * 0.042 - 33

    public static int getFuelForLaunchFromMoon(int mass) {

        int weight = WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYMOON, Constants.LAUNCHCONSTANT1, Constants.LAUNCHCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLaunchFromMoon(weight);
        } else {
            weight = 0;
        }

        return weight;
    }

    public static int getFuelForLaunchFromMars(int mass) {

        int weight = WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYMARS, Constants.LAUNCHCONSTANT1, Constants.LAUNCHCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLaunchFromMars(weight);
        } else {
            weight = 0;
        }

        return weight;
    }

    public static int getFuelForLaunchFromEarth(int mass) {

        int weight =WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYEARTH, Constants.LAUNCHCONSTANT1, Constants.LAUNCHCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLaunchFromEarth(weight);
        } else {
            weight = 0;
        }

        return weight;
    }
}
