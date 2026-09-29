package com.bukkue;

public class MultiplyCalculator {

    public int multiply(int calorie, int serving) {
        return calorie * serving;
    }

    public void printCalorieTable(int calorie, int maxServing) {
        for (int serving = 1; serving <= maxServing; serving++) {
            System.out.println(serving + "인분 : " + multiply(calorie, serving) + " kcal");
        }
    }
}
