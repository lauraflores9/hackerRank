package challenges.day9;

/*
    Recursive Method for Calculating Factorial
        factorial(N):
            1 if N <= 1
            N x factorial(N - 1) otherwise

    Function Description
        Complete the factorial function in the editor below. Be sure to use recursion.
        factorial has the following parameter:
        int n: an integer

    Returns
        int: the factorial of n
        Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial,
        you will get a score of 0.
 */

import java.io.*;

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n <= 1) return n;
        else return n * factorial(n - 1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

