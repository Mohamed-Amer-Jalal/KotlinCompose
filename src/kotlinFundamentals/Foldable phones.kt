package kotlinFundamentals

fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()  // Should print off
    foldablePhone.switchOn()               // Should turn on
    foldablePhone.checkPhoneScreenLight()  // Should print on

    foldablePhone.fold()                   // Fold the phone
    foldablePhone.switchOn()               // Should print a message that the screen can't turn on
    foldablePhone.checkPhoneScreenLight()  // Should print off

    foldablePhone.unfold()                 // Unfold the phone
    foldablePhone.switchOn()               // Should turn on
    foldablePhone.checkPhoneScreenLight()  // Should print on
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) isScreenLightOn = true
        else println("Cannot turn on the screen while the phone is folded.")
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
