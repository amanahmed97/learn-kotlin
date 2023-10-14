import dao.BillDao
import dao.TransactionDao
import dao.UserDao
import models.BillModel
import models.TransactionModel
import models.UserModel
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import services.BillService
import services.TransactionService
import services.UserService

class BillServiceTest {
    private lateinit var billService: BillService
    private lateinit var userService : UserService
    private lateinit var transactionService : TransactionService
    @Mock
    private lateinit var billDao: BillDao
    @Mock
    private lateinit var userDao : UserDao
    @Mock
    private lateinit var transactionDao : TransactionDao

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        userService = UserService(userDao)
        transactionService = TransactionService(transactionDao)
        billService = BillService(billDao,userService,transactionService)
    }

    @Test
    fun `add bill test`(){
        val billMocked = BillModel(1,1,300.0,0,true)
        billMocked.transaction = mutableListOf<TransactionModel>()
        billMocked.users = mutableListOf<UserModel>()
        `when`(billDao.add(billMocked)).thenReturn(billMocked)
        val bill = billService.addBill(1, emptyList(),1,300.0,0,true)
        assertEquals(bill.billId,1)
    }

    @Test
    fun `get bill test`(){
        val billMocked = BillModel(1,1,300.0,0,true)
        `when`(billDao.get(billMocked.billId)).thenReturn(billMocked)
        val bill = billService.getBill(1)
        assertEquals(bill.billId,1)
    }

//    @Test
//    fun `update bill test`(){
//        var billMocked = BillModel(1,1,300.0,0,true)
//        billMocked.transaction = mutableListOf<TransactionModel>()
//        billMocked.users = mutableListOf<UserModel>()
////        billMocked.transaction.add(0,TransactionModel(1,1,1,2,100.0))
//        `when`(billDao.add(billMocked)).thenReturn(billMocked)
//        billMocked = billService.addBill(1, emptyList(),1,300.0,0,true)
//
//        `when`(billDao.update(billMocked)).thenReturn(billMocked)
//        billMocked = billService.updateBill(1, emptyList(),1,600.0,0,true)
//        assertEquals(billMocked.billId,1)
//    }
}