import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may innclude just putting in a literal value...
 * do not add any additional code.
 * <p>
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to the
 * called function, you did too much and should start over from the previous test.
 */

public class WeekTwoExercisePartThree {
    @Test
    public void sending20190913ReturnsTrue() {
        boolean actual = isUnluckyDate(2019, 9, 13);

        assertTrue(actual);
        // assertEquals(Arrays.asList(LocalDate.of(2020,03,13), LocalDate.of(2020,11,13)), actual);
    }

    @Test
    public void sending20191213ReturnsTrue() {
        boolean actual = isUnluckyDate(2019, 12, 13);

        assertTrue(actual);
    }

    @Test
    public void sending20191113ReturnsFalse() {
        boolean actual = isUnluckyDate(2019, 11, 13);

        assertFalse(actual);
    }

    @Test
    public void sending20201113ReturnsTrue() {
        boolean actual = isUnluckyDate(2020, 11, 13);

        assertTrue(actual);
    }

    @Test
    public void sending2019ReturnsDatesFromSeptAndDec() {
        LocalDate[] actual = unluckyDatesByYear(2019);
        LocalDate[] expected = new LocalDate[]{LocalDate.of(2019, 9, 13), LocalDate.of(2019, 12, 13)};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sending2020ReturnsDatesFromMarchAndNovember() {
        LocalDate[] actual = unluckyDatesByYear(2020);
        LocalDate[] expected = new LocalDate[]{LocalDate.of(2020, 3, 13), LocalDate.of(2020, 11, 13)};

        assertArrayEquals(expected, actual);
    }

    // TODO Empty this method: after PR Review by Steve

    public LocalDate[] unluckyDatesByYear(int year) {
        LocalDate[] localDates = new LocalDate[0];

        for (int month = 1; month <= 12; month++)
            if (isUnluckyDate(year, month, 13))
                localDates = addElement(localDates, year, month);

        return localDates;
    }

    // TODO Remove this method: after PR review by Steve

    private LocalDate[] addElement(LocalDate[] localDates, int year, int month) {
        LocalDate[] temp = new LocalDate[localDates.length + 1];

        if (localDates.length > 0)
            temp[0] = localDates[0];

        temp[Math.min(localDates.length, temp.length - 1)] = LocalDate.of(year, month, 13);
        localDates = temp;

        return localDates;
    }

    // TODO Empty this method: after PR reveiw by Steve
    public boolean isUnluckyDate(int year, int month, int day) {
        DayOfWeek dayofWeek = LocalDate.of(year, month, day).getDayOfWeek();

        if (dayofWeek == DayOfWeek.FRIDAY)
            return true;

        return false;
    }
}
