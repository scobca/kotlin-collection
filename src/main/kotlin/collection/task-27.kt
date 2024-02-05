package collection

import java.io.File

fun counter(name: String) {
    val lineList = mutableListOf<String>()
    File("src/main/resources/$name").useLines { lines -> lines.forEach { lineList.add(it) } }

    val k = lineList[1].toInt()
    var count = 0

    for (i in 2..< lineList.size) {
        for (j in (i + k)..< lineList.size) {
            if (((lineList[i].toLong() * lineList[j].toLong()) % 7).toInt() == 0 && ((lineList[i].toLong() + lineList[j].toLong()) % 2).toInt() == 0) {
                count++
            }
        }
    }

    println(count)
}

fun main() {
    val start: Long = System.currentTimeMillis()

    counter("27A_7875.txt")
    counter("27B_7875.txt")

    val finish: Long = System.currentTimeMillis()

    println(finish - start)
}