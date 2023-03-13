package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.Chair

class VictorianChair : Chair {
    override fun getName(): String {
        return "VictorianChair"
    }
}