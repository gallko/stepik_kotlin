package p2.l3

class SugarStorage(var volume: Int = 10) {
    fun decreaseSugar(v: Int) {
        if (v < 0) return
        volume -= v
        if (volume < 0) volume = 0
    }
    fun increaseSugar(v: Int) {
        if (v < 0) return
        volume += v
    }
}
