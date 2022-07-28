package com.eng.behavior.maps;

public class DemoGC {
    public String toString()
    {
        return "demo";
    }

    // finalize method
    public void finalize()
    {
        System.out.println("Finalize method is called");
    }
}
