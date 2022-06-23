package challenges.day28;

/*
    Task
        Consider a database table, Emails, which has the attributes First Name and Email ID.
        Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose
        email address ends in @gmail.com.
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        ArrayList<String> gmailUsers = new ArrayList<>();
        String gmailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(gmailRegEx);

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];
                Matcher matcher = pattern.matcher(emailID);

                if (matcher.find()) gmailUsers.add(firstName);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Collections.sort(gmailUsers);
        gmailUsers.forEach(System.out::println);

        bufferedReader.close();
    }
}
