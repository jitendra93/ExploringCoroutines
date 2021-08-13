import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlin.random.Random

fun main(){

    GlobalScope.launch {
        generateFlow().collect {
            println()
        }
    }
}

fun generateFlow() = flow{
    (1..50).forEach { emit(Random(it).nextInt()) }
}