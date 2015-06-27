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
public class node {
    private int data ;
    private node next=null;
    /*
    * using same method name with multiple parameters is called OVERLOADING.
    *
    */
    node (int data)
    {
        this.data=data;
    }
    
    
    node(int data ,node next)
    {
    
        this.data=data;
        this.next=next;
        
    }
    
    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public node getNext()
     {
        return next;
     }

    /**
     * @param next the next to set
     */
    public void setNext(node next)
     {
        this.next = next;
     }
       
    
}

