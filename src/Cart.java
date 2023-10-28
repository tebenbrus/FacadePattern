public class Cart implements HotelService {
    private int numberOfCarts;
    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
    public void service() {
        requestCart();
    }
    public void requestCart() {
        System.out.println("Guest requested " + numberOfCarts + " luggage carts");
    }
}