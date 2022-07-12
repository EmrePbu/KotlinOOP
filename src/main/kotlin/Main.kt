import decor.Decoration
import decor.Decoration2
import decor.Direction

//https://developer.android.com/codelabs/kotlin-bootcamp-classes

fun main() {
    buildAquarium()
    println()

    makeFish()
    println()

    makeDecorations()
    println()

    println(Direction.EAST)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decorations = Decoration2("crystal", "wood", "diver")
    println(decorations)
    val (rock, _, diver) = decorations
    println(rock)
    println(diver)

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.volume} l")
}
