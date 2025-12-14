package ch2_kotlin.classtype

enum class ErrorCode(val code: Int, val message: String) {
    NOT_FOUND(404, "Not Found"),
    UNAUTHORIZED(401, "Unauthorized"),
    INTERNAL_ERROR(500, "Server Error")
}

fun main(args: Array<String>) {
    val errorCodes: List<ErrorCode> = listOf(ErrorCode.NOT_FOUND, ErrorCode.UNAUTHORIZED, ErrorCode.INTERNAL_ERROR)

    for (error in errorCodes) {
        when (error) {
            ErrorCode.UNAUTHORIZED -> println("${error.message}")
            ErrorCode.NOT_FOUND -> println("${error.message}")
            ErrorCode.INTERNAL_ERROR -> println("${error.message}")
        }
    }
}
