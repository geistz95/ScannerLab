




Chapter 10 Notes

MATH methods do not need to know the states of any variables/instanced values, it treats everything the same

Static methods can be used by every classes.
Static classes do not get created, instead the functions can be called without creating the class.
You're just calling the reference to that function
The constructors of a static class are private, so you cannot make any new, in instance "Math" objects

Static methods MUST use static variables
They cannot use instanced variables or non static methods also
Static variables are used by every class in the program, it is the same value for every class unlike instanced variables

Static variables are initialized before any instance of the object is created
Static final variables are consistent immutable values.
They must contain a value, or java will point to the error

FINAL keyword:
Cannot change value
Cannot Override
Cannot extend (classes)

Wrapping Primitives :
int = Integer
double = Double
char = Character
long = Long
byte = Byte
boolean = Boolean
float = Float
short = Short


Unwrapping wrappers :
using (primType) vairable= object.(primtype)value();

Autoboxing : You can specify which objects you want to put into, for example an ArrayList without declaring the type of the value!
It considers both prim and wrapper (it automatically converts it)

Wrappers have utility methods of the type.


Number formatting using "%, d", 100000, you can put %, d and then put in the value later

 % means insert argument here, the ",xx" is the formatting of the insert

the syntax of %

% [argument number] [flags] [width] [.precision] type

The type is mandatory, also thw %

d = decimal

f = float

x = hexadecimal

c = character

t = times  
	//  c - complete date
	//  r - just time
	//  A - Weekday
	//  B = Month
	//  d = day of month
You can use < to repeat arguments

java.util.Date is outdated
use
java.util.Calender

When making a new calender use  Calender cal = Calender.getInstance()

.set = set year, month, day, hour, min  (year starts from index 0)

.setTimeInMillis(set time in millisecs

.add (add days to specific'd value)

.roll (adds days but does not change the month)

.set = you're just setting the day


More than one argument, ordering matters!

You can do static imports

use - shorten commands

if you import System.out you can just use out.println();



