import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
N행 M열의 배열에서 만들 수 있는 8*8 체스판의 개수는 (N-7)*(M-7)이다.
최악의 경우 칠해야 하는 정사각형의 개수는 당연히 64가 될 것이며, static 변수로 선언하였다.

각 경우의 수는 정점을 기준으로 구분하되, 정점은 체스판의 가장 왼쪽 위 첫번째 좌표를 말한다.
(0, 0) ~ (7, 7) 부터 각 경우에서의 (정점, 정점) ~ (정점+7, 정점+7)의 색깔을 비교하면서
다른 경우에는 count를 늘려간다.
 */

public class Q02_1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //첫 줄의 입력을 통해 배열 생성
        arr = new boolean[N][M];

        //한줄씩 읽으면서 흰색이면 true, 검은색이면 fasle로 저장
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N-7;
        int M_col = M-7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j<M_col; j++){
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y){

        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean TF = arr[x][y]; //첫번째 칸의 색깔을 가져옴

        for(int i=x; i<end_x; i++){
            for(int j=y; j<end_y; j++){
                //올바른 색상이 아니면 새로 칠해야 하는 칸이므로 count 1 증가
                //흰색과 검정색은 계속해서 엇갈리게 나와야 함!!
                if(arr[i][j]!=TF){
                    count++;
                }
                //색상이 엇갈려야 하므로 계속해서 TF를 바꿔주어야 함
                TF = !TF;
            }
            //색상은 세로줄에서도 계속해서 엇갈려야 함.
            TF = !TF;
        }
        //첫번째 칸을 기준으로 할 때 색칠해야 할 개수가 count이고,
        //첫번째 칸과 반대되는 색을 기준으로 할 때 색칠해야 할 개수는 64-count이다.
        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }
}
