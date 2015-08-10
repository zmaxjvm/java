####### Synchronizing tasks in a common point #######


The Java concurrency API provides a synchronizing utility that allows the synchronization
of two or more threads in a determined point. It's the CyclicBarrier class. This class is
similar to the CountDownLatch class explained in the Waiting for multiple concurrent events
recipe in this chapter, but presents some differences that make them a more powerful class.

The CyclicBarrier class is initialized with an integer number, which is the number of threads
that will be synchronized in a determined point. When one of those threads arrives to the
determined point, it calls the await() method to wait for the other threads. When the thread
calls that method, the CyclicBarrier class blocks the thread that is sleeping until the other
threads arrive. When the last thread calls the await() method of the CyclicBarrier class,
it wakes up all the threads that were waiting and continues with its job.

One interesting advantage of the CyclicBarrier class is that you can pass an additional
Runnable object as an initialization parameter, and the CyclicBarrier class executes this
object as a thread when all the threads have arrived to the common point. This characteristic
makes this class adequate for the parallelization of tasks using the divide and conquer
programming technique.

In this recipe, you will learn how to use the CyclicBarrier class to synchronize a set of
threads in a determined point. You will also use a Runnable object that will execute after all
the threads have arrived to that point. In the example, you will look for a number in a matrix
of numbers. The matrix will be divided in subsets (using the divide and conquer technique),
so each thread will look for the number in one subset. Once all the threads have finished their
job, a final periodicallyTask will unify the results of them.