package abstract_factory_design_pattern.guitar.concrete_factories

import abstract_factory_design_pattern.guitar.abstract_fatory.GuitarAbstractFactory
import abstract_factory_design_pattern.guitar.abstract_product.TaylorGuitar
import abstract_factory_design_pattern.guitar.abstract_product.YamahaGuitar
import abstract_factory_design_pattern.guitar.concrete_product.TaylorAcousticGuitar
import abstract_factory_design_pattern.guitar.concrete_product.YamahaAcousticGuitar

class AcousticGuitarFactory : GuitarAbstractFactory {
    override fun createTaylorGuitar(): TaylorGuitar {
        return TaylorAcousticGuitar()
    }

    override fun createYamahaGuitar(): YamahaGuitar {
        return YamahaAcousticGuitar()
    }
}