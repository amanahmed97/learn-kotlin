package controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcontrollers/BillController;", "", "service", "Lservices/Service;", "(Lservices/Service;)V", "bill-split-hu17"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/api/v1/bill")
public final class BillController {
    private services.Service service;
    
    public BillController(@org.jetbrains.annotations.NotNull()
    services.Service service) {
        super();
    }
}