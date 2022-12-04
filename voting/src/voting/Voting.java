/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voting;
import java.util.Scanner
/**
 *
 * @author lalsu
 */
public class Voting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int age;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your age");
        age= sc.nextInt();
        if(age<18)
        {
            System.out.println("not elligible");
        }
        else if (age>18&&age<25)
        {
            System.out.println("wait");
        }
        else if (age>25&&age<40)
        {
            System.out.println("ok");
        }
    }
    
}
