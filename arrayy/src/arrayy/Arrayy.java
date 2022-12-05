/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayy;
import java.util.Scanner;
/**
 *
 * @author lalsu
 */
public class Arrayy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               int n,total=0,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of subjects:");
        n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("enter marks");
        for ( int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        percentage=total/n;
        System.out.println("total is"+total);
        System.out.println("percentage is"+percentage);
        System.out.println("marks of subject 2 is"+marks[2]);
    }
    
}
