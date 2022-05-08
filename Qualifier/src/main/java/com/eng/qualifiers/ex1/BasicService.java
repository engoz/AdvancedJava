package com.eng.qualifiers.ex1;

/**
 * Created by servicium on 31.12.2015.
 */
@ServiceType(ServiceType.Type.BASIC)
public class BasicService implements Service {
    public void serve() {
        System.out.println("******** Basic Services rendered ********");
    }
}
