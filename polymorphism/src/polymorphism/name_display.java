/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author lalsu
 */
public class name_display {
   String name;

   void display()
   {
     
    System.out.println("Name is GAVASKAR ");   
   }
}
class name_display extends name_display_base {
 String name;
 void display()
 {
     this.name="GAVASAKR";
    this.display(name);
 }
 void display(String name1)
 {
     name=name1;
     System.out.println("Name is "+ name);
 }
}
