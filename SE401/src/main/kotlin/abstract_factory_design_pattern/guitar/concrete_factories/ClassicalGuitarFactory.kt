package abstract_factory_design_pattern.guitar.concrete_factories

import abstract_factory_design_pattern.guitar.abstract_fatory.GuitarAbstractFactory
import abstract_factory_design_pattern.guitar.abstract_product.TaylorGuitar
import abstract_factory_design_pattern.guitar.abstract_product.YamahaGuitar
import abstract_factory_design_pattern.guitar.concrete_product.TaylorClassicalGuitar
import abstract_factory_design_pattern.guitar.concrete_product.YamahaClassicalGuitar

class ClassicalGuitarFactory : GuitarAbstractFactory {
    override fun createTaylorGuitar(): TaylorGuitar {
        return TaylorClassicalGuitar()
    }

    override fun createYamahaGuitar(): YamahaGuitar {
        return YamahaClassicalGuitar()
    }
}