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
