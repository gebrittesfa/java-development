package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //Set up or arrange
        Employee employee = new Employee();
        employee.setEmployeeId(2);
        employee.setDepartment("Finance");
        employee.setPayRate(25);
        double expectedPunchInTime = 6.0;
//       // employee.punchIn(4);
//       // employee.punchOut(10);
//        double timeIn = 6.0;
//        double timeOut = 18.0;
//        double expectedHoursWorked = timeOut - timeIn; //12 hours worked

        //act
        employee.punchIn(expectedPunchInTime);
        //assert
        double actualPunchInTime = employee.getPunchInTime();
        assertEquals(expectedPunchInTime, actualPunchInTime);

    }

    @Test
    void punchOut() {
        Employee employee2 = new Employee();
        employee2.setDepartment("Finance");
        employee2.setPayRate(25);
        double expectedHoursWorked = timeOut - timeIn; //12 hours worked
        //act
        employee2.punchIn(timeIn);
        employee2.punchOut(timeOut);
        //assert
        double actualHoursWoked = employee2.getPunchInTime();
        assertEquals(expectedHoursWorked,actualHoursWoked );
    }
}