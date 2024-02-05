package backend;

import utility.Constants;

public class WeightFuelCalculation {

    public static int getWeightFuel(final int mass, final double gravity, final double constant1, final int constant2) {

        return (int) (mass * gravity * constant1 - constant2);
    }

}
