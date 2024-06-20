package com.pluralsight;

import java.time.LocalDate;

public class Lease {
        private int id;
        private Vehicle VIN;
        private LocalDate leaseStartDate;
        private LocalDate leaseEndDate;
        private double monthlyPayment;

        public Lease(int id, Vehicle vin, LocalDate leaseStartDate, LocalDate leaseEndDate, double monthlyPayment) {
            this.id = id;
            this.VIN = vin;
            this.leaseStartDate = leaseStartDate;
            this.leaseEndDate = leaseEndDate;
            this.monthlyPayment = monthlyPayment;
        }

        public Lease(Vehicle vin, LocalDate leaseStartDate, LocalDate leaseEndDate, double monthlyPayment) {
            this.VIN = vin;
            this.leaseStartDate = leaseStartDate;
            this.leaseEndDate = leaseEndDate;
            this.monthlyPayment = monthlyPayment;
        }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", vin=" + VIN +
                ", leaseStartDate=" + leaseStartDate +
                ", leaseEndDate=" + leaseEndDate +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVIN() {
        return VIN;
    }

    public void setVIN(Vehicle VIN) {
        this.VIN = VIN;
    }

    public LocalDate getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(LocalDate leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public LocalDate getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(LocalDate leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
