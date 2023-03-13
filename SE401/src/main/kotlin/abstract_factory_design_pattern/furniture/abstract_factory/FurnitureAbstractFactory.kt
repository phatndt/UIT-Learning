package abstract_factory_design_pattern.furniture.abstract_factory

import abstract_factory_design_pattern.furniture.abstract_product.Chair
import abstract_factory_design_pattern.furniture.abstract_product.CoffeeTable
import abstract_factory_design_pattern.furniture.abstract_product.Sofa

interface FurnitureAbstractFactory {
    fun createChair(): Chair
    fun createCoffeeTable(): CoffeeTable
    fun createSofa(): Sofa
}