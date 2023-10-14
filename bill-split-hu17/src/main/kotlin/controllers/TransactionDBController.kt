package controllers


import services.TransactionService
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/api/v2/transaction")
@Produces(MediaType.APPLICATION_JSON)
class TransactionDBController(private var service: TransactionService) {

    @Path("/total-balance")
    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
    fun userTotalBalance(@QueryParam("userId") userId : Int): String {
        return "User Total Balance : " + service.totalBalance(userId);
    }

    @Path("/individual-balance")
    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
    fun userIndividualBalance(@QueryParam("userId1") userId1 : Int,@QueryParam("userId2") userId2 : Int): String {
        return "User1 to User2 : Individual Balance : " + service.individualBalance(userId1,userId2);
    }

}