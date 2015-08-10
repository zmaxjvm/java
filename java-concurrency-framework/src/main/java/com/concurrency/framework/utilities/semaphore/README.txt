

####### Thread Synchronization Utilities #######


-------
learn how to use high-level mechanisms to get the synchronization of
multiple threads. These high-level mechanisms are as follows:

#1 Semaphores: A semaphore is a counter that controls the access to one or
more shared resources. This mechanism is one of the basic tools of concurrent
programming and is provided by most of the programming languages.

#2 CountDownLatch: The CountDownLatch class is a mechanism provided by the Java
language that allows a thread to wait for the finalization of multiple operations.

#3 CyclicBarrier: The CyclicBarrier class is another mechanism provided by the
Java language that allows the synchronization of multiple threads in a common point.

#4 Phaser: The Phaser class is another mechanism provided by the Java language that
controls the execution of concurrent tasks divided in phases. All the threads must
finish one phase before they can continue with the next one. This is a new feature of
the Java 7 API.

#5 Exchanger: The Exchanger class is another mechanism provided by the Java
language that provides a point of data interchange between two threads
-------

-------
Semaphore

if the counter of the semaphore is 0, the semaphore puts the thread to sleep until
the counter is greater than 0. A value of 0 in the counter means all the shared resources are
used by other threads, so the thread that wants to use one of them must wait until one is free.

In this recipe, you will learn how to use the Semaphore class to implement special kinds of
semaphores called binary semaphores.
-------



