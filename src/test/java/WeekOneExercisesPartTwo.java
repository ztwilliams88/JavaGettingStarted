import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekOneExercisesPartTwo {
    @Test
    public void bloodAlcoholLevelForAMale() {
        char gender = 'M';
        int weightInPounds = 185;
        int ouncesOfAlcoholConsumed = 3;
        float hoursSinceLastDrink = 2;

        float actualBAC = calculateBAC(gender, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.03, actualBAC, .001);
    }

    @Test
    public void bloodAlcoholLevelForAFemale() {
        char gender = 'M';
        int weightInPounds = 185;
        int ouncesOfAlcoholConsumed = 3;
        float hoursSinceLastDrink = 2;

        float actualBAC = calculateBAC(gender, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.025, actualBAC, .001);
    }

    /*
    */

    /**
     * Given your weight, gender, number of drinks, the amount of alcohol
     * by volume of the drinks consumed, and the amount of time since your last drink,
     * calculate your Blood Alcohol Content (BAC).
     *
     * The weight quotient is 5.14 divided by the person's weight in pounds.
     * The alcohol distribution ratio is 0.73 for men and 0.66 for women.
     * The peak alcohol content is the product of the weight quotient, ounces of alcohol consumed, and the
     * alcohol distribution ratio.
     * The last consumption interval is the product of the hours since the last drink and 0.015.
     *
     * The Blood Alcohol Content is the difference between the peak alcohol content and the last consumption interval.
     *
     * @param gender
     * @param weightInPounds
     * @param ouncesOfAlcoholConsumed
     * @param hoursSinceLastDrink
     * @return
     */
    private float calculateBAC(char gender, int weightInPounds, int ouncesOfAlcoholConsumed, float hoursSinceLastDrink) {
        return 0.0f;
    }
}