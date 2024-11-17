## Data Structures and Algorithms
**Array assignment**

Calculate the average temperature, and give how many days are above the avarage temperature
1. Take an input from the user (eg. 5)
2. Prompt the user to enter all the 5 numbers (temperature values)
3. Calculate the avarage temperature
4. Given the avarage temperature, how many of the numbers in the line 2 are above the avarage temperature?

**Linked List Assignement** 

*Insert into a linked list*

0. if linked list doesn't exist then create it
1. Inserting at the beginning
2. Inserting at the ending
3. Insert anywhere in the Linked List

**Double Linked List Assignment**

*create a redo method for an UndoRedoManager class*
- Assignment located in the DoubleLinkedList folder

***

## QAP 1 - Movie Theater Seating Reservation System

**Located in ArrayList/MovieTheater folder**

- Implement a seat reservation system for a movie theater using Java. 
- This system will involve an array list that simulates a seating chart and various operations to manage reservations and cancellations. 
- The solution must consist of two classes: MovieTheater and Seat, and a driver program to test
with the following functionality:

**Requirements:**

1. **Seating Chart:**
   - The seating chart should be represented as a grid of seats where 0 denotes available seats and X denotes reserved seats.

2. **Reserve a Seat:**
   - The user should be able to select and reserve a seat. 
   - Upon successful reservation, the system returns a message indicating the row and seat number (e.g., "Row B, Seat 3")
   - If the selected seat is unavailable, the system should provide a list of available seats.
3. **Cancel a Reservation:**
   - The user should be able to cancel a reservation. 
4. **Class Structure:**
    -  `MovieTheater`: This class contains the theater’s name, number of rows, and the seating chart. It must include methods to print the seating chart, reserve a seat, and cancel a reservation.
    - `Seat`:  This class manages individual seat operations such as reserving and canceling a seat.
      - It also provides the seats status and number.
5. **Driver Program:**
    - The driver program  creates a MovieTheater object and test the functionality of the system.
    - The driver program  allows the user to reserve and cancel seats until the user decides to exit the program.
   
**Additional Specifications:**
- **Intialization:**: The `MovieTheater` class initializes the seating chart based on the number of rows and seats per row.
- **Display Seating Chart:**: The `MovieTheater` class  provides a method to display the seating chart.
- **Seat Class**: The `Seat` class includes methods for :
  - Reserving a seat.
  - Cancelling a reservation.
  - Retrieving the seat status.

## Recursion Assignment
- Write a function that finds the sum of a positive integer number using recursion as SHOWN in class.
- Write a function that takes in any decimal number and converts to a binary number using the flow we did in class 