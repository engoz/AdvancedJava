package com.eng.qualifiers.ex1;

/**
 * Created by servicium on 31.12.2015.
 */
@ServiceType(ServiceType.Type.PREMIUM)
public class PremiumService implements Service {
    public void serve() {
        System.out.println("******** Premium Services rendered ********");
    }
}
