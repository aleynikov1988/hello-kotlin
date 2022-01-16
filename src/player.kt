class player(
    var strength: Int = 0,
    var dexterity: Int = 0,
    var experience: Int = 0,
    var level: Int = 1,
    var nextLevelExperience: Int = 10
) {
    fun receiveExperience(xp: Int) {
        experience += xp
        if (experience >= nextLevelExperience) {
            levelUp()
        }
        println("strength=$strength dexterity=$dexterity level=$level")
    }

    private fun levelUp() {
        level += 1
        strength += if (level % 2 == 0) 1 else 0
        dexterity += if (level % 2 == 0) 1 else 0
        nextLevelExperience += 100
    }
}