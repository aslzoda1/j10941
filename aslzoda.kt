// 1. Greet User
fun main() {
    println("🚀 Aslzoda Bozorboyeva - Welcome to Kotlin World!")
    executeMathUtils()
    runStringProcessor()
    collectionDemo()
}

// 2. Mathematical Utility
fun executeMathUtils() {
    val numbers = listOf(5, 12, 8, 23, 42)
    val maxNumber = numbers.maxOrNull()
    val average = numbers.average()
    println("📊 Max: $maxNumber, Average: $average")
}

// 3. String Processor
fun runStringProcessor() {
    val text = "Kotlin is expressive and concise"
    val reversed = text.reversed()
    val wordCount = text.split(" ").size
    println("🔤 Reversed: '$reversed' | Words: $wordCount")
}

// 4. Custom Filter Logic
fun collectionDemo() {
    val developers = listOf("Aslzoda", "Alex", "John", "Amelia")
    val filtered = developers.filter { it.startsWith("A") }
    println("👥 Team members starting with 'A': $filtered")
}