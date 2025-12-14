package ch2_kotlin.classtype

sealed class Result {
    object Loading: Result()
    class Success(val data: String) : Result()
    class Error(val message: String) : Result()
}

fun main() {
    val results: List<Result> = listOf( Result.Loading, Result.Success("data"), Result.Error("error"))
    for (result in results) {
        when (result) {
            is Result.Loading -> println("Loading")
            is Result.Success -> println(result.data)
            is Result.Error -> println(result.message)
        }
    }
}
