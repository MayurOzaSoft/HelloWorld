#Stack Frame

	1. New Runtime Stack is created for each Thread
	2. All Method i.e. each and every Method + associated Local variables will be stored in Stack
	3. After Execution each method stack is free it's area
	4. After Execution all JVM will clear Stack Entry
	5. Each entry is called as Stack Frame/Activation Record
	6. Data Stored in the stack is available for corresponding Thread, Not available to other Threads. Can be Considered as Thread Safe.

#Stack Frame Structure

    - Local Variable Array
    - Stack Operands
    - Frame Data

#Local Variable Array

	1. Contain local variables of the method, Each array is of type 4 Bytes
	2. Values of types are as follows :
		- Int, float and object reference >> 4 Bytes
		- double, long >> 8 Bytes (4+4)
		- Byte(1Bytes), Char(2Bytes), short(2Byte) >> converted to int type and Before storing all occupied with 4 Bytes with 1 slot
		- Boolean >> the way of storing is varied from JVM to JVM (Most of JVM follows 1 slot i.e. 4 Bytes)

#Operands Stack

	1. This will be used as workspace, some instructions passed values to Operands stack, some pop values from operand stacks, some perform required operations
	2. You can say it will be for performing temporary operations for your flow.

#Frame Data

	1. All symbolic reference related to that method, also contains reference to exception table i.e. corresponding catch block information in case of exception

*** Symbolic reference are logical reference not actual physical location, class constant pool from class files

#PC Registers

	1. For every thread separate PC registers created at the time of thread creation.
	2. PC registers contain address of current executing instructions
	3. once Instruction execution completed, PC registers will be implemented to hold address of next Instrcution

#Native Method Stack

	1. For Every thread JVM creates Native Method Stacks i.e. to hold Native method calls
	2. Native means not written in Java.

---- http://blog.jamesdbloom.com/
##Execution Engine

    1. Central Component of JVM. Responsible for executes java class files.
    2. Maine two Components
        - Interpreter
        - JIT(Just in Time) Compiler

#Interpreter

   - Responsible for to
        - Read the Byte Code
        - Interpret (Convert into Machine code i.e. Native code)
        - Execute Machine code

#JIT(Just in Time) Compiler (from 1.1 version)

    - To improve performance of language from Interpreter's scope
    - *** This concepts applicable only for commonly compiled method (frequently used also called as Hot Spot Method)
    - JIT Compilation happen only in case of threshold counter reaches for that particular Method, else it will follow Approach of Interpreter (Read, Interpret and Execution)
    - As JIT maintains separate counter for each Method
    - If Hot Spot identified it generated corresponding native code and next time it will directly executes this method instead going through cycle of interpreter
    - This Threshold count varied from JVM to JVM
    - Some Advance JIT Compilers regenerates More Optimised code if threshold count reaches second time. (This Hot Spots are identified by Profiler in JVM internally)
    - JIT Has below part :
        - Intermediate Code Generator
        - Code Optimizer (Profiler)
        - Target Code Generator
        - Machine Code/Native Code

*** Java Called as Interpreter and compiler language
*** Code interpreted at least once

##Execution Engine

[ Interpreter         |           JIT             |       Garbage Collector         |      Security Manager  ]

                                    [ JNI (Java Native Interface) ]

                                   [  Java Native Method Libraries ]

*** JNI responsible for communication between Native Libraries of JVM with Execution Engine