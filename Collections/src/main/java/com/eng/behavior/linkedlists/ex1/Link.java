package com.eng.behavior.linkedlists.ex1;

/**
 * Created by servicium on 07.10.2016.
 */
public class Link {

    public long dData;                 // data item
    public Link next;                  // next link in list
    public Link previous;              // previous link in list

    public Link(long d)                // constructor
    {
        dData = d;
    }

    public void displayLink()          // display this link
    {
        System.out.print(dData + " ");
    }

}
