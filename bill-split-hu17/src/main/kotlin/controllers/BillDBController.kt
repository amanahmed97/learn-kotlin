package controllers

import models.BillModel
import models.Bills
import models.TransactionModel
import services.BillService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/api/v2/bill")
@Produces(MediaType.APPLICATION_JSON)
class BillDBController(private var service: BillService) {


    @GET
    fun getBillApi(bill : Bills): Bills {
        var billModel = service.getBill(bill.billId)
        var bill = Bills(billModel.billId, emptyList(),billModel.billPaidBy,billModel.billAmount,billModel.groupId,billModel.billStatus)
        print(bill)

//        return service.getBill(bill.billId)
        return bill
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun postBillApi(bill : Bills): String {
        service.addBill(bill.billId, bill.billUsers, bill.billPaidBy,bill.billAmount, bill.groupId,bill.billStatus)
        return "Bill Added"
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    fun putBillApi(bill : Bills): String {
        service.updateBill(bill.billId, bill.billUsers, bill.billPaidBy,bill.billAmount, bill.groupId, bill.billStatus)
        return "Bill Updated"
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    fun deleteBillApi(bill : Bills): String {
        service.deleteBill(bill.billId)
        return "Bill Deleted"
    }

    @Path("/settle-bill")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun settleBillApi(settle : TransactionModel ) : String {
        service.settleBill(settle)
        return "Bill Settled with above amount"
    }
}