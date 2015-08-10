####### Waiting for multiple concurrent events #######

The Java concurrency API provides a class that allows one or more threads to wait until a
set of operations are made.
It's the CountDownLatch class. This class is initialized with an
integer number, which is the number of operations the threads are going to wait for. When
a thread wants to wait for the execution of these operations, it uses the await() method.
This method puts the thread to sleep until the operations are completed. When one of these
operations finishes, it uses the countDown() method to decrement the internal counter


