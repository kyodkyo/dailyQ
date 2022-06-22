import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17_2839 {
    public static final int sugar1 = 5;
    public static final int sugar2 = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while(true){
            if(N<0){
                count = -1;
                break;
            }

            if(N%sugar1==0){
                count += N/5;
                break;
            } else {
                N -= sugar2;
                count++;
            }
        }

        System.out.println(count);
    }
}