package Hotel.Bookings;

import Hotel.Rooms.Bedroom;

public class BedroomBooking {

    private Bedroom bedroom;
    private int nights;

    public BedroomBooking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getBill(){
        return nights * bedroom.getRate();
    }

}
