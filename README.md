# Anagram Checker in Kotlin

This project provides simple extension functions in Kotlin to check whether two strings are anagrams of each other.

## Features

- Implemented in **Kotlin 2.1.21**
- Three different methods to check for anagrams:
    - `isAnagram`: Uses character arrays and stream sorting
    - `isAnagramList`: Uses sorted lists and `containsAll`
    - `isAnagramListEquals`: Uses sorted lists and equality comparison

## Getting Started

Clone the repository or copy the implementation from the `rk.powermilk` package.

### Example Usage

```kotlin
fun main() {
    val first = "listen"
    val second = "silent"

    println(first.isAnagram(second))           // true
    println(first.isAnagramList(second))       // true
    println(first.isAnagramListEquals(second)) // true
}
````

## Function Descriptions

### `String.isAnagram(word: String): Boolean`

Compares two strings by converting them to lowercase, converting to character arrays, sorting them, and checking for
equality.

---

### `String.isAnagramList(word: String): Boolean`

Converts strings to lowercase, transforms them into lists, sorts them, and uses `containsAll` to determine if all
characters match.

---

### `String.isAnagramListEquals(word: String): Boolean`

Same as `isAnagramList`, but compares sorted lists directly for full equality.

## Requirements

* Kotlin 2.1.0 or newer
* JDK 17 or newer (recommended)

## License

This project is licensed under the MIT License

---

Feel free to contribute, open issues, or suggest improvements.
