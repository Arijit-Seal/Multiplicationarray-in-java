/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationarray;
import java.io.DataInputStream;
/**
 *
 * @author Arijit
 */
public class Multiplicationarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int i,j,k;
        DataInputStream in= new DataInputStream(System.in);
         int a[][]=new int[3][3];
         int b[][]= new int[3][3];
         int c[][]= new int [3][3];
         System.out.println("\nEnter the value of 1st matrix:");
         for(i=0;i<3;i++)
             for(j=0;j<3;j++)
                 a[i][j]=Integer.parseInt(in.readLine());
         System.out.println("\nEnter the value of 2nd matrix:");
         for(i=0;i<3;i++)
             for(j=0;j<3;j++)
                 b[i][j]=Integer.parseInt(in.readLine());
         for(i=0;i<3;i++)
             for(j=0;j<3;j++)
             {
                 c[i][j]=0;
                 for(k=0;k<3;k++)
                     c[i][j]=c[i][j]+a[i][k]*b[k][j];
             }
         System.out.println("\nMatrix Multiplication:");
         for(i=0;i<3;i++)
         {
             for(j=0;j<3;j++)
                System.out.print(c[i][j]+" ");
                System.out.print("\n");
         }
             
         
         
    }
    
}
