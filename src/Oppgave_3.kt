// a) Brukernavn og passord bør være assossiert med hverandre. Dette kan løses med maps. Opprett et map som tar
//      to String-verdier for å lagre dette.
// b) Legg inn flere brukernavn og passordverdier.
// c) Lag funksjonalitet for å ta i mot brukernavn og passord fra brukeren.
// d) Lag funksjonalitet for å sjekke om brukernavnet eksisterer.
// e) Lag funksjonalitet for å sjekket at passordet stemmer hvis brukernavnet eksisterer.
fun main() {
    val loginDetaljer: MutableMap<String, String> = mutableMapOf("brukernavn" to "passord", "b" to "p")
    loginDetaljer["Bruker"] = "Pass"

    println("Brukernavn: ")
    val username = readLine()

    println(loginDetaljer.containsKey(username))

    println("Passord: ")
    val password = readLine()

    if(loginDetaljer.containsKey(username)) {
        println(loginDetaljer[username].equals(password))
    }
}
