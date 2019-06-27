import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer count,sum=0;
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        for (int i = a; i < b; i++) {
            count=0;
            for (int j = 2; j < b; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count<2){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}