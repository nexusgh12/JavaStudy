package Homework.day9.assignment_5;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

abstract class Airplane {
    private Calendar departureDate;
    private Calendar arrivalDate;

    private String departureLocation;
    private String arrivalLocation;

    public static String[] domestic = {"김포", "인천", "김해", "제주", "울산"};
    public static String[] oversea = {"도쿄", "상하이", "홍콩", "싱가폴", "쿠알라룸푸르"};

    private String isDomestic;

    public abstract String flight();

    public void printDeparture() {
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(df.format(getDepartureDate().getTime()));
    }

    public void printArrival(){
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(df.format(getArrivalDate().getTime()));
    }
    
    public void setIsDomestic(String str){
        this.isDomestic = str;
    }
    public String getIsDomestic(){
        return isDomestic;
    }

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

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
   

    
}

class AirplaneMain extends Airplane{ 

    public String flight(){
        
        if(Arrays.asList(domestic).contains(getDepartureLocation())){
            setIsDomestic("국내선");
        }
        else if(Arrays.asList(oversea).contains(getDepartureLocation())){
            setIsDomestic("국제선");
        }
        return getIsDomestic();
    }



}