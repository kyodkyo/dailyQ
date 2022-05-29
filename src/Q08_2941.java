import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<words.length; i++){
            if(input.contains(words[i])){
                input = input.replace(words[i], "!");
            }
        }
        System.out.println(input.length());
    }
}
