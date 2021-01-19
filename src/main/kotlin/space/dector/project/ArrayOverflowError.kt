package space.dector.project


class ArrayOverflowError(
    val capacity: Int,
    val requestedCapacity: Int,
) : Error("Couldn't push data to array: requested capacity ($requestedCapacity) is more than available ($capacity)")
