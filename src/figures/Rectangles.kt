package figures

import Behaviors.Describable
import Behaviors.Drawable

class Rectangles: Drawable, Describable{
    var height: Int
    var width: Int

    constructor(){
        height=0
        width=0
    }
    override fun draw():String {
        var stringToReturn: String = ""
        for(i in 1..height){
            for (j in 1.. width){
                stringToReturn+="* "
            }
            stringToReturn+="\n"
        }
        return stringToReturn
    }

    override fun requestDescription() {
        println("Ingrese la altura del rectangulo: ")
        //Para revisar que el input no sea una letra
        val inputHeight = readLine()!!.toIntOrNull()
        if (inputHeight!= null){
            this.height=inputHeight
        }
        println("Ingrese el ancho del rectangulo")
        //Para revisar que el input no sea una letra
        val inputWidth= readLine()!!.toIntOrNull()
        if (inputWidth!= null){
            this.width=inputWidth
        }
    }

}