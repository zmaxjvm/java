#Task Location - java\com\concurrency\framework\creating



-------
№1. Synchronizing a method

One of the most common situations in concurrent programming occurs when more than one
execution thread shares a resource.

-- The keyword synchronized
-- The Lock interface and its implementations

Synchronizing a method.

If you know that a method will not be called by more than one thread, don't use the synchronized keyword



-------
№2 Using conditions in synchronized code

A classic problem in concurrent programming is the producer-consumer problem. We have
a data buffer, one or more producers of data that save it in the buffer and one or more
consumers of data that take it from the buffer.





-------

