class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    init {
        println("\t\t\tAquarium filling up!!")
        println("Volume: $volume")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2_000 / 1.1
        height = (tank / (length * width)).toInt()
    }

    val volume: Int
        get() = width * height * length / 1_000

    fun printSize() {
        println("Width: $width\t\tHeight: $height\t\tLength: $length\n")
    }
}
