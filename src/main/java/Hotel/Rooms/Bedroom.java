package Hotel.Rooms;

public class Bedroom extends Room{
    public enum RoomType {
        SINGLE(1, 10.00),
        DOUBLE(2, 20.00),
        FAMILY(4, 40.00),
        MASTER(2, 50.00);

        private final int capacity;
        private final double rate;

        RoomType(int capacity, double rate){
            this.capacity = capacity;
            this.rate = rate;
        }
    }

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
        setCapacity(roomType.capacity);
    }

    public double getRate(){
        return this.roomType.rate;
    }
}
