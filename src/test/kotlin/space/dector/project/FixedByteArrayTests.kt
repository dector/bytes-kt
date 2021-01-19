package space.dector.project

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class FixedByteArrayTests : StringSpec({

    "Empty array" {
        val arr = FixedByteArray(0)

        arr.size shouldBe 0
        arr.capacity shouldBe 0
    }

    "Non-empty array" {
        val arr = FixedByteArray(5)

        arr.size shouldBe 0
        arr.capacity shouldBe 5
    }

    "Overflow array" {
        val arr = FixedByteArray(3)

        arr.pushByte(0.toByte())
        arr.pushByte(0.toByte())
        arr.pushByte(0.toByte())

        arr.size shouldBe 3
        arr.capacity shouldBe 3

        val err = shouldThrow<ArrayOverflowError> {
            arr.pushByte(0.toByte())
        }

        err.capacity shouldBe 3
        err.requestedCapacity shouldBe 4
    }
})
