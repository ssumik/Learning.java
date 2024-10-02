package program;

import entities.Person;

public class Program {

    public static void main(String[] args) {
        Person room = new Person();
        
        room.rentRoom();
        room.printRoomData();
    }
}
