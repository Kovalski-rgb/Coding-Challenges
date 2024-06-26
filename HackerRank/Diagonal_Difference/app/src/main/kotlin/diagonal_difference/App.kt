import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val size = arr.size
    val topDiagonalIndexes = arr.mapIndexed { index, _ -> (size+1) * (index)   }
    val botDiagonalIndexes = arr.mapIndexed { index, _ -> (size-1) * (index+1) }
    val sumTop = (topDiagonalIndexes.map { arr[it%size][it/size] }).sum()
    val sumBot = (botDiagonalIndexes.map { arr[it%size][it/size] }).sum()
    return Math.abs(sumTop-sumBot)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
