package POO

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/*
El equipo de programacion de una empresa, ha recibido una solicitud para realizar un sistema que gestione el control de cita online,
para ser atendido en una oficina
Las citas se solicitan por internet y cuando se confirma, se almacena un numero aleatorio, la fecha y hora de la cita

En la oficina, se valida la cita y comienza el seguimiento de atencion de cada cita segun la hora programada

Cuando se avisa al numero de cita atenido y no se encuentre, se atendera al final del dia en caso que sea el primer llamado, si es el segundo llamado
se pierde la cita

A)Realice el estudio de la informacion, de acceso a datos e implementacion de las operaciones y estructuras

B)Realice la programacion del mismo (kotlin)

 */

/*
------------------------------------------------ESTUDIO DE LA INFORMACION-----------------------------------------------


Creariamos clase cita ()
creariamos variable citacreada:Boolean=false
creariamos lista de tipo clase cita
añadiriamos las citas si la funcion confirmarcita=true, si no no la añadimos

Cuando solicitas por internet y se confirma la cita->FuncionConfirmarCita(cita=true), cuando ejecutas el metodo si es correcto
y la cita es=true, procederiamos a la creacion de las variables numeroaleatorio, fecha y horadecita




------------------------------------------------ESTUDIO DE LA INFORMACION-----------------------------------------------

 */

/*
---------------------------------------------PROGRAMACION---------------------------------------------------------------
 */
fun main(){
    //val pruebaLista:MutableList <Int> = MutableList(100,{(Math.random()*100).toInt()})


    //CREACION LISTA DE CITAS
    val listacitas= mutableListOf<cita>()
    var listaOrdenada= listOf<cita>()

    listaOrdenada=listacitas.sortedBy { cita ->cita.fecha  }

    //CREACION DE OBJETOS DE TIPO CITA
    val cita1=cita()
    val cita2=cita()

    //OTORGAR DATOS A LA CITAS
    cita1.funcionconfirmarcita()//si no se ejecuta esta funcion que nos permite confirmar la cita, no podemos otorgarle los datos puesto que la validacion esta incorrecta
    cita1.otorgarDatos(31,2,2022,16)

    cita2.funcionconfirmarcita()
    cita2.otorgarDatos(1,3,2022,17)

    //VARIABLE PARA RECCORRER EL TAMAÑO DE LA LISTA
    var i=0

    //AÑADIR OBJETOS "CITA" A LA LISTA DE CITAS, SI LA CITA NO ESTA CONFIRMADA NO SE AÑADAE

    if(cita1.citacreada){
        listacitas.add(cita1)
    } else{
        println("No esta confirmada la cita")
    }

    if(cita2.citacreada){
        listacitas.add(cita2)
    } else{
        println("No esta confirmada la cita")
    }

    //IMPRIMIR LAS
    println("LISTA DE CITAS")
    while(i<listacitas.size){
        listacitas.elementAt(i).toString()
        println(listacitas[i])
        i++
    }

    //IMPRIMIR LAS
    println("LISTA DE CITAS ORDENADAS")
    while(i<listaOrdenada.size){
        println(listaOrdenada.elementAt(i).toString())
        println(listaOrdenada[i])
        i++
    }

}
    class cita(){
        var citacreada:Boolean=false
        var numeroCita=(Math.random()*100).toInt()
        var fecha=""

        fun funcionconfirmarcita(){
            citacreada=true

        }
        override fun toString(): String {
            return "Numero cita $numeroCita y la fecha es $fecha "
        }

        fun otorgarDatos (dia:Int,mes:Int,año:Int,hora:Int){
            fecha="$dia/$mes/$año a las : $hora "
        }


    }

/*
---------------------------------------------PROGRAMACION---------------------------------------------------------------
 */