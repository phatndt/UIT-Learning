package abstract_factory_design_pattern.guitar.concrete_product

import abstract_factory_design_pattern.guitar.abstract_product.YamahaGuitar

data class YamahaClassicalGuitar(override val name: String = "yamaha classical") : Guitar(name), YamahaGuitar {
}