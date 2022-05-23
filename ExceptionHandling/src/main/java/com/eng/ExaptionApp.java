package com.eng;

import com.eng.exception.BlokageException;
import com.eng.exception.KMHException;
import com.eng.exception.LimitException;
import com.eng.exception.MyBean;

public class ExaptionApp {

    public static void main(String[] args) {
        String kod = "1";

        MyBean bean = new MyBean();

        try {
            bean.mockException("1");
        }catch (Exception ex){
            if (ex instanceof KMHException){
                System.out.println("KMH throws " + ((KMHException) ex).getText());
            }else if (ex instanceof BlokageException){
                System.out.println("Blokage throws " + ((BlokageException) ex).getText());
            }else if (ex instanceof LimitException){
                System.out.println("Limit throws " + ((LimitException) ex).getText());
            }
        }


    }
}
