package cn.edu.guet;

public class Ticket {

    private  String triainNumber;
    private  String starStation;
    private  String endStaition;
    private  String departureTime;

    public String getTriainNumber() {
        return triainNumber;
    }

    public void setTriainNumber(String triainNumber) {
        this.triainNumber = triainNumber;
    }

    public String getStarStation() {
        return starStation;
    }

    public void setStarStation(String starStation) {
        this.starStation = starStation;
    }

    public String getEndStaition() {
        return endStaition;
    }

    public void setEndStaition(String endStaition) {
        this.endStaition = endStaition;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrrivalTime() {
        return arrrivalTime;
    }

    public void setArrrivalTime(String arrrivalTime) {
        this.arrrivalTime = arrrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    private  String arrrivalTime;
    private  String duration;

}
