import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    print("Enter IP Address: ")
    val ipAddress = reader.readLine().trim()

    while (true) {
        val process = ProcessBuilder("ping", "-c", "1", ipAddress).start()
        val exitCode = process.waitFor()
        if (exitCode == 0) {
            println("Ping successful for $ipAddress")
        } else {
            println("Ping failed for $ipAddress")
        }
    }
}
