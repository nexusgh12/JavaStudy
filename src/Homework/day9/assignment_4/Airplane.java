package Homework.day9.assignment_4;

import java.util.Calendar;

abstract class Airplane {
    private Calendar departureDate;
    private Calendar arrivalDate;

    public Calendar getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }
    public Calendar getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    public static void main(String[] args) {
        Airplane a1 = new Airplane() {
            
       };
       Calendar departure = Calendar.getInstance();
       Calendar arrival = Calendar.getInstance();
       departure.set(2022, 2, 1);
       arrival.set(2022, 2, 2);

       a1.setDepartureDate(departure);
       a1.setArrivalDate(arrival);
       
    }

}
