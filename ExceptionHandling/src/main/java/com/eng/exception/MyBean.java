package com.eng.exception;

import com.eng.inf.MyBeanLocal;

public class MyBean implements MyBeanLocal {
    @Override
    public String mockException(String kod) throws KMHException,LimitException,BlokageException {
        try {
            if (kod.equals("1")){
                throw new BlokageException("Blokaj da hata alındı");
            }else if(kod.equals(2)){
                throw new KMHException("KMH da hata alındı");
            }else if(kod.equals(2)){
                throw new LimitException("Limit da hata alındı");
            }
        }catch (Exception ex){
            throw ex;
        }
        return null;
    }
}
