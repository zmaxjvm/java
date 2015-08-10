####### The core of the Fork/Join framework is formed by the following two classes #######

The fork/join framework is an implementation of the ExecutorService interface that helps you take advantage of multiple processors.
It is designed for work that can be broken into smaller pieces recursively The goal is to use all the available processing power to enhance the performance of your application.

As with any ExecutorService implementation, the fork/join framework distributes tasks to worker threads in a thread pool.
The fork/join framework is distinct because it uses a work-stealing algorithm.
Worker threads that run out of things to do can steal tasks from other threads that are still busy.

The center of the fork/join framework is the ForkJoinPool class, an extension of the AbstractExecutorService class.
ForkJoinPool implements the core work-stealing algorithm and can execute ForkJoinTask processes.

The first step for using the fork/join framework is to write code that performs a segment of the work.
Your code should look similar to the following pseudocode:

if (my portion of the work is small enough)
  do the work directly
else
  split my work into two pieces
  invoke the two pieces and wait for the results

-------

The original source image is represented by an array of integers, where each integer contains the color values for a single pixel.
The blurred destination image is also represented by an integer array with the same size as the source.

-------

#1 ForkJoinPool: It implements the ExecutorService interface and the work-stealing algorithm.
It manages the worker threads and offers information about the status of the tasks and their execution.

#2 ForkJoinTask: It's the base class of the tasks that will execute in ForkJoinPool.
It provides the mechanisms to execute the fork() and join() operations inside
a task and the methods to control the status of the tasks. Usually, to implement
your Fork/Join tasks, you will implement a subclass of two subclasses of this class:
RecursiveAction for tasks with no return result and RecursiveTask for tasks that return one.

The invokeAll() method of the ForkJoinTask class is one of the main differences
between the Executor and the Fork/Join framework. In the Executor framework, all the tasks
have to be sent to the executor, while in this case, the tasks include methods to execute and
control the tasks inside the pool. You have used the invokeAll() method in the Task class,
that extends the RecursiveAction class that extends the ForkJoinTask class.


-------
Books:

Concurrent Programming in Java: Design Principles and Pattern (2nd Edition) by Doug Lea.
A comprehensive work by a leading expert, who's also the architect of the Java platform's concurrency framework.
Java Concurrency in Practice by Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, and Doug Lea. A practical guide designed to be accessible to the novice.
Effective Java Programming Language Guide (2nd Edition) by Joshua Bloch.
Though this is a general programming guide, its chapter on threads contains essential "best practices" for concurrent programming.
Concurrency: State Models & Java Programs (2nd Edition), by Jeff Magee and Jeff Kramer. An introduction to concurrent programming through a combination of modeling and practical examples.
Java Concurrent Animated: Animations that show usage of concurrency features.

-------




