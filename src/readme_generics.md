##Generics
``````````````````````````
	- Main purpose of Generics
		- Type Safety
		- Type Casting
	- To hold only String type of objects we can create generic version of Array List of Object as :
		ArrayList<String> arrayList = new ArrayList<String>();
	- For this we can add only String type of objects, for other type we will get compile time error
	- Through generics we are getting Type-safety, at the time of retrieval we are not required to perform Typecasting
		String string = arrayList.get(0);
	- Through generics we can solve type casting problem

		- ArrayList arrayList = new ArrayList()										- ArrayList<String> arrayList = new ArrayList<String>();
		- Non-generic version of ArrayList											- Generic version of ArrayList
		- For this we can add any Type of Object, Not Type-safety					- We can add only String type of Objects - Type Safe
		- at the time of retrieval Typecasting is Required							- Type Casting is not required

	- *** Polymorphism concept applicable only for base type but not for parameter type (usage of parent reference to hold child object is concept of polymorphism)

		ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		Collection<String> collection = new ArrayList<String>();
		ArrayList<Object> arrayList = new ArrayList<String>(); // this will give comiple time error >> Incompatible Types Found >> it is applicable only for BaseType and not Parameter Type

	- *** For type parameter we can provide any class or interface but if we try to provide primitive then we will get compile time error
			ArrayList<int> arrayList = new ArrayList<int>(); // Compile time error Incompatible Type found

``````````````````````````````
##Generic classes
``````````````````````````````
	- Until 1.4, non generic version :
		class ArrayList {

			add(Object object);
			Object get(int index)

		}

		argument to add method is Object hence we can add any type of object to ArrayList due to this Type Safety was missing return type of get method is Object, it was necessary to perform Typecasting
	- In 1.5 Generic version of class :

		class ArrayList<T>{

			add(T t);
			T get(int index);

		}

	- Based on our runtime requirement T will be replaced with provided type
		e.g. to hold only String Type of objects, Generic version of ArrayList object created as :

			ArrayList<String> arrayList = new ArrayList<String>();

			Compiler considered version :

				class ArrayList<String> {

					add(String string);
					String get(int index);

				}

			String string = arrayList.get(0); >> Type casting is not required
	- In Generics we are associating a Type parameter to the class, such type of parameterized classes are called as "Generic classes or Template classes"

	- Based on our requirement we can define our own Generic classes also :
		e.g. class Account<T> {


			}

			Account<Credit> creditAccount = new Account<Credit>();
			Account<Saving> creditAccount = new Account<Saving>();

	- Bounded Types
		- We can bound the type parameter for a particular range by using "extends" keyword such types are called "Bounded Type"
			e.g.
				 class Test<T> {

				 }

				 as Type parameter we can pass any type and there are no restrictions >> "Unbounded Type"

				 Test<Integer> test = new Test<Integer>();
				 Test<String> test = new Test<String>();
		- Syntax :
			class Test<T extends X>{


			}

			>> X - can be either class or interface , if X is a class then as a Type Parameter we can pass either X type or it's child classes
			>> X is interface then we can pass either X or it's implementation classes

		- We can defined bounded types even in combination also :
			e.g. class Test<T extends Number & Runnable> {

				}

			>> as a Type parameter we can take anything which should be child class of Number and should implements Runnable interface

			class Test<T extends Runnable & Comparable> { } // Valid
			class Test<T extends Number & Runnable>{ } // Valid
			class Test<T extends Runnable & Number>{ } // Invalid >> class first and then followed by interface  ***
			class Test<T extends Number & Thread> { } // Invalid >> we can not extends two class at a time

*** We can defined Bounded types only by using extends keyword and we can not use implements and super keywords but we can replace "implements" with the "extends" keyword
*** We can take any valid java identifier but it is convention to use "T"

	class Test<T> { } 			class Test<X> { }  					class Test<A> { } 					class Test<Demo> { }  >> All are valid definations

*** Based on our requirement we can declare any number of type parameters and all these type parameters should be separated with ","

	class Test<A,B> { } 			class Test<X, Y, Z> { }				class HashMap<K, V){ }

``````````````````````````````
##Generic Methods & Wild Card character (?)
``````````````````````````````

	- method(ArrayList<String> arrayList)
		- We can call this method bypassing ArrayList of only String type, within method we can add only String type of objects bymistake if we try to add any other type then we will get compile time error
			- arrayList.add("A");
			- arrayList.add("B");
			- arrayList.add(12); // Invalid

	- method(ArrayList<?> arrayList)
		- We can call this method by passing ArrayList of any Type
		- We can not add thing within the method except the "null" as we don't know the type exactly
		- "null" is allowed because it is valid value for any type
			- arrayList.add(12.5); // Invalid
			- arrayList.add("T"); // Invalid
			- arrayList.add(12); // Invalid
			- arrayList.add(null); // valid
		- This type of methods are best suitable for read only operations

	- method(ArrayList < ? extends X > arrayList)
		- X can be either class or interface
		- if X is class then we can call this method by passing arrayList of either X type or it's child classes
		- if X is an interface then we can call this method by passing array list either X type or it's implementation classes
		- Within the method we can not add anything to the list except "null" as we don't know the type exactly
		- This type of methods are best suitable for read only operations

	- method(ArrayList < ? super X > arrayList)
		- X can be either class or interface
		- We can call this method by passing arrayList of either X type or it's child classes
		- if X is an interface then we can call this method by passing arrayList of either X type or super class of implementation class of X
		- within the method we can add X type of objects and null to the list

			Runnable >> Thread (impl class) >> Object (extended-super class)

	- When we call Generic method it is defined that, It follows behaviour of method i.e. if method has Non-generic method and it called from generic method then it will not follow Generic rule and can accept other types as well

``````````````````````````````
``````````````````````````````