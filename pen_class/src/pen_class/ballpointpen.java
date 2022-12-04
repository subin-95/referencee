/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pen_class;

/**
 *
 * @author lalsu
 */
public class ballpointpen {
    abstract class genericpen
            
{
    abstract void writing();
    void pen_type()
    {
        System.out.println("writing with ink");
    }
}
    class pen extends genericpen
{
    String pen_name;
    String model;
    float height;
    float width;
   public void purpose()
   {
       System.out.println("Writing");
   }

    @Override
    void writing() {
        System.out.println("Wrting can be used");
    }
}
    public class ballpointpen extends pen {
    String nip_type; 
    ballpointpen()
    {
        nip_type="ball";
    }
    ballpointpen(String ball_point)
    {
        nip_type=ball_point;
    }
  public void purpose()
  {
      System.out.println("Writing and drawing");
  }
  
  public void purpose(String purpose_type)
  {
      System.out.println("Purpose is"+ purpose_type);
  }
}}
