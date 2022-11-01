package interfaces1_5

internal class Point(var x:Int, var y:Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

}

internal class CloudOfPoints(val points: ArrayList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        points.forEach {
            it.move(dx, dy)
        }
    }
}

fun main() {
    val p = Point(1,1)
    val cloud = CloudOfPoints(arrayListOf(Point(1,1)))
    p.move(1,1);
    cloud.move(2,2)
    val p2 = cloud.points[0]
    println("${p.x} ${p.y}")
    println("${p2.x} ${p2.y}")
}