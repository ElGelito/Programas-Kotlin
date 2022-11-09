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

Cuando solicitas por internet y se confirma la cita->FuncionConfirmarCita(cita=true), cuando ejecutas el metodo si es correcto
y la cita es=true, procederiamos a la creacion de las variables numeroaleatorio, fecha y horadecita


------------------------------------------------ESTUDIO DE LA INFORMACION-----------------------------------------------

 */

/*
---------------------------------------------PROGRAMACION---------------------------------------------------------------
 */
fun main(){
    val prueba=cita()

    prueba.funcionconfirmarcita()//si no se ejecuta esta funcion que nos permite confirmar la cita, no podemos otorgarle los datos puesto que la validacion esta incorrecta

    prueba.otorgarDatos("Dia: 25/12/2022  hora: 16:49 ")
}
    class cita(){
        var citacreada:Boolean=false
        var numeroCita=(Math.random()*100).toInt()

        fun funcionconfirmarcita(){
            citacreada=true

        }

        fun otorgarDatos (fechaCita:String){

            if(citacreada){
               println("El numero de la cita es: $numeroCita y la fecha para la cita es: $fechaCita")

            }else{
                println("La cita no esta confirmada")
            }
        }
    }

/*
---------------------------------------------PROGRAMACION---------------------------------------------------------------
 */