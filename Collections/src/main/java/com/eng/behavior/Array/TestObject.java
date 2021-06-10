package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author engin.oz
 */
public class TestObject {

    List<String> arr = new ArrayList<>();

    public List<String> getArr() {
        if (arr == null)
            arr = new ArrayList<>();

        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }


    public TestObject() {
        arr.clear();
    }
}
