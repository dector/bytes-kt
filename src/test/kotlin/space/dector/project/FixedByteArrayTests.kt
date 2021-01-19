package space.dector.project

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class FixedByteArrayTests : StringSpec({

    "Empty array" {
        val arr = FixedByteArray(0)

        arr.size shouldBe 0
        arr.capacity shouldBe 0
    }
})
