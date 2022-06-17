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

        DocumentObj documentObj = new DocumentObj("test", DocumentType.PDF);
        if(documentObj.getType() == DocumentType.PDF){
            System.out.println("PDF");
        }


    }

}
