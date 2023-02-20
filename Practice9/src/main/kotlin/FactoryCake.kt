

class FactoryCake constructor(title: String, price: Double, dough: String, cream: String, weight: Double, calories: Double, var company: String, var store: String) : Cake(title, price, dough, cream, weight, calories) {

    fun getShop(): String {
        return "Торт $title от компании $company продаётся в магазине $store";
    }
}