# Array Traversal Patterns in Java

Array traversal means **visiting each element exactly once**.

---

## 1. Standard Index-Based Traversal

```java
for (int i = 0; i < arr.length; i++) {
	int value = arr[i];
}
```

Use when:
- Index matters
- Two pointers
- Sliding window
- Modify elements

## 2. Enhanced For Loop (For-Each)

```java
for (int val : arr) {
	// read-only access to val
}
```

Use when:
- Index is NOT required
- Read-only traversal

⚠️ Cannot modify array structure here (you can still assign to elements by index if you have indices separately).

## 3. Reverse Traversal

```java
for (int i = arr.length - 1; i >= 0; i--) {
	int v = arr[i];
}
```

Use in:
- Stack-based problems
- Next greater/smaller element

## 4. Two Pointer Traversal (VERY IMPORTANT)

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
	// process arr[left] and arr[right]
	left++;
	right--;
}
```

Used in:
- Sorted arrays
- Pair sum
- Palindrome checks

## 5. Sliding Window Traversal

```java
int left = 0;
for (int right = 0; right < arr.length; right++) {
	// expand window

	while (condition) {
		left++;
	}
}
```

Used in:
- Subarray problems
- Maximum/minimum window
- String windows

## Traversal Rule (MEMORIZE)
Every array problem is either:
- Simple traversal
- Two pointers
- Sliding window

