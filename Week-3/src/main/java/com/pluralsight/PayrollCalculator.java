package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//import java.io.InputStreamReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader("employees.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(fileReader)));
            reader.readLine(); //it will read and skip the first line
            String line;

            // Read each line of the file
            while ((line = reader.readLine()) != null) { // Starts on second line
                String[] data = line.split("\\|");
                Employee employee = new Employee(Integer.parseInt(data[0]),
                        data[1], Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]));
                double pay = employee.getGrossPay();
                System.out.printf("%d %s %.2f\n", employee.getEmployeeId(),
                        employee.getName(), pay);

                // Writing data to CSV file
                String[] header = {"Id", "Name", "Gross pay"};
                //writer.write(header);


            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
