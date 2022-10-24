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