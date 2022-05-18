import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q05_1546 {
/*
최고 성적을 기준으로 성적/최고성적*100으로 모두 변환한 뒤 평균을 구해야 함
for문을 통해 가장 높은 성적을 max에 저장한다.
각 성적을 변환하여 배열에 담고, 배열의 모든값을 더하여 평균을 낸다.
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] score = new double[N];
        double max = 0;
        for(int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(st.nextToken());

            if(score[i]>max){
                max = score[i];
            }
        }

        double sum = 0;
        for(int i=0; i< score.length; i++){
            score[i] = (score[i]/max)*100;
            sum += score[i];
        }
        System.out.println(sum/N);
    }
}
