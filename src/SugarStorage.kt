class SugarStorage(
    var volume: Int
) {
    fun decreaseSugar(v: Int) {
        if (!isNegativeValue(v)) {
            volume -= v

            if (isNegativeValue(volume)) {
                volume = 0
            }
        }
    }

    fun increaseSugar(v: Int) {
        if (!isNegativeValue(v)) {
            volume += v
        }
    }

    private fun isNegativeValue(v: Int): Boolean {
        return v < 0
    }
}