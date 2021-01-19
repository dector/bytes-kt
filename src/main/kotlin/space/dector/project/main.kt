package space.dector.project


fun main() {
    println("It works!")
}

interface ByteArray {
    val size: Int
}

class FixedByteArray(
    size: Int
) : ByteArray {

    // TODO

    override val size = size
}

class DynamicByteArray(
    initialSize: Int
) : ByteArray {

    // TODO

    override val size = initialSize
}
