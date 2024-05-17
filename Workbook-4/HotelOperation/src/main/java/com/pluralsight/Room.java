package com.pluralsight;

import java.util.ArrayList;

public class Room {
    private int numberOfBeds;
    //private double price;
    private boolean occupied;
    private boolean dirty;
    //private boolean available;
    private String roomType;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, String roomType) {
        this.numberOfBeds = numberOfBeds;
        //this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.roomType = roomType;
    }
    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
               // ", price=" + price +
                ", Occupied=" + occupied +
                ", Dirty=" + dirty +
                ", RoomType=" + roomType +
                '}';
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    /*public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    } */

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        dirty = dirty;
    }

    /*public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        available = available;
    } */

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Derived getter methods
    public boolean getAvailable() {
        if (!dirty && !occupied) {
            return true;
        } else
            return false;
    }

    //Method to check In the room
    public void checkIn() {
        occupied = true; //Mark the room as occupied
        dirty = true; //Mark the room is dirty when checked in
//            Available = false; //Room is not available for booking
//            System.out.println("Room checked in successfully.");
//        } else {
//            System.out.println("Room is already occupied.");
    }

    public void checkOut() {
        occupied = false; //Mark the room as unoccupied
        //Dirty = false;
        cleanRoom();
//            System.out.println("Room checked in successfully.");
//        } else {
//            System.out.println("Room is already vacant.");
//        }
    }

    //Methode to clean the room
    public void cleanRoom() {
        // if (Dirty){
        dirty = false;
//            System.out.println("Room checked in successfully.");
//        } else {
//            System.out.println("Room is already clean.");
//        }
    }
}
//    public static void main(String[] args) {
//        //Creating room object
//        Room room1 = new Room("")
//        //Create an arrayList of rooms
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(rooms);
//        rooms.add(room1);
//
//    }
//}
//}
