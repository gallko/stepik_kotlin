package p2.l3

open class Item(var lvl: Int, var weight: Double)

open class Weapon(lvl: Int, weight: Double): Item(lvl, weight) {
    open fun calcDamage(): Int = 42
}

open class MagicWeapon(lvl: Int, weight: Double): Weapon(lvl, weight) {
    override fun calcDamage(): Int = super.calcDamage() * 2
}