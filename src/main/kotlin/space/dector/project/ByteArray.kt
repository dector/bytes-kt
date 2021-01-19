package space.dector.project


interface ByteArray {

    val capacity: Int
    val size: Int

    fun pushByte(b: Byte): Unit = TODO()
}
