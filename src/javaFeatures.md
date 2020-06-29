
##Java 10
``````````````````````````````````
    - var reserved keyword
    - garbage collectors improvements
    - G1, Full GC in Java 10 GC collectors is parallel
    - HotSpot VM -- dynamic decompiling, ergonomic (platform dependent)
    - CDS - Class Data Share -- Same sharing and less start up time
    - AppCDS - Application class - Data Sharing
    - Root Certificates - cacerts JSE Root CA Programme - Oracle Contributor Agreement - OPEN JDK (TLS work by Default in Open JDK) and ORACLE JDK Builds
    - JVM safe points - Thread based versioninig
    - Version Counter
	    - $FEATURE(Major).$INTERIM(Minor).$UPDATE(Security).$PATCH
		    e.g. JDK11.0.JDK11.0.1
		
	- Runtime API updated
    - JIT (HotSpo) 
        >> C1  : Fast simple start up
        >> C2  : Longer run
        >> Graal : JIT Compile Java byte Code (Ahead of time compiler)
    - Removed javah, Enhanced java.util.Locale (Language Tag - extendion tag) 
        - Currency type (cu)
        - First Day of the week (fw)
        - Region override (rg)
        - Time Zone (tz)

``````````````````````````````````
##Java 11
``````````````````````````````````

    - var possible to use in Lambda parameters - uniformity to local variables
    - class annotations @Nonnull and @Nullable
    - HttpClient : java.net.http (incubated API removed)
	- Completely Asynchronous 
	    - Rx flow 
    - Garbage Collectors 
        >> Epsilon : Create new JVM and Performance Testing
        >> Z Garbage Collectors : now only for Linux
    - Launch Single File programme 
        >> OLD >> Compile (class file) >> JAR >> Main class Module
        >> Now we can directly do it in one go using "java Test.java" 
    - Flight Recorder >> Inspects JMC : Java Mission Control (Continuous dump)
	- jdk.jfr.Event
	- Minimal Ovrehead JVM Performance
	- Reduce Dependency from Third party Profilers
    - Security Update 
        >> TLS 1.3 Update 
        >> CryptoGraphy : ChaCha 2020(New and Replacement on insecure RC4) 20-Poly1305
        >> Cheaper than AES and Widely used in TLS
    - JVM Improvements 
        >> Nest-Based Access Control
        >> Improvisation in Array and String
    - Deprecation
        >> Remove Nashorn
        >> Compression modules from Java 9 
        >> CORBA 
        >> Support for Unicode 10

``````````````````````````````````
``````````````````````````````````