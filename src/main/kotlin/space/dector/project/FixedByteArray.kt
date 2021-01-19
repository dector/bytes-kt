package space.dector.project


class FixedByteArray(
    capacity: Int
) : ByteArray {

    private val data = ByteArray(capacity)
    private var pointer = 0

    override val capacity = capacity
    override val size get() = pointer

    override fun pushByte(b: Byte) {
        val newSize = size + 1

        if (newSize > capacity)
            throw ArrayOverflowError(
                capacity = capacity,
                requestedCapacity = newSize,
            )

        data[pointer] = b
        pointer++
    }
}
