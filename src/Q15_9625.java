import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[46][2];
        //arr[1][0] = 0;
        arr[1][1] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;

        for(int i=3; i<N+1; i++){
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }
        System.out.println(arr[N][0] + " " + arr[N][1]);
    }
}
