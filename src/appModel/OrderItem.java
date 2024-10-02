package appModel;

public class OrderItem {
    private final FoodItem foodItem;
    private final int qty;

    public OrderItem(FoodItem foodItem, int qty) {
        this.foodItem = foodItem;
        this.qty = qty;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getQty() {
        return qty;
    }

    public int getTotalPrice() {
        return foodItem.getPrice() * qty;
    }
}