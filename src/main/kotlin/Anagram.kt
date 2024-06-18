/**
 * Function to check if a word is anagram (char method).
 *
 * @property word word to check if it is an anagram.
 * @return[Boolean] true if word is anagram, false otherwise.
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
 * @return[Boolean] true if word is anagram, false otherwise.
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
 * @return[Boolean] true if word is anagram, false otherwise.
 */
fun String.isAnagramListEquals(word: String): Boolean {
    if (length != word.length) {
        return false
    }

    return lowercase().toList().sorted() == word.lowercase().toList().sorted()
}
