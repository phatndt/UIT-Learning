package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.Sofa

class ModernSofa : Sofa {
    override fun getName(): String {
        return "ModernSofa"
    }
}