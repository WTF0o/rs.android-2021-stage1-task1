package subtask2

import kotlin.math.max

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        return  intArrayOf(input.filter { it != input.max()}.sum(), input.filter { it != input.min()}.sum())
    }
}
