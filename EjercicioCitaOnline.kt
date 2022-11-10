import java.sql.Time
import java.util.Date
import java.util.TimeZone


/*El equipo de programacion ha recibido una solicitud para realizar un sistema que gestione el control de cita online, para ser atendido en una oficina
Para solicitar una cita necesitas acceder via internet, una vez hecho, se almacena un numero aleatorio,la fecha y hora de la cita.

En la oficina se valida la cita y se empieza el seguimiento y atencion de cada cita personalizado, segun la hora programada

    Cuando se avise al numero de cita atendido y no se encuentre, se atendera al final de cada dia, en caso que sea el primer llamado,si es
 el segundo llamado, se pierde la cita.

a) Realice el estudio de informacion, de acceso a datos e implementacion de las operaciones y estructuras.
b) Realice la programacion del mismo (Kotlin)*/



data class citaOnline(var id: Int, var fecha: String, var hora: Int, var llamado: Int = 0) {

}

var citaCola: MutableList<citaOnline> = mutableListOf()
var citasHoy: MutableList<citaOnline> = mutableListOf()

fun buscarCita() {

}


/* Esta todo en el main para probar las cosas luego hay que moverlo a metodos a otro documento o arriba */
fun main() {

    var cita1 = citaOnline(1, "24/2/22", 1430)
    citasHoy.add(cita1)
    var cita2 = citaOnline(2, "15/8/29", 1650)
    citasHoy.add(cita2)
    var cita3 = citaOnline(3, "66/8/7", 830)
    citasHoy.add(cita3)


    println("-----------------------------------------------")
    println("Bienvenido al centro de salud por favor indique el id de su cita")
    var trash: Int?
    trash = readLine()?.toIntOrNull()
    var idcita: Int = trash ?: 0

    //recorremos la lista y si coincide en la citasHoy la eliminamos y  se añade en citasCola
    fun buscarID(): Int {
        var x: Int = -1
        if (x == -1) {
            for (it in citasHoy) {
                if (idcita == it.id) {
                    x = citasHoy.indexOf(it)
                    citaCola.add(it)
                    citasHoy.removeAt(x)
                    break
                }
            }
        }
        return x
    }
    //comprobamos si funciona el for de arriba
    buscarID()
    println(citasHoy)
    println(citaCola)

    //Vamos a llamar a pacientes
    println("-----------------------------------------------")
    println("Indique si esta o no para ser atendido")
    println("Pulse 0 si esta aqui en la sala de espera")
    println("Pulse 1 si no esta en la lista de espera")
    var trash1: Int?
    trash1 = readLine()?.toIntOrNull()
    var numeroEspera: Int = trash1 ?: 0
    do {
        when {
            numeroEspera == 0 -> {
                citaCola.removeAt(0)
                numeroEspera = 2
                println("Ha sido atendido")
            }

            numeroEspera == 1 -> {
                println("Te llamamo otra vez")
                println("¿Estas ahora en tu siguiente llamada?")
                println("Si estas pulsa 0 y si no estas pulsa 2")
                trash1 = readLine()?.toIntOrNull()
                numeroEspera = trash1?:0
                citaCola.removeAt(0)
                numeroEspera+1
                if (numeroEspera==0) println("Ha sido atendido") else if (numeroEspera==2){ println("Chao") }
            }
        }
    } while (numeroEspera != 2)
}