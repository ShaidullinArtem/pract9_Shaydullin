import products.*

open class Cake constructor(title: String, price: Double, var dough: String, var cream: String, var weight: Double, var calories: Double) : Product(title, price){

    open fun getView(): String {
        return "Пероженноле из $dough теста с $cream кремом";
    }
    open fun getMinCalories(): Double {
        return weight / calories;
    }

    open fun calcTotalCalories(cakeCount: Int): Double {
        return cakeCount.toDouble() * calories;
    }
}