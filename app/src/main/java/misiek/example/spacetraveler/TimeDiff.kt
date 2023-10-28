package misiek.example.spacetraveler

import java.util.*

object TimeDiff {
    /**
     * (For testing purposes)
     *
     */
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val d1 = Date()
//        try {
//            Thread.sleep(750)
//        } catch (e: InterruptedException) { /* ignore */
//        }
//        val d0 = Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24 * 3) // About 3 days ago
//        val diff = getTimeDifference(d0, d1)
//        System.out.printf("Time difference is %d day(s), %d hour(s), %d minute(s), %d second(s) and %d millisecond(s)\n",
//            diff[0], diff[1], diff[2], diff[3], diff[4])
//        System.out.printf("Just the number of days = %d\n",
//            getTimeDifference(d0, d1, TimeField.DAY))
//    }

    /**
     * Calculate the absolute difference between two Date without
     * regard for time offsets
     *
     * @param d1 Date one
     * @param d2 Date two
     * @param field The field we're interested in out of
     * day, hour, minute, second, millisecond
     *
     * @return The value of the required field
     */
    fun getTimeDifference(d1: Date?, d2: Date?, field: TimeField): Long {
        return getTimeDifference(d1, d2)[field.ordinal]
    }

    /**
     * Calculate the absolute difference between two Date without
     * regard for time offsets
     *
     * @param d1 Date one
     * @param d2 Date two
     * @return The fields day, hour, minute, second and millisecond
     */
    fun getTimeDifference(d1: Date?, d2: Date?): LongArray {
        val result = LongArray(5)
        val cal: Calendar = Calendar.getInstance()
        cal.setTimeZone(TimeZone.getTimeZone("UTC"))
        cal.setTime(d1)
        val t1: Long = cal.getTimeInMillis()
        cal.setTime(d2)
        var diff: Long = Math.abs(cal.getTimeInMillis() - t1)
        val ONE_DAY = 1000 * 60 * 60 * 24
        val ONE_HOUR = ONE_DAY / 24
        val ONE_MINUTE = ONE_HOUR / 60
        val ONE_SECOND = ONE_MINUTE / 60
        val d = diff / ONE_DAY
        diff %= ONE_DAY.toLong()
        val h = diff / ONE_HOUR
        diff %= ONE_HOUR.toLong()
        val m = diff / ONE_MINUTE
        diff %= ONE_MINUTE.toLong()
        val s = diff / ONE_SECOND
        val ms = diff % ONE_SECOND
        result[0] = d
        result[1] = h
        result[2] = m
        result[3] = s
        result[4] = ms
        return result
    }

    fun printDiffs(diffs: LongArray) {
        System.out.printf("Days:         %3d\n", diffs[0])
        System.out.printf("Hours:        %3d\n", diffs[1])
        System.out.printf("Minutes:      %3d\n", diffs[2])
        System.out.printf("Seconds:      %3d\n", diffs[3])
        System.out.printf("Milliseconds: %3d\n", diffs[4])
    }

    enum class TimeField {
        DAY, HOUR, MINUTE, SECOND, MILLISECOND
    }
}