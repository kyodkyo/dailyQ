import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q06_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int sum = 0;
        for(int i=0; i<month-1; i++){
            sum += months[i];
        }
        sum += (day-1);
        System.out.println(days[sum%7]);
    }
}
