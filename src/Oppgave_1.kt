// Fiks feilene underveis
// Feil kan fikses ved å endre datatype eller verdi.
// Det er lov å legge til nye variabler
fun main() {
    var x: Int = 65.2  // Hva er feil?
    var isPunk = true  // Hvilken type har isPunk?
    var message = 'Hello' // Hva er feil?
    var y = 7 // Hvilken type har y?
    val z: Int = y // Hvilken verdi har z?

    y = y + 50 // Hvilken verdi har y?

    val s: Short // Hvilken verdi har s?
    var bigNum: Long = y.toLong() // Hvilken verdi har bigNum?
    val b: Byte = 2
    val smallNum = b.toShort() // Hvilken type har smallNum
    val k = y.toDouble() // Hvilken type har k?

    b = k.toByte() // Hva er feil?
    b = smallNum // Hva er feil?
    isPunk = "false" // Hva er feil?
    s = 0b10001 // Hvilken verdi har s?
}