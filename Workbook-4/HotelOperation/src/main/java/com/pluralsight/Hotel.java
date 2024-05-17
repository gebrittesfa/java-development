package com.pluralsight;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRoom;
    private int bookedSuites;
    private int bookedRoom;

    public Hotel(String name, int numberOfSuites, int numberOfRoom, int bookedSuites, int bookedRoom) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRoom = numberOfRoom;
         this.bookedSuites = bookedSuites;
        this.bookedRoom = bookedRoom;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= numberOfSuites - bookedSuites) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                if (numberOfRooms <= numberOfSuites - bookedSuites) {
                    bookedSuites += numberOfRooms;
                    return true;
                }
            }
            return false;
        }
//        public int getAvailableSuites () {
//            return numberOfSuites - bookedSu ites;
//        }
//        public int getAvailableRoom () {
//            return numberOfRoom - bookedRoom;
//        }
        return isSuite;
    }

}