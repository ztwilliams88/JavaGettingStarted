import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekOneExercisesPartOne {
    // ** EXERCISE INSTRUCTIONS **
    // Make the smallest change(s) possible to get each test to pass in sequence.
    // Commit to git after each test passes with a message describing what you did.

    final double ROUND_TO_NEAREST_PENNY = .001;

    @Test
    public void numberOfWholeSlicesForOnePizzaAndEightPeople() {
        int numberOfPeople = 8;
        int numberOfEightSlicePizzas = 1;

        int actualSlicesPerPerson = divideUpEightSlicePizzasEvenly(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(1, actualSlicesPerPerson);
    }

    @Test
    public void numberOfWholeSlicesFromOnePizzaAndEightPeople() {
        int numberOfPeople = 4;
        int numberOfEightSlicePizzas = 2;

        int actualSlicesPerPerson = divideUpEightSlicePizzasEvenly(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(4, actualSlicesPerPerson);
    }

    @Test
    public void numberOfWholePiecesPerPerson() {
        int numberOfPeople = 3;
        int numberOfEightSlicePizzas = 2;

        int actualSlicesPerPerson = divideUpEightSlicePizzasEvenly(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(1, actualSlicesPerPerson);
    }

    @Test
    public void leftoversWithFivePeopleAndTwoPizzas() {
        int numberOfPeople = 5;
        int numberOfEightSlicePizzas = 2;

        int actualLeftoverSlices = determineLeftoverSlicesOfPizza(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(1, actualLeftoverSlices);
    }

    private int divideUpEightSlicePizzasEvenly(int numberOfPizzas, int numberOfPeople) {
        return 0;
    }

    private int determineLeftoverSlicesOfPizza(int numberOfPizzas, int numberOfPeople) {
        return 0;
    }

    @Test
    public void simpleInterestReturnsCorrectAmount() {
        float principalAmount = 1500;
        float interestRateAsAPercent = 4.3f;
        float termOfInvestmentInYears = 4;

        float actualInvestmentValue = calcSimpleInterest(principalAmount, interestRateAsAPercent, termOfInvestmentInYears);

        assertEquals(1758f, actualInvestmentValue, ROUND_TO_NEAREST_PENNY);
    }

    /**
     * The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual
     * rate of interest, t is the number of years the amount is invested, and A is the amount at the end of
     * the investment.
     *
     * @param principal
     * @param percentInterestRate
     * @param numberOfYears
     * @return
     */
    private float calcSimpleInterest(float principal, float percentInterestRate, float numberOfYears) {
        return 0;
    }
}
