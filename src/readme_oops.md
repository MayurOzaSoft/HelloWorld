#OOPs : Object Oriented Programming

````````````````````

Data Hiding
Abstraction
Encapsulation
Tightly couples Encapsulation

IS-A Relationship -- Inheritance
HAS-A Relationship -- Composition, Aggregation
Method Signature
Polymorphism
	- Overloading
	- Overriding

Static Control Flow
Instance Control Flow

Constructor
Coupling
Cohesion
Type Casting

````````````````````
##Data Hiding

````````````````````

	- Outside person can not access Internal Data directly or Internal Data should not go out directly >> This fearure is called as "Data Hiding"
	- after validation or authentication can access Internal Data >> like UserName Password in order to access your account else error for accessibility of data
	- How we can access "Data Hiding" feature?
		- Declaring date member (variable) as private in order restrict access
		- Providing accessibility with the method invocation which is public
	- Access Modifiers
		- Private (Recommended Modifiers for Data Member [variables]) -- in C Default modifier is Private
		- Protected
		- Public
		- Default
	- The main advantage of "Data Hiding" is Security

````````````````````
##Abstraction
````````````````````
	- Hiding of internal implementation and expose(highlight) only set of services >> concept of "Abstraction"
	  e.g. ATM functionality
	- Advantage of Abstraction
		- Security >> Implementation is not exposed
		- Enhancement >> It will be easy without any effect on end user experience
		- Improves Easiness to use System
		- Maintainability is increased
	- How we can implement this?
		- Interface Class
		- Abstract Class >> Partial Implementation

````````````````````
##Encapsulation
````````````````````
	- Process of binding data from various area i.e. data members (variables) and it's corresponding behaviour (Methods) binding to one single unit
	  e.g. imagine capsule as example
	- Every class is example of Encapsulation
	- combination of Data Hiding + Abstraction is nothing but Encapsulation
	- Advantages
		- Security (Biggest advantage of Encapsulation)
		- Enhancement
		- Maintainability
	- Disadvantages
		- It increases line of code and slows down execution

````````````````````
##Tightly Coupled Encapsulated class
````````````````````
	- If all data member(Variable) of that class is private then it can be considered as "Tightly Coupled Encapsulated" class
````````````````````
##IS-A Relationship
````````````````````
	- It is also known as "Inheritance"
	- It is implemented by using keyword "extends"
	- Main advantage is : Re-usability
	- Child extend Properties of parents and available to child
	- Parent don't have default access to child methods, with Parent Reference we can not call child specific methods
	- Parent reference can hold child object but with this it only access Parent Methods or properties
	- common Methods can be written in Parent class and specific methods are written newly in child classes (this make reusability of code and reduce efforts) 
	- Entire Java API based on Inheritance concepts
	- Objects class is acts as root (Parent) class for all directly or indirectly (It contains most common method required for all java Objects)
	- Throwable class acts as root class for Exception and Error class (common Exception or Error methods are available in it)
	- Object
		- Throwable
			- Exception
			- Error
	- It is not possible to extend Multiple classes, Java Does not support multiple Inheritance
	- Diamond problem can be solved using Polymorphism
	- If class does not extend any other class, only in that case your class is direct child class of Object. Suppose it extends any other class (suppose B) then it will be indirect child class of Object.
	- Multi-level Inheritance support for Java ( A -> B -> Object)
	- Cyclic Inheritance is not allowed in Java - It is not required

*** Why Java Won't support for Multiple Inheritance ? 
	- There will be Ambiguity while invoking method with same name hence it will be difficult to perform any operation. this is why Multiple Inheritance not supported in java.

*** How you can we solve this ?
	- Interface can extend any number of interface simultaneously, this imply it is possible for multiple Inheritance w.r.t. Interface
	- Why Ambiguity won't be there in Interface ? 
		- As Multiple method declaration available but Implementation is unique, Because of which There will be no change of Ambiguity problem in Interfaces
		- But through interfaces we won't get any Inheritance

````````````````````
##HAS-A Relationship
````````````````````
	- HAS-A Relationship is also knows as Composition/Aggregation
	- There is no spcific keyword used to implement HAS-A Relationship, in most cases with new keyword we can implement the same
	- The main advantage of HAS-A relationsip is reusability of the code
	- Difference between Composition and Aggregation
		- Strong Association between Objects is called as Composition
		- Container and it's contained objects are strongly Asscociated (e.g. University consist of Departments, without University there will not be existence of department)
		- Weak Association between Objects is called as Aggregation
		- Container and it's contained objects are weakly Asscociated (e.g. Department and Professor, If Department is closed professor can move to another university of another department)
		- Composition >> Container holds objects of contained objects (Dept. has to stay within University)
		- Aggregation >> Container objects holds reference of contained objects (Prof. can stay out of department)

````````````````````
#####When to User Composition(HAS-A) and Inheritance(IS-A)?
````````````````````
		- When you required complete functionality it is better to go for IS-A Relationship
		- When you required some or minimum part of it's functionality to use it is better to go for HAS-A Relationship
		
````````````````````
##Method Signature
````````````````````

	- It consist of Method Names followed by argument types
	- public static int methodName(float f, int i)
		- Here, methodName(float f, int i) >> considered as method signature (in C/C++ return type was part of method signature)
	- Compiler will use Method signature to resolve method calls
	- Compiler create Method Table for each of it's Thread using method signature, if any of different method signature called using that particualr Thread object it throws as error, Not find Symbol Error
	
	e.g. 
		public class Test {
			
			public void m1(){
			
			}
		}
		
		Test t = new Test();
		t.m1();
		t.m2(); // Not found any Symbol
		
	- Two Method with same signature not allowed

````````````````````
##Overloading
````````````````````
	- Two methods are set it to be overloaded if and only if both methods having same name but different argument types
	- In C method overloading concept is not available, it is not possible to declare multiple method with same name but different argurment types
	- If any change in argument type we should have to declare new method name like Math.abs function in C Which has abs >> int, fabs >> float, labs >> long. It increases complexity
	- In java we can declare multiple methods with same name with different argument types e.g. Math.abs allowed for all int, float and long These methods called as "Overloaded Methods"
	- Method resolution always take care by compiler based on reference type, it is also considered as "Compile Time Polymorphism" or "Static Polymorphism" or "Early Binding"
	
Automatic Promotion in Overloading
	- While resolving overloaded methods if exact matched method is not available then we won't get any compile time error immediately. 
	- first it will promote argument to next level and check better matched method is available or not. 
	- If matched method is available then it will be considered else it will promoted argument again to another (next) level and process will be continued untill all possible promotions.
	- If not found then we will get compile time error.
	- following are possible promotions are expected in overloading (This is called "Automatic Promotion")
		- byte >> short >> int >> long >> float >> double
		- char >> int >> long >> float >> double 
	- While resolving overloaded methods, compiler will always use precedence for child type arguments when compared with parent type arguments

````````````````````
##Overriding
````````````````````
	- Whatever methods parent has by default available to child through inheritance if child class not satisfied with parent class implementation, child allowed to redefined that method based on it's requirement, this process is called "Overriding"
	- Parent class method which is Overridden Method Called as "Overridden Method" and child class method which is overriding called as "Overriding method"
	- In Overriding Method resolution is takes care by JVM based on on Runtime object so called as "Runtime Polymorphism" or "Late Binding" or "Dynamic Polymorphism"
	- Rules for Overriding
		- Method names and argument types must be matched i.e. Method signatures must be same
		
		- In Overrriding return type must be same but it's applicable untill 1.4 version only from 1.5 onwards it is allowed to have co-variant return types 
		- According to this child class method return type need not be same as parent method return type it's child class also allowed
		- Co-variant return type concept applicable only for object type but not for primitive types i.e. int, long, float, double
		
		- private methods not allowed/available to child class, so overrriding method not allowed for private method
		- Child Method exactly same as Private method in Parent, It is valid but it is not considered as overriding
		
		- Parent class final methods can not be overridden in child classes if we trying to override then we will get compile time error >> overridden method is final
		- Parent class abstract method we should override to provide implementation
		- Abstract class can extend method of parent class, you can define parent method as abstract and ask next level child classes to implement the same
		- Following modifiers won't keep any restriction
			- synchronized
			- native
			- strictfp
			- abstract
		- Final to non final overriding not possible but non final to final is possible in overridden methods
		
		- While in overriding we can not reduce scope of access modifier but we can increase the scope i.e. default to Public, protected and private possible
			- in same way public to default is not possible and compile time error >> attempted to assign weaker access priviledges-public***
		- scope of access modifiers : public < default < protected < private
		- Parent : public 
		  Child  : public
		  
		  Parent : protected
		  Child  : protected, public
		  
		  Parent : default
		  Child  : default, protected, public
		  
		  Parent : private >> It is not allowed for private methods

````````````````````
####*** Exception in Overriding
````````````````````
	- If child method throws checked exception, then it's parent should throw same checked exception of it's parent exception else we will have compile time error
	- There is no restriction on Unchecked exception
````````````````````
####Unchecked Exception
````````````````````
	- Exception  >> RuntimeException + it's all child classes
	- Error >> VMError + it's all child classes 
	- E.g.
		
		// Valid case
		- P : public void test() throws Exception 
		  C : public void test()
		
		// Invalid case
		- P : public void test() 				
		  C : public void test() throws Exception
		
		// Valid case
		- P : public void test() throws Exception
		  C : public void test() throws IOException
		
		// Invalid case
		- P : public void test() throws IOException
		  C : public void test() throws Exception
		
		// Valid case
		- P : public void test() throws IOException
		  C : public void test() throws FileNotFoundException, EOFException
		
		// Invalid case
		- P : public void test() throws IOException
		  C : public void test() throws EOFException, InterruptedException
		
		// Valid case
		- P : public void test() throws IOException
		  C : public void test() throws ArithmeticException, NullPointerException,ClassCastException

````````````````````
####***Overriding w.r.t. static methods
````````````````````
	- You can not override static method as non-static, else we will get compile time error
	- reason is static methods are class level method for instance method i.e. object level method is not allowed to override class level methods
	- If both are static parent method as well as child, then there is no compilation error. So it is applicable for static methods but it is not overriding and it is called as method hiding
	- All rules of method hiding are exactly same as method Overriding except one difference compiler responsible for method reference based on reference type (JVM responsible, based on runtime object)
		- both should be static				non static
		- compiler reference 				JVM runtime object
		- compile time polymorphism			Runtime Polymorphism
		- static binding					Dynamic binding
		- early binding 					late binding

````````````````````
####Overriding w.r.t. varargs methods
````````````````````
	- We can override varargs method only with another varargs method only
	- if we try with normal method then it will be considered as overloading and not overriding
	
	- variable resolution always takes care by compiler based on reference type irrespective whether it is static or non-static (overrriding applicable only for methods and not for variables)

````````````````````
####Difference between Overloading and Overriding
````````````````````

	Property						Overloading 								Overrriding
	
	- Method Names					Same 										Same
	- Argument Types				Must be diffrent atleast order				Same (including order)
	- Method signatures				Must be different							Must be same
	- Return types					No Restrictions								Must be same untill 1.4, from 1.5 onwards co-variant return type also allowed
	- private, static, final		can be overloaded							It can not be overriden
	- Access modifiers				no restriction								We can't reduce scope of access-modifier but we can increase scope of it private > default > protected > public
	- throws clause					no restriction								If child class throws any checked exception then Parent must throw same or it's parent exception but no restriction for unchecked exception
	- Method resolution				Compiler based,based on reference type		Takes care JVM based on runtime Object 
	- Also known as 				Compile Time/Static/Early Binding			Runtime/Late Binding/Dynamic
	
	- In Overloading Method name same and argument types must be different, we are not required to check remaining like return type, access modifiers, exception etc. 
	- In overriding we have to check all cases like method name Access modifiers, throws keyword etc.
	- Overloading is simple mechanism but Overrriding is complex

````````````````````
````````````````````
Parent Class method : public void test(int i) throws IOException >> consider we have method in parent class
Child Class methods	: 
	- public void test(int i)						>> Valid Overridding
	- public static int test(long i)				>> Valid Overloading
	- public void test(int i) throws Exception		>> Invalid Overridding, exception not valid
	- public static void test(int i)				>> Invalid Overridding, non static to static not allowed
	- public static abstract void test(int i)		>> Compile time error, illigal combination of modifiers (static and abstract not allowed)

````````````````````
##Polymorphism 
````````````````````
	- One Name multiple forms, concept of Polymorphism
	- Method name is same but we can apply different types of arguments >> Overloading 
	- Method signature is same but implementation is different w.r.t. parent >> Overriding 
	- Usage of parent reference to hold child object is concept of polymorphism
		- e.g. List can have different ref. ArrayList, LinkedList, Vector and Stack it extends List
	- Parent class reference can be used to hold child object but by using that reference we can call only methods available in Parent class and we can't call child specific methods
	- Using child reference we can call both child and parent methods, If we don't know exact runtime object then we should go for parent reference
		- e.g. elements in ArrayList can be any type of object and hold that object using Object (which is parent of any object) 
		
	- Child child = new Child();			 		 Parent parent = new Child();
		- Return type knows								- Return type Not sure
		- Can call both parent as well as child			- Can call only method related to parent and not child
		- Can hold only object of child					- Can hold any type of it's child object
	- Static/Compile Time/Early Binding
		- Overloading
		- Method hiding
	- Dynamic/Runtime/Late Binding
		- Overridding
		
````````````````````
##OOPs - 3 Pillars of OOPs
````````````````````
	- Encapsulation >> Security
	- Polymorphism  >> Flexibility
	- Inheritance	>> Reusability

````````````````````
##Coupling
````````````````````
	- Degree of dependencies between components is called as Coupling
	- If Dependency is more then it is considered as Tightly coupling and if Dependency less then considered as loosely coupling
	
	class A {
		static int i = B.j;
	}
	
	class B {
		static int j = C.k;
	}
	
	class C {
		static int j = D.test();
	}
	
	class D {
		public static int test(){
			return 10;
		}
	}
	
	- In above class A, B, C are tightly coupled with each other and without effecting any component we can not modify any component
	- with this enhancement is difficulty and supresses reusability, reduces maintainability of the application
	- It is bad practice to have tightly coupled components
	- We have to maintain dependency between component as less as possible i.e. loosely coupling (Good programming practice)
	
````````````````````
##Cohesion
````````````````````
	- For every component, clear well-defined functionality is defined then that component is set to be follow high cohesion
	- writing all functions in one component is said to be >> Low Cohesion
	- Separation of component based on well defined specific component >> High Cohesion -- Good Practice to separate and less dependent component 
		- Makes modification without effecting other component
		- Enhancement will become easy
		- Modular easy to seggregate
		- Promotes Reusability of the code
	- Loosely coupling and High Cohesion are good practice
	
````````````````````
##Object Typecasting
````````````````````
	- We can use parent reference to hold child object
		- e.g. Object o = new String("Test Java");
	- We can use Interface reference to hold implemented class object
		- e.g. Runnable r = new Thread();
	- A b = (C) d;
		- A >> Class or Interface name
		- b >> Reference Variable name
		- C >> Class or Interface name
		- d >> Referene variable name
	- Rules :
		- Type of 'd' and 'C' must have some relation i.e. with child to parent or parent to child or same type else there will be compilation error >> Inconvertible Type Error 
		- 'C' Must be either same of derived type of 'A' else there will be compile time error >> Incompatible Types found Error
		- Runtime object type of 'd' must be either same or derived type of 'C' else we will have RuntimeException >> ClassCastException
		
		e.g.
		
			- Object 
				- Base 1
					- Der 1
					- Der 2
				- Base 2
					- Der 3
					- Der 4
			
			Base 2 base2 = Der 4 ();
			
			Base 1 base1 = (Base 1) base2; // Invalid -- Inconvertible Exception
			
	- Through Type Casting we are not creation new object for the existing object, we are providing another type of reference variable i.e. we are performing Typecasting not object casting
		- e.g. 
			String str = new String("Test");
			Object o = (Object) str;
			
	- *** if C --> B --> A
	
		public class C {
		
			public void test(){
				s.o.p("Child");
			}
		}
		
		- C c = new C();
		
		- (B)c >> B b = new C(); 
		- A((B)c) >> A a = new C();
	
	- Parent reference can be used to hold child object but using that reference we cannot call method of Child class, we can call only method related to parent
	
````````````````````
##Static control flow
````````````````````
	- Identification of Static members from top to bottom
	- Execution of static variable assignment and block from top to bottom
	- Execution of main method
````````````````````
````````````````````
Direct and Indirect read

	- Withing method if we are trying to read variable and method called from another static block is called as indirect read, if accessed from particualat method directly is called as direct read
	- If variable is just identified by JVM and original value not yet assigned then variable is set to be in RIWO ("Read Indirectly and Write Only" state) 
	- If variable is in RIWO state then we can not perform Direct Read But we can perform Indirect Read
	- If we are trying to read directly then we will have Compile time error >> Illegal Forward Reference
````````````````````
##Static block
````````````````````
	- static blocks will be executed at the time of class loading, if we want to perform any at the class loading then that activity we have to defined that inside static block 
	- At the time of java class loading corresponding native libraries should be loaded, in order to perform this we have to define this inside Static block
	
		public class Test(){
		
			static {
				// load your native libraries
			}
		
		}
	- After loading every database driver class we have to register driver class with driver manager but insider database driver class there is static block to perform this activity and we are not responsible for to register explicitly 
		
		public class DBManager {
			
			static {
			
				// register driver class with driver manager 		
			
			}
		
		}
	- you can define any number of static block and all are executed top to bottom
	- Without writing main method it is possible to print some statement to the console by using static block
		- Multiple ways to executes statements in Java without Java Main method

			--------------------
			
			static int i = test();

			private static int test() {
				System.out.println("Insider Static Method test");
				System.exit(0);
				return 10;
			}
			
			--------------------
			
			Test test = test();
			
			// Instance Block
			{
				System.out.println("Insider Static Method test");
				System.exit(0);
			}
			
			--------------------
			
			Test test = test();
			
			Test()
			{
				System.out.println("Insider Static Method test");
				System.exit(0);
			}
		
		- *** From 1.7 it is mandatory to have main method, without this it is impossible to print statement to the console
		- Static control flow in Parent to Child Relationship
			- When we execute child class following sequence of events will be executed automatically as part of static control flow
				1. Identification of static members from parent to child 
				2. Execution of Static variable assignments and static blocks from parent to child
				3. *** Execution of only child class main method
			- *** When we loading child class automatically Parent class will be loaded but when we call parent class child class won't be loaded
				parent class member bydefault available to child class but child class members not available for parent class (Inheritance concept)


````````````````````
##Instance Control flow
````````````````````
	- Whenever we are executing a java class first static control flow will be executed, in the static control flow if we are creating object then below sequence events will be executed
		- Instal control flow execution
			1. Identification of instance members from top to bottom
			2. Execution of Instance variable assingnment and instance blocks from top to bottom
			3. Execution of constructor
	- Static control flow is one time activity which will be performed at the time of class loading but Instance control flow is not one time activity and it will be performed for every object  creation
	- Object creation is most costly operation if there is no specific requirements then it is not recommended to create object
	- Instance control flow from Parent to Child relationship
		- Following sequence will be performed automatically as the part of Instance Control Flow
			- Identification of Instance member from Parent to child
			- Execution of Instance variable assignments and instance blocks only in Parent class
			- Execution of Parent Constructor
			- Executino of Instance variable assignments and instance blocks for child class
			- Executino of Child Constructor
			
````````````````````
````````````````````
*** From Static area we can not access Instance members directly while executing static area JVM may not identify instance members

	class Test{
	
		int i = 10;
		public static void main(String[] args0){
		
			System.out.println(i); // Compilation Error
			
		}
	}

````````````````````
##Ways to create objects in Java and Ways to get Objects in Java
````````````````````
	- Using new Operator >> new Test();
	- newInstance Method >> Class.forName("Test").getInstance();
	- clone >> Test test = (Test) test1.clone();
	- Factory Method >> DateFormat dateFormat = DateFormat.getDateFormatInstance();
	- Deserialisation

````````````````````
##Constructor
````````````````````
	- Once we create an object, we should perform initialization then only object is in position to respond properly
	- Whenever we are creating object some part of the code executed to perform initialization of the objects, this part of code called as "Constructor"
	- main purpose of constructor is initialization of an object not to create Object
	- Constructor and Instance Block
		- Main purpose of constructor is to perform initialization of an object
		- if any other activity other than initialization then we should go for Instance Block (e.g. Update Entry in DB for every Object Creation >> increament value)
		- Both have different concept and it is not feasible to replace one concept to another
		- Execution will be first instance block then Constructor
	- Rules for writing constructors
		- name of the class and name of the constructor must be matched
		- return type concept not applicable for constructor even void, if we add then it will be considered as method and not constructor
		- application modifiers for constructor are public, private, protected and default, if we use any other modifier we will get compile time error
	- Default constructor
		- It is generated by compiler only in case when there is no constructor defined in class >> It is not always that compiler generate default Constructor
		- JVM responsible only for execution and not for generating constructor
		- Every class in java contain Constructor it may be default which is generated by compiler or customized constructor explicitly provided by developer but not both simultaneously
	- Prototype of Constructor
		- It is with no-arg constructor
		- access modifier of default constructor is exactly same as class access modifier (only for public and default)
		- it contains only one line i.e. super(); it is no argument call to super call constructor
		
				written code 					compiler code
			
				class A {				class A {
				
											A(){
												super();
											}		
				
				}						}
				
			
				public class A {		class A {
				
					public A() {			A() {
												super();
					}						}		
				
				}						}
			
			
				public class A {		class A {
				
					public A() {			A() {
						this();					this();
					}						}		
				
					public A(int i) {		public A(int i) {
												super();
					}						}
				
				}						}
		- If we are not writing anything i.e. super or this then compiler will always place super()
		- super() or this() must be first statement in constructor, both not valid and gives you compilation error
		- if we use super() or this() outside constructor then we will get compile time error as above, it is possible to use only in constructor
	
	- super() and this() 
		- these are constructor class to call super class and current class constructors
		- used only in constructors as first line
		- used only once in constructor
		
	- super and this
		- keywords and these are current class and super class instance members
		- we can use it anywhere except static area
		- we can use this any number of time
	
	- We can declare multiple constructors and all constructors having same name but different type of arguments >> Oveloaded constructors
		
	- For constructors overriding and inheritance concepts are not applicable but overloading concept is applicable
	- Every class in java including abstract class except Interface (it can not contain constructor)
	- Recursive constructor invocation is not allowed 
	- If parent class conatain any argument constructor then while writing child classes we have to take special care 
	- Whenever we are writing argument constructor it is highly recommended no-arg constructor also
	- If parent class constructor throws any checked exception then compulsory child class constructor should throw same excpetion or it's child otherwise code won't compile
	- compiler generated constructor is called as Default Constructor


````````````````````
##Singleton class
````````````````````
	- Create One object and share/reuse withing the other object as same object may require in all requirement
	- It improves performance and memory utilisation will be improved
	
		- Runtime r = Runtime.getRuntime(); // Object is used from FactoryMethod and same instance is used across
	
	- Creating Singleton class
	
		1. use private constructor and private static variable and public factory method which will return instance of object
		
			public class SingletonClass {

				private static SingletonClass singletonClass = new SingletonClass();

				private SingletonClass() {}

				public static SingletonClass getSingletonClass(){
					return singletonClass;
				}
			}
			
			e.g. Runtime class is implemented using this approach
			
		2. Another approach :
		
			public class SingletonClass {

				private static SingletonClass singletonClass = null;

				private SingletonClass() {}

				public static SingletonClass getSingletonClass(){
				
					if(singletonClass == null){
						singletonClass = new SingletonClass();
					}
					return singletonClass;
				}
			}
			
		3. 2nd approach will lead to not Thread safe and may have multiple instance of object solution for it :
		
			public class SingletonClass {

				private static SingletonClass singletonClass = null;

				private SingletonClass() {}

				public synchronized static SingletonClass getSingletonClass(){
				
					if(singletonClass == null){
						singletonClass = new SingletonClass();
					}
					return singletonClass;
				}
			}
			
		4. This will lead performance impact due to synchronization on method level, we will introcuce block in order to execute only to particualar part of object creation
		
			public class SingletonClass {

				private static SingletonClass singletonClass = null;

				private SingletonClass() {}

				public static SingletonClass getSingletonClass(){
				
					if(singletonClass == null){
						// Thread Safe
						synchronized(SingletonClass.class){
							// Double Check
							if(singletonClass == null){
								singletonClass = new SingletonClass();
							}
						}
					}
					return singletonClass;
				}
			}
			
	- class is not final but we are not allowed to create child classes >> by declaring every constructor as private, we restrict every child class creation

````````````````````
````````````````````	