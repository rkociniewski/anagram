import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramTest {
    @Test
    fun `should check if two words are anagrams`() {
        assertTrue("english".isAnagram("shingle"))
        assertTrue("english".isAnagramList("shingle"))
        assertTrue("english".isAnagramListEquals("shingle"))
    }

    @Test
    fun `should check if two words aren't anagrams (different size)`() {
        assertFalse("english".isAnagram("shinglek"))
        assertFalse("english".isAnagramList("shinglek"))
        assertFalse("english".isAnagramListEquals("shinglek"))
    }

    @Test
    fun `should check if two words aren't anagrams`() {
        assertFalse("english".isAnagram("shinglk"))
        assertFalse("english".isAnagramListEquals("shinglk"))
        assertFalse("english".isAnagramList("shinglk"))
    }
}
