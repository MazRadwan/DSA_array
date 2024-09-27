package ArrayList.MovieTheater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater("Avalon Theater", 5, 6);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== " + theater.getTheaterName() + " ===");
            System.out.println("1. View seating chart");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. View available seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    theater.printSeatingChart();
                    break;
                case 2:
                    System.out.print("Enter seat number to reserve (e.g., B3): ");
                    String seatToReserve = scanner.nextLine().toUpperCase();
                    if (theater.reserveSeat(seatToReserve)) {
                        System.out.println("Seat " + seatToReserve + " reserved successfully.");
                    } else {
                        System.out.println("Failed to reserve seat " + seatToReserve + ". It may be already reserved.");
                    }
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel reservation (e.g., B3): ");
                    String seatToCancel = scanner.nextLine().toUpperCase();
                    if (theater.cancelSeat(seatToCancel)) {
                        System.out.println("Reservation for seat " + seatToCancel + " cancelled successfully.");
                    } else {
                        System.out.println("Failed to cancel reservation for seat " + seatToCancel + ". It may not be reserved.");
                    }
                    break;
                case 4:
                    System.out.println("Available seats: " + theater.getAvailableSeats());
                    break;
                case 5:
                    System.out.println("Thank you for using the Movie Theater Seating System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}