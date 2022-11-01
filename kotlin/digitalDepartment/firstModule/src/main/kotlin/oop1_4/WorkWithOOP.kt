package oop1_4

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    val dx = toX - r.x
    val dy = toY - r.y

    if (dx >= 0) while (r.direction != Direction.RIGHT) r.turnRight()
    else while (r.direction != Direction.LEFT) r.turnRight()

    while (toX != r.x) r.stepForward()

    if (dy >= 0) while (r.direction != Direction.UP) r.turnRight()
    else while (r.direction != Direction.DOWN) r.turnRight()

    while (toY != r.y) r.stepForward()
}

class Robot(
    x: Int,
    y: Int,
    direction: Direction
) {

    var x: Int = x
        private set
    var y: Int = y
        private set
    var direction: Direction = direction
        private set


    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.LEFT -> Direction.DOWN
            Direction.RIGHT -> Direction.UP
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
            Direction.RIGHT -> Direction.DOWN
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.LEFT -> x--
            Direction.RIGHT -> x++
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

fun main() {
    val r = Robot(0,1,Direction.UP)
    moveRobot(r, 3, 7)
    println("${r.x} ${r.y}")
}