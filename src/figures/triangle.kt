package figures

import Behaviors.Describable
import Behaviors.Drawable

class triangle: Drawable, Describable{
    var height: Int

    constructor(){
        height=0
    }

    override fun requestDescription() {
        println("Ingrese la altura del triangulo: ")
        //Para revisar que el input no sea una letra
        val inputHeight = readLine()!!.toIntOrNull()
        if (inputHeight!= null){
            this.height=inputHeight
        }

    }

    override fun draw(): String {
        var stringToReturn=""
        for (i in 1..height){
            stringToReturn+=" ".repeat(height-i)
            stringToReturn+="* ".repeat(i)
            stringToReturn+="\n"
        }
        return stringToReturn
    }

}