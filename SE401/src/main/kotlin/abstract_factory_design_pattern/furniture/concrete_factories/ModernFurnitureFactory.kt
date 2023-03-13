package abstract_factory_design_pattern.furniture.concrete_factories

import abstract_factory_design_pattern.furniture.abstract_factory.FurnitureAbstractFactory
import abstract_factory_design_pattern.furniture.abstract_product.Chair
import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable
import abstract_factory_design_pattern.furniture.abstract_product.Sofa
import abstract_factory_design_pattern.furniture.concrete_product.ModernChair
import abstract_factory_design_pattern.furniture.concrete_product.ModernCoffeeTable
import abstract_factory_design_pattern.furniture.concrete_product.ModernSofa

class ModernFurnitureFactory: FurnitureAbstractFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ModernCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}