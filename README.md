# NetBeansWork

----------------------------------------------------------------------------------------------------------------

java is an object oriented programming language that was developed by James Gosling At SUN Micro-System.
SUN:- Stanford University Network
 =>object-oriented:- bc it uses object and class with the help of these concept we can implement any real world pro
 =>Object :- is a real world entity which consists of state and behavior.

State  reprsent value of an object
Ex:- pen is an object
name and color reprsent value of an object (state)
behavior reprsent functionality of an object

Ex:- writing something with pen
 =>object contains properties (variables) and behavior(function / method)=>class:- is a logical thing or blue print but not physically exists.
class student
{
}
flower
rose, marry gold is an object of class flower
furniture
table chair is an object of class furniture
View Encoding Language Settings Macro Run Plugins

public static void main(String[] args)
Q1. WHY MAin method delcared as public
And:- to call main) from every where by JVM so main is delcared as public
Q2. -static
Ans:- to call main() method without creating any object by IVm so ..
Q3. -void
It doesn't return any types so-
=>String[] args:- it will take command line argument
=>String:- it wil take any type of data
=>args is a String type variable
public static void main(String[] args)
- (String [largs)
- (String args[])
-(String[] thinknext)
- (String[] t)

--------------------------------------------------------------------------------
This keyword:

* this is used to refer current class instance method
* this can be passed as an argument in the method alin
```
class Demo
{
vold m1()
this.info(l, 'aman');
System.out.println ("hello"));
vod add (nt ant b)
(
int c= a•b;
Systom.out.println(c):
this.m1();
)
void info (nt if,Sting name)
System.out.println(id+* *• name),
)
public static void main (String[] args)
Demo d= new Demo ():
d.add(23,12):
}
```
------------------------------------------------
```
Class Student
I/instance varable
int rol;
Stg name/
intage)
Moat feel
state String dy-"COC))
//parameterized construtor
Student (int rol,String name, int age,/oat (ce)
(
this.rolls rol
this name = name;
this.age= age
thislee=fee,
/Instance method
void info ()
(
System.out.prath(role* "Iname+
)
public stabe void main (Strng() arge)
(
Student s1-pew Student(I, aman",2),1200 551)
Student s2= new Student (s1):
```
--------------------------------------------------

Database in AWT:
=>How to connect database
step 1:- Load the Driver
I
Class.forName("com.mysql.jdbc.Driver*);
O 0
* Class is a also class
* forName () is a predefined methof of Driver class
* com.mysql.jdbc.Driver is Driver implementation path
* Driver is a class/interface
WN
step 2:- Established Connection
Connection cn=DriverManager-getConnection("jdbc:mysql://localhost:3306/databasename®,"username",*password*);

* Connection is a predefined interface
* DriverManager is predefined class
* getConnection() is a predefined method of Connection interface
* jdbc is a API
* mysql is a database
* localhost is a local server
* 3306 is a port number

step 3:- create Statement

Statement s=cn.createStatement();
OR
PreparedStatementp=cn.prepareStatement();
* Statement and PreparedStatement is a predefined interface

* if u want to store image and file in database then must be use PreparedStatement 
with the help of Statement interface we can't do this

* Statement interface compile each and every time where PreparedStatement compile only once.

step 4:- Execute Query
* if u want to insert/update/delete record in database
int ¡=p.executeUpdate ();
* if u want to get/reteive/fetch record from the database
ResultSetr=p.executeQuery();
* ResultSet is an interface
step 5:- close connection
En.close ();


 






