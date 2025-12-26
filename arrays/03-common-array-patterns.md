# Common Array Patterns (Interview Focused)

---

## Pattern 1: Find Maximum / Minimum

```java
int max = arr[0];
for (int num : arr) {
	max = Math.max(max, num);
}
```
Time: O(n)

## Pattern 2: Prefix Sum
Prefix sum helps answer range / subarray queries efficiently.

```java
int[] prefix = new int[arr.length];
prefix[0] = arr[0];

for (int i = 1; i < arr.length; i++) {
	prefix[i] = prefix[i - 1] + arr[i];
}
```
Used in:

- Subarray sum
- Range sum queries

## Pattern 3: Sorting + Traversal

```java
Arrays.sort(arr);
```
Used in:

- Two pointer problems
- Greedy algorithms

⚠️ Sorting changes order → be careful

## Pattern 4: Count Occurrences
Handled using `HashMap` (see HashMap section)

## Interview Notes
- If brute force is O(n²), think `HashMap`.
- If subarray or range → think prefix sum.
- If sorted + pair → think two pointers.

