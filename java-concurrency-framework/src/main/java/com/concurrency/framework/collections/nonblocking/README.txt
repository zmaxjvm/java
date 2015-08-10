####### Using non-blocking thread-safe lists #######


ConcurrentLinkedQueue is an unbounded thread-safe queue based on linked nodes. This queue orders elements as a FIFO (first-in-first-out).
The head of the queue is that element that has been on the queue the longest time.
The tail of the queue is that element that has been on the queue the shortest time.
New elements are inserted at the tail of the queue, and the queue retrieval operations obtain elements at the head of the queue.
A ConcurrentLinkedQueue is a good choice when many threads share access to a common collection.
Like most other concurrent collection implementations, this class does not permit the use of null elements.

This java example spawns off two threads. One puts strings on the queue and the other takes strings off the queue.