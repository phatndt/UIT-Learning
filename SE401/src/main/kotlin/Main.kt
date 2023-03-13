import abstract_factory_design_pattern.furniture.abstract_factory.FurnitureAbstractFactory
import abstract_factory_design_pattern.furniture.concrete_factories.ActDecoFurnitureFactory
import abstract_factory_design_pattern.furniture.concrete_factories.ModernFurnitureFactory
import abstract_factory_design_pattern.guitar.concrete_factories.AcousticGuitarFactory
import abstract_factory_design_pattern.guitar.concrete_factories.ClassicalGuitarFactory

fun main(args: Array<String>) {
//    val taylorAcoustic = AcousticGuitarFactory().createTaylorGuitar()
//    val yamahaAcoustic = AcousticGuitarFactory().createYamahaGuitar()
//    val taylorClassical = ClassicalGuitarFactory().createTaylorGuitar()
//    val yamahaClassical = ClassicalGuitarFactory().createYamahaGuitar()
//    println(taylorAcoustic)
//    println(taylorClassical)
//    println(yamahaAcoustic)
//    println(yamahaClassical)


    var furnitureAbstractFactory: FurnitureAbstractFactory

    furnitureAbstractFactory = ModernFurnitureFactory()
    val modernChair = furnitureAbstractFactory.createChair()
    val modernSofa = furnitureAbstractFactory.createSofa()

    furnitureAbstractFactory = ActDecoFurnitureFactory()
    val actDecoChair = furnitureAbstractFactory.createChair()
    val actDecoSofa = furnitureAbstractFactory.createSofa()

    println(modernChair.getName())
    println(modernSofa.getName())
    println(actDecoChair.getName())
    println(actDecoSofa.getName())
}