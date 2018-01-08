package com.company;


public class BoardingPass {
    private String passName, origin, destination, company, seat, date, passNum;
    private int flightNum, bags, seatZone, departureGate, hour;
    private char seatClass;

    public BoardingPass(String passName, String origin, String destination, String company, String seat, String date,
                        int flightNum, int bags, String passNum, int seatZone, int departureGate, int hour, char seatClass) {
        this.passName = passName;
        this.origin = origin;
        this.destination = destination;
        this.company = company;
        this.seat = seat;
        this.date = date;
        this.flightNum = flightNum;
        this.bags = bags;
        this.passNum = passNum;
        this.seatZone = seatZone;
        this.departureGate = departureGate;
        this.hour = hour;
        this.seatClass = seatClass;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public int getSeatZone() {
        return seatZone;
    }

    public void setSeatZone(int seatZone) {
        this.seatZone = seatZone;
    }

    public int getDepartureGate() {
        return departureGate;
    }

    public void setDepartureGate(int departureGate) {
        this.departureGate = departureGate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public char getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(char seatClass) {
        this.seatClass = seatClass;
    }
}
