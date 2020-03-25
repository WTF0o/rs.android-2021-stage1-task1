package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val charArray = digitString.toCharArray()
        val intArray : IntArray = IntArray(charArray.size)
        var max: Int = Character.digit(charArray[0],10)
        var coutReplace: Int = k

        for (index in charArray.indices){
            intArray[index] = Character.digit(charArray[index],10)
            if(max < intArray[index]) max = intArray[index]
        }

        for (index in 0..intArray.lastIndex/2){

            if(intArray[index] != intArray[intArray.lastIndex - index])
              when (max){

                  intArray[index] -> {
                      intArray[intArray.lastIndex - index] = max
                      coutReplace--
                  }
                  intArray[intArray.lastIndex - index] -> {
                      intArray[index] = max
                      coutReplace--
                  }
                  else -> {intArray[index] = max
                      intArray[intArray.lastIndex - index] = max
                      coutReplace = coutReplace - 2}

              }

        }

        return  if (coutReplace >= 0) intArray.contentToString().filter { it !in "[] ," }
                else "-1"

    }
}
