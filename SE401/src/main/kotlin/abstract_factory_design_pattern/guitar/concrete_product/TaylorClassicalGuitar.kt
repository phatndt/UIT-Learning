package abstract_factory_design_pattern.guitar.concrete_product

import abstract_factory_design_pattern.guitar.abstract_product.TaylorGuitar

data class TaylorClassicalGuitar(override val name: String = "taylor classical") : Guitar(name), TaylorGuitar {
}