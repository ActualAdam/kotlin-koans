
class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        private var pos = start

        override fun next(): MyDate {
            if (!hasNext()) throw NoSuchElementException()
            val next = pos
            pos = pos.followingDate()
            return next
        }

        override fun hasNext(): Boolean {
            return pos <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}