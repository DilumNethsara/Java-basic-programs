package hotelreservationsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class HotelReservationSystem {
    
    static ArrayList<rooms> room = new ArrayList<rooms>();
    static ArrayList<rooms> bookedRooms = new ArrayList<rooms>();
    static Scanner sc = new Scanner(System.in);
    
    
    public static void viewBookingDetails(){
        for(int i = 0; i<bookedRooms.size();i++){
            if(room.get(i).isAvailable()){
                System.out.println("Room No \t Type \t\t Capacity \t\t Price");
                System.out.println(bookedRooms.get(i).toString());
            }
        }
            System.out.println();
        }

    public static void main(String[] args) {

       System.out.println("--Welcome to Hotel Reservation system--");

       boolean exit = false;
       
       room.add(new rooms(1,"deluxe room",2,8000.00,true));
       room.add(new rooms(2,"single room",1,2500.00,true));
       room.add(new rooms(3,"double room",2,4500.00,true));
       room.add(new rooms(4,"single room",1,2500.00,false));
       room.add(new rooms(5,"family room",5,15000.00,false));

        while(!exit){ 
            System.out.print("1 - Check available rooms \n 2 - Make reservations \n 3 - View booking details \n 4 - Exit \n Enter : ");
            int option = sc.nextInt();
            System.out.println();
        switch(option){
            case 1 ->{checkAvailableRooms();
                        break;}
            case 2 ->{makeReservation();
                        break;}
            case 3 ->{viewBookingDetails();
                        break;}
            case 4 ->{exit = true;
                        break;}
            default -> System.err.println("Invalid input");
        }
        } 
    }
   
    public static void checkAvailableRooms(){
        for(int i = 0; i<room.size();i++){
            if(room.get(i).isAvailable()){
                System.out.println("Room No \t Type \t\t Capacity \t\t Price");
                System.out.println(room.get(i).toString());
            }
        }
        System.out.println();
    }
    
    public static void makeReservation(){
        System.out.print("Enter a room number for book : ");
        int roomNumber = sc.nextInt();
        int index=0;
        if(roomNumber>room.size())
            System.err.println("This room is not exist!\n"); 
        else{

         for(int i = 0 ;i<room.size();i++){
            if(room.get(i).getRoomNo()==roomNumber){
                index = i;
                break;
            }
        }
        if(!room.get(index).isAvailable()){
            System.err.println("This room is already booked!\n");
        }               
        else{
            System.out.println("Thank you! Room number "+roomNumber+" is booked succsessfuly!\n" );
            room.get(index).setAvailable(false);
            bookedRooms.add(new rooms(room.get(index).getRoomNo(),room.get(index).getType(),room.get(index).getCapacity(),room.get(index).getPrice(),room.get(index).isAvailable()));
        }
        }
        
    }
       
    }
    
    

