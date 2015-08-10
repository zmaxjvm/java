####### deadlocks #######
You have to be very careful with the use of Locks to avoid deadlocks. This situation occurs
when two or more threads are blocked waiting for locks that never will be unlocked. For
example, a thread (A) locks a Lock (X) and a thread (B) locks a Lock (Y). If now, the thread
(A) tries to lock the Lock (Y) and the thread (B) simultaneously tries to lock the Lock (X),
both threads will be blocked indefinitely, because they are waiting for locks that will never
be liberated. Note that the problem occurs, because both threads try to get the locks in the
opposite order. The Appendix, Concurrent programming design, explains some good tips to
design concurrent applications adequately and avoid these deadlocks problems.

-------
Starvation

Starvation describes a situation where a thread is unable to gain regular access to shared resources and is unable to make progress.
This happens when shared resources are made unavailable for long periods by "greedy" threads. For example,
suppose an object provides a synchronized method that often takes a long time to return. If one thread invokes this method frequently,
other threads that also need frequent synchronized access to the same object will often be blocked.

-------
Livelock


-------
