class Product(
    val productName: String,
    val productID: String,
    var productQty: Int = 0,
    var productDescription: String = "",
    discount: Double,
    unitPrice: Double
) {
    var salePrice: Double
    init {
        salePrice = unitPrice - ((unitPrice*discount)/100)
    }

    override fun toString(): String {
        return "SalePrice=$salePrice"
    }


}