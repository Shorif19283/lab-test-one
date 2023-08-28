import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ARRAYLIST {
    public  static int n=5;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> sfd=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int x=input.nextInt();
            sfd.add(x);
        }
        Collections.sort(sfd,Collections.reverseOrder());


        for(int i=0;i<n;i++)
            System.out.println(sfd.get(i));
       /// Collections.sort(sfd);
    }
}
