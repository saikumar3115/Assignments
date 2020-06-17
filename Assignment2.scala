object Assignment2 {
  def add(x: Int, y: Int): Int = {
    x + y
  }
  //Its pure function, inputs solely determines the output

//  b.
  var x = 33
  def changeStuff: Unit = {
    x = x + 10
  }
  //It not a pure function, as x is declared as global variable, and if x changes output of the function also changes.
  //MoreOver, there is no return statement

  def fullName(firstName: String, lastName: String): String = {
    s"$firstName $lastName"
  }
  fullName("Scala","Spark")
  //Its pure function

  //d.
  def loco: Unit = {
    println("toma 4loco!")
  }
  loco
  //It's Pure function,

  //2)What does the following
  def building = {
    "tall"
  }
  println(building)
  //When the function is defined, Scala compiler it infers type of the function building as String, and when we try to print the output it returns "tall"

  def crazy(number: Int) = {
    number + 3
  }
  println(crazy("sai"))

  //Throws Type Mismatch,
  //In function signature parameter is defined as Int, And when we pass the String it will be expect the type Int as input to the fuction

  def singSong(times: Int): String = {
    s"I'm going to sing ${times.toString} times"
  }
  println(singSong(5))
  //The function expect the Int as the input, until we pass the argument as Int we get the output as "I'm going to sing 10 times" if we pass 10 as input

  def fullName(first: String, last: String = "balvin"): String = {
    s"$first $last"
  }
  //Since the second parameter is optional, in case of println(fullName("j") the output will be j balvin, in case if we give inputs as //println(fullname("sai","kumar")) its prints "sai kumar"

  def mathFun(x: Int, y: Int = 99): Int = {
    x * y
  }
  println(mathFun(4, 5))
  //output will be 9, as y is the optional parameter

  def theBest(category: String, thing: String): String = {
    s"The best type of $category is $thing"
  }
  println(theBest(thing = "Squirtle", category = "Pokemon"))
  //The best type of $Pokemon is $Squirtle"
  //since these are named arguments, and we pass the parameter name while passing the input

  def sumPrintNumbers(x:Int):Int={
    var y=0;
    for(z<-x to x+9){
      y=y+z
    }
    return y
  }


  def getAgeCategory(x:Int):String={
    x match {
      case x if x<=10 => "kid"
      case x if x<=20 || x>=10 => "teen"
      case x if x<=60 || x>=20 => "adult"
      case x if x>=60 => "old age"
      case _ => "Invalid Entry"
    }
  }

}
