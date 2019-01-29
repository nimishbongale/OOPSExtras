import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PasswordStrength {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int passstr, oned=0,onelc=0,oneuc=0,onesp=0;
        char input;
       for(int i=0;i<n;i++)
            {
                input=password.charAt(i);
                if(Character.isDigit(input))
                oned=1;
                else if(Character.isLowerCase(input))
                onelc=1;
                else if(Character.isUpperCase(input))
                oneuc=1;
                else
                onesp=1;
            }
            passstr=4-(oned+onelc+oneuc+onesp);
        if(n<6)
        {
            int extrabit;
            extrabit=passstr+n;
            if(extrabit<6)
            passstr+=6-extrabit;
        }
        return passstr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
