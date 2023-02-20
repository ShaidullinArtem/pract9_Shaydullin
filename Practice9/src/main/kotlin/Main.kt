import products.Product

fun main(args: Array<String>) {

    var car1: Car = Car("Камри 3.5", 150000.50, "Таёта", 250.0);
    // инфомация об авто
    println(car1.getInfo())
    // расход бензина
    println(car1.getGasolineConsumption(1500.0, 100.0))
    // количество кВт
    println(car1.getKVt())

    var liteCar: LiteCar = LiteCar("Камри 2.5", 150000.50, "Таёта", 250.0, 4);
    println(liteCar.getSpace())

    var hardCar: HardCar = HardCar("Газель", 150000.50, "Таёта", 250.0, 150.5);
    println(hardCar.getCapacityNumber())

    var cake1: Cake = Cake("Наполеон", 150.50, "Бездрожжевое", "Сливочный", 1.0, 360.0);
    // инфомация о перожином
    println(cake1.getView())
    // сколько калорий в одном грамме
    println(cake1.getMinCalories())
    // общее количество калорий в нескольких продуктах
    println(cake1.calcTotalCalories(10));

    var weddingCake: WeddingCake = WeddingCake("Пломбир", 150.50, "Бездрожжевое", "Сливочный", 1.0, 360.0, "Романовы")
    println(weddingCake.getToPerson())

    var factoryCake: FactoryCake = FactoryCake("Медовик", 150.50, "Бездрожжевое", "Сливочный", 1.0, 360.0, "Бисквитный двор", "Яблоко")
    println(factoryCake.getShop())

    var product1: Product = Product("Мыло", 150.0);
    // информация о товаре
    println(product1.getLabel())
    // цена товара со скидкой
    println(product1.getDiscount(10.0))
    // общая цена за несколько продуктов
    println(product1.getTotalPrice(10))
}