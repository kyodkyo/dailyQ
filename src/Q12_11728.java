import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Q12_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());

        int[] result = new int[sizeA+sizeB];

        String[] elementsA = br.readLine().split(" ");
        for(int i=0; i<sizeA; i++){
            result[i] = Integer.parseInt(elementsA[i]);
        }

        int index = 0;
        String[] elementsB = br.readLine().split(" ");
        for(int i=sizeA; i<result.length; i++){
            result[i] = Integer.parseInt(elementsB[index]);
            index++;
        }

        Arrays.sort(result);

        for(int i:result){
            bw.write(String.valueOf(i) + " ");
        }

        bw.flush();
        bw.close();

        //[배열 출력 다른 방법] but, 시간초과 가능성이 있음,,
        // System.out.println(Arrays.toString(result));
    }
}
