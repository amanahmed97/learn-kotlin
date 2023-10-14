////import junit.framework.TestCase.assertEquals
//import models.Users
//import org.junit.Before
//import org.junit.Test
//import org.junit.After
//import org.junit.jupiter.api.BeforeEach
//import org.mockito.Mock
//import services.Service
//
//class ServiceTest{
//
//    @Mock
//    lateinit var service : Service
//
//    @Before
//    fun setUp(){
//        service = Service()
//    }
//
//    @Test
//    fun addUserTest(){
//
//        val response = service.addUser(0,"user1","user1@gmail.com","9731648271",0.0)
//        assertEquals(response, 0)
//    }
//
//    @Test
//    fun  getUserTest(){
//        service.addUser(0,"user1","user1@gmail.com","9731648271",0.0)
//        val response = service.getUser(0)
//        assertEquals(response, 0)
//    }
//
//    @Test
//    fun updateUserTest(){
//        service.addUser(0,"user1","user1@gmail.com","9731648271",0.0)
//        val response = service.updateUser(0,"user1","user1@yahoo.com","9731642356",0.0)
//        assertEquals(response,"user1@yahoo.com")
//    }
//
//    @Test
//    fun deleteUserTest(){
//        service.addUser(0,"user1","user1@gmail.com","9731648271",0.0)
//        val response = service.deleteUser(0)
//        assertEquals(response,"Deleted")
//    }
//
//    @Test
//    fun addBillTest(){
//
//        var user0 = Users(0,"user0","user0@gmail.com","9731648271",0.0)
//        var user1 = Users(1,"user1","user1@gmail.com","9731648271",0.0)
//        var user2 = Users(2,"user2","user2@gmail.com","9731648271",0.0)
//        var users = mutableListOf<Users>()
//        users.add(0,user0);users.add(1,user1);users.add(2,user2);
//        service.userList = users
//        var usersI = mutableListOf<Int>()
//        usersI.add(0,0);usersI.add(1,1);usersI.add(2,2);
//        val response = service.addBill(0, usersI, 0,300.0, 0,true)
//        assertEquals(response,0)
//    }
//
//    @Test
//    fun getBillTest(){
//
//        var user0 = Users(0,"user0","user0@gmail.com","9731648271",0.0)
//        var user1 = Users(1,"user1","user1@gmail.com","9731648271",0.0)
//        var user2 = Users(2,"user2","user2@gmail.com","9731648271",0.0)
//        var users = mutableListOf<Users>()
//        users.add(0,user0);users.add(1,user1);users.add(2,user2);
//        service.userList = users
//        var usersI = mutableListOf<Int>()
//        usersI.add(0,0);usersI.add(1,1);usersI.add(2,2);
//        service.addBill(0, usersI, 0,300.0, 0, true)
//        val response = service.getBill(0)
//        assertEquals(response,0)
//    }
//
//    @Test
//    fun updateBillTest(){
//
//        var user0 = Users(0,"user0","user0@gmail.com","9731648271",0.0)
//        var user1 = Users(1,"user1","user1@gmail.com","9731648271",0.0)
//        var user2 = Users(2,"user2","user2@gmail.com","9731648271",0.0)
//        var users = mutableListOf<Users>()
//        users.add(0,user0);users.add(1,user1);users.add(2,user2);
//        service.userList = users
//        var usersI = mutableListOf<Int>()
//        usersI.add(0,0);usersI.add(1,1);usersI.add(2,2);
//        service.addBill(0, usersI, 0,300.0, 0,true)
//        val response = service.updateBill(0, usersI, 0,600.0, 0,true)
//        assertEquals(response,600.0)
//    }
//
//    @Test
//    fun deleteBillTest(){
//
//        var user0 = Users(0,"user0","user0@gmail.com","9731648271",200.0)
//        var user1 = Users(1,"user1","user1@gmail.com","9731648271",-100.0)
//        var user2 = Users(2,"user2","user2@gmail.com","9731648271",-100.0)
//        var users = mutableListOf<Users>()
//        users.add(0,user0);users.add(1,user1);users.add(2,user2);
//        service.userList = users
//        var usersI = mutableListOf<Int>()
//        usersI.add(0,0);usersI.add(1,1);usersI.add(2,2);
//        service.addBill(0, usersI, 0,300.0, 0, true)
//        val response = service.deleteBill(0)
//        assertEquals(response,"Deleted")
//    }
//
//    @Test
//    fun settleBillTest(){
//
//        var user0 = Users(0,"user0","user0@gmail.com","9731648271",0.0)
//        var user1 = Users(1,"user1","user1@gmail.com","9731648271",0.0)
//        var user2 = Users(2,"user2","user2@gmail.com","9731648271",0.0)
//        var users = mutableListOf<Users>()
//        users.add(0,user0);users.add(1,user1);users.add(2,user2);
//        service.userList = users
//        var usersI = mutableListOf<Int>()
//        usersI.add(0,0);usersI.add(1,1);usersI.add(2,2);
//        service.addBill(0, usersI, 0,300.0, 0,true)
//        val response = service.settleBill(0)
//        assertEquals(response,"Bill Settled")
//    }
//
//    @After
//    fun tearDown(){
////        println("Worked")
//    }
//
//
//}