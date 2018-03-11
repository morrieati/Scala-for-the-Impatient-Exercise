import java.awt.datatransfer._

import scala.collection.JavaConverters._
import scala.collection.mutable._
import scala.util.Random

// 1
def generateRandomArray(n: Int) =
  for (i <- 0 to n) yield new Random().nextInt(n)
generateRandomArray(10)

// 2
def replacementArray(nums: Array[Int]) = {
  for (i <- nums.indices if i % 2 == 1) {
    val temp = nums(i - 1)
    nums(i - 1) = nums(i)
    nums(i) = temp
  }
  nums
}
replacementArray(Array(1, 2, 3, 4, 5))

// 3
def generateNewReplacementArray(nums: Array[Int]) =
  for (i <- nums.indices) yield if (i % 2 == 1) nums(i - 1) else if (i == nums.length - 1) nums(i) else nums(i + 1)
generateNewReplacementArray(Array(1, 2, 3, 4, 5))

// 4
def seperateArray(nums: Array[Int]) = {
  val positiveArray = for (elem <- nums if elem > 0) yield elem
  val negtiveArray = for (elem <- nums if elem <= 0) yield elem
  positiveArray ++ negtiveArray
}
seperateArray(Array(-1, 1, -2, 2, 3, -3, 4, 5))

// 5
def calculateAverage(nums: Array[Double]) = nums.foldLeft(0.0)(_ + _) / nums.length
calculateAverage(Array(1, 2, 3, 4, 5, 6))

// 6
def reverseArray(nums: Array[Int]) = for (i <- nums.indices) yield nums(nums.length - 1 - i)
reverseArray(Array(1, 2, 3, 4, 5))

// 7
Array(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5).distinct

// 9
val americaTimeZones = java.util.TimeZone.getAvailableIDs().filter(_.startsWith("America/"))
val sortedTimeZones = americaTimeZones.map(_.substring(8)).sorted

// 10
val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val result: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor).asScala