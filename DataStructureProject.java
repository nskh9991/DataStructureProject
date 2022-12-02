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
public class DataStructureProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Items item1 = new Items("banana", 2);
        Items item2 = new Items("moz", 30);
        Items item3 = new Items("jungle", 20005);
        Items item4 = new Items("kiwi", 5);
        
        BST availableItems = new BST();
      availableItems.Insert(item1);
      availableItems.Insert(item2);
      availableItems.Insert(item3);
      availableItems.Insert(item4);

        
    
    }
    
}
