package Exceptions.HotelBookingSoluntion.App;

import Exceptions.HotelBookingSoluntion.Model.Entities.Reservation;
import Exceptions.HotelBookingSoluntion.Model.Exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            short roomNumber = sc.nextShort();
            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = simpleDateFormat.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyy): ");
            String checkInString = sc.next();
            Date checkOut = simpleDateFormat.parse(checkInString);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update resevation: ");
            System.out.print("Check-in(dd/mm/yyyy):");
            checkIn = simpleDateFormat.parse(sc.next());
            System.out.print("Check-out(dd/mm/yyyy):");
            checkOut = simpleDateFormat.parse(sc.next());

            reservation.updatedDates(checkIn, checkOut);
            System.out.println(reservation);
        } catch (ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e){
            System.out.println("Error in resevation: " +e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Please, enter with an integer number for the room number");
        } catch (RuntimeException e){ //any error that has not been handled will be reported here
            System.out.println("Unexpected error!");
        }

        sc.close();
    }
}
