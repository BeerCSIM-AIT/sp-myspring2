package nvc.it.myspring2.model

data class Product(
    val id: Long,
    val name: String,
    val price: Double,
    val unitInStock: Int
)