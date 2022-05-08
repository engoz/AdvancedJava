package com.eng.qualifiers.ex1;

import javax.inject.Inject;

/**
 * Created by servicium on 31.12.2015.
 */
public class PremiumCustomerPortal {
    @Inject @ServiceType(ServiceType.Type.PREMIUM)
    Service service;

    public  void performService(){
        service.serve();
    }
}
