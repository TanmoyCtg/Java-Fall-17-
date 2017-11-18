# Java-Fall-17-
Hi, I am joy.Student of a American International university Bangladesh(AIUB).I take java in my fall semester. I saved all my semester and personal code here. I also describe how i solve or write this code. So if anyone interested to change my code, you can and you may also add your code.

Introduction
I never programmed in java. Java is pure Object oriented language. My course teacher is really great. I really like java now. Day to day life, I try to explore java. 

Java is a programming language. Java is class-based, object-oriented. That means in java what you write, you must need a class and then you need object. What is object and class I will discuss it later.

Inventor: James Gosling

How to declare a class

In java, everything we need to write inside class. Class is like a box. Imagine class is box. In this box so many things you put. Those thing are object.So, A class is made up group of objects. You can not see the class in real life i mean physical. It's logical entity.

Inside class you declare 
#variable 
#methods
#constructor
#nested class

Now let's Jump into the class Syntax:

class CLASS_NAME{
  varibale
  methods
}

class Person{
  String name;
  int age;

}

Person is a class name. inside curly braces we declare variable. What is the variable name? 1. name 2. age

Let's see before name i use String.What is String? name is a String type variable.

String name = "joy"; String name = ""
inside quotation or only quotation , when you declare that is String. String always declare inside the quotation.
Then age is integer type variable. We all know that,we represent age in number. 

I will write more about datatype in later.
------Exercise1---------------

public class Person{
String name;
int age;

public static void main(String[] args){
Person joy = new Person(); 
System.out.println(joy.name);
System.out.println(joy.age);
}
}
run this program in https://www.jdoodle.com/online-java-compiler or eclipse or intellij. whatever you like
Output:
null
0








