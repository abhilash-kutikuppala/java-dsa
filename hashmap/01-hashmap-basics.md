# HashMap Basics

- **Definition:** Key-value store with average O(1) lookup, insertion, deletion.
- **Collision handling:** chaining (lists) or open addressing.
- **Java class:** `HashMap<K,V>`; not synchronized — use `ConcurrentHashMap` if needed.

## Notes

- Choose appropriate initial capacity and load factor for performance.
- Use `LinkedHashMap` for predictable iteration order, `TreeMap` for sorted keys.
