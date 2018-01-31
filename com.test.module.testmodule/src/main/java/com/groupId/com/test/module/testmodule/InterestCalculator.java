package com.groupId.com.test.module.testmodule;

public class InterestCalculator {

    public static final int MONTHS_PER_YEAR = 12;

    public double getYearlyInterest(
            final InterestManager interestManager, final double savings) {

        double monthlyInterestPercentage = 
            interestManager.getMonthlyInterestPercentage();

        double ratio = monthlyInterestPercentage / 100;
        double base = 1 + ratio / MONTHS_PER_YEAR;
        double power = Math.pow(base, (double) MONTHS_PER_YEAR);
        double interest = savings * (power - 1);

        return interest;
    }
}

