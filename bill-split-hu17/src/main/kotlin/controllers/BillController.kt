package controllers

import models.Bills
import services.Service
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/api/v1/bill")
@Produces(MediaType.APPLICATION_JSON)
class BillController(private var service: Service) {
//    var service = Service()

//    @GET
//    fun getBillApi(): Bills {
//        return service.billList.get(0)
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun postBillApi(bill : Bills): Bills {
//        service.addBill(bill.billId, bill.billUsers, bill.billPaidBy,bill.billAmount, bill.groupId,bill.billStatus)
//        return service.billList.get(bill.billId)
//    }
//
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun putBillApi(bill : Bills): Bills {
//        service.updateBill(bill.billId, bill.billUsers, bill.billPaidBy,bill.billAmount, bill.groupId, bill.billStatus)
//        return service.billList.get(bill.billId)
//    }
//
//    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun deleteBillApi(bill : Bills): String {
//        service.deleteBill(bill.billId)
//        return "Bill Deleted"
//    }
//
//    @Path("/settle-bill")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    fun settleBillApi(bill : Bills) : String {
//        service.settleBill(bill.billId)
//        return "Bill Settled"
//    }
}

/*
{
	"billId" : 0,
	"billUsers" :
	[
		{
        "userId" : 0,
        "userName" : "user0",
        "userEmail" : "user0@gmail.com",
        "userPhone" : "9731627631",
        "userTotalBalance" : 200.0
    	},
    	{
        "userId" : 1,
        "userName" : "user1",
        "userEmail" : "user1@gmail.com",
        "userPhone" : "9731627631",
        "userTotalBalance" : -100.0
    	},
    	{
        "userId" : 2,
        "userName" : "user2",
        "userEmail" : "user2@gmail.com",
        "userPhone" : "9731627631",
        "userTotalBalance" : -100.0
    	}
	],
	"billAmount" : 300.0,
	"groupId" : 0
}

{
	"billId" : 0,
	"billUsers" : [0,1,2],
	"billPaidBy" : 0,
	"billAmount" : 300.0,
	"groupId" : 0,
	"billStatus" : true
}
 */
