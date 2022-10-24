package POO

/*
3. Crear un programa donde se le pase el nombre de un alumno y un listado de sus 5 notas y
tiene como métodos:
notaPromedio: Calcular el promedio de sus notas
detalleNotas: imprima la cantidad de asignatura por rango de nota

 */

    class alumno(){

        var promedio=0f
        var nombre="";
        var nota=FloatArray(5)
        var trash:Float?=0f
        var suma=0f
        var acumuladorsuspenso=0
        var acumuladorregular=0
        var acumuladorpromocionado=0

        fun solicitarDatos():String{
            println("Como te llamas?")
            nombre= readLine().toString()

            println("Tu nombre es: $nombre")

            for(i in 0..nota.size-1){
                println("Introduce la nota: $i")
                trash= readLine()?.toFloatOrNull()
                nota[i]=trash?:0f
                println(nota[i])
            }
            return ""
        }

        fun notaPromedia():String{
            for (i in 0..nota.size-1){
                suma=nota[i]+suma
            }

            promedio=suma/nota.size
            return "El promedio es: $promedio"
        }

        fun detalleNota():String{
            for (i in 0..nota.size-1){
                if(nota[i]<5){
                    acumuladorsuspenso++

                } else if(nota[i]>=5&&nota[i]<7){
                    acumuladorregular++

                } else{
                    acumuladorpromocionado++

                }
            }
            return "La cantidad de suspendidas es: $acumuladorsuspenso, la cantidad de regulares son : $acumuladorregular, y la cantidad de promocionados son : $acumuladorpromocionado"
        }
    }