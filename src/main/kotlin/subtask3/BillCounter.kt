package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.filterIndexed { index, i -> index != k}.sum()
        return if(sum / 2 - b == 0)  "bon appetit"
                else (b - sum / 2 ).toString();
    }
}
