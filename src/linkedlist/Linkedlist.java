/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author aly
 */
public class Linkedlist {

   
    public static void main(String[] args) {
    
       Scanner x=new Scanner(System.in);
    
       
   System.out.println("new printing");
 
    linkedlistnodes list=new linkedlistnodes(3); 
//    list.insertbegin(4);
//    list.insertbegin(5);
//    list.printing();
//    list.Get_Index_value(5);
//    list.Get_Index_value(20);
//    list.Get_Value_Index(1);
//    list.Get_Value_Index(20);
//    list.printing();
//    list.delet_index(0);
//    System.out.println("after deleting");
//    list.printing();
//    list.Delet_value(3);
//    System.out.println("after deleting");
//    list.printing();
//    boolean value;
//    value=list.Is_value(3);
//    System.out.println("existence of value is "+value);
//    list.Get_length();
    list.insertbegin(1);
    list.insertbegin(3);
    list.insertbegin(2);
    list.insertbegin(3);
    list.insertbegin(4);
    list.insertbegin(2);
    list.insertbegin(3);
    list.insertbegin(4);
    list.printing();
    list.Get_Index_Last(3);

    


    
    

    
    
    
    }
    
}
