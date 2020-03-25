package subtask1

import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.isEmpty()) return sadArray
        val happyList = sadArray.toCollection(ArrayList<Int>())

        for (n in happyList.indices)
        for (index in happyList.indices){
            if(index >= happyList.indices.last)
                break
            if (index != happyList.indices.first &&
                index != happyList.indices.last &&
                happyList[index - 1] + happyList[index + 1] < happyList[index])
                    happyList.removeAt(index)

        }

        return happyList.toIntArray()

    }
}
