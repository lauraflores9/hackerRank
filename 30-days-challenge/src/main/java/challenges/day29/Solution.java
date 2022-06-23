package challenges.day29;

/*
    Task
        Given set S = {1,2,3,..,N}. Find two integers, A and B (where A < B), from set S such that the value of A&B
            is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND
            operator.

    Function Description
        Complete the bitwiseAnd function in the editor below.
            bitwiseAnd has the following parameter(s):
                - int N: the maximum integer to consider
                - int K: the limit of the result, inclusive
            Returns
                - int: the maximum value of A&B within the limit.


 */

import java.io.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int max = 0;

        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int aux = i & j;
                if ((aux < K) && (max < aux)) max = aux;
            }
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
