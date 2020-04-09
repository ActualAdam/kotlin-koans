data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return this.toString().toInt().compareTo(other.toString().toInt())
    }

    override fun toString(): String {
        return year.toString() + month.toString() + dayOfMonth.toString()
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
