package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable

class ModernCoffeeTable : CoffeeTable {
    override fun getName(): String {
        return "ModernCoffeeTable"
    }
}