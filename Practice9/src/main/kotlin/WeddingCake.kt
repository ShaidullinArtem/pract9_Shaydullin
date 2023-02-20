

class WeddingCake constructor(title: String, price: Double, dough: String, cream: String, weight: Double, calories: Double, var newlyweds: String) : Cake(title, price, dough, cream, weight, calories) {

    fun getToPerson(): String {
        return "Торт $title для молодожёнов $newlyweds";
    }
}