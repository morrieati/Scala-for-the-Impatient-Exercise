object main {
  def main(args: Array[String]): Unit = {
    def generateNewReplacementArray(nums: Array[Int]) =
      for (i <- nums.indices) yield if (i % 2 == 1) nums(i - 1) else if (i == nums.length - 1) nums(i) else nums(i + 1)
    generateNewReplacementArray(Array(1, 2, 3, 4, 5))
  }
}