// add two matrix in java
import java.util.Scanner;

class matrix {
   
    public static void main(String args[]) {
        int n;
        System.out.println("enter the size of matrix");
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][]= new int [n][n];
        int i;
        int j;
        Scanner r = new Scanner(System.in);
        System.out.println("enter the elements of matrix a ");
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("___MATRIX___");
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("\n");
           

        }
        System.out.println("enter the elements of matrix b");
        for ( i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                b[i][j] = r.nextInt();
            }
        }
        System.out.println("___MATRIX___");
        for ( i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println("\n");
           

        }

        System.out.println("SUM of two matrix a And b =");
        for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+"  ");

                }
                System.out.println("\n");
            }


       
        r.close();
        x.close();


    }
}