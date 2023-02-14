import products.*

class Car constructor(title: String, price: Double, var brand: String, var power: Double) : Product(title, price){

    fun getInfo(): String {
        return "$brand / $title - $power лошадиных сил. Всего за $price";
    }

    fun getGasolineConsumption(wayLen: Double, oil: Double): Double {
        return wayLen / oil;
    }

    fun getKVt(): Double {
        return power * 0.74;
    }
}