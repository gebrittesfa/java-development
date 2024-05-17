package com.pluralsight;

public class Reservation {
    private String roomType;
    private String room;
    private int numberOfNights;
    private  boolean weekend;

    public Reservation(){
        roomType = null;
        numberOfNights = 0;
        weekend = false;
        room = null;
    }

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {

        this.roomType = roomType;
    }

    public int getNumberOfNights() {

        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public String getRoom() {
        return room;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    //Derived
    public double getPrice(){
        if (room.getRoomType.equals("King")){
            if (weekend)
            return 139.00*1.10;
            return 139.00;
        }else if (room.getRoomType.equals("double")){
            if (weekend)
                return 124.00 * 1.10;
            return 124.00;
        }
        return 0;
    }
    public double getReservationTotal(){

        return getPrice() *numberOfNights;
    }

}
