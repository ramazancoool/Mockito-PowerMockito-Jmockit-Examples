package com.groupId.test.module;

public final class InterestManager {

    public final double getMonthlyInterestPercentage() {
        fancyNetworkCallWithStaticMethod();
        return 5;
    }

    private static void fancyNetworkCallWithStaticMethod() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
    }
}

