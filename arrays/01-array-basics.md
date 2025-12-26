# Array Basics

## What is an Array?
An array is a **fixed-size, contiguous memory structure** used to store elements of the **same type**.

```java
int[] arr = {1, 2, 3, 4};
```

### Key Properties
- Fixed size (cannot grow or shrink)
- Index-based access (0-based)
- Fast random access

### Memory Model (IMPORTANT)
- Arrays are objects in Java
- Stored in heap
- Variable holds a reference to the array object

```java
int[] arr = new int[3];
// arr ───▶ [0, 0, 0]
```

### Primitive vs Object Arrays (VERY IMPORTANT)

Primitive array
```java
int[] nums = {1, 2, 3};
```
Stores actual values — no object references inside.

Object array
```java
String[] words = {"a", "b"};
```
Stores references to objects — each element points to a `String` object.

### Array Length
```java
int n = arr.length;
```
`length` is a property, not a method — O(1).

### Mutability (IMPORTANT NOTE)
Arrays are mutable objects — elements can be changed:

```java
arr[0] = 10;
```
Mutability is unrelated to primitive vs object types. Arrays are mutable by design; `String` is immutable by class design.

### When to Use Arrays
- Size is known beforehand
- Fast access required
- Performance-critical code

### When NOT to Use Arrays
- Dynamic resizing needed
- Frequent insertions/deletions

### Time Complexity
| Operation | Time |
|---|---:|
| Access by index | O(1) |
| Traversal | O(n) |
| Search | O(n) |

