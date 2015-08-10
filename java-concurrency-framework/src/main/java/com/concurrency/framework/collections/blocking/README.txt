####### Using non-blocking thread-safe lists #######


The LinkedBlockingDeque class implements the BlockingDeque interface.
Read the BlockingDeque text for more information about the interface.
The word Deque comes from the term "Double Ended Queue".
A Deque is thus a queue where you can insert and remove elements from both ends of the queue.
The LinkedBlockingDeque is a Deque which will block if a thread attempts to take elements out of it while it is empty, regardless of what end the thread is attempting to take elements from.
