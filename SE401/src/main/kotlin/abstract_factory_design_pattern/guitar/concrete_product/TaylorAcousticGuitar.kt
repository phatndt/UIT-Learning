package abstract_factory_design_pattern.guitar.concrete_product

import abstract_factory_design_pattern.guitar.abstract_product.TaylorGuitar

data class TaylorAcousticGuitar(override val name: String = "taylor acoustic") : Guitar(name), TaylorGuitar {}