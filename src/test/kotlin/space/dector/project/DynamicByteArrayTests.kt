package space.dector.project

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class DynamicByteArrayTests : StringSpec({

    "Empty array" {
        val arr = DynamicByteArray(0)

        arr.size shouldBe 0
        arr.capacity shouldBe 0
    }

    "Overflow array" {
        val arr = DynamicByteArray(3, 5)

        arr.pushByte(0.toByte())
        arr.pushByte(0.toByte())
        arr.pushByte(0.toByte())

        arr.size shouldBe 3
        arr.capacity shouldBe 3

        arr.pushByte(0.toByte())

        arr.size shouldBe 4
        arr.capacity shouldBe 8
    }
})
