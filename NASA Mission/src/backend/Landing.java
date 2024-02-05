package backend;

import utility.Constants;

public class Landing {

    // Formula for landing
    // mass * gravity * 0.033 - 42

    public static int getFuelForLandingToMoon(int mass) {

        int weight = WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYMOON, Constants.LANDINGCONSTANT1, Constants.LANDINGCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLandingToMoon(weight);
        } else {
            weight = 0;
        }

        return weight;
    }

    public static int getFuelForLandingToMars(int mass) {

        int weight = WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYMARS, Constants.LANDINGCONSTANT1, Constants.LANDINGCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLandingToMars(weight);
        } else {
            weight = 0;
        }

        return weight;
    }

    public static int getFuelForLandingToEarth(int mass) {

        int weight = WeightFuelCalculation.getWeightFuel(mass, Constants.GRAVITYEARTH, Constants.LANDINGCONSTANT1, Constants.LANDINGCONSTANT2);
        if (weight >= 1) {
            weight += getFuelForLandingToEarth(weight);
        } else {
            weight = 0;
        }

        return weight;
    }
}
