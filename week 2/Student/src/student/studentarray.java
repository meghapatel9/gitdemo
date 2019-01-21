/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;
import java.util.Scanner;

/**
 *
 * @author Megha
 */
public class studentarray {
    public static void main(String[] args)
    {
    Student s1=new Student();
    s1.name="Megha";
    System.out.print(s1.name);
    
   Student[] gos=new Student[5];
//    gos[0].id=10;
//    gos[0].name="Mary";
//    
    Scanner in=new Scanner(System.in);
   for(int i=0;i<gos.length;i++)
   {
       gos[i]=new Student();
      System.out.println("Enter student name: ");
      gos[i].setName(in.nextLine());
      System.out.println("Enter Student Id: ");
    gos[i].setId(Integer.valueOf(in.nextLine()));
   }
    for(int i=0;i<gos.length;i++)
    {
        System.out.print("id: "+gos[i].id+"name: "+gos[i].name);
        System.out.println();
    } 
    
    }
}
