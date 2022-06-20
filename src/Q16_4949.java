import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Q16_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true){
            s = br.readLine();

            //문장이 . 이면 종료
            if(s.equals(".")){
                break;
            }
            sb.append(checkStack(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String checkStack(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // 쌍을 이루어야 하는 괄호만 확인하고 나머지 문자는 스킵함
            if(c=='(' || c =='['){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.empty() || stack.peek()!='('){
                    return "no";
                } else {
                    stack.pop();
                }
            }
            else if(c==']'){
                if(stack.empty() || stack.peek()!='['){
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) return "yes";
        else return "no";
    }
}
