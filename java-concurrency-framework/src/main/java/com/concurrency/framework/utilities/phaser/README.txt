####### Phaser (Этапщик) #######

-------
A reusable synchronization barrier, similar in functionality to CyclicBarrier and CountDownLatch but supporting more flexible usage.
(using methods register(), bulkRegister(int), or forms of constructors establishing initial numbers of parties)
and optionally deregistered upon any arrival (using arriveAndDeregister())

A Phaser may be used instead of a CountDownLatch to control a one-shot action serving a variable number of parties.
The typical idiom is for the method setting this up to first register, then start the actions, then deregister, as in:

-------
Количество участников барьера может меняться.
1 Поток не обязан ожидать, пока все участники соберутся на барьере.
2 Достаточно только сообщить о готовности своей работы.
3 Наоборот, потоку необязательно быть участником барьера, чтобы ожидать его преодоления.

-------


Состояние этапщика включает
номер этапа (фазы, цикла синхронизации) | int phase
количество участников | int parties
количество участников, которые заявили/не заявили о своей готовности | int arrived, unarrived
состояние завершения | boolean terminated
Всегда верно:
terminated = false   →   phase = [реальный номер этапа, счет ведется с нуля] % (231 − 1)
parties  =  arrived + unarrived
0  ≤  unarrived, arrived  ≤  parties

Все элементы состояния снабжены геттерами.

-------
1. Основные управляющие методы:
register()	зарегистрировать участника
arrive()	сообщить этапщику о своей готовности, не ожидая открытия барьера
arriveAndAwaitAdvance()	классическое прибытие на барьер. Точный аналог CyclicBarrier.await()
arriveAndDeregister()	отменить свое участие


-------

Барьер открывается сразу после всякого уменьшения unarrived до нуля
То есть, в том числе, когда снимается последний участник,
однако при создании «пустого» этапщика (new Phaser() или new Phaser(0)) «ворота закрыты».

Так или иначе, преодолеть барьер можно только с вызовом одного из методов, начинающихся на «arrive».
В контексте потока, который это сделает, выполняется protected-метод onAdvance(phase, parties) — если он возвращает true,
этапщик завершает свою работу (terminated ← true). Этот механизм позволяет управлять жизненным циклом изнутри класса.
В дефолтной реализации phaser умирает как раз если с барьера ушли все участники (parties = 0).

-------


