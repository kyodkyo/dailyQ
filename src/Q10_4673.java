public class Q10_4673 {
    public static void main(String[] args) {
        boolean[] tf = new boolean[10001];

        for(int i=1; i<10001; i++){
            int n = division(i);
            if(n<10001){
                tf[n] = true;
            }
        }

        for(int i=1; i<10001; i++){
            if(!tf[i]){
                System.out.println(i);
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
