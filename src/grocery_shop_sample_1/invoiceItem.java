/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grocery_shop_sample_1;

/**
 *
 * @author DILUSHA LAKSHAN
 */
public class invoiceItem {
    private String proName;
    private long proID;
    private double sellingPrice;
    private int quantity;
    private long stockID;

    /**
     * @return the proName
     */
    public String getProName() {
        return proName;
    }

    /**
     * @param proName the proName to set
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * @return the proID
     */
    public long getProID() {
        return proID;
    }

    /**
     * @param proID the proID to set
     */
    public void setProID(long proID) {
        this.proID = proID;
    }

    /**
     * @return the sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public long getStockID(){
        return stockID;
    }
    
    public void setStockID(long stockID){
        this.stockID = stockID;
    }
    
}
