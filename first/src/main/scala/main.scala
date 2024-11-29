object StringProcessor {

  def processStrings(numbers: List[String], condition: String => Boolean): List[String] = {
    numbers.filter(condition) }
// Используем функцию высшего порядка 'processStrings' она принимает
// в качестве аргумента функцию 'condition', которая отбирает элементы списка нужной длинны
    val goodNumbers: List[String] = processStrings(List("apple", "cat", "banana", "dog", "elephant"), x => x.length > 3)


  def main(args: Array[String]): Unit = {
    val strings = List()
// Для вывода элементов списка используем функцию 'map'
// с помощью которой переводим каждый элемент в верхний регистр
    println("Processed strings: " + goodNumbers.map(x => x.toUpperCase))
  }
}