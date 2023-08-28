import java.util.Scanner;

public class ck {
        public static int ROW_S=8;
        public  static int COL_S=4;
        public static void calculation(int[][] ary,String[] contri)
        {
            System.out.println("      contry  gole   silronce  total");

            for(int i=0;i<ROW_S;i++)
            {
                System.out.printf("%10s",contri[i]);
                int total=0;
                for(int j=0;j<COL_S;j++)
                {
                    System.out.printf("%8d",ary[i][j]);
                    total=total+ary[i][j];
                }
                System.out.printf("%8d",total);
            }
        }
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            int[][] ary=new int[ROW_S][COL_S];
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<4;j++)
                {
                    ary[i][j]=input.nextInt();
                }
            }
            String[] contri=new String[8];
            for(int i=0;i<8;i++)
            {
                contri[i]=input.next();
            }
            calculation(ary,contri);
        }
}
