package POO

/*
La empresa de Puerto de valencia, necesita realizar un progrmaa para la gestion de carga y descarga de contenedores

De los contenedores se sabe su numero de contenedor pais de origen y destino, y el estado en el que se encuentra (transito, retenido y entregado)

Las operaciones que se quieren realizar son: Carga y Descargar, conocer el numero de contenedores en cada uno de los estados

 */

    var acumuladortransito=0
    var acumuladorretenido=0
    var acumuladorentregado=0
    var contenedoresCargandose=0
    var contenedoresDescargandose=0

    class contenedor(var nContenedor:Int, var paisOrigen:String, var destino:String,var estado:estadoseencuentra){

        fun imprimirDatos(){
            println("El numero de contenedor es: $nContenedor, el pais de origen es: $paisOrigen, el destino es: $destino, y el estado es: $estado")
        }
        fun establecernumero(){
            if (estado.equals(estadoseencuentra.transito)){
                acumuladortransito++

            } else if(estado.equals(estadoseencuentra.entregado)){
                acumuladorentregado++

            } else{
                acumuladorretenido++

            }
        }


        enum class estadoseencuentra{transito,retenido,entregado}


    fun cargarContenedor(){
        println("Cargando Contenedor...")
        contenedoresCargandose++
    }

    fun descargarContenedor(){
        println("Descargando Contenedor...")
        contenedoresDescargandose++
    }

    fun imprimirEstado(){
        println("Hay $acumuladortransito, coches en el estado 'transito', " +
                "Hay $acumuladorretenido coches en el estado 'retenido', " +
                "Hay $acumuladorentregado coches en el estado 'entregado'," +
                "Hay $contenedoresCargandose contenedores cargandose," +
                "Hay $contenedoresDescargandose contenedores descargandose ")
    }
}
