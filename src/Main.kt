fun main(){
    var multiply= prodInt(arrayOf(23,7,54,9))
    println(multiply)
    var add = mixedArray(arrayOf("Rachael",33.7,false,"Britain",6.8,35))
    println(add)

    var sounds = chars(arrayOf('a', 'k', 'e', 'u', 'j'))
    println(sounds)

}
fun prodInt(values: Array<Int>):Int{
    var product = 1
    values.forEach{value->
        product*=value
    }
    return product


}
fun mixedArray(combinations:Array<Any>):Double{
    var deciNum = 0.0
    combinations.forEach{combination->
        if(combination is Double)
            deciNum+=combination
    }
    return deciNum

}
fun chars(letters:Array<Char>): Int{
    var vowels = 0
    letters.forEach{letter->
        if(letter=='a'|| letter=='e'|| letter=='i' || letter=='o'||letter=='u' ){

            ++vowels
        }
    }
    return vowels
}