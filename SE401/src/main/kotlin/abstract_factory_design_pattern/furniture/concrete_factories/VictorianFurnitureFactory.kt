package abstract_factory_design_pattern.furniture.concrete_factories

import abstract_factory_design_pattern.furniture.abstract_factory.FurnitureAbstractFactory
import abstract_factory_design_pattern.furniture.abstract_product.Chair
import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable
import abstract_factory_design_pattern.furniture.abstract_product.Sofa
import abstract_factory_design_pattern.furniture.concrete_product.VictorianChair
import abstract_factory_design_pattern.furniture.concrete_product.VictorianCoffeeTable
import abstract_factory_design_pattern.furniture.concrete_product.VictorianSofa

class VictorianFurnitureFactory: FurnitureAbstractFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return VictorianCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}