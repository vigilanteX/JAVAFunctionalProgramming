Steps-
1-First find FunctionalInterface, functional interface is an interface with single abstract method and can have more than 1 default and static method.
2-Consider name is Runnable, as Runnable contains single abstract method run()
3- InterfaceName ref_name=()->sout("hello");
Ex- Runnable r1=()->sout("hello world");
4-Now pass this r1 to Thread class constructor
Thread t=new Thread(r1);
t.start();

OR
Directly pass lambda in Thread class constructor.
Thread t=new Thread(()->sout("hello world"));









Comparator
Accepts object o1 and o2
compare method has three functions:
1-If method returns -ive o1 will come first then o2
2-If method returns +ive o1 comes after o2
3-If zero then no order change