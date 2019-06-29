import java.util.Scanner;

public class CompVersion {
    public static void main(String... args) {
        Scanner sc =new Scanner(System.in);
        String v1=sc.next();
        String[] arr1 = v1.split("\\.");
        String v2=sc.next();
        String[] arr2 = v2.split("\\.");
        sc.close();

        int[] ar1 =new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            ar1[i]=Integer.parseInt(arr1[i]);
            /*if (ar1[i] < Integer.MAX_VALUE) {        //Test if conversion occured
                System.out.println("yes");
            }*/
            //System.out.print(ar1[i]+" ");
        }

        int[] ar2 =new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            ar2[i]=Integer.parseInt(arr2[i]);
            //System.out.print(ar2[i]+" ");
        }
        int maxlen = (ar1.length == ar2.length) ? ar1.length:(ar1.length > ar2.length) ? ar1.length:ar2.length;
        //int[] minarr =new int[Integer.MIN_VALUE];
        int[] maxarr =new int[maxlen];
        if (ar1.length>ar2.length){
            for (int i = 0; i < ar1.length; i++) {
                maxarr[i] = ar1[i];
                System.out.println(maxarr[i]);
            }
            //minarr = ar2;
        }
        /*for (int i = 0; i < ar1.length; i++) {
            System.out.println(maxarr[i]);
        }*/
    }
}
