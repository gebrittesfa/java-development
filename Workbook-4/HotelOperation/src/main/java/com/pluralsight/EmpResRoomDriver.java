package com.pluralsight;

import java.util.Scanner;

public class EmpResRoomDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time did you start work?");
        double startTime = scanner.nextDouble();
        System.out.println("What time did you finish work?");
        double finishTime = scanner.nextDouble();
        Employee employee1 = new Employee(1,"Gebrit Tesfay",
                "It", 27.00,45);

        System.out.println("OverTime: " +employee1.getOvertimeHours());
        System.out.println("Emp1 payment: " +employee1.getTotalPay());
        System.out.println("Regular Hours: " +employee1.getRegularHours());

        Reservation res1 = new Reservation();
        res1.setRoomType("double");
        res1.setWeekend(false);
        res1.setNumberOfNights(3);
        System.out.println(res1.getPrice());
        System.out.println(res1.getReservationTotal());

        Employee employee = new Employee();
        employee.setEmployeeId(2);
        employee.setDepartment("Finance");
        employee.setPayRate(25);
        employee.punchIn(4);
        employee.punchOut(10);

        System.out.println("Worked hours: " +employee.getHoursWorked());
        System.out.println("OT hours: " +employee.getOvertimeHours());
        System.out.println("Payment: " +employee.getTotalPay());
        System.out.println(employee.getRegularHours()); */
        /*
        we have  a hotel room and has 10 suites and 10 normal room
        The king rooms they are suites and the double rooms are normal rooms
         */
        Room room1 = new Room(1,139.00,false,false,"King");
        Room room2 = new Room(2,139.00,false,false,"King");
        Room room3 = new Room(3,139.00, false,false,"King");
        //Create an array
        Room[] suites ={room1, room2, room3};

        ///Basic
        Room room11 = new Room(1,124.00,false,false,"Double");
        Room room12 = new Room(1,124.00,false,false,"Double");
        //Create an array
        Room[] basicSuites ={room11, room12};

        // Create a hotel object
        Hotel gebritHotel = new Hotel("Gebrit Hotel",10, 10,
                0,0);
        //SomeOne ask what
        Reservation res = new Reservation();
        // what kind of room do you want, how many night ,
        res.setNumberOfNights(3);
        //res.setRoomType(room1); //setRoom supposted to be
        res.setWeekend(true);
        System.out.println(res.getReservationTotal());
        room1.setOccupied(true);
        room1.setDirty(true);

        //Check what rooms
        for (Room room : suites){
            if (room.isOccupied()) {
                System.out.println(room);
            }
            }
        }
    }
