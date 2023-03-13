package abstract_factory_design_pattern.guitar.concrete_product

import abstract_factory_design_pattern.guitar.abstract_product.YamahaGuitar

data class YamahaAcousticGuitar(override val name: String = "yamaha acoustic") : Guitar(name), YamahaGuitar {}