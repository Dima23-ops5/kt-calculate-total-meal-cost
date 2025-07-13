// create a function and implement it
const val DEFAULT_DISCOUNT = 0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double): Double {
    fun applyTax(base: Double, tax: Double): Double {
        return base + base * tax
    }

    fun applyTip(sum: Double, tip: Double): Double {
        return sum + sum * tip
    }

    fun applyDiscount(sum: Double, discount: Double): Double {
        return sum - discount
    }

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    return applyDiscount(costWithTip, discount)
}

fun calculateTotalMealCost(baseCost : Double, taxRate : Double, tipPercentage : Double) : Double {
    fun applyTax(tax : Double, baseCost: Double) : Double {
        return baseCost + baseCost * tax
    }

    fun applyTip(tipPercentage: Double, sumWithTax : Double) : Double {
        return sumWithTax + sumWithTax * tipPercentage
    }

    fun applyDiscount(sumWithTip : Double) : Double {
        return sumWithTip - DEFAULT_DISCOUNT
    }
    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    return applyDiscount(costWithTip)
}