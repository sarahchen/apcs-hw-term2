/*

  You want to store all info Stuy Students in a data structure
  You want to optimize for:
  1. Finding a student based on 4-Digit ID
  2. Adding a student by 4-Digit ID
  3. Changing a student (found by 4-Digit ID)

  Store by array -> O(1) time
  A[ID - k]
  k = the ID range for senior class (ie 1000)

  HASHING / HASH TABLES
  We want to store things in a table by index (array).
  We have to take a unique ID and convert it into a table index to store it.
  Hash function h(x) is a mapping function. it takes a piece of information
  and converts it into an index in our hash table.
  ex. OSIS Numbers
      h(x) = x % 10000

  clash / collision
  -hash tables array: has to be sufficiently large (sparsely populated).
  -hash function should do a good job distributing items in the table.
 */

