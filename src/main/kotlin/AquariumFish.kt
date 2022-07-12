abstract class AquariumFish {
    abstract val color: String
}

object GoldColor : FishColor {
    override val color: String
        get() = "Gold"
}

object GrayColor : FishColor {
    override val color: String
        get() = "Gray"
}

interface FishAction {
    fun eat()
    fun swim() {
        println("Swim")
    }
}

interface FishColor {
    val color: String
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println("eat $food")
    }
}

class Shark : FishAction, FishColor by GrayColor {
    override val color: String
        get() = "Gray"

    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("algae"),
    FishColor by fishColor {}

sealed class Seal
object SeaLion : Seal()
object Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}