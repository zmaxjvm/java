####### Concurrent Collections #######


ff Using non-blocking thread-safe lists
ff Using blocking thread-safe lists
ff Using blocking thread-safe lists ordered by priority
ff Using thread-safe lists with delayed elements
ff Using thread-safe navigable maps
ff Generating concurrent random numbers
ff Using atomic variables
ff Using atomic arrays


Data structures are a basic element in programming. Almost every program uses one or
more types of data structures to store and manage their data. Java API provides the Java
Collections framework that contains interfaces, classes, and algorithms, which implement
a lot of different data structures that you can use in your programs.
When you need to work with data collections in a concurrent program, you must be very
careful with the implementation you choose. Most collection classes are not ready to work
with concurrent applications because they don't control the concurrent access to its data. If
some concurrent tasks share a data structure that is not ready to work with concurrent tasks,
you can have data inconsistency errors that will affect the correct operation of the program.
One example of this kind of data structures is the ArrayList class.

Java provides data collections that you can use in your concurrent programs without
any problems or inconsistency. Basically, Java provides two kinds of collections to use
in concurrent applications:

№_1 Blocking collections: This kind of collection includes operations to add and remove
data. If the operation can't be made immediately, because the collection is full or
empty, the thread that makes the call will be blocked until the operation can
be made.

№_2 Non-blocking collections: This kind of collection also includes operations to add and
remove data. If the operation can't be made immediately, the operation returns a
null value or throws an exception, but the thread that makes the call won't
be blocked.

Through the recipes of this chapter, you will learn how to use some Java collections that you
can use in your concurrent applications. This includes:
ff Non-blocking lists, using the ConcurrentLinkedDeque class
ff Blocking lists, using the LinkedBlockingDeque class
ff Blocking lists to be used with producers and consumers of data, using the
LinkedTransferQueue class
ff Blocking lists that order their elements by priority, with the
PriorityBlockingQueue
ff Blocking lists with delayed elements, using the DelayQueue class
ff Non-blocking navigable maps, using the ConcurrentSkipListMap class
ff Random numbers, using the ThreadLocalRandom class
ff Atomic variables, using the AtomicLong and AtomicIntegerArray classes
