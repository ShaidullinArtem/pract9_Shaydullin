

class HardCar constructor(title: String, price: Double, brand: String, power: Double, var capacity: Double) : Car(title, price, brand, power){
    fun getCapacityNumber(): String {
        return "Грузовая машина $brand $title мощностью $power лошадиных сил, вмещает $capacity т "
    }
}