package ArrayList.MovieTheater;

public class Seat {
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reserve() {
        if (!reserved) {
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean cancel() {
        if (reserved) {
            reserved = false;
            return true;
        }
        return false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }
}