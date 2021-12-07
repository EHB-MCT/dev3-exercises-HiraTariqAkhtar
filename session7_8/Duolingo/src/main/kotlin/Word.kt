open class Word(open val original: String, open val translated: String, open val language: String) {
   open var difficulty: Int = 1
        set(value) {
            if (value < 1) {
                // moelijkheid mag niet minder dan 1
                field = 1
            } else {
                field = value
            }
        }
}