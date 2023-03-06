import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramTest {
    @Test
    fun `should check if two words are anagrams`() {
        assertTrue("kajak".isAnagram("kajka"))
        assertTrue("kajak".isAnagramList("kajka"))
        assertTrue("kajak".isAnagramListEquals("kajka"))
    }

    @Test
    fun `should check if two words aren't anagrams (different size)`() {
        assertFalse("kajk".isAnagram("kajka"))
        assertFalse("kajk".isAnagramList("kajka"))
        assertFalse("kajk".isAnagramListEquals("kajka"))
    }

    @Test
    fun `should check if two words aren't anagrams`() {
        assertFalse("kajak".isAnagram("kajta"))
        assertFalse("kajak".isAnagramListEquals("kajta"))
        assertFalse("kajak".isAnagramList("kajta"))
    }
}