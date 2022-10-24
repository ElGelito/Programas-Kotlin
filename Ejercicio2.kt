package POO

/*
2. Crear un programa que se solicite los 3 lados de un triangulo y tenga los métodos:
ladoMayor y esEquilatero.
Realice tres constructores para esta clase. Indique siempre que constructor se está
ejecutando:
1 constructor principal se le pasa los valores de cada lado (lado1, lado y lado3)
2 constructor no se le pasa ningún valor y solicita el valor de (lado1 y lado2=, lado 3 es el
valor de lado1
3 constructor se le pase el valor de un solo lado (lado1) e iguale los restantes
 */


    class trianguloEj2 (){
        var lado1:Int=0
        var lado2:Int=0
        var lado3:Int=0

        fun solicitar():String{
            var trash:Int?=0

            println("Introduce valor del lado 1: ")
            trash= readLine()?.toIntOrNull()
            lado1=trash?:0
            println(lado1)

            println("Introduce valor del lado 2: ")
            trash= readLine()?.toIntOrNull()
            lado2=trash?:0
            println(lado2)

            println("Introduce valor del lado 3: ")
            trash= readLine()?.toIntOrNull()
            lado3=trash?:0
            println(lado3)

            return "El lado 1 es: $lado1, el lado 2 es: $lado2, y el lado 3 es: $lado3"

        }

        fun ladoMayor():String{
            if(lado1>lado2&&lado1>lado3) return "El lado mas grande es el lado 1 con valor :$lado1"
            if(lado2>lado1&&lado2>lado3) return "El lado mas grande es el lado 2 con valor :$lado2"
            if(lado3>lado1&&lado3>lado2) return "El lado mas grande es el lado 3 con valor: $lado3"
            if(lado1==lado2 &&lado1>lado3) return "Lado 1 con valor:  $lado1, y lado 2 con valor: $lado2 son mayores que el lado 3 con valor: $lado3"
            if (lado1==lado3 &&lado1>lado2) return "Lado 1 con valor: $lado1, y lado 3 con valor: $lado3 son mayores que el lado 2 con valor: $lado2"
            if(lado3==lado2 &&lado2>lado1) return "Lados 3 con valor: $lado3, y lado 2 con valor: $lado2 son mayores que el lado 1 con valor: $lado1"
            else return "Son iguales todos los lados"
        }
        fun esEquilatero():String{
            if (lado1==lado2&&lado1==lado3) return "Es equilatero" else return "No es equilatero"
        }

    }



