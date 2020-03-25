package subtask4


class StringParser {

    fun getResult(inputString: String): Array<String> {

        val openBrackets = arrayOf('(','[','<')
        val result: ArrayList<String> = ArrayList<String>()
        var indexBegin:Int = 0
        var indexEnd:Int = 0
        var indexOpenBracket:Int = 0

        for (i in inputString.indices)
            if(inputString[i] in openBrackets) {
                indexBegin = i + 1
                indexOpenBracket = openBrackets.indexOf(inputString[i])
                indexEnd = findCloseBracket(indexOpenBracket,inputString[i],indexBegin,inputString)
                result.add(inputString.substring(indexBegin, indexEnd))
            }

        return result.toTypedArray();
    }

    fun findCloseBracket(indexOpenBracketInArray:Int,openBrackets:Char,beginTextIndex:Int,text:String):Int{

        val closeBrackets = arrayOf(')',']','>')
        var coutOpenBrackets:Int = 0

        for (index in beginTextIndex..text.indices.last)
            when(text[index]){
                openBrackets -> ++coutOpenBrackets
                closeBrackets[indexOpenBracketInArray] ->  if(coutOpenBrackets == 0) return index
                                                            else --coutOpenBrackets
            }

        return -1
    }
}
