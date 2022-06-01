public class Q10_4673 {
    public static void main(String[] args) {
        boolean[] selfNum = new boolean[10001]; // false-셀프넘버 O, true-셀프넘버 X

        for(int i=1; i<10001; i++){
            int n = division(i);
            if(n<10001){
                selfNum[n] = true; //셀프넘버가 아닌 수이므로 true로 값을 바꿔준다.
            }
        }

        for(int i=1; i<10001; i++){
            if(!selfNum[i]){
                System.out.println(i); //
            }
        }
    }

    public static int division(int n){
        int sum = n;
        while (n!=0){
            sum += (n%10);
            n = n/10;
        }
        return sum;
    }
}
