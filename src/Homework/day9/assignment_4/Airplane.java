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
    


}
