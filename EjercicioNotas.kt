package POO

/*
Declara una clase que almacene el nombre y la nota de una persona, definir un metodo que retorne true o false segun si la persona esta aprobada o no
Esta funcion debe recibir como parametro una funcion que al llamarla pasando la nota de la persona retornara si aprobado o no y otra funcion si es la mejor nota (10).

 */

class alumnado (val nombre:String, val nota:Int){


    fun resultadoExamen(fn:(Int)->Boolean): Boolean { return fn(nota)}

}

fun estaAprobado(nota:Int):Boolean= nota>=5
fun notaMaxima(nota:Int):Boolean= nota==10

fun ejemploFuncionOrdenSuperior2(){
    println("Ejercicio funcion orden superior")

    val persona1=alumnado("Angel",9)
    if(persona1.resultadoExamen(::notaMaxima)) println("${persona1.nombre} es la mejor nota") else println("${persona1.nombre} no es la mejor nota")
    if(persona1.resultadoExamen (::estaAprobado)) println("${persona1.nombre} esta aprobado") else println("${persona1.nombre} no esta aprobado")

}


