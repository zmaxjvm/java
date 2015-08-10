####### Synchronizing data access with read/write locks #######

One of the most significant improvements offered by locks is the ReadWriteLock interface
and the ReentrantReadWriteLock class, the unique one that implements it. This class
has two locks, one for read operations and one for write operations.
There can be more than one thread using read operations simultaneously, but only one thread can be using write
operations. When a thread is doing a write operation, there can't be any thread doing read operations.