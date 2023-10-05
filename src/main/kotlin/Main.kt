fun main() {
    val amount: Int = readln().toInt()
    val sale: Int = if (amount < 1001) {
        0
    } else if (amount < 10001) {
        100
    } else amount*5/100
    val ourClient: Boolean = amount != 0

    val finalSale: Int = if (ourClient) (amount - sale)*1/100 else sale

    println("покупка — $amount рублей →")
    if (sale != 0) println("после применения скидки — ${amount - sale} рублей.")
    if(ourClient) println("после применения 1% скидки — ${amount - sale - finalSale} рубля.")
}