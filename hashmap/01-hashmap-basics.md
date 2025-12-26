# HashMap Basics in Java

## What is HashMap?
HashMap stores data as **key-value pairs**.

```java
Map<Integer, Integer> map = new HashMap<>();
```

### Why HashMap?
- Fast lookup
- Avoid nested loops
- Reduce time complexity from O(n²) → O(n)

### Core Operations

Put
```java
map.put(key, value);
```

Get
```java
map.get(key);
```

Contains Key
```java
map.containsKey(key);
```

getOrDefault (VERY IMPORTANT)
```java
map.put(num, map.getOrDefault(num, 0) + 1);
```
Used for:
- Frequency counting
- Anagrams
- Duplicate detection

### Iterating a HashMap
```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	int key = entry.getKey();
	int value = entry.getValue();
}
```

### Time Complexity (average)
| Operation | Avg |
|---|---:|
| put | O(1) |
| get | O(1) |
| containsKey | O(1) |

(Java 8+ handles collisions using balanced trees for heavy bins.)

### Important Notes
- `HashMap` stores objects, not primitives — `int` is auto-boxed to `Integer`.
- Order is NOT guaranteed.

