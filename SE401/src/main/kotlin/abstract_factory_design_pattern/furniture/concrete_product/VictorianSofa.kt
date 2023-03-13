package abstract_factory_design_pattern.furniture.concrete_product

import abstract_factory_design_pattern.furniture.abstract_product.Sofa

class VictorianSofa : Sofa {
    override fun getName(): String {
        return "VictorianSofa"
    }
}