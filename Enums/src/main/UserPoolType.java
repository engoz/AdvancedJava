package main;

/**
 * Created by enginoz on 02/05/17.
 */
public enum UserPoolType {
    EMPTY(-1," "),
    USER(1,"USER"),
    TMU(2,"TMU"),
    TRADER(3,"TRADER");
    int index;
    String name;

    UserPoolType(int index, String name){
        this.index = index;
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
