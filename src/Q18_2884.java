import java.util.Scanner;

public class Q18_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m>=45) {
            m = m-45;
            System.out.println(h + " " + m);
        } else if(m<45) {
            if(h==0) {
                h = 23;
            } else {
                h = h-1;
            }
            m = m + 15;
            System.out.println(h + " " + m);
        }

        sc.close();
    }
}
