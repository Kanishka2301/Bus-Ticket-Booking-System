package busResv;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
    ArrayList<Bus> buses = new ArrayList<Bus>();
    ArrayList<Booking> bookings = new ArrayList<Booking>();

    buses.add(new Bus(1,true,1));
        buses.add(new Bus(2,false,43));
        buses.add(new Bus(3,true,48));
        buses.add(new Bus(4,true,48));
        buses.add(new Bus(5,true,35));
        buses.add(new Bus(6,true,30));
        buses.add(new Bus(7,true,20));
        buses.add(new Bus(8,true,25));
        buses.add(new Bus(9,true,10));
        buses.add(new Bus(10,true,18));
        buses.add(new Bus(11,true,28));
        buses.add(new Bus(12,true,43));
        buses.add(new Bus(13,true,20));
        buses.add(new Bus(14,true,23));
        buses.add(new Bus(15,true,25));


        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOpt = scanner.nextInt();
            if (userOpt == 1)
            {
               Booking booking = new Booking();
               if(booking.isAvailable(bookings,buses)){
                 bookings.add(booking);
                 System.out.println("Booking is confirmed");
               }
               else
                   System.out.println("Bus is full.Try another bus");
            }
        }
    }
}