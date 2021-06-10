package compares;

import java.util.Date;

public class MyObject {

    private String ad;
    private Date dateTime;

    public MyObject(String ad, Date dateTime) {
        this.ad = ad;
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date datetime) {
        this.dateTime = datetime;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
