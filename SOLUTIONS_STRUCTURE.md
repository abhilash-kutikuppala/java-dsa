
Proposed solutions folder structure (renamed to `leetcode-solutions` and categorized)

leetcode-solutions/
- arrays/
  - two-sum/
    - Solution.java
  - container-with-most-water/
    - Solution.java
- frequency-patterns/
  - count-elements-with-max-frequency/
    - Solution.java

Notes:
- Each problem has its own folder containing `Solution.java`.
- To compile a single solution from the repository root:

```
javac leetcode-solutions/arrays/two-sum/Solution.java
java -cp leetcode-solutions/arrays/two-sum Solution
```

- If you make classes `public` or add packages, adjust filenames and classnames accordingly.
