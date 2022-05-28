package day1

import readInput

fun main() {
    fun part1(input: List<Int>): Int {
        return input
            .zipWithNext()
            .count { it.second > it.first }
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(3, 1)
            .zipWithNext()
            .count { it.second.sum() > it.first.sum() }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("day1\\Day01_test").map { it.toInt() }
    check(part1(testInput) == 7)

    val input = readInput("day1\\Day01").map { it.toInt() }
    println(part1(input))

    check(part2(testInput) == 5)
    println(part2(input))
}
