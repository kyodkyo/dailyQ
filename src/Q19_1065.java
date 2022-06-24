import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q19_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        System.out.println(counting(number));
        br.close();
    }

    public static int counting(int num) {
        int count = 0;

        if (num < 100) {       // 1~99
            return num;
        } else {               // 100 ~ 999
            if (num == 1000) { // 예외처리
                num = 999;
            }
            count = 99;
            for(int i=100; i<=num; i++) {
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hun-ten)==(ten-one)) {
                    count ++;
                }
            }
        }

        return count;
    }
}
