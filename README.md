Arrays in Java
1. Introduction
An array in Java is a data structure that allows storing multiple elements of the same type in a contiguous block of memory. Arrays provide a simple and efficient way to group related data and access them using an index. They are commonly used when the number of elements to store is known and fixed.

2. Array Declaration
Array declaration in Java specifies the data type of the array and the variable that will hold the array. The syntax for array declaration is:

java
Copy code
dataType[] arrayName; 
// or 
dataType arrayName[];
For example:

java
Copy code
int[] numbers; 
char[] characters;
3. Array Creation
After declaring an array, memory for the array must be allocated. This is done using the new keyword:

java
Copy code
arrayName = new dataType[size];
For example:

java
Copy code
numbers = new int[5];
This creates an array of size 5 capable of storing integers.

4. Array Initialization
Once created, arrays can be initialized with values. This can be done either one element at a time or all at once:

One element at a time:

java
Copy code
numbers[0] = 10;
numbers[1] = 20;
All at once:

java
Copy code
int[] numbers = {10, 20, 30, 40, 50};
5. Array Declaration, Creation, and Initialization in a Single Line
You can combine declaration, creation, and initialization into one line:

java
Copy code
int[] numbers = {10, 20, 30, 40, 50};
This is a concise way to create and populate an array at the same time.

6. length vs length()
length: This is a property of arrays that provides the total number of elements in the array. For example:

java
Copy code
int size = numbers.length;
length(): This is a method used with String objects to get the length of the string. For example:

java
Copy code
int size = "hello".length();
The two are different in usage and purpose.

7. Anonymous Arrays
An anonymous array is created without assigning it to a variable and is used for immediate tasks. For example:

java
Copy code
sum(new int[] {1, 2, 3});
Here, an array is created and passed directly to a method.

8. Array Element Assignments
You can assign values to specific elements in an array using their indices. For example:

java
Copy code
numbers[2] = 25; // Assigns 25 to the 3rd element of the array
Each element can be accessed and modified individually.

9. Array Variable Assignments
Array variables can reference other arrays of the same type. For example:

java
Copy code
int[] numbers = {10, 20, 30};
int[] otherNumbers = numbers;
Both numbers and otherNumbers now point to the same array in memory, and changes through one reference will reflect in the other.

