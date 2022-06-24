import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20_4344 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] arr; //성적 저장 array
        double[] perc = new double[caseNum];

        for(int i=0; i<caseNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int studentNum = Integer.parseInt(st.nextToken());
            arr = new int[studentNum];

            double sum = 0;

            for(int j=0; j<studentNum; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double mean = sum/studentNum;
            double count = 0;

            for(int s=0; s<studentNum; s++) {
                if(arr[s] > mean) {
                    count ++;
                }
            }

            perc[i] = (count/studentNum)*100;
            System.out.printf("%.3f%%\n", perc[i]);
        }
    }
}