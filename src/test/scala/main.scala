object main {
  def main(args: Array[String]): Unit = {
    def replacementArray(nums: Array[Int]) = {
      for (i <- nums.indices if i % 2 == 1) {
        val temp = nums(i - 1)
        nums(i - 1) = nums(i)
        nums(i) = temp
      }
      nums
    }
    replacementArray(Array(1, 2, 3, 4, 5))
  }
}