import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main(): Unit = runBlocking {
    println("START")
    launch {
        coroutine()
    }
    yield()
    println("END")
}

suspend fun coroutine() {
    println("coroutine start")
    val num1 = 1
    val num2 = 2
    yield()
    println("${num1 + num2}")
}

/*
실행결과
----------
START
coroutine start
END
3
 */