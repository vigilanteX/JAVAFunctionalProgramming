Intermediate Operations List (Commonlu used):

. filter(): This method filters elements based on a condition.

· map(): It transforms each element into something else.

· flatMap(): Used to flatten multiple collections into a single stream.

· distinct(): Removes duplicates from the stream.

. sorted(): Sorts the elements in the stream.

. peek(): Performs an action for each element (usually for debugging).

. limit(): Limits the number of elements in the stream.

. skip(): Skips the first N elements in the stream.



Terminal Operations List (Commonlu used):

. collect(): Collects the elements of the stream into a collection (like a List, Set , or Map ).

. forEach(): Performs an action for each element in the stream.

· reduce(): Reduces the elements of the stream to a single value (like summing numbers).

. count(): Counts the number of elements in the stream.

. anyMatch(): Checks if any elements match a condition.

. allMatch(): Checks if all elements match a condition.

. noneMatch(): Checks if none of the elements match a condition.

. findFirst(): Returns the first element in the stream.

. findAny(): Returns any element from the stream (mainly useful in parallel streams).



### Stream Operations in Java

| **Intermediate Operations**                                                                 | **Terminal Operations**                                                                 |
|---------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| They return stream.                                                                         | They return non-stream values.                                                           |
| They can be chained together to form a pipeline of operations.                              | They can’t be chained together.                                                          |
| Pipeline of operations may contain any number of intermediate operations.                   | Pipeline of operations can have maximum one terminal operation, that too at the end.     |
| Intermediate operations are lazily loaded.                                                  | Terminal operations are eagerly loaded.                                                  |
| They don’t produce end result.                                                              | They produce end result.                                                                 |
| **Examples:** `filter()`, `map()`, `distinct()`, `sorted()`, `limit()`, `skip()`            | **Examples:** `forEach()`, `toArray()`, `reduce()`, `collect()`, `min()`, `max()`, `count()`, `anyMatch()`, `allMatch()`, `noneMatch()`, `findFirst()`, `findAny()` |
