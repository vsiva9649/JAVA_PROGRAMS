package Basima_Mam;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class NonOccupationPeriod {
    LocalDate startDate;
    LocalDate endDate;

    NonOccupationPeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

class OccupationCalculator {
    LocalDate occupationStartDate;
    LocalDate occupationEndDate;
    List<NonOccupationPeriod> nonOccupationPeriods;

    OccupationCalculator(LocalDate occupationStartDate, LocalDate occupationEndDate) {
        this.occupationStartDate = occupationStartDate;
        this.occupationEndDate = occupationEndDate;
        this.nonOccupationPeriods = new ArrayList<>();
    }

    void addNonOccupationPeriod(LocalDate startDate, LocalDate endDate) {
        NonOccupationPeriod nonOccPeriod = new NonOccupationPeriod(startDate, endDate);
        nonOccupationPeriods.add(nonOccPeriod);
    }

    Period calculateOccupationPeriod() {
        return Period.between(occupationStartDate, occupationEndDate.plusDays(1));
    }

    Period calculateTotalNonOccupationPeriod() {
        Period totalNonOccPeriod = Period.ZERO;
        for (NonOccupationPeriod nonOccPeriod : nonOccupationPeriods) {
            totalNonOccPeriod = totalNonOccPeriod.plus(Period.between(nonOccPeriod.startDate, nonOccPeriod.endDate.plusDays(1)));
        }
        return totalNonOccPeriod;
    }

    Period calculateEffectiveOccupationPeriod() {
        Period occupationPeriod = calculateOccupationPeriod();
        Period totalNonOccPeriod = calculateTotalNonOccupationPeriod();
        return occupationPeriod.minus(totalNonOccPeriod);
    }
}

public class Doubt {
	public static void main(String[] args) {
        LocalDate occupationStartDate = LocalDate.of(2023, 1, 1);
        LocalDate occupationEndDate = LocalDate.of(2023, 12, 31);

        OccupationCalculator calculator = new OccupationCalculator(occupationStartDate, occupationEndDate);

        // Example non-occupation periods
        calculator.addNonOccupationPeriod(LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 15));
        calculator.addNonOccupationPeriod(LocalDate.of(2023, 5, 10), LocalDate.of(2023, 5, 20));

        Period effectiveOccupationPeriod = calculator.calculateEffectiveOccupationPeriod();

        System.out.println("Effective Occupation Period: "
                + effectiveOccupationPeriod.getYears() + " years "
                + effectiveOccupationPeriod.getMonths() + " months "
                + effectiveOccupationPeriod.getDays() + " days");
    }
}
