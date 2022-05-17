import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
#그룹 단어 체커
단어의 개수만큼 for문을 돌리며, checkStr()의 값이 true이면 count를 1씩 증가시킨다.

checkStr() : 단어를 하나씩 쪼개서 비교함
- prev : 이전 단어
- now : 현재 단어
 */

public class Q04_1316 {
    static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=0; i<num; i++){
            if(checkStr()){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean checkStr() throws IOException {
        String str = br.readLine();
        boolean[] check = new boolean[26];

        //현재 단어는 무엇일지 모르므로 -1
        // (now가 0이면 비교를 안하고 넘어가는 경우가 생기므로 -1로 설정함)

        int prev = -1;
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i)-'a';
            if(prev!=now){                  //앞선 문자와 같지않고
                if(!check[now]){            //지금까지 체크한 적이 없는 알파벳이면
                    check[now] = true;      //해당 요소를 true로 변경함.
                    prev = now;
                } else {                    //체크한 적이 있는 요소이면
                    return false;           //이전에 나온적이 있는 알파벳인 것이므로 그룹 단어가 아님
                }
            }                               //prev==now이면 if문을 거치지 않고 다음 반복으로 넘어감
        }
        return true;
    }
}


