# NetBeansWork

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
 
----------------------------------------------------------------------------------------------------------------

java is an object oriented programming language that was developed by James Gosling At SUN Micro-System.
SUN:- Stanford University Network
=>object-oriented:- bc it uses object and class with the help of these concept we can implement any real world pro
=>Object :- is a real world entity which consists of state and behavior.
State reprsent value of an object
Ex:- pen is an object
name and color reprsent value of an object (state)
behavior reprsent functionality of an object
Ex:- writting something with pen
=> object contains properties (variables) and behavior(function / method)=>class:- is a logical thing or blue print but not physically exists.
class student
{
}
flower
rose, marry gold is an object of class flower
furniture
table chair is an object of class furniture
13(91931) OneDrive\Desktop\Dero.java-Notepad•
Search
View Encoding Language Settings Macro Run Plugins
Window
arresca?
GREa
23 E Demo java 83 Ba Student
public static void main(String[] args)
Q1. WHY MAin method delcared as public
And:- to call main) from every where by JVM so main is delcared as public
Q2.
-static
Ans:- to call main() method without creating any object by IVm so ..
q3.
-void
it doesn't return any types so-
=>String[] args:- it will take command line argument
=>String:- it wil take any type of data
I
=>args is a String type variable
public static void main(String[] args)
- (String [largs)
-(String args!])
-(String[] thinknext)
- (String[] t)
--(String..
-. args)l






