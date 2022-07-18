package com.learning.driver

class TestClass (a:Int,b:Int){
  def sum(): Unit ={
    println(a+b)
  }
}

object a{
  def main(args: Array[String]): Unit = {
    val obj=new TestClass(1,2)
    obj.sum()
  }

}