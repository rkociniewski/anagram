package rk.powermilk

/**
 * Function to check if a word is anagram (char method).
 *
 * @property word word to check if it is an anagram.
 * @return[Boolean] `true` if a word is anagram, `false` otherwise.
 */
fun String.isAnagram(word: String): Boolean {
    if (length != word.length) {
        return false
    }

    return lowercase().chars().sorted().toArray().contentEquals(word.lowercase().chars().sorted().toArray())
}

/**
 * Function to check if a word is anagram (list method).
 *
 * @property word word to check if it is an anagram.
 * @return[Boolean] `true` if a word is anagram, `false` otherwise.
 */
fun String.isAnagramList(word: String): Boolean {
    if (length != word.length) {
        return false
    }

    return lowercase().toList().sorted().containsAll(word.lowercase().toList().sorted())
}

/**
 * Function to check if a word is anagram (equality check method).
 *
 * @property word word to check if it is an anagram.
 * @return[Boolean] `true` if a word is anagram, `false` otherwise.
 */
fun String.isAnagramListEquals(word: String): Boolean {
    if (length != word.length) {
        return false
    }

    return lowercase().toList().sorted() == word.lowercase().toList().sorted()
}

/**
 * Checks whether the current string is an anagram of the given [word],
 * ignoring case and all non-letter characters (e.g. spaces, punctuation, digits).
 *
 * This method sanitizes both strings by:
 * - Converting them to lowercase.
 * - Removing all non-letter characters.
 * - Sorting the remaining characters.
 * - Comparing the resulting lists.
 *
 * Useful for comparing sentences or phrases as anagrams, e.g. ignoring whitespace and punctuation.
 *
 * Example:
 * ```
 * "rail safety".sanitizedAnagramOf("fairy tales") // returns true
 * "a man, a plan, a canal, panama".sanitizedAnagramOf("panama canal plan a man a") // returns false
 * ```
 *
 * @param word The string to compare against.
 * @return[Boolean] `true` if the sanitized versions are anagrams, `false` otherwise.
 */
fun String.sanitizedAnagramOf(word: String): Boolean {
    fun sanitize(s: String) = s.lowercase().filter { it.isLetter() }.toList().sorted()
    return sanitize(this) == sanitize(word)
}
