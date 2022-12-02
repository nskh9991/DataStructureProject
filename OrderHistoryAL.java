/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

/**
 *
 * @author LEGION
 */
public class OrderHistoryAL {
     ArrayList <Customer> AL = new ArrayList<Customer>();
    
    public boolean isEmpty(){
    AL.isEmpty();
    return true;
    }
    public void add(Customer data){
        AL.add(data);
    }
    
    public void deleteOrder(Customer data){
        AL.remove(data);
    }
    
    public boolean search(Customer data){
        if(AL.contains(data)== true)
        return true;
        else{ System.out.println("customer not found:(");
        return false;
        }
    }
    
    public void show(){
        for(int i =0; i < AL.size();i++){
            System.out.println(AL.get(i).toString());
        }
       
    }

}
