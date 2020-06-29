##Regular Expression
````````````````````````
	- Used to develop Translators (Assemblers, compilers, interpreters etc.), Form validation, pattern matching, Digital circuits and develop communication protocols (TCP/IP, UDP)
	- Pattern
		- It represents compiled version of regular expression i.e. it is java equivalent object of pattern
		- We can create Pattern object using compiled method of Pattern class
			public static Pattern compile(String expression)
			e.g. Pattern pattern = Pattern.compile("ab");
	- Matcher
		- We can use matcher object to check given pattern in the Target String
		- We can create matcher object by using matcher method of Pattern class
			public Matcher matcher(String target)
			e.g. Matcher matcher = pattern.matcher("TARGET STRING");
	- Methods
		- boolean find()
		- int start()
		- int end()
		- String group()
	- Pattern and Matcher classes present "java.util.regex" package and introduced in 1.4
	- Character classes
		- [abc] 						- either 'a' or 'b' or 'c'
		- [^abc] 						- except 'a' or 'b' or 'c'
		- [a-z]							- lower case from a to z
		- [A-Z]							- upper case from a to z
		- [a-zA-Z]						- from a to z and from A to Z
		- [0-9]							- numeric characters
		- [0-9a-zA-Z]					- numeric + alphanumeric
		- [^0-9a-zA-Z]					- except numeric and alphanumeric
	- Predefined Character classes
		- \s 							- space character
		- \S							- except space character
		- \d							- any digit from 0-9
		- \D							- except digit 0-9, any character
		- \w							- any word character [0-9a-zA-Z]
		- \W							- except word characters (special character)
		- .								- any character
	- Quantifiers
		- We can use quantifiers to specify number of occurences to match
			- a 						- exactly one match 'a'
			- a+						- atleast one match with 'a'
			- a*						- any match with 'a' including zero
			- a?						- atmost one match with 'a'
	- split
		- we can use Pattern class split method to split target string according to particualr pattern
		- String class split method
			- String also has split method to split target string according to particular pattern
			e.g. String string = "JAVA LEARNING";
				 String[] strArray = string.split("\\s");
				 System.out.println(Arrays.toString(strArray)); >> [JAVA, LEARNING]
		- ***Pattern class split method can take targer string as argument and String class split method can take Pattern as argument
	- String Tokenizer
		- specially designed class for Tokenization activity
		- it is present in java.util package

````````````````````````
```````````````````````` 