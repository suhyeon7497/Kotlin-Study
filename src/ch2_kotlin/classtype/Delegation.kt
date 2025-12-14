package ch2_kotlin.classtype

interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("[CONSOLE]: $message")
    }
}

class FileLogger : Logger {
    override fun log(message: String) {
        println("[FILE]: $message")
    }
}

class RemoteLogger : Logger {
    override fun log(message: String) {
        println("[REMOTE]: $message")
    }
}

class LoggingService(
    private val logger: Logger,
) : Logger by logger {
    fun process() {
        log("processing started.")
    }
}

fun main() {
    val consoleService = LoggingService(ConsoleLogger())
    consoleService.process()
    // [CONSOLE] processing started

    val fileService = LoggingService(FileLogger())
    fileService.process()
    // [FILE] processing started

    val remoteService = LoggingService(RemoteLogger())
    remoteService.process()
    // [REMOTE] processing started
}

