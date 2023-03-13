package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable

class VictorianCoffeeTable : CoffeeTable {
    override fun getName(): String {
        return "VictorianCoffeeTable"
    }
}