import java.util.Scanner;

public class Maze {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String[] sarr = s1.split("-");
        int[] darr=new int[sarr.length];
        if (darr.length==3){
            try {
                for (int i = 0; i < sarr.length; i++) {
                    darr[i] = Integer.parseInt(sarr[i]);
                    //System.out.print(darr[i]+" ");

                }
                if (darr[0]>31 || darr[0]<0 || darr[1]>12 || darr[1]<0 || darr[2]>3000 || darr[2]<0){
                        throw new Exception("e");
                }
                else printNow(darr[0],darr[1],darr[2]);
            }
            catch (Exception e){
                System.out.println("Wrong input");
            }

        }
        else {
            System.out.println("Wrong input");
        }

    }
    public static void printNow(int dd, int mm,int yyyy){

        switch (mm){
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                if (yyyy%4==0 || yyyy%100==0 && yyyy%400==0) {
                    System.out.println("February has 29 days");
                }
                else
                    System.out.println("February has 28 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("june has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
        }
    }
}
