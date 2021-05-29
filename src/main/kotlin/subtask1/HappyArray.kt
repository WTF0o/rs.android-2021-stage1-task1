package subtask1

class HappyArray {

    private var test: MutableListIterator<Int>? = null

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.isEmpty()) return sadArray
        
        val happyList = sadArray.toMutableList()

        for (index in happyList.indices)
        for(index in happyList.indices){
            if(index == happyList.indices.first) continue
            else if(index >= happyList.indices.last) break;
            else if (happyList[index] > happyList[index.inc()] + happyList[index.dec()]) happyList.removeAt(index)
        }
        
        return  happyList.toIntArray()
    }
}
