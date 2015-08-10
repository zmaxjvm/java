#Task Location - java\com\concurrency\framework\creating
-------
№1. how to Creating and running a thread

-------
№2. Getting and setting thread information
The Thread class saves some information attributes that can help us to identify a thread,
know its status, or control its priority. These attributes are:

### ID: This attribute stores a unique identifier for each Thread.

### Name: This attribute store the name of Thread.

### Priority: This attribute stores the priority of the Thread objects. Threads can have a
priority between one and 10, where one is the lowest priority and 10 is the highest
one. It's not recommended to change the priority of the threads, but it's a possibility
that you can use if you want.

### Status: This attribute stores the status of Thread. In Java, Thread can be in
one of these six states: new, runnable, blocked, waiting, time waiting,
or terminated.

-------
№3 Interrupting a thread


-------
№4 Sleeping and resuming a thread
For example, a thread in a program checks a sensor state once per minute


-------
№5 Creating and running a daemon thread
Thread.setDaemon(true) makes a Thread daemon but it can only be called before starting Thread in Java.
Daemon Threads are suitable for doing background jobs like housekeeping.
You will never see print statement written in finally block because finally will not be called.

-------
№6 Processing uncontrolled exceptions in a thread



-------
№7 Using local thread variables
One of the most critical aspects of a concurrent application is shared data.
special importance in those objects that extend the Thread class or implement the
Runnable interface.
The Java Concurrency API provides a clean mechanism called thread-local variables with a very good performance.



-------

















-------

