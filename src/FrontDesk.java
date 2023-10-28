class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(String plateNumber, int roomNumber, int numberOfCarts) {
        valet = new Valet(plateNumber);
        housekeeping = new HouseKeeping(roomNumber);
        cart = new Cart(numberOfCarts);
    }
    public void valetService() {
        valet.service();
    }
    public void housekeepingService() {
        housekeeping.service();
    }
    public void cartService() {
        cart.service();
    }
}
