object Assignment3 {
  def triple(x: Int): Int = x * 3
  val tripleCopy: (Int) => Int = triple
  println(tripleCopy(5))
  //output 5*3= 15
  //tripleCopy is the immutable object where we are assigning the function to it which has the simiar
  //signature

  def m(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
  val max: (Int, Int) => Int = m
  println(max(88, 99))
   //output 99
  //max is the immutable object where we are assigning the function to it which has the simiar
  // signature,

  var fullName = (first: String, last: String) => {
    s"$first $last"
  }
  println(fullName("bob", "loblaw"))
//output : "bob loblaw"
val hi = () => "howdy!"
  println(hi())
  //output : "howdy!"
  //Anonymous function is assigned

  def play(thing: String): String = {
    s"Let's play with $thing"
  }
  def funify(thing: String, f: String => String): String = {
    f(thing) + " and have fun"
  }
  println(funify("cats", play))
  //output "Let's play with cats and have fun"
  //play is the function which takes String as argument, funify is the higher order function which take play as the argument

  def toUpper(x:String):String={
    x.toUpperCase
  }
  def toLower(x:String):String={
    x.toLowerCase
  }
  def formatNames(name:String,func:String=>String):String={
    func(name)
  }
  println(formatNames("Scala",toUpper))
  //output: "SCALA"
  println(formatNames("Spark",toLower))
  //output : "spark"
  println(formatNames("BigData",toUpper))
  //output : "BIGDATA"

}
