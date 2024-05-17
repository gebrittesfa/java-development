package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    //The check in method responsible for setting occupied to true and dirty to true
    //Set up or arrange
    //Set up any : variable //Arrange
       // Room room = new Room(1, false,false,"King");

    @Test
    void checkIn() {
        //Set up or arrange
        Room room = new Room(1, 122.45,false,false,"King");
        boolean expectedOccupied = true;
        boolean expectedDirty = true;

        //Act
        //room.setDirty(true);
        room.checkIn();
        boolean actualOccupied = room.isOccupied(); //Should be true
        boolean actualDirty = room.isDirty(); // Should be true
        assertEquals(expectedOccupied, actualOccupied);
        assertEquals(expectedDirty, actualDirty);
    }
    @Test
    void checkOut() {
        //Set up or arrange
        Room room = new Room(1, 122.45,false,false,"King");
        boolean expectedOccupied = false;
        boolean expectedDirty = false;
        //Act
        room.checkOut();

        //Assert:
        boolean actualOccupied = room.isOccupied(); //Should be False
        boolean actualDirty = room.isDirty(); // Should be false
        assertEquals(expectedOccupied, actualOccupied);
        assertEquals(expectedDirty, actualDirty);

    }

    @Test
    void cleanRoom() {
        //Set up or arrange
        Room room = new Room(1, 122.45,false,false,"King");
        boolean expectedDirty = false;
        //Act
        room.cleanRoom();

        //Assert:
        boolean actualDirty = room.isDirty(); // Should be false
        assertEquals(expectedDirty, actualDirty);
    }
}