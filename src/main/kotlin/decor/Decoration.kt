package decor

data class Decoration(val rocks: String) {}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {}

enum class Color(val rgb: Int) {
    RED(0xFF_00_00), GREEN(0x00_FF_00), BLUE(0x00_00_FF),
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270),
}