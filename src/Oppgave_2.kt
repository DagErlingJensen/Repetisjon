// a) Print ut planet nr.4
// b) Legg planetene i en liste. planet nr. 4 skal fortsatt printes etter at listen er opprettet.
// c) Det finnes kanskje en planet til i solsystemet. Vi kan gjøre plass til den i lista ved å bruke null-verdi.
//      Endre lista til å støtte dette
// d) Pluto ble omklassifisert i 2006, og hører derfor ikke hjemme i listen. Hvordan skulle man fjernet den fra listen.
// e) Endre listen slik at man kan legge inn flere himmellegemer ettersom de blir oppdaget
fun main() {
    val planeter: List<String?> = mutableListOf("Merkur", "Venus", "Tellus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto", null)
    print(planeter[3])
}