/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author aly
 */
public class linkedlistnodes {
    node head;
    
    
    linkedlistnodes(int data){
        head = new node(data);
        
    }
    public void printing ()
    {
        node current=head;
    
    while(current!=null)
     {
         System.out.println("x="+current.getData());
         current=current.getNext();
    
     }
    }
    public void insertend (int x)
    {
    node new_node=new node(x);
    node current=head;
    while(current.getNext()!=null)
     {
         current=current.getNext();
    
     }
    current.setNext(new_node);
   
    }
    public void insertbegin (int x)  /*insertion at begining*/
    {
    node new_node=new node(x);
    new_node.setNext(head);
    head=new_node;
   
    }
    public void delet_index(int x) /*delete index*/
            
            
    { node current =head;
       node next=head;
       node temp=head;
      int counter=0;
    if(x==0)
        {  
           temp=current.getNext();
           head=temp; 
           current=null;
            
        }
   else
    {
      while(current!=null && counter!=x )
      {
       temp=current;
       next=current.getNext();
       current=next;
       next=temp;
       counter++;
      
       } 
      if(current==null)
            System.out.println(" Exceed the size");
      else
        { 
         
      
         temp=current.getNext();
         next.setNext(temp);
         
         
        }
          

        }
    }
    public void Delet_value(int x)   /* delete  value */
            
            
    { node current =head;
       node next=head;
       node temp=head;
      int counter=0;
    if(head.getData()==x)
        {  
           temp=current.getNext();
           head=temp; 
           current=null;
            
        }
   else
    {
      while(current!=null && current.getData()!=x )
      {
       temp=current;
       next=current.getNext();
       current=next;
       next=temp;
       counter++;
      
       } 
      if(current==null)
            System.out.println(" Can't find the value");
      else
        { 
         
      
         temp=current.getNext();
         next.setNext(temp);
         
         
        }
          

        }
    }
    
    public void Get_Index_value (int x)    /*get the index of a value*/
            
    {
        node current =head;
        int counter=0;
      
        
        {
        while(current!=null && (current.getData()!=x) )
         {
      
           current=current.getNext();
           
           counter++;
      
          } 
         if(current==null)
             System.out.println("Can't find the value");
         else
          {
         
             System.out.println("the index is "+counter);
         
          }
        }
    }
    public void Get_Value_Index (int x)    /*get the value of a index*/
            
    {
        node current =head;
        node next =head;
        int counter=0;
        while(current!=null && (counter!=x) )
         {
      
           current=current.getNext();
           counter++;
      
          } 
         if(current==null)
             System.out.println("Exceed the linked list size");
         else
          {
         
             System.out.println("the value is "+current.getData());
         
          }
    
    }
     public boolean Is_value (int x)    /*check existence of value*/
            
    {
        node current =head;
        node next =head;
      
        
        {
        while(current!=null && (current.getData()!=x) )
         {
      
           current=current.getNext();
      
          } 
         if (current==null)
         {
          
             return false;
         }
         else
          {
         
            return true;         
          }
        }
    }
     public void Get_length ()    /*get length of linked list*/
            
    {
        node current =head;
        int counter=0;
      
        
        {
        while(current!=null  )
         {
      
           current=current.getNext();
           counter++;
      
          } 
            System.out.println(" the size of linked list is "+counter);
        }
    }
     public void Get_Index_Last (int x)    /*get the value of a index*/
            
    {
        node current =head;
        node next =head;
        int counter=0;
        while(current!=null && (counter!=x) )
         {
      
           current=current.getNext();
           counter++;
      
          } 
         if(current==null)
             System.out.println("Exceed the linked list size");
         else
          {
         
             while(current!=null)
             {   
                 System.out.println("the value is "+current.getData());

                 current=current.getNext();



                 
             }
         
          }
    
    }
     
     
}