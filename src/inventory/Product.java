/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.Serializable;

/**
 *
 * @author Iwa Stojnowa
 */
public class Product implements Comparable, Serializable{
    
    public static int count;
    private String id;
    private Category productCategory;
    private int reorderLevel;

    public Product(Category productCategory, int reorderLevel) {
        count++;
        this.id = "P-"+count;
        this.setProductCategory(productCategory);
        this.setReorderLevel(reorderLevel);
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.getId()+ " " + this.getProductCategory() + " " + this.getReorderLevel();
    }

    
    public int compareTo(Object o){
        try{
            Product p2 = (Product) o;
            return (this.getId().equals(p2.getId()) ? 0 : -1);            
        } catch(ClassCastException cException) {           
            return -1;
        }
    }
}
