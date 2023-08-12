# Enumaration
An enumeration in Java is a special data type 
which contains a set of predefined constants. 

## Enum
Enum is Java keyword.

## Declaration
we use keyword **enum**. similar to how you'd create 
a class using the class keyword.
<br><br>
`public enum colors{
    RED,
    BLUE, 
    BLACK, ...
}`
<br><br>
`enum binary{
    1, 0;
}`
<br><br>
`enum daysOfWeek{
    SUNDAY, MONDAY, TUESDAY, 
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
`
<br>
Imagine the situation where we would like to save date information that some
workers joined a company....
<br>
we could do a method like this:
<br>`joinedMonth(6)` <br>
but, notice that "3" doesn't say anything. What's 3? One day? One Month?
If we write like this:<br>
`jonedMonth(June)` it's clearer.
