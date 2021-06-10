package basic.strings;

import java.util.Date;

/**
 * Created by servicium on 16.12.2015.
 */
public class Person {

    private String name;
    private Date birhtDate;

    public Person(String name, Date birhtDate) {
        this.name = name;
        this.birhtDate = birhtDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirhtDate() {
        return birhtDate;
    }

    public void setBirhtDate(Date birhtDate) {
        this.birhtDate = birhtDate;
    }
}
