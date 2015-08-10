####### Synchronizing a block of code with a Lock #######

Java provides another mechanism for the synchronization of blocks of code. It's a more
powerful and flexible mechanism than the synchronized keyword. It's based on the Lock
interface and classes that implement it (as ReentrantLock). This mechanism presents
some advantages, which are as follows:

The Lock interfaces allow you to get more complex structures to implement your critical section.

The Lock interfaces provide additional functionalities over the synchronized keyword.
One of the new functionalities is implemented by the tryLock() method

The Lock interfaces allow a separation of read and write operations having multiple
readers and only one modifier.

The Lock interfaces offer better performance than the synchronized keyword.

-------
When we want to implement a critical section using locks and guarantee that only one execution thread
runs a block of code, we have to create a ReentrantLock object. At the beginning of the
critical section, we have to get the control of the lock using the lock() method. When a
thread (A) calls this method, if no other thread has the control of the lock, the method gives
the thread (A) the control of the lock and returns immediately to permit the execution of the
critical section to this thread. Otherwise, if there is another thread (B) executing the critical
section controlled by this lock, the lock() method puts the thread (A) to sleep until the
thread (B) finishes the execution of the critical section.

At the end of the critical section, we have to use the unlock() method to free the control of
the lock and allow the other threads to run this critical section. If you don't call the unlock()
method at the end of the critical section, the other threads that are waiting for that block
will be waiting forever, causing a deadlock situation.

-------
lock() and tryLock()
The Lock interface (and the ReentrantLock class) includes another method to get the
control of the lock. It's the tryLock() method. The biggest difference with the lock()
method is that this method, if the thread that uses it can't get the control of the Lock
interface, returns immediately and doesn't put the thread to sleep. This method returns a
boolean value, true if the thread gets the control of the lock, and false if not.

-------
You have to be very careful with the use of Locks to avoid deadlocks. This situation occurs
when two or more threads are blocked waiting for locks that never will be unlocked.

-------

