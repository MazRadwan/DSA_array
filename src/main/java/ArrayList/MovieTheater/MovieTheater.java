package ArrayList.MovieTheater;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    public MovieTheater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        for (int row = 0; row < numRows; row++) {
            for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                char rowChar = (char) ('A' + row);
                String seatNumber = String.format("%c%d", rowChar, seatNum );
                seats.add(new Seat(seatNumber));
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    public boolean cancelSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.cancel();
    }

    public void printSeatingChart() {
        int seatsPerRow = 5; // Fixed number of seats per row
        for (int i = 0; i < seats.size(); i++) {
            if (i % seatsPerRow == 0) {
                System.out.println();
                System.out.print((char) ('A' + i / seatsPerRow) + " ");
            }
            System.out.print(seats.get(i).isReserved() ? "X " : "0 ");
        }
        System.out.println();
    }

    public List<String> getAvailableSeats() {
        List<String> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (!seat.isReserved()) {
                availableSeats.add(seat.getSeatNumber());
            }
        }
        return availableSeats;
    }

    private class Seat {
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
}