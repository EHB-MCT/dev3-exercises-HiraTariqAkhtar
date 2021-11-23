import java.sql.*
import java.util.*

fun main(){
    // Create a driver: the library/class that will create the connection
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    val statement = connection.prepareStatement("SELECT S6_cities.name FROM S6_rides INNER JOIN S6_cities ON S6_cities.id = S6_rides.destination_city_id ")
    val result = statement.executeQuery()
    while(result.next()) {
       val resultAsString = result.getString("name")
        println(resultAsString)
    }
}