import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
조합을 이용해야 함
nCr = n! / {(n-r)! * r!}
케이스 [1 3] → 3C1 = 3! / (2! * 1!)

for문을 3번 돌리는 것은 너무 비효율 적이므로
nCr = n*(n-1)*...*(n-r+1) / r*...1
으로 바꾸어서 풀었다.
 */

// 다리놓기
public class Q1010 {
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
