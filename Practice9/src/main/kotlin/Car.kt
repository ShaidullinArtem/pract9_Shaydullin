import products.*

open class Car constructor(title: String, price: Double, var brand: String, var power: Double) : Product(title, price) {

    open fun getInfo(): String {
        return "$brand / $title - $power лошадиных сил. Всего за $price";
    }

    open fun getGasolineConsumption(wayLen: Double, oil: Double): Double {
        return wayLen / oil;
    }

    open fun getKVt(): Double {
        return power * 0.74;
    }
}