package POO

/*
4. Dato un punto (X,Y) decir la ubicación en el cuadrante al que pertenece, llamando al método
imprimir
 1 constructor principal se le pasa los valores del punto(X,Y)
 2 constructor secundario no se le pasa ningún valor y solicita el valor X y Y
 3 constructor tercero se le pase el valor X ( el punto siempre debe estar sobre el eje Y)
 */
class Ejercicio4_1 (var x:Int, var y:Int){
    fun imprimir():String{
        if(x>0&&y>0) return "Se encuentra en el cuadrante 1"
        else if(x<0&&y>0) return "Se encuentra en el cuadrante 4"
            else if(x<0&&y<0) return "Se encuentra en el cuadrante 3"
                else return "Se encuentra en el cuadrante 2"
    }

}
class Ejercicio4_2(){
    var x:Int=0
    var y:Int=0
    var trash:Int?=0

    fun imprimir():String{
        println("Introduce el valor de la coordenada X: ")
        trash= readLine()?.toIntOrNull()
        x=trash?:0

        println("Introduce el valor de la coordenada Y: ")
        trash= readLine()?.toIntOrNull()
        y=trash?:0

        if(x>0&&y>0) return "Se encuentra en el cuadrante 1"
            else if(x<0&&y>0) return "Se encuentra en el cuadrante 4"
                else if(x<0&&y<0) return "Se encuentra en el cuadrante 3"
                    else return "Se encuentra en el cuadrante 2"
    }
}

class Ejercicio4_3(var x:Int){
    fun imprimir():String{
        if(x>0) return "Se encuentra en el cuadrante 1"
            else return "Se encuentra en el cuadrante 4"
    }
}