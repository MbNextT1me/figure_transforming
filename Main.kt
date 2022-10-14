fun main() {
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)

    val f1: Figure = Rect(4,3,4,2)
    val f2: Figure = Circle(0, 0, 5)
    val f3: Figure = Square(0,0,2)

    println(f1.area())
    println(f2.area())
    println(f3.area())

    f2.resize(2)
    f1.rotate(RotateDirection.Clockwise,3,-3)
}