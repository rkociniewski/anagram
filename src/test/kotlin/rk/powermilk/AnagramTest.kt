package rk.powermilk

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class AnagramTest {
    @ParameterizedTest
    @MethodSource("validAnagramPairsProvider")
    fun `should detect valid anagrams`(input: String, candidate: String) {
        assertTrue(input.isAnagram(candidate))
        assertTrue(input.isAnagramList(candidate))
        assertTrue(input.isAnagramListEquals(candidate))
    }

    @ParameterizedTest
    @MethodSource("invalidAnagramPairsProvider")
    fun `should detect invalid anagrams`(input: String, candidate: String) {
        assertFalse(input.isAnagram(candidate))
        assertFalse(input.isAnagramList(candidate))
        assertFalse(input.isAnagramListEquals(candidate))
    }

    @Test
    fun `should detect sanitized anagrams`() {
        assertTrue("rail safety".sanitizedAnagramOf("fairy tales"))
        assertFalse("a man, a plan, a canal, panama".sanitizedAnagramOf("panama canal plan a man a"))
    }

    private fun validAnagramPairsProvider(): Stream<Arguments> = Stream.of(
        Arguments.of("english", "shingle"),
        Arguments.of("Listen", "Silent"),
        Arguments.of("a", "a"),
        Arguments.of("aabbcc", "abcabc"),
        Arguments.of("", ""),
        Arguments.of("😀😃😄", "😃😄😀"), // emoji anagram
        Arguments.of("àéîöü", "öüîéà") // Unicode letters
    )

    private fun invalidAnagramPairsProvider(): Stream<Arguments> = Stream.of(
        Arguments.of("english", "shinglek"),
        Arguments.of("english", "shinglk"),
        Arguments.of("a", "b"),
        Arguments.of("abc", "abd"),
        Arguments.of("😀😃😄", "😀😃😅"), // emoji not anagram
        Arguments.of("àéîöü", "öüîéa"), // one letter off
        Arguments.of("test", "tteś") // different unicode char
    )
}

