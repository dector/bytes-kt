package space.dector.project


class DynamicByteArray(
    initialCapacity: Int,
    private val capacityDelta: Int = 128,
) : ByteArray {

    private var data = ByteArray(initialCapacity)
    private var pointer = 0

    override val capacity get() = data.size
    override val size get() = pointer

    override fun pushByte(b: Byte) {
        val newSize = pointer + 1

        if (newSize > data.size) {
            val newData = ByteArray(data.size + capacityDelta)
            this.data.copyInto(newData)
            this.data = newData
        }

        data[pointer] = b
        pointer++
    }

}
