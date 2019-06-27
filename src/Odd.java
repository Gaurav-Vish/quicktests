import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer sum=0;
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        for (int i = a; i < b; i++) {
            if (i%2==0){
                continue;
            }
            else{
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}