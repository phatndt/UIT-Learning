package abstract_factory_design_pattern.guitar.abstract_fatory

import abstract_factory_design_pattern.guitar.abstract_product.TaylorGuitar
import abstract_factory_design_pattern.guitar.abstract_product.YamahaGuitar

interface GuitarAbstractFactory {
    fun createTaylorGuitar(): TaylorGuitar
    fun createYamahaGuitar(): YamahaGuitar
}