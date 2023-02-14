import products.*

class Cake constructor(title: String, price: Double, var dough: String, var cream: String, var weight: Double, var calories: Double) : Product(title, price){

    fun getView(): String {
        return "Пероженноле из $dough теста с $cream кремом";
    }
    fun getMinCalories(): Double {
        return weight / calories;
    }

    fun calcTotalCalories(cakeCount: Int): Double {
        return cakeCount.toDouble() * calories;
    }
}