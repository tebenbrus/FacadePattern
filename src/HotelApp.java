public class HotelApp {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk("NCJ3391", 6699, 3);
        System.out.println();
        frontDesk.valetService();
        frontDesk.housekeepingService();
        frontDesk.cartService();
    }
}