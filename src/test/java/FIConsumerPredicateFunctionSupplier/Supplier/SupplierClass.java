package FIConsumerPredicateFunctionSupplier.Supplier;

public class SupplierClass {

    private String itemName;
    private int price;

    public String getItemName(){
        return itemName;
    }

    private void setItemName(String itemName){
        this.itemName = itemName;
    }

    public int getPrice(){
        return price;
    }

    private void setPrice(int price){
        this.price = price;
    }

    SupplierClass(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
    }

    public String toString(){
        return "Item [itemName=" + itemName + ", price=" + price + "]";
    }
}
