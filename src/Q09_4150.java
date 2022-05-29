import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q09_4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger[] fibo = new BigInteger[N + 1];

        for (int i = 0; i <= N; i++) {
            if (i < 2) {
                fibo[i] = BigInteger.valueOf(i);
            } else if (i == 2) {
                fibo[i] = BigInteger.valueOf(1);
            } else {
                fibo[i] = fibo[i-1].add(fibo[i-2]);
            }
        }
        System.out.println(fibo[N]);
    }
}
