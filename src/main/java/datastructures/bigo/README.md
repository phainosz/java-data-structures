# Big O

## Time complexity
- Always measure with worst case scenario.
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/).

## O(1)
- Constant time algorithm.
- There is no dependence on the input size. Only one execution.
- Getting an array value using the index is O(1).

## O(n)
- Linear time algorithm.
- Iteration that depends on the input size.
- Iterate an array is O(n).

## O(log n)
- Logarithmic time algorithm.
- When the data decreases in each step by a certain factor.
- Divide and conquer.
- Binary search in a binary tree is an example for this case.

## O(n^2)
- Quadratic time algorithm.
- The performance is directly related to the squared size of the input.
- Nested iteration is an example of quadratic algorithm.

## O(2^n)
- Exponential time algorithm.
- With each addition to the input, the growth rate doubles.
- A fibonacci with recursion is an example of exponential algorithm.

## Rules of simplification
- Drop Constants is when you have something like this **O(n + n)** and simplifies to this **O(n)**.
    - Two loops not nested is O(n).
- Drop Non-Dominants is when you have **O(n^2 + n)** and simplifies to **O(n^2)**.
    - Nested loops grows faster than a single loop, meaning the dominant term is the O(n^2).