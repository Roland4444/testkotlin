import kthello2.*

import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertEquals

class Kthello2KtTest {
    @Test
    fun testmax_calculate() {
        assertEquals(3,max_calculate(3,1))
    }

    @Test
    fun testmin_calculate() {
        assertEquals(1,min_calculate(3,1))
    }

    @Test
    fun testternar(){
        assertEquals(3, ternar(5,4))
    }



}