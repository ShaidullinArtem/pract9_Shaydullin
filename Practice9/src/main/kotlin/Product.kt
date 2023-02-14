
package products
open class Product constructor(var title: String, var price: Double){

    open fun getLabel(): String {
        return "Товар: $title, цена: $price";
    }

    open fun getDiscount(percent: Double): Double {
        return price - (price * percent * 0.1);
    }

    open fun getTotalPrice(productCount: Int): Double {
        return price * productCount.toDouble();
    }
}