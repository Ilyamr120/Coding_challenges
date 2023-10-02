
fun main(){
    var karprekarObj=Implementer("1234")
    println("Number to get back to 1234 is: { ${karprekarObj.kaprekar()} }")
}

public class Implementer(var num:String="6174"){
    fun kaprekar(): Int{
        var count=0
        var diff=num.toInt()
        if(num.length==4){
            do{
                var ascNB=asc(""+diff)
                var descNB=desc(""+diff)
    
                var num_as=ascNB.toInt()
                var num_ds=descNB.toInt()
    
                diff=num_ds-num_as
                println("$num_ds - $num_as = $diff")

                count++
                if(diff==6174){
                    return count
                }
            }while(diff!=num.toInt())

            return count
        }
        else
            println("Karprekar algorithm only allows numbers with 4 digits !!!");
        
        return -1;
    }
    fun desc(x: String):String{
        var str:String=x
        var dsNB=""
        while(str.length>0){
            var max=str[0]
            for(i in 1..str.length-1){
                if(str[i]>max){
                    var tmp=str[i]
                    str=str.replace(str[i],max)
                    max=tmp
                }
            }
            dsNB+=max
            str=str.replace(""+max, "")
        }   
        return dsNB
    }
    fun asc(y: String):String{
        var str=y
        var asNB=""

        while(str.length>0){
            var min=str[0]
            for(i in 1..str.length-1){
                if(str[i]<min){
                    var tmp=str[i]
                    str=str.replace(str[i],min)
                    min=tmp
                }
            }
            asNB+=min
            str=str.replace(""+min, "")
        }
        return asNB
    }
}