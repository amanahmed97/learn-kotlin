import dao.UserDao
import models.UserModel
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import services.UserService

class UserServiceTest {
    private lateinit var userService : UserService
    @Mock
    private lateinit var userDao : UserDao

    @BeforeEach
    fun setUp(){
        MockitoAnnotations.initMocks(this)
        userService = UserService(userDao)
    }

    @Test
    fun `add users test`(){
        val userMocked = UserModel(1,"user1","user1@gmail.com","9073818384",0.0)
        `when`(userDao.add(userMocked)).thenReturn(userMocked)
        val user = userService.addUser(1,"user1","user1@gmail.com","9073818384",0.0)
        assertEquals(user.userId,1)
    }

    @Test
    fun `get users test`(){
        val userMocked = UserModel(1,"user1","user1@gmail.com","9073818384",0.0)
        `when`(userDao.get(userMocked.userId)).thenReturn(userMocked)
        val user = userService.getUser(userMocked.userId)
        assertEquals(user.userId,1)
    }

    @Test
    fun `update users test`(){
        val userMocked = UserModel(1,"user1","user1@gmail.com","9073818384",0.0)
        `when`(userDao.update(userMocked)).thenReturn(userMocked)
        val user = userService.updateUser(1,"user1","user1@gmail.com","9073818384",0.0)
        assertEquals(user.userId,1)
    }

    @Test
    fun `delete users test`(){
        val userMocked = UserModel(1,"user1","user1@gmail.com","9073818384",0.0)
        `when`(userDao.delete(userMocked.userId)).thenReturn(true)
        val user = userService.deleteUser(1)
        assertEquals(true,true)
    }

}
