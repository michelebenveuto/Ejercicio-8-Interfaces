package figures

import Behaviors.Describable
import Behaviors.Drawable

class Square: Drawable, Describable{
    var side: Int

    constructor(){
        side=0
    }

    override fun draw():String {
        var stringToReturn: String = ""
        for(i in 1..side){
            for (j in 1..side){
                stringToReturn+="* "
            }
            stringToReturn+="\n"
        }
        return stringToReturn
    }

    override fun requestDescription() {
        println("Ingrese el lado del cuadrado: ")
        val option = readLine()!!.toIntOrNull()//Para revisar que el input no sea una letra
        if (option!= null){
            this.side=option
        }
        else if(option== null){
            this.side=0
        }
    }
}