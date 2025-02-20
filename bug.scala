```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // This will throw an IndexOutOfBoundsException if you try to access the element at index 3
  println(list(3))
}
```