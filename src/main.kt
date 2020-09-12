interface Virus{
    fun mutate()
    fun spread()
}
enum class SortsVirus{
    corona,
    influenza,
    HIV

}
class CoronaVirus:Virus{
    override fun mutate() {
        println("CoronaVirus")
    }
    override fun spread() {
        println("CoronaVirus")
    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println("InfluenzaVirus")
    }
    override fun spread() {
        println("InfluenzaVirus")
    }

}
class HIVVirus:Virus{
    override fun mutate() {
        println(" HIVVirus")
    }
    override fun spread() {
        println(" HIVVirus")
    }

}
class VirusFactory{


    fun makeVirus(virusType:SortsVirus):Virus{
        var  type:Virus?
        if(virusType==SortsVirus.corona)
            type= CoronaVirus()
        else if(virusType==SortsVirus.influenza)
            type=InfluenzaVirus()
        else type=HIVVirus()
        return type


    }
}

fun main() {

    var virus1=VirusFactory().makeVirus(SortsVirus.influenza)
    virus1.mutate()
    virus1.spread()
    var virus2=VirusFactory().makeVirus(SortsVirus.corona)
    virus2.mutate()
    virus2.spread()
    var virus3=VirusFactory().makeVirus(SortsVirus.HIV)
    virus3.mutate()
    virus3.spread()

}