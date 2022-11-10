package POO

/*
2.Realice un programa para realizar la gestión de una Hamburguesería, permitiendo las siguientes
acciones:

a) Introducir nuevos productos de hamburguesa, donde se conoce su identificación única, el
nombre del producto,tipo de producto (carne, pollo o vegana)precio, precio en combo y los
ingredientes originales que la componen .

b) Listado de los productos, con toda su información

b) Permitir hacer un pedido, y la posibilidad de personalizar cada producto, permitiendo:

 b1) adicionar o eliminar ingredientes

 b2) observaciones o nota de algún ingrediente o del producto

 b3) si el producto no es un combo, permitir hacerlo

 b4) si el producto es un combo, permitirlo hacerlo grande por el incremento de un valor X

 b5) Conocer, el precio total del pedido y la dirección del envió
 */

data class Hamburguesa (var idHamburguesa:Int,var nombreProducto:String,var tipodeproducto:tipoProducto,var precio:Float,var preciocombo:Float,var ingredientesOriginales:MutableList<String>){

}
enum class tipoProducto{carne,pollo,vegana}

fun main(){
    val pedido1=Hamburguesa(1,"BIGMAC",tipoProducto.carne,6.99f,8.99f, mutableListOf("Queso","Carne","Pan"))
    val pedido2=Hamburguesa(2,"McPollo",tipoProducto.pollo,5.99f,7.99f, mutableListOf("Queso","Pollo","Pan"))
    val listadoPedidos:MutableList<Hamburguesa> = mutableListOf(pedido1, pedido2)
    var decision=0
    var trash:Int?

    for(i in 0..listadoPedidos.size-1){
        println("SI desea añadir un ingrediente a su pedido pulse 1")
        trash= readLine()?.toIntOrNull()
        decision=trash?:0

        while(decision==1){
            println("¿Que ingrediente desea añadir?")
            val ingredienteNuevo= readLine().toString()
            listadoPedidos[i].ingredientesOriginales.add(ingredienteNuevo)
            println("Si desea añadir otro ingrediente pulse 1 , si no, pulse cualquier tecla")
            trash= readLine()?.toIntOrNull()
            decision=trash?:0

        }

        println("SI desea eliminar un ingrediente a su pedido pulse 1")
        trash= readLine()?.toIntOrNull()
        decision=trash?:0

        while(decision==1){
            println("Actualmente esta es la lista de ingredientes de su pedido: ${listadoPedidos[i].ingredientesOriginales}")
            println("Indica respetando mayusculas cual ingrediente desea eliminar: ")
            val ingredienteEliminado= readLine().toString()
            listadoPedidos[i].ingredientesOriginales.remove(ingredienteEliminado)
            println("Si desea eliminar otro ingrediente pulse 1, si no, pulse cualquier tecla")
            trash= readLine()?.toIntOrNull()
            decision=trash?:0

        }

        println("Observaciones o nota del pan: " +
                "No apto para celiacos, si desea cambiar su pan por uno sin gluten pulse 1, si no, pulsa cualquier tecla")
        trash= readLine()?.toIntOrNull()
        decision=trash?:0

        while (decision==1){
            listadoPedidos[i].ingredientesOriginales.remove("Pan")
            listadoPedidos[i].ingredientesOriginales.add("Pan sin gluten")
            decision=2
        }

        println("Si desea hacer su producto un combo (añadir patatas y bebida) por solo 2€ pulse 1")
        trash= readLine()?.toIntOrNull()
        decision=trash?:0
        while (decision==1){
            listadoPedidos[i].nombreProducto=listadoPedidos[i].nombreProducto+",Bebida"+",Patatas"
            println("Si desea hacer su combo mas grande por el incremento de 1€ pulse 2, si no pulse cualquier tecla ")
            trash= readLine()?.toIntOrNull()
            decision=trash?:0
            if(decision==2){
                listadoPedidos[i].preciocombo=listadoPedidos[i].preciocombo+1.0f

            }
            decision=0
        }
    }
    println("Indique la direccion del pedido: ")
    var trash2= readLine().toString()
    var direccion=trash2
    var precioTotal=pedido1.precio+pedido2.precio
    println("El listado de pedidos es: $listadoPedidos, el precio total es:$precioTotal, y la direccion es:$direccion" )
}

