

class LiteCar constructor(title: String, price: Double, brand: String, power: Double, var personCount: Int) : Car(title, price, brand, power) {
    fun getSpace(): String {
        return "Машина $brand $title мощностью $power лошадиных сил, вмещает $personCount пассажиров";
    }
}