package abstract_factory_design_pattern.furniture.concrete_factories

import abstract_factory_design_pattern.furniture.abstract_factory.FurnitureAbstractFactory
import abstract_factory_design_pattern.furniture.abstract_product.Chair
import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable
import abstract_factory_design_pattern.furniture.abstract_product.Sofa
import abstract_factory_design_pattern.furniture.concrete_product.ActDecoChair
import abstract_factory_design_pattern.furniture.concrete_product.ActDecoCoffeeTable
import abstract_factory_design_pattern.furniture.concrete_product.ActDecoSofa

class ActDecoFurnitureFactory: FurnitureAbstractFactory {
    override fun createChair(): Chair {
        return ActDecoChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ActDecoCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ActDecoSofa()
    }
}