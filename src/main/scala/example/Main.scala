package example

import scala.::
import scala.Console.println
import scala.collection.mutable

object Main extends App {

  var ages = List(42, 61, 29, 64)
  println(s"The oldest person is ${ages.max}")

  var new_ages = ages :+ 10
  println(s"The youngest person is ${new_ages.min}")

  /*println("dousite")
  var uki = 0

  var routeTotalTime = 1
  ages.foreach(
      age => {
        var cal = routeTotalTime + age
        println(cal)
      }
  )*/

}