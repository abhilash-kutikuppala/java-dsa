# Array + HashMap Patterns

---

## Pattern 1: Frequency Count

```java
Map<Integer, Integer> freq = new HashMap<>();

for (int num : arr) {
	freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```
Used in:

- Majority element
- Anagram
- Duplicate count

## Pattern 2: First Duplicate

```java
Set<Integer> seen = new HashSet<>();

for (int num : arr) {
	if (seen.contains(num)) {
		// first duplicate found
		break;
	}
	seen.add(num);
}
```

## Pattern 3: Value → Index Mapping (Two Sum)

```java
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < arr.length; i++) {
	int targetValue = target - arr[i];

	if (map.containsKey(targetValue)) {
		return new int[]{map.get(targetValue), i};
	}

	map.put(arr[i], i);
}
```

## Pattern 4: Prefix Sum + HashMap (VERY IMPORTANT)

```java
Map<Integer, Integer> prefixMap = new HashMap<>();
prefixMap.put(0, 1);

int sum = 0;

for (int num : arr) {
	sum += num;

	if (prefixMap.containsKey(sum - k)) {
		// subarray found
	}

	prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
}
```

## Interview Notes (READ BEFORE SOLVING)
- Subarray + sum → prefix sum
- Pair problems → HashMap
- Frequency → `getOrDefault`
- Reduce nested loops whenever possible

