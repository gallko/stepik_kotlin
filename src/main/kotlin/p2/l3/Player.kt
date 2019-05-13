package p2.l3

class Player(var str:Int = 0, var dex:Int = 0, var XP: Int = 0, var lvl:Int = 1,
             var nextLvlXP: Int = 10) {

    fun receiveXP(xp: Int) {
        XP += xp
        if (XP >= nextLvlXP) lvlUP()
        println("str=$str dex=$dex, lvl=$lvl")
    }

    private fun lvlUP() {
        lvl += 1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        nextLvlXP += 100
    }
}
