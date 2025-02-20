```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Safe access using get method
  println(list.get(3).getOrElse(0)) //Returns 0 if index is out of bounds

  //Safe access by checking size
  if (list.size > 3) {
    println(list(3))
  } else {
    println("Index out of bounds")
  }

  //Using Try-catch block
  try {
    println(list(3))
  } catch {
    case e: IndexOutOfBoundsException => println("Index out of bounds: "+ e.getMessage)
  }
}
```