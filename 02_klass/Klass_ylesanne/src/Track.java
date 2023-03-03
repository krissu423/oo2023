import java.util.Date;

public class Track {
    Integer trackTime;
    String firstname;
    String lastname;
    Date createTime;
    Date deleteTime;

    public Track(Integer trackTime, String firstname, String lastname){
        this.trackTime = trackTime;
        this.firstname = firstname;
        this.lastname = lastname;
        this.createTime = new Date();
        this.deleteTime = null;
    }

    public String deleteTrack(){
        this.deleteTime = new Date();
        return "Time deleted!";
    }

    public String changeTime(Integer newTime){
        this.trackTime = newTime;
        System.out.println("Time changed!");
        return "x";
    }
}