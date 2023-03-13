package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.Chair

class ModernChair : Chair {
    override fun getName(): String {
        return "ModernChair"
    }
}