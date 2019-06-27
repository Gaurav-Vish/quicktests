import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Integer a,temp,b=0,sum=0;
        a=sc.nextInt();
        temp=a;
        while (temp>0){
            b=temp%10;
            sum=sum*10+b;
            temp=temp/10;
            System.out.print(a+" ");
            System.out.print(temp+" ");
            System.out.print(sum+" ");
            System.out.println(b);
        }
        if (a==sum){
            System.out.println("Palindrome");
        }
    }
}
