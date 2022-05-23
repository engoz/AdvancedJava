package main;

/**
 * Created by servicium on 10.06.2015.
 */
public enum DocumentType {

    WORD(1),
    PDF(2),
    HTML(3);

    private final int value;

    private DocumentType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static DocumentType parse(int value){
        for (DocumentType type: DocumentType.values()){
            if (value == type.getValue()){
                return type;
            }
        }
        return null;
    }


}
