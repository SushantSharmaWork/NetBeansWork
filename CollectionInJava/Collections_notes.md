# Collections in java:

## Why Collection?
If you want to store 1000 values then we use
```Int a = 10,b = 20, c= 30;```
**TO OVERCOME THIS PROBLEM WE HAVE ARRAY

Array: ```int arr[1000]={10,20,30};```
**Cons:**
- Array store similar type
- Fixed size
**TO OVERCOME THIS PROBLEM WE HAVE COLLECTION**
## COLLECTION
Collection is an interface which is used to represent group of individual object into a single unit is known as Collection.
Collection Frame work is a set of predefined classes and interfaces, which is used to perform some operation like
insertion, deletion, searching etc.

- cursor:- if u want to get the object one by one from the collection is known as cursor
*1. Iterator*:- is an interface which is used to retrieve the object from the collection only forward direction. it a universal cursor bcz
it is applicable all the collection classes.
Methods:-
1. public boolean hasNext() :- check object available or not
2. public object next() :- get the object from the collection

*2.ListIterator*:- is an interface which is used to retrieve the object from the collection either forward ,backward direction or both. it is not
a universal cursor bez it is applicable only List interface classes like ArrayList,LinkedList,Vector and Stack
Methods:-
Forward direction
1. ```pùblic boolean hasNext()```
2. ```public object next()```
Backward Direction
3. ```public boolean hasPrevious)```
4. ```public object previous )```

*3. Enumeration:*- is a legacy class(old class) present in JDK 1.2 which is used to retrieve the object from the collection only forward direction.
 applicable only in vector and stack.
1. ```public boolean hasMoreElement()```
2. ```public object nextElement```
4. ```for each loop```
