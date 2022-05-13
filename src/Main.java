import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
조합을 이용할 것
nCr = n! / {(n-r)! * r!}
케이스 [1 3] → 3C1 = 3! / (2! * 1!)
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        for(int i=1; i<=T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.printf("%.0f\n", Combination(M, N));
        }
    }

    public static double Combination(int n, int r) {

        double a = 1;
        double b = 1;

        for (double i = n; i > n - r; i--) {
            a = a * i;
        }
        for (double i = r; i > 0; i--) {
            b = b * i;
        }

        return a / b;
    }
}
