import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
data class IntervalQuantity(
        val timeInterval: TimeInterval,
        val quantity: Int
)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(intervalQuantity: IntervalQuantity): MyDate = this.addTimeIntervals(intervalQuantity.timeInterval, intervalQuantity.quantity)

operator fun TimeInterval.times(multiplicand: Int): IntervalQuantity = IntervalQuantity(this, multiplicand)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
