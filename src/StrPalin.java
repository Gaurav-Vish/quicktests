import java.util.Scanner;

public class StrPalin {
    public static void main(String[] args) {
        int count,odd=0;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String s=a.toLowerCase().replaceAll(" ","");
        for (int i = 0; i < s.length(); i++) {
            count=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)==s.charAt(i)){
                    //System.out.print(s.charAt(i)+" ");
                    //System.out.print(s.charAt(j)+" ");
                    count++;
                    //System.out.println(count+" ");
                }
            }
            if (count%2!=0){
                odd++;
                //System.out.println(odd+" ");
            }
        }
        if (odd%2==0)
            System.out.println("Palindrome not possible");
        else
            System.out.println("Palindrome possible");
        //System.out.println(a);
        //System.out.println(s);
    }
}
