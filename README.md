# Anagram Checker in Kotlin

[![version](https://img.shields.io/badge/version-1.0.13-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/anagram/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/anagram/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/anagram/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/anagram)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.20-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.10-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

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

* Kotlin 2.1.21 or newer
* JDK 21 or newer (recommended)

## License

This project is licensed under the MIT License.

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Rafał Kociniewski** - [PowerMilk](https://github.com/rkociniewski)
