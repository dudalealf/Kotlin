// [X] See hard-wired.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest: StringSpec() {

    init {
        "should return the closest value to 0" {
            hiker.answer(listOf(1,5,20,70,120,670)) shouldBe 1
        }
        "should return the positive int if there's a tie" {
            hiker.answer(listOf(-1,1,5,20,70,120,670)) shouldBe -1
        }
    }
}
