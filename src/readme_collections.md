##Arrays
``````````````````````````````
	- An Array is an indexed collection of fixed number of homogeneous data elements 
	- Advantage is we can represent multiple values by using single variable so that readability of code will be improved
	- Limitations
		- Arrays are fixed in size, once we created we can not increase or decrease size of an array based on our requirement due to this to use array we should know size in advance
		- Array can hold only homogeneous (Any one Type of data type) data type elements, We can solve this by creating array of type Object class
		- Arrays concepts not implemented based on some standard data structure, hence readymade method support is not availble. we have to write the code explicitly which increases complexity
	- To Overcome above problems of Arrays we should go for Collections concepts
``````````````````````````````
##Collections
``````````````````````````````
	- Collections are growable in nature i.e. based on our requirement we can increase or decrease size
	- Collections can hold both homogeneous and heterogeneous elements
	- Every collection class is implemented based on some standard data structure, for every requirement readymade support is available. We should use that method instead implementing it again***

``````````````````````````````
##Arrays vs Collections
``````````````````````````````
	
	- Fixed in Size								- Growable in Size
	- Memorywise not recommended to use			- Memorywise recommended to use
	- Hold Homogeneous							- Hold both Homogeneous and Heterogenous objects
	- Performancewise Array is good 			- Not good in terms of performance 
	- No underline Data Structure				- Data Structure present and can be used as it is (Readymade method support available)
	- Support both primitive and object			- Support only to use Object types but not primitive types

``````````````````````````````
``````````````````````````````
Collections
	- Group of objects into single objects 
Collection Framework
	- It contains several classes and interfaces which can be used to represent group of individual objects as as single entity
	
	- Java >> Collection, Collection Framework 				C++ >> Container, STL (Standard Template Library)

``````````````````````````````
##Collection Interfaces
``````````````````````````````

	- List
	- Set
	- SorteSet
	- NavigableSet
	- Queue
	- Map
	- SortedMap
	- NavigableMap

Collection (I) 
	- Group of individual objects as a single entity then we should go for collection
	- Collection is an Iterface and defines most common methods which are applicable for any collection object
	- In General collection interface is considered as "root" element of collection framework
	- There is no concrete class which implements collection interface directly

Collections (C)
	- It is a class present in java.util package to define several utility methods for collection objects like sorting, searching etc.

List (I)
	- It is the child interface of Collection
	- If we want to represent a group of individul objects as a single entity where duplicates and insertion order must be preserved then we should go for List

Set (I)
	- It is child interface of Collection
	- If we want to represent as group of individual objects as a single entity where duplicates are not allowed and insertion order it not required then we should go for Set

Sorted Set (I)
	- Child interface of Set
	- If we want to represent a group of individul objects as a single entity where duplicates are not allowed and all objects should be inserted in according to some sorting order then use SortedSet

NavigableSet (I) 
	- Child interface of SortedSet and contains several methods for navigation purposes


List Vs Set
	
	- Duplicates are allowed 											- Duplicates are not allowed
	- Insertion order preserved											- Insertion order not preserved

Queue
	- Child interface of collection
	- If we want to represent a group of individul objects prior to processing then we should go for Queue
	- Usually Queue First In First Out (FIFO) order but based on our requirement we can implement our own priority order using PriorityQueue

Note >> 
	- All Above interfaces (Collection, List, SortedSet, NavigableSet and Queue) representing group of individual objects
	- If group of objects as key-value pair then we should go for Map

Map 
	- It is not child interface of collection
	- Represent group of object as key-value pairs
	- Both key-value are objects only, duplicate keys are not allowed but values can be duplicated

SortedMap
	- Group of key-value pairs according to some sorting order then we should go for SortedMap
	- Sorting should be based on key but not based on value

NavigableMap
	- Child interface of SortedMap
	- Define several Methods for Navigation purposes
	
Legacy Characters in Collection Framework
	- Enumeration (I)
	- Dictionary (Abstract Class)
	- Vector (C)
	- Stack (C)
	- HashTable (C)
	- Properties (C) 

``````````````````````````````
##Collection
``````````````````````````````
	- Methods
		- add(Object o)
		- addAll(Collection c)
		- remove(Object o)
		- removeAll(Collection o)
		- retailAll(Collection c)
		- clear()
		- removeIf(Predicate<? extends E> filter) >> 1.8
		- contain(Object o)
		- containsAll(Collection c)
		- isEmpty()
		- size()
		- Object[] toArray()
		- <T> T[] toArray()
		- Iterator iterator()
		- Spliterator<E> splitIterator() >> 1.8
		- Stream<E> stream() >> 1.8
		- Stream<E> parallelStream() >> 1.8

*** There is no concrete class which implements collection interface directly

``````````````````````````````
##List
``````````````````````````````
	- We can preserve insertion order with index and differentiate duplicate object using index, index will play important role in list
	- Methods in List interface
		- add(E e)
		- addAll(Collection<? extends E> c)
		- addAll(int index, Collection<? extends E> c)
		- add(E e)
		- add(int i, E e)
		- remove(int i)
		- removeAll(Collection<?> c);
		- retainAll(Collection<?> c);
		- replaceAll(UnaryOperator<E> operator) >> 1.8
		- containsAll(Collection<?> c)
		- contains(Object o)
		- iterator()
		- toArray()
		- sort(Comparator<? extends E> c)
		- clear()
		- get(int index)
		- set(int index, E element)
		- indexOf(Object o)
		- lastIndexOf(Object o)
		- ListIterator<E> listIterator()
		- ListIterator<E> listIterator(int index);
		- List<E> subList(int fromIndex, int toIndex)
		- Spliterator<E> spliterator() >> 1.8
		- <E> List<E> of() >> unmodifieable List 1.9
		- List<E> copyOf(Collection<? extends E> coll) >> unmodifiable List >> 1.10

	- Underlined data structure is resizable or growable array
	- ***duplicates objects are allowed
	- ***insertion order it preserved
	- ***Heterogenous objects are allowed (except TreeSet and TreeMap)
	- ***Null insertion is possible 
	- ArrayList arrayList = new ArrayList() >> create Empty array list object with default initial capacity i.e. 10 >> Once ArrayList reaches it's maxed capacity a new ArrayList object will be created with new capacity = (currentCapacity * 3/2) + 1
	- ArrayList arrayList = new ArrayList(int initialCapacity) >> Creates Empty List with specified initialCapacity
	- ArrayList arrayList = new ArrayList(Collection<? extends E> c) >> Creates equivalent Array List object with specified collection


- Usually we use object to hold data and transfer it from one location from to another (Container) to provide for this requirement every collection class bydefault implements serializable and cloneable interfaces
- ArrayList and Vector classes implements RandomAccess Interace so that any random element we can access with the same speed

``````````````````````````````
##RandomAccess (java.util)
``````````````````````````````
	- It does not contain any Methods, this type of classes called as Marker Interface. Where required ability will be provided automatically by JVM
	
- ArrayList is best choice if our frequent operation is retrieval operation (Because it implements RandomAccess Interface) >> fetch >> Complexity O(1)
- ArrayList is worst choice if our frequent operation is insertion or deletion in middle >> Complexity >> delete, insert >> O(n)

``````````````````````````````
##ArrayList Vs Vector
``````````````````````````````
	- Every method present in ArrayList is non synchronized 				- Every method present in vector is synchronized
	- Multiple thread are allowed to operate - Not Thread Safe				- At a time only one thread is allowed to operate - Thread safe
	- Relatively performance of Array is High								- Relatively Performance is low (Thread has to wait to operate on Vector object)
	- Since 1.2 															- Since 1.0 >> It is Legacy

``````````````````````````````
##Synchronized version of ArrayList
``````````````````````````````
	- Bydefault is non synchronized, but we can get synchronized list using synchronizedList() from Collections class
		- List list = Collections.synchronizedList(new ArrayList()); // new ArrayList() >> is non Synchronized but after this execution list >> Synchronized version of ArrayList
	- Similarily we can get Synchronized version using below method for Map and Set
		- synchronizedMap(Map s)
		- synchronizedSet(Set s)

``````````````````````````````
##LinkedList
``````````````````````````````
	- Underlined data structure is Double LinkedList (Doubly) insertion order it preserved, duplicate objects are allowed
	- Heterogenous objects are allowed
	- Null insertion is possible
	- It implements serializable, cloneable interfaces but not RandomAccess
	- LinkedList is best choice if our frequene operation is insertion or deletion in middle
	- It will be worst choice if our frequent operation is retrieval operation
	
	- Constructors
		- LinkedList linkedList = new LinkedList(); >> Create Empty LinkedList object
		- LinkedList linkedList = new LinkedList(Collection c) >> Creates equivalent LinkedList object for collection
	- Methods Specific to LinkedList
		- Usually we can use LinkedList to develop stack and queues to provide support for this requirement LinkedList class defines :
			- addFirst(Object o)
			- addLast(Object o)
			- getFirst()
			- getLast()
			- removeFirst()
			- removeLast()

``````````````````````````````
##ArrayList Vs LinkedList
``````````````````````````````

	- ArrayList is best choice if our frequent operation is retrieval operation 				- Best Choice if frequent operation is insertion, deletion or middle
	- worst choice if our frequent operation is insertion, delection or middle					- Worst choice if our frequence operation if retrieval operation
	  as several shoft operation is performed
	- Elements are stored in consecutive memory location, because of that retrieval easy		- Elements won't be stored in consecutive memory location, because of that retrieval is difficult

``````````````````````````````
##Vector
``````````````````````````````
	- Underlined Data Structure is resizeable array of growable array 
	- Insertion order it preserved
	- duplicates are allowed
	- Heterogenous objects are allowed
	- Null insertion allowed
	- implements serializable, cloneable and RandomAccess interface
	- Every method is synchronized, it is Thread-safe

	- Constructors
		- Vector vector = new Vector() 
			- creates empty vector object with default initial capacity 10 once vector reaches it's max capacity new Vector object will be created with  new capacity = currentCapacity * 2
		- Vector vector = new Vector(int initialCapacity)
			- created Empty vector object with specified initial capacity
		- Vector vector = new Vector(int initialCapacity, int incrementalCapacity) 
		- Vector vector = new Vector(Collection c) 
			- creates equivalent vector object for the given collection, this constructor meant for interconversion between collection objects
	- Methods
		- add(Object o)
		- add(int index, Object o)
		- addElement(Object o)
		- remove(Object o)
		- removeElement(Object o)
		- remove(int index)
		- removeElementAt(int index)
		- clear()
		- removeAllElements()
		- get(int index)
		- elementAt(int index)
		- firstElement()
		- lastElement()
		- int size()
		- int capacity()
		- Enumeration elements()

``````````````````````````````
##Stack
``````````````````````````````
	- It is child class of vector and specially designed class for Last In First Out order (LIFO)
	- Constructor
		- Stack stack = new Stack()
	- Methods
		- push(Object o)
		- pop()
		- peek() >> return Top of the stack without removal
		- empty() >> returns true if stack is empty
		- search(Object o)	>> returns offset if element is available else returns -1

``````````````````````````````
##Cursors of Java
``````````````````````````````
	- If we want to get objects one by one then we should go for cursor, there are three types of cursors available in java
		- Enumeration
		- Iterator
		- ListIterator
		
	- Enumeration (I)
		- we can use enumeration to get objects one by one from legacy collection object
		- we can get Enumeration objects using elements() method from Vector class
		- Methods
			- boolean hasMoreElements()
			- object nextElements()
		- Limitations
			- we can apply Enumeration concepts only for legacy classes and it is not a universal cursor
			- with enumeration we can get only values (i.e. fetching/read access) and we can not perform remove operation
			- in order to do these operation we should go for Iterator
			
	- Iterator (I)
		- We can apply iterator concept for any collection object and hence it is universal cursor
		- using this we can perform both read and remove operations
		- Iterator >> Iterator iterator = collection.iterator(); >> public Iterator iterator() from collection class
		- Methods
			- public boolean hasNext()
			- publi Object next()
			- public void remove()
		- Limitations
			- by use of enumeration and iterator we can move only towards forward direction, these are single direction cursors and not bidirectional cursors
			- with the use of iterator we can perform only read and remove operations and can't perform replace and add new objects
			- to overcome above we should go for ListIterator
			
	- ListIterator (I)
		- with this we can move to forward or backward direction these are bidirectional cursor
		- with this we can perform replace, add of new objects in addition to read and remove operations
		- ListIterator listIterator() 
			e.g. ListIterator listIterator = list.listIterator(); >> where list >> any List object
		- Methods
			- It is child interface of Iterator bydefault methods from iterator available to ListIterator (hasNext, next, remove)
			- Other Methods
				- Forward Movement
					- hasNext()
					- next()
					- nextIndex()
				- Backward Movement
					- hasPrevious()
					- previous()
					- previousIndex()
				- Extra Operations
					- remove()
					- add(Object o)
					- set(Object o)
		- Most features are present but it is only applicable to List objects

``````````````````````````````
##Set
``````````````````````````````
	- HashSet, LinkedHashSet
	- SortedSet, NavigableSet, TreeSet
	- Duplicates are not allowed and insertion order not preserved
	- Set Interface does not contain any new method, we can use only collection interface interface

``````````````````````````````
##HashSet
``````````````````````````````
	- Underlined data structure is HashTable
	- Duplicates are not allowed, insertion order not preserved. all objects are inserted  based on hashCode of objects
	- null insertion is allowed (Only once)
	- Heterogenous objects are allowed
	- implements serializable, cloaneable but not RandomAccess interface
	- it is best choice if frequent operation is search
	- HashSet duplicates are not allowed if we are trying to insert duplicates then we won't get any compile time error and add method simply returns false (boolean)
		HashSet hashSet = new HashSet();
		hashSet.add("A"); // true
		hashSet.add("A"); // false
	- Constructor
		- HashSet hashSet = new HashSet()
			- Create hashSet object with default initial capacity 16 and default fill ration (load factor) is 0.75
		- HashSet hashSet = new HashSet(int initialCapacity)
			- Creates empty hashSet object with specified initialCapacity and default fill ratio 0.75
		- HashSet hashSet = new HashSet(int initialCapacity, float fillRatio)
			- Creates empty hashSet object with the specified initilaCapacity and specified fill Ratio
		- HashSet hashSet = new HashSet(Collection c)
			- Creates equivalent hashSet with given collection >> meant for interconversion between collection objects

``````````````````````````````
##Fill Ratio or Load Factor
``````````````````````````````
	- after filling how much ratio a new HashSet object will be created, this ratio is called "Fill Ratio or Load Factor"
	- e.g. 0.75 means after filling 75% Ratio a new HashSet object is created Automatically 

``````````````````````````````
##LinkedHashSet
``````````````````````````````
	- Exactly same as HashSet including constructor and methods
	- HashSet vs LinkedHashSet
	
		- Underlined data Structure is HashTable 								- Underlined Data structure is LinkedList and HashTable
		- Insertion order not preserved											- Insertion order preserved
		- Since Java 1.2														- Since java 1.4
	- In general we can use LinkedHashSet to develop cached based application where duplicates are not allowed and insertion order preserved (mainly in maintain Cached Memory implementation) 

``````````````````````````````
##SortedSet (I)
``````````````````````````````
	- Child Interface of Set
	- group of objects according to some sorting order without duplicates then we should go for SortedSet
	- Methods
		- firt()
		- last()
		- headSet(Object o) >> gives values < Object o
		- tailSet(Object o) >> gives values >= to Object o
		- subSet(Object o1, Object o2) >> gives values >= o1 and < o2
		- comparator() >> describes underline sorting technique used if we are using default(for number Ascending order and string Alphabetical order) then it return null
``````````````````````````````
##TreeSet
``````````````````````````````
	- Underlined data structure is Balanced Tree
	- Duplicates are not allowed
	- Insertion order not preserved
	- Heterogenous objects are not allowed (Else there will be runtime error ClassCastException)
	- null insertion allowed only once 
	- implemetns Serializable, cloneable but not RandomAccess
	- all objects will be inserted based on some sorting order it may be default natural sorting order or customised sorting order
	- Constructors
		- TreeSet treeSet = new TreeSet() >> with empty treeSet object where elements will be inserted according to default natural sorting order
		- TreeSet treeSet = new TreeSet(Comparator<? super E> c) >> creates empty treeSet object where elements will be inserted according to customise sorting order specified by Comparator object
		- TreeSet treeSet = new TreeSet(Collection c)
		- TreeSet treeSet = new TreeSet(SortedSet<E> sortedSet)
	- For non-empty treeSet if we add null is not allowed and will throw NullPointerException
	- For empty treeSet null allowed untill Java 1.6 and 1.7 onwards null is not allowed even as first element i.e. null (not applicable for TreeSet from 1.7 onwards)
	- For default sorting compulsory object should be homogeneous and comparable else we will get runtime exception ClassCastException
	- If object said to be comparable if and only if it implements Comparable interface
	
``````````````````````````````
##Comparable (I) 
``````````````````````````````
	- It is present in "java.lang" package and it contains only one method 
		- int compareTo(T o) >> return int  0 >> objects are equal, -1 >> object is less than other object,  1 >> one object is greater than other object
		- If we are depending on default sorting order then while adding objects in TreeSet JVM will call compareTo method
		- e.g. TreeSet treeSet = new TreeSet();
			   treeSet.add("K");
			   treeSet.add("Z");
			   treeSet.add("A");
			   treeSet.add("A");
			   
			   System.out.println(treeSet); // [A, K, Z] if obj1.compareTo(obj2); >> obj2 : already inserted, obj1 : to be inserted
		- If default sorting order not satisfied then we can do customised sorting using Comparator 
		
	- Comparable is meant for default sorting order where as Comparator meant for customised sorting order

``````````````````````````````
##Comparator
``````````````````````````````
	- Present in "java.util" package and it defined two methods 
		- int compare(Object o1, Object o2)
		- boolean equals(Object o)
	- When we implement Comparator interface compulsory we need to provide implementation only for compare method 
	- We are not require to provide implementation for equals methos as it has already been implemented in Object class which is default extended by your class through inheritance 
	- If we are default sorting order then object should be comprable and homogeneous else we will get runtime exception ClassCastException

``````````````````````````````
##Comparator vs Comparable
``````````````````````````````
	- define own soring and customized existing default then go for Compartor and for default sorting order we use comparable
	- Only two classes in java API, Collator and RuleBasedCollator implements Comparator interface

``````````````````````````````
##Map (I) 1.2
``````````````````````````````
	- HashMap  1.2 >> LinkedHashMap 1.4
	- IdentityHashMap 1.4
	- WeakHashMap 1.2
	- SortedMap 1.2 >> NavigableMap 1.6 >> TreeMap 1.2
	- Dictionary >> HastTable >> Properties (1.0)

	- Map is not child interface of collection
	- Group of objects as key-value pairs then we should go for map
	- Both key-values are objects only, duplicate keys are not allowed but values can be duplicated
	- Each key value pair is called as entry, Map is called as collection of entry objects
	- Methods
		- Object put(Object key, Object value)
			- if key already present then old value will be replaced with new value and return us old value
				map.put(100, "Test") >> return us null as old value is null and it replace with "Test" and return us null 
		- void putAll(Map<? extends K, ? extends V> map)
		- get(K key)
		- boolean containsKey(Object key)
		- boolean containsValues(Object value)
		- boolean isEmpty()
		- int size()
		- void clear()
		- boolean remove(K key, V value)
		- ***Collection views of Map
			- Set keySet()
			- Collection values()
			- Set entrySet() 
		- Map is group of key-value pair and each pair is called as entry, hence map is considered as collection of entry objects
		- Without exsiting map object there no chance of existing entry object hence Entry interface is defined inside Map interface
				interface Map{
				
				
					interface Entry {
						
						.
						.
						.					
						getKey();
						getValue();
						setValue();
						equals();
						hashCode();
						.
						.
						// these methods only applied to Entry object
					}
					
				}

``````````````````````````````
##HashMap
``````````````````````````````
	- Underlined data structure is HashTable
	- Insertion order is not preserved and it is based on HashCode of keys
	- Duplicates keys are not allowed but values can be duplicated
	- Heterogenous objects are allowed for both key and value
	- null is allowed for key but only once and allowed for values (any number of time)
	- HashMap implements Serializable, Cloneable interface but not RandomAccess
	- Best choice if our frequent operation is Search operation (Hashing related data structure)
	- Constructors 
		- HashMap hashMap = new HashMap(); >> creates empty hashMap with default initial capacity 16 and default fill ratio or Load factor 0.75
		- HashMap hashMap = new HashMap(int initialCapacity); >> Creates HashMap with specified initialCapacity
		- HashMap hashMap = new HashMap(int initialCapacity, float loadFactor)
		- HashMap hashMap = new HashMap(Map map)

``````````````````````````````
##HashMap Vs HashTable
``````````````````````````````
	- Non Synchronized 										- Synchronized methods in HashTable Methods
	- Multiple Threads can operate, not thread Safe			- Only Single thread can operate at a time, thread safe
	- relatively Performance is high						- relatively Performance is low
	- null allowed for both key and value					- null not allowed in key and value >> NullPointerException
	- since 1.2												- since 1.0 (called as Legacy class)

*** Synchronized version of HashMap object >> Collections.synchronizedMap(map)
	- bydefault HashMap is non-synchronized but we can get synchronized version of map using synchronizedMap Method of Collections class
		- Map map = Collections.synchronizedMap(hashMap); 

``````````````````````````````
##LinkedHashMap 
``````````````````````````````
	- Child class of HashMap
	- Exactly same as HashMap (including methods and constructors)
	- Only difference is 
		- underline data Structure is LinkedList + HashTable (Hybrid Data Structure)				- Underlined data structure is HashTable
		- Insertion order is preserved																- Insertion order is not preserved and based on Hashcode of keys
		- introduced in Java version 1.4															- Since 1.2 

*** LinkedHashSet and LinkedHashMap are commonly used for cache based applications

``````````````````````````````
##== and .equals() method
`````````````````````````````` 
	- "==" meant for Reference or address comparison
	- .equals() meant for content comparison
	
	e.g. Integer i1 = new Integer(10);
		 Integer i1 = new Integer(10);
		 
		 System.out.println(i1 == i2); // false
		 System.out.println(i1.equals(i2)); // true

``````````````````````````````
##IdentityHashMap
``````````````````````````````
	- Exactly same as HashMap (including methods and constructors)
	- difference is 
		- in case of JVM will use .equals() method to identify duplicate keys, which is meant conten comparison
		- in case of IdentityHashMap JVM will use == operator to identify duplicate keys which is meant for reference comparison (address comparison)
``````````````````````````````
##WeakHashMap
``````````````````````````````
	- It is exactly same as HashMap
	- Object doesn't have any reference it is not eligible for gc if it is associated with HashMap i.e. HashMap dominates gc 
	- in case of WeakHashMap if object does not contain any reference it is eligible for gc even object associated with WeakHashMap i.e. gc dominates WeakHashMap

``````````````````````````````
##SortedMap
``````````````````````````````
	- Group of data according to some sorted value
	- Here Sorting here is based on Key and not based on value 
	- Methods
		- Object firstKey()
		- Object lastKey()
		- SortedMap headMap(Object key) >> exclusive key
		- SortedMap tailMap(Object key) >> inclusive key
		- SortedMap subMap(Object key1, Object key2)
		- Comparator Comparator() >> null

``````````````````````````````
##TreeMap
``````````````````````````````
	- Underlined data structure is RED-BLACK Tree
	- Insertion order is not preserved and it is based on some sorting order of keys
	- duplicate keys are not allowed, values can be duplicated
	- If we are depending on default natural sorting order then keys should be homogeneous and comparable else we will get RuntimeException >> ClassCastException 
	- If we are defining sorting by comparator then keys need not be homogeneous and comparable we can take Heterogeneous non comparable objects also
	- Whether we are defining default or customized sorting order there are no restrictions for values. We can take heterogeneous non-comparable objects also.
	- "null" acceptance 
		- For non empty tree map if we are trying to insert an entry with "null" key then we will get RuntimeException
		- For empty TreeMap with "null" key is allowed but after inserting that entry if we try to add another entry then we have RuntimeException with NullPointerException
		- Above "null" acceptance rule applicable untill 1.6 only and from 1.7 onwards "null" is not allowed for key
		- For value there is no restriction for values and we can enter "null" as value
		- Constructor
			- TreeMap treeMap = new TreeMap(); >> Default sorting order
			- TreeMap treeMap = new TreeMap(Comparator<? super E> c); >> Customized Sorting order
			- TreeMap treeMap = new TreeMap(Collection c);
			- TreeMap treeMap = new TreeMap(SortedMap sortedMap);

``````````````````````````````
##Hashtable
``````````````````````````````
	- Underlined data structure for Hashtable is Hashtable
	- Insertion order is not preserved and is based on HashCode of key
	- Duplicate keys are not allowed and values can be duplicated 
	- Heterogeneous objects are allowed both keys and values 
	- null is not allowed for both key and value else we will have RuntimeException >> NullPointerException
	- implementes serializable and cloaneable interface but not RandomAccess
	- Every method in Hashtable is Synchronized hence, Hashtable obejct is Thread Safe
	- Best choice if our frequent operation is search operation
	- Constructors
		- Hashtable hashtable = new Hashtable(); >> Empty hashtable object with default initial capacity 11 and default fill ratio 0.75
		- Hashtable hashtable = new Hashtable(int initialCapacity); 
		- Hashtable hashtable = new Hashtable(int initialCapacity, float loadFactor); 
		- Hashtable hashtable = new Hashtable(Map map); 
		
``````````````````````````````
##Properties
``````````````````````````````
	- If any thing which changes frequently (like username, password, mail id etc.) are not recommended to hard code it in java source code 
	- As if any change and in order to reflect that change then we need execute all deployment process (compile, build, deploy, restart server) are required in order to avoid it is recommended to store these values in common file
	- This common file is loaded in java Properties object and loaded wherever we need to get these values 
	- If any  change we can modify there and redeploy will work for us using Properties file
	- We can use java properties object to hold properties which are coming from .properties file
	- In normal HashMap, Hashtable key-value can be of any type but in case of properties key-value should be String type
	- Constructor
		- Properties properties = new Properties();
	- Methods
		- String setProperty(String pname, String pvalue) >> return us old value
		- String getProperty(String pname) >> get value specied with property name, if not available this return null
		- Enumeration propertyNames(); >> returns all property name present in properties object
		- load(InputStream inputStream) >> load properties from java properties objects
		- store(OutputStream outputStream, String comments) >> Strore properties from java properties object into properties file

``````````````````````````````
##Queue (I) >> Since 1.5 version
``````````````````````````````
	- Child interface of Collection (FIFO)
	- if we want to represent group of objects prior to processing then we have to use Queue (notification system, messaging system)
	- With the same order message is delivered on which order they inserted (First In First Out) follows FIFO
	- Based on our requirement we can implement out own priority order also (PriorityQueue)
	- From 1.5 onwards LinkedList class also implements Queue interface
	- LinkedList based implementation of queues always follows FIFO order
	- Methods 
		- boolean offer(Object o) >> to add object into queue
		- Object peek() >> to return head element of the queue
		- Object element() >> returns NullPointerExeption if no element is present return head element of the queue
		- Object poll() >> remove and return element of the queue if queue empty then return null
		- Object remove() >> remove and return element of the queue if queue empty then return NullPointerExeption if no element is present

``````````````````````````````
##PriorityQueue
``````````````````````````````
	- elements required prior to processing according to some priority then we should go for priority queue
	- priority can be default sorting order to customized sorting order defined by Comparator
	- Insertion order is not preserved and it is based on some priority
	- If we are depending on default natual sorting order then compulsory objects should be homogeneous and comparable else we will get RuntimeException ClassCastException
	- If we are defining out own sorting by comparator then objects need not be homogeneous and comparable
	- Null is not allowed even as first element also 
	- Constructor
		- PriorityQueue prorityQueue = new PriorityQueue(); >> Create Empty prorityQueue with default initial capacity as 11 and all object will be inserted according to default natural sorting order
		- PriorityQueue prorityQueue = new PriorityQueue(int initialCapacity);
		- PriorityQueue prorityQueue = new PriorityQueue(int initialCapacity, Comparator comparator);
		- PriorityQueue prorityQueue = new PriorityQueue(SortedSet sortedSet);
		- PriorityQueue prorityQueue = new PriorityQueue(Collection c);

*** Some platforms won't provide proper support for Thread priorities and PriorityQueue
	
``````````````````````````````
##NavigableSet (1.6)
``````````````````````````````
	- It is child interface of SortedSet
	- It defines several methods for navigation purposes
	- Methods
		- lower(Object o) >> "< o"
		- floor(Object o) >> "<= o"
		- higher(Object o) >> " > o "
		- ceiling(Object o) >> " >= o "
		- pollFirst() >> remove and return first element
		- pollLast() >> remove and return last element
		- descendingSet() >> return NavigableSet in reverse order

``````````````````````````````
##NavigableMap (1.6)
``````````````````````````````
	- It is child interface of SortedMap implementation map is TreeMap
	- It defines several methods for navigation purposes
	- Methods
		- lowerKey(Object o) >> "< o"
		- floorKey(Object o) >> "<= o"
		- higherKey(Object o) >> " > o "
		- ceilingKey(Object o) >> " >= o "
		- pollFirstEntry() >> remove and return first entry
		- pollLastEntry() >> remove and return last entry
		- descendingMap() >> return NavigableMap in reverse order

``````````````````````````````
##Collections
``````````````````````````````
	- Defines several utility methods for collection objects like sorting, searching, reversing etc.
	- Sort Method
		- public static void sort(List list) >> To sort based on default natural sorting order 
			- List should contain homogeneous comparable object else RuntimeException ClassCastException
			- Should now contain any null value else RuntimeException NullPointerExeption
		- public static void sort(List list, Comparator comparator) >> Sort based on customized sorting order
		- It used Quick Sort for Primitive Types and Merge Sort for Objects
	- Search Method
		- Provide following bindary search methods
			- public static int binarySearch(List list, Object object) >> List is sorted with default natural order then we can use this
			- public static int binarySearch(List list, Object object, Comparator comparator) >> if list sorted with customized sorting order
		- It used Binary Search algorithm, Successfull search returns index and unsuccessfull returns insertion point
		- Insertion point is nothing but location where search item can be placed in sorted list 
		- In order to use this method list must be sorted else we will get unpredictable results
		- If list is sorted according to comparator then at the time of search operation also we have to pass same comparator object else we will get unpredictable results
		
*** For the list of n elements in the case of binary search element :
	- Successfull search result range 0 to n-1
	- Unsuccessfull search result range -(n+1) to -1
	- Total Result range -(n+1) to n-1
	
	| A | Z | K | 
		
		>> 0 to 2 
		>> -4 to -1 
		>> -4 to 2 
		
	- Reversing elements of List
		- public static void reverse(List<?> list)
			- to reverse elements of list
		- public static <T> Comparator<T> reverseOrder()
			- to get reversed comparator 

``````````````````````````````
##Arrays
``````````````````````````````
	- It is utility class defined for Array objects
	- Sort Method
		- Provide utility to sort primitive as well as object type arrays
		- public static void sort(primitive[] primitive) >> Default sorting order natual Sorting 
		- public static void sort(Object[] object) >> Default sorting order natual Sorting >> Object can be possible to sort based on customized sorting order
		- public static void sort(Object[] object, Comparator comparator) >> customized Sorting 
	- Search
		- public static int binarySearch(primitive[] a, primitive key) 
		- public static int binarySearch(Object[] object, Object key) 
		- public static int binarySearch(Object[] object, Object key, Comparator compartor) 
	- All Rules are similar to Collection class binary search methods
	
``````````````````````````````
##Conversion of Array to List
``````````````````````````````
	- public static List asList(Object[] object)
		- This method won't create independent list object for the existing array we are getting list view (list is referenced with existing Array Object, new object of list is not created)
		- By performing any change automatically change will be reflected to the array
		- Similarly using list reference if we perform any change that change will be reflected automatically to array
		- We can not perform any operation which varies the size else we will get RuntimeException >> UnsupportedOperationException
		- If we try to replace object with Heterogeneous object using list reference then we will get RuntimeException >> ArrayStoreException

``````````````````````````````
``````````````````````````````