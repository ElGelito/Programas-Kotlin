package POO
import pkinterfaces.InterfacePunto

/*
//Definir una clase llamada PUNTOPLANO que hereda de una interfase "InterfacePunto" que tiene definidas las propiedades:
	-Punto x y punto y,
	-metodo imprimir que imprime las coordenadas del punto

Definir un metodo de extension sobre la clase puntoplano llamado "dibujar" que
	-Imprima las coordenadas del punto
 */
interface InterfacePunto {
    var x:Int
    var y:Int
    fun imprimir()
}

 class PUNTOPLANO(override var x: Int, override var y: Int):InterfacePunto{
     override fun imprimir() {
         println("Punto en el plano ($x,$y)")
     }
}

fun PUNTOPLANO.dibujar(){
    println("Dibujando puntos (${this.x}, ${this.y})")
}

fun main(){
    val prueba=PUNTOPLANO(1,2)
    prueba.imprimir()
    prueba.dibujar()

}
