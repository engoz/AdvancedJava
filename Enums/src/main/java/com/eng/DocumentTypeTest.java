package com.eng;

/**
 * Created by servicium on 10.06.2015.
 */
public class DocumentTypeTest {


    public static void main(String[] args) {
        DocumentType type = DocumentType.parse(1);
        
        System.out.println(type);

        int value = type.getValue();
        System.out.println(value);
    }

}
