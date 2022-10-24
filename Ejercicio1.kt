package POO

/*
1. Crear una clase Persona donde sus atributos son (Nombre y edad)"), crear el método
imprimir, donde se muestre la
clasificación de la persona según su edad. menor (<18años),joven (18 a 29 ), adulto en
cualquier otro rango
 */

class Personaej1(var nombre:String, var edad:Int){

var respuesta=""
    init {
        if (edad<0||edad>120) respuesta="$nombre Su edad es $edad y es incorrecta "

        else if(edad<18) respuesta=" $nombre Su edad es $edad y por lo tanto es menor de edad"

            else if(edad in 18..29) respuesta="$nombre Su edad es $edad y pertenece al grupo joven"

                else respuesta="$nombre Su edad es edad y pertenece al grupo adulto"

    }

    fun imprimirEdad(){
        println(respuesta)
    }

}