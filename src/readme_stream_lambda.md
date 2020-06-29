###JAVA SE 8
````````````````````
	- Streams 
	- Lambda

````````````````````
##Streams
````````````````````
	- A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result
	- Stream is not data Structure is processed data from input of collections, Arraya or I/O Channels
	- Stream do not change it's original structure it manupulate result as per pipelined methods
	- Each Intermediate Operations are lazily executed and it returns stream of results, with this various operations are pipelined. Terminal Operations mark the end of Stream and return the result.
    - Intermediate Operations >> Operations that can be connected and their return type is Stream >> These are also called as Lazy Because these operations are merged amd processed into single pass by Terminal Operations
    - Terminal Operations >> Operations that close stream pipelined
			- Filtering
				- filter(Predicate)
				- distinct()
				- limit(n)
				- skip(n)
			- Filtering and Matching
				- allMatch  >> Returns boolean
				- anyMatch	>> Returns boolean
				- noneMatch	>> Returns boolean
				- findFirst >> Returns Optional
				- findAny   >> Returns Optional
			- Mapping
				- map(Function) >> Returns
			- Reduce
				- reduce
			- Numeric Streams
				- mapInt
				- mapDouble
				- mapLong
			- Numeric Ranges
				- range
				- rangeClosed
			- Infinite Streams
				- iterate
				- generate
			- flatMap
			- collect
````````````````````
````````````````````
	- Short-cicuiting  >> Which stops/break the Streams flow -- Basically useful in infinite Streams
		- anyMatch
		- allMatch
		- noneMatch
		- findFirst
		- findAny
````````````````````
````````````````````
	- Intermediate Operations
		- filter(Predicate<T>)
		- map(Function<T>)
		- flatMap(Function<T>)
		- sorted(Comparator<T>)
		- peek(Consumer<T>)
		- distinct()
		- limit(int n)
		- skip(int n)
````````````````````
````````````````````
	- Terminal Operaions
		- forEach
		- collect
		- reduce
		- toArray
		- min
		- max
		- sum
		- count
		- minBy
		- maxBy
````````````````````
````````````````````
	- Peek >> useful in visualizing how stream operations behave and understanding the implications and interactions of complex intermediate stream operations
````````````````````
#Lambda
````````````````````
Lambda
	- functional programming 
	- parallel processing
	- easy consise code
	- easier to use API-libraries

Functional vs Object Oriented Programming
	- It is just another way of writing paradigm and make your code more readable and ease of understanding
	
	- Function as value 
	
		- greetingFunction = () -> System.out.println("TEST DEMO LAMBDA");
		- multiplyFunctio = (int a) -> a * 2;
		- addFunction = (int a, int b) -> a + b;
		- safeDivision = (a, b) -> {
				if(b == 0) return 0;
				return a/b;
			};
		- stringLength = (String string) -> string.length();
	
	- Functional Interface
		- Interface which has only one abstract method is called as "Functional Interface"
		- @FunctionalInterface >> It is not mandatroy to define but it is good practice to use this in order to provide compile time error

````````````````````
````````````````````

