// Fiks feilene underveis
// Feil kan fikses ved å endre datatype eller verdi.
// Det er lov å legge til nye variabler
fun main() {
    var x: Int = 65  // Hva er feil? >> 65.2 er ikke en Int.
    var isPunk = true  // Hvilken type har isPunk? >> isPunk er en Boolean
    var message = 'H' // Hva er feil? >> '' markerer Char, "" markerer String. "Hello" er en string
    var y = 7 // Hvilken type har y? >> y er en Int
    val z: Int = y // Hvilken verdi har z? >> z er 7

    y = y + 50 // Hvilken verdi har y? >> y er 57 (z er fortsatt 7)

    val s: Short // Hvilken verdi har s? >> s er Undefined
    var bigNum: Long = y.toLong() // Hvilken verdi har bigNum? >> bigNum er 57.0
    var b: Byte = 2
    val smallNum = b.toShort() // Hvilken type har smallNum >> smallNum er 2
    val k = y.toDouble() // Hvilken type har k? >> k er en Double

    b = k.toByte() // Hva er feil? >> b var en val
    b = smallNum.toByte() // Hva er feil? >> smallNum er en Short og måtte konverteres
    isPunk = false // Hva er feil? >> isPunk er Boolean, "false" er en String
    s = 0b10001 // Hvilken verdi har s? >> 0b10001 er 17 skrevet i binært format som kotlin forstår
}