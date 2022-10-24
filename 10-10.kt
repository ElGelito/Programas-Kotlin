package POO
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

//Forma 1 de declararlo

class coche (var Modelo:String, var numeroPuertas:Int, var numVelocidad:Int, var asientos:Int){

    fun cambiarVelocidad(nuevaVelocidad:Int){
        numVelocidad =nuevaVelocidad
    }

    fun detener(){
        numVelocidad=0
    }

    init{
        Modelo= Modelo.uppercase(Locale.getDefault())
        if(numVelocidad<0) numVelocidad=0
        if(numVelocidad>300)numVelocidad=0
    }
}


data class Vehiculo(var modelo:String,var puertas:Int,var velocidad:Int,var asientos: Byte)
{var potenciaMax:Int=300}

fun crearVehiculo(){
    val coche=Vehiculo("Seat",4,300,5)
    println("Los datos del coche son: ${coche.toString()}")

}

////Forma 2 de declararlo
//class Coche(nombreModelo:String, numeroPuertas:Int, numVelocidad:Int,numAsientos:Int)
//{
//    val modelo=nombreModelo
//    val puerta=numeroPuertas
//    val velocidad=numVelocidad
//    val asientos=numAsientos
//
//}
//val seat2= Coche("Seat",4,230,5)
//

//Declaramos propiedades en el constructor

class Persona(val nombre:String, val apellidos:String, val edad: Int?){}

class Alumno constructor(_nombre:String, _apellidos:String, _edad:Int?){
    val nombre:String=_nombre
    val apellidos:String=_apellidos
    val edad:Int?=_edad
}

fun crearPersona(){
    val persona1 = Persona("Albert","Einstein Garcia ",50)
    val persona2 = Persona("Ingrid","Garcia Jhonson",null)

    println("Personas: ${persona1.nombre} "+ "apellidos: ${persona1.apellidos}"+"edad: $persona1.edad")
}

data class Profesor(var nip:Int, var contrato:String,var nombre:String, var nacimiento:String)

data class Tutor(var nip:Int, var contrato:String,var nombre:String, var nacimiento:String){
    init {
        var nacimiento= LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    }
}

fun creartutor(){
    val tutor1=Tutor(1,"Fijo indefinido","Aitor","01-07-2003")
    val tutor2=Tutor(2,"Fijo concurrente","Sergio","01-07-2002")

    println("Los datos del tutor son : ${tutor1.toString()}")
}

data class Articulo(var codigo:Int,var descripcion:String,var precio:Float)

fun dataclassArticulo(){
    val articulo1=Articulo(1,"Papas",3f)
    val articulo2=Articulo(2,"Jamon",4f)
    val articulo3=articulo1.copy(precio=2.50f, descripcion = "patatas(articulo3)")
    var articulo4=articulo2.copy(precio = 2f)
    val copiaArticulo3=articulo3
    println(articulo1.toString())
    println(articulo2)

    if(articulo3.equals(copiaArticulo3)) println("Son iguales $articulo3 y su copia $copiaArticulo3") else println("Articulos distintos")

    if(articulo1==articulo3) println("Son iguales $articulo1 y $articulo3") else println(("Son diferentes $articulo1 y $articulo3"))

}

enum class Color{ROJO,AZUL,VERDE,VIOLET,BLANCO,MORADO,NEGRO}
enum class Ingredientes {PAN,QUESO,CARNE,TOMATE,LECHE}
enum class TipoCarta{DIAMANTE,TREBOL,CORAZON,PICA}

enum class rgbColor(val r:Int, val g:Int, val b:Int){
    RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255), ORANGE(255,165,0),
    YELLOW(255,255,0),INDIGO(75,0,130), VIOLET(238,130,238);

    fun rgb()=(r*256+g)*256+b
    fun hex()="# ${(r*65536)+(g*256)+b}"

}

class Carta(val tipo:TipoCarta, val valor:Int){
    fun imprimir()="Carta $tipo y su valor $valor"
}

    class Empleado constructor(_nombre: String, _apellidos: String, _edad: Int?){
        var nombre:String=_nombre
            set(valor) {field=valor.uppercase()}
            get(){return "("+field+")"}
    }


object miSeat{
    var modelo="Leon"
    val puertas=5
    var velocidad:Int?=260

        set(value) {
            if(value!=null){
                if(value<0) field=0 else field=value
            } else field=0
        }
        get(){return field?:0}
    val asientos=5

    init{
        this.modelo.uppercase()
        velocidad= velocidad?:0
    }

    fun cambiarVelocidad()=this.velocidad
    fun detener(){this.velocidad=0}
    fun descripcionCoche():String="El $modelo es un estupendo conce de $puertas con $asientos y alcanza una velocidad de $velocidad"

}

open class vehiculoOpen(var modelo:String,numbastidor:String){

    fun acelerar()=println("Vehiculo:Aumentando velocidad")

    open fun detener()=println("Vehiculo:Dismiyuendo velocidad")

    open fun imprimir_caracteristicas()=println("Vehiculo (caracteristicas) \n Modelo: $modelo")

}

class Coches(_modelo:String,_numbastidor:String,val potencia:Int,val asientos:Int):
    vehiculoOpen(_modelo,_numbastidor){
    override fun imprimir_caracteristicas()= println("Coche (caracteristicas \n Modelo: $modelo \n Potencia:$potencia \n Asientos:$asientos")//Anula el metodo del padre y lo modifica para que sea mejor el suyo
     override fun detener(){
         super.detener()//Llama al metodo del padre
         println("Coche acelerado")
     }
    }

abstract class ModeloVehiculo(var modelo: String,var numbastidor: String,var peso:Float? ,var color:String) {
    //propiedades abstractas
    abstract var velocidadMax: Float

    //Metodos abstractos, hay que definirilos en la clase hijo para ser llamados
    abstract fun acelerar(valor: Int)
    abstract fun detener()

    //Metodos no abstractos definidos, ueden ser sobreescritos o llamados

    open fun fichaVehiculo() = println(
        "Coche (caracteristicas) \n Modelo: $modelo \n No.Bastidor: $numbastidor \n Peso: $peso\n" +
                "Color : $color \n   Velocidad Maxima: $velocidadMax \n"
    )
}

        class ModeloSeat(_modelo: String,_bastidor:String,_peso:Float?,_color:String):
        ModeloVehiculo (_modelo,_bastidor,_peso,_color){

            override var velocidadMax: Float=0f
                set(value){
                    if(value<0) field=0f else field=value
                }

            init {
                modelo=_modelo.uppercase()
                numbastidor=_bastidor.uppercase()
                peso=_peso?:0F
                color=_color.uppercase()
            }

            override fun acelerar(valor: Int)= println("Modelo SEAT, acelerando a $valor")
            override fun detener()= println("Modelo Seat: Deteniendo")
            override fun fichaVehiculo() {
                println("Caracteristicas del Modelo Seat")
                super.fichaVehiculo()
            }

        }

class A{
    var a1:Int=0
    var a2:Int=0
    fun imprimir()="Hola"
}


