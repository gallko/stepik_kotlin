import p2.l3.MagicWeapon
import p2.l3.Player
import kotlin.math.max

val str = "PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM"

fun test(i: MutableList<Int>) {

}

fun getCubeList(n:Int): List<Int> =
    IntArray(n){ it*it*it }
        .toList()

fun calculateWordStat(input:String) =
    input.split(" ")
        .groupBy{ it }
        .maxBy { entry -> entry.value.size }
        ?.key ?: ""

class DogException() : Exception()
class CatException() : Exception()
// write your code here

fun checkClient(client : String) {
}

fun main() {
    println("Hello world!")

    var p:Player = Player(str = 2)

    p.receiveXP(10)
    p.receiveXP(100)
    p.receiveXP(100)
    p.receiveXP(10)

    val instance: MagicWeapon = MagicWeapon(1, 1.0)
    println("Damage = ${instance.calcDamage()}")

    val res: List<Int> = getCubeList(7)

    println("dog" in "dogandat")

    var a: String? = "dddd"
    var b: Int? = null
    b = if (a != null) a.length else 0
    b = a?.length ?: null
    b = a?. length ?: 0
    b = a?.length
    b = if (a?.length != null) a!!.length else -1

}
