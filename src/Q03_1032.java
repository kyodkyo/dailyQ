import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
첫번째 줄을 입력받아 배열에 넣은 뒤
다음에 들어오는 입력과 첫번째를 비교하여 서로 다른 문자이면 '?'로 바꿈
마지막엔 toString으로 전체 출력!
 */

public class Q03_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());

        String[] arr = new String[line];
        for(int i=0; i<line; i++){
            arr[i] = br.readLine();
        }

        boolean df = true;
        for(int i=0; i<arr[0].length(); i++){
            for(int j=0; j<line; j++){
                if(arr[0].charAt(i) != arr[j].charAt(i)){
                    df = false;
                    break;
                }
            }

            if(df){
                System.out.print(arr[0].charAt(i));
            } else{
                System.out.print('?');
                df = !df;
            }
        }
    }
}
