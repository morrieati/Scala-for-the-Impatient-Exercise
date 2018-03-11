// 1
def signum(x: Int) = {
  if (x > 0) 1
  else if (x == 0) 0
  else -1
}

signum(10)
signum(0)
signum(-5)

// 2
{}

// 3
var x: Unit = {}
var y = 0
x = y = 1

// 4
for (i <- 0 to 10) println(10 - i)

// 5
def countdown(n: Int): Unit = for (i <- 0 to n) println(n - i)
countdown(5)

// 6
var z: Long = 1
for (c <- "Hello") z *= c
z

// 7
"Hello".foldLeft(1L)(_ * _.toLong)

// 8
def product(str: String) = {
  var x: Long = 1
  for (c <- str) x *= c
  x
}
product("Hello")

// 9
def recursiveProduct(str: String, product: Long = 1): Long = {
  val temp = product * str.head.toLong
  if (str.length == 1) temp
  else recursiveProduct(str.tail, temp)
}
recursiveProduct("Hello")

// 10
