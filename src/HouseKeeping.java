public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void service() {
        cleanRoom();
    }

    public void cleanRoom() {
        System.out.println("Housekeeping is cleaning room " + roomNumber);
    }
}