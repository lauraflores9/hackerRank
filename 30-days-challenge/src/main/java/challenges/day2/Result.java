package challenges.day2;

import java.io.*;

/*
    Task
        Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
            and tax percent (the percentage of the meal price being added as tax) for a meal,
            find and print the meal's total cost. Round the result to the nearest integer.
 */
class Result {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;

        double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
