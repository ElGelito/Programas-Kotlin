package POO

/*
1. Realice un programa para realizar un pedido de pizza de Pizza Hurt, tenga presente la siguiente
información:
• Mensaje de bienvenida a Pizza Hut//

• Los productos son los siguientes:
◦ 5 pizzas pre-elaboradas:
 1- Americana (Salsa de tomate, mozzarella, extra de pepperoni, bacon y cebolla roja)
 2- Barbacoa (Salsa barbacoa, carne, cebolla roja y bacon, extra dequeso)")
 3- Carbonara (Salsa carbonara, jamón York, champiñones , cebolla roja, extra de queso)
 4- Hawaina (Doble jamón, piña , extra mozzarella, Salsa carbonara,extra de queso)
 5- Meat Lovers (Salsa de tomate, carne, pepperoni, jamón de York, bacon y mozzarella")


◦ Pizza elaborada por 2 mitades:
 Por Mitades (2 mitades, cada una de una piza pre-elaborada)

◦ Pizza que es creada al gusto del usuario

 Crea Tu Propia Pizza ( Al Gusto !!! )

• Para realizar el pedido de cada pizza, diseñar un menú auxiliar para ayudar al usuario en la
selección.
Tenga en cuenta lo siguiente:

 - Crear tu propia Pizza: seleccionar una de las ya elaboradas, añadiendo ingredientes a
gusto del usuario. Cada ingrediente, según su precio, va incrementando el precio de la pizza
pre-elaborada
 - Permitir al cliente, elegir el tipo de masa para cada pizza, pueden ser:
 Tipo de masa: "Masa Tradicional", "Masa Fina","Masa Rolling","Masa Rolling con queso"
 - Seleccionar el tamaño de cada pizza: "pequeña", "mediana" o "familiar"
 - El cliente pueda seleccionar el tipo de pedido: "local" , "A domicilio" o "Recoger"
• Las promociones, están vinculada al tipo de pedido. En caso de haber alguna promoción,
aplicar la promoción al final del pedido.
• Antes de finalizar el pedido, mostrar un resumen al cliente, para que confirme el pedido
realizado. En caso que desee modificar el pedido, las opciones son: Adicionar producto,
Eliminar producto y Modificar producto

 Nota: El cliente en cualquier momento, puede salir del proceso de realizar el pedido

 */

class Pizzeria() {

    var eleccion=0;
    var trash:Int?=0
    var ingredientesPizza=""
    var americana="1- (Salsa de tomate, mozzarella, extra de pepperoni, bacon y cebolla roja)"
    var barbacoa="2- (Salsa barbacoa, carne, cebolla roja y bacon, extra dequeso)"
    var carbonara="3- (Salsa carbonara, jamón York, champiñones , cebolla roja, extra de queso)"
    var hawaiana="4- (Doble jamón, piña , extra mozzarella, Salsa carbonara,extra de queso)"
    var meatlover="5- (Salsa de tomate, carne, pepperoni, jamón de York, bacon y mozzarella)"

    fun saludo(){
        println("!BIENVENIDO A PIZZA HUT: EL GUSTO DE ESTAR JUNTOS!")
        println("")
    }

    fun elegirMenu(){
        println("ELIGE TU MENU:")
        println("MENU 1:" +
                " 5 pizzas pre elaboradas" +
                "1- Americana (Salsa de tomate, mozzarella, extra de pepperoni, bacon y cebolla roja)\n" +
                " 2- Barbacoa (Salsa barbacoa, carne, cebolla roja y bacon, extra dequeso)\")\n" +
                " 3- Carbonara (Salsa carbonara, jamón York, champiñones , cebolla roja, extra de queso)\n" +
                " 4- Hawaina (Doble jamón, piña , extra mozzarella, Salsa carbonara,extra de queso)\n" +
                " 5- Meat Lovers (Salsa de tomate, carne, pepperoni, jamón de York, bacon y mozzarella\")")

        println("")
        println("MENU 2" +
                " PIZZA ELABORADA POR 2 MITADES")

        println("")

        println("MENU 3" +
                " PIZZA CREADA AL GUSTO POR EL USUARIO")


        println("Elige tu menu (1|2|3)")
        println("")
        trash= readLine()?.toIntOrNull()
        eleccion=trash?:0

        if(eleccion!=1&&eleccion!=2&&eleccion!=3){
            println("No has elegido ningun menu correcto:")
        } else if(eleccion==1){
            println("Has elegido el MENU 1:"+
                    "5 pizzas pre elaboradas" +
                    "1- Americana (Salsa de tomate, mozzarella, extra de pepperoni, bacon y cebolla roja)\n" +
                    " 2- Barbacoa (Salsa barbacoa, carne, cebolla roja y bacon, extra dequeso)\")\n" +
                    " 3- Carbonara (Salsa carbonara, jamón York, champiñones , cebolla roja, extra de queso)\n" +
                    " 4- Hawaina (Doble jamón, piña , extra mozzarella, Salsa carbonara,extra de queso)\n" +
                    " 5- Meat Lovers (Salsa de tomate, carne, pepperoni, jamón de York, bacon y mozzarella\")")
        } else if(eleccion==2){
            println("Has elegido el MENU 2: "+
                    "PIZZA ELABORADA POR 2 MITADES")
        } else{
            println("Has elegido el MENU 3" +
                    "PIZZA CREADA AL GUSTO POR EL USUARIO")
        }
    }


}


