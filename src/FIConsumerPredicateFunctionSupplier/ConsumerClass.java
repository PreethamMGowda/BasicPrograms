package FIConsumerPredicateFunctionSupplier;

public class ConsumerClass {

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

    ConsumerClass(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
    }
}
