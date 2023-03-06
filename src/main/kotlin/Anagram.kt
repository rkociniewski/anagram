fun String.isAnagram(word: String): Boolean {
    if (length != word.length)
        return false

    return lowercase().chars().sorted().toArray().contentEquals(word.lowercase().chars().sorted().toArray())
}

fun String.isAnagramList(word: String): Boolean {
    if (length != word.length)
        return false

    return lowercase().toList().sorted().containsAll(word.lowercase().toList().sorted())
}

fun String.isAnagramListEquals(word: String): Boolean {
    if (length != word.length)
        return false

    return lowercase().toList().sorted() == word.lowercase().toList().sorted()
}
