import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.dropwizard.Application
import io.dropwizard.setup.Environment
import services.Service
import configs.SplitBillConfiguration
import controllers.*
import dao.BillDao
import dao.TransactionDao
import dao.UserDao
import io.ebean.DB
import org.slf4j.LoggerFactory
import services.BillService
import services.TransactionService
import services.UserService


class SplitBillApp : Application<SplitBillConfiguration>() {
    override fun run(

        configuration: SplitBillConfiguration,
        environment: Environment
    ) { // code to register module

        val database = DB.getDefault()

        environment.objectMapper.registerModule(KotlinModule())

        log.info("SplitBillApp STARTED")

        val userDao = UserDao(database)
        var userService = UserService(userDao)
        val userDbController = UserDBController(userService)
        environment.jersey().register(userDbController);
        val transactionDao = TransactionDao(database)
        var transactionService = TransactionService(transactionDao)
        val transactionDbController = TransactionDBController(transactionService)
        environment.jersey().register(transactionDbController);
        val billDao = BillDao(database)
        var billService = BillService(billDao,userService,transactionService)
        val billDbController = BillDBController(billService)
        environment.jersey().register(billDbController);

        var service = Service()
        val userController = UserController(service,database)
        val billController = BillController(service)
        environment.jersey().register(userController);
        environment.jersey().register(billController)
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            SplitBillApp().run(*arrayOf("server"))
        }
        private val log = LoggerFactory.getLogger(Application::class.java)
    }
}
/*
5.2.0

main class should be set

./gradlew shadowJar

./gradlew clean build

build {
    dependsOn(shadowJar)
}

 */