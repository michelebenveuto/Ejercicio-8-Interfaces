import figures.*

fun main(args: Array<String>){
    //Figuras iniciales con atributos igual a 0
    val square = Square()
    val rectanlge = Rectangles()
    val triangle = triangle()
    //menu principal
    var firstMenu="""
        Menu:
        1)Dibujar una figura
        2)Salir
    """.trimIndent()
    //menu para dibujar
    var secondMenu="""
        Menu:
        1)Digujar un cuadrado
        2)Dibujar un rectangulo
        3)Dibujar un Triangulo
        4)Salir al menu principal
    """.trimIndent()
    //variables para terminar los ciclos
    var wantsToContinue=true
    var wantsToDraw= true

    //primer ciclo
    do {
        println(firstMenu)
        println("Ingrese la opcion que quiera: ")
        var firstOpcion= readLine()!!.toIntOrNull()//Para revisar que el input no sea una letra u otro string
        if (firstOpcion==1){
            wantsToDraw=true
            do{
               println(secondMenu)
                println("Ingrese la opcion que quiera: ")
                var shapeToDraw= readLine()!!.toIntOrNull()//Para revisar que el input no sea una letra
                when(shapeToDraw){
                    1->{
                        square.requestDescription()
                        println(square.draw())
                    }
                    2->{
                        rectanlge.requestDescription()
                        println(rectanlge.draw())
                    }
                    3->{
                        triangle.requestDescription()
                        println(triangle.draw())
                    }
                    4->{
                        wantsToDraw=false
                    }
                    else->(println("Esta opcion no existe"))
                }
            }while (wantsToDraw)
        }
        else if (firstOpcion==2){
            wantsToContinue= false
        }else(println("Esta opcion no existe"))

    }while (wantsToContinue)
}