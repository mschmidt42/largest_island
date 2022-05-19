# Largest Island


You are given a map consisting of n×mn \times  n*m (1 <= n, m <= 500)  square tiles. Each tile can be either a land (represented by as hash #) or an ocean (represented by a dot .). Tiles are connected by its four sides (left, right, top, bottom). Groups of connected land tiles form an island. There might be multiple islands on a map. What is the size of the largest island?

Please write a function, that for a given map description returns the largest island on it, i.e. the largest area of connected land. Note that an island can consist of only one tile.

## Example 1
Input

```
n = 5
m = 4
tiles = ["..#.",
         "..##",
         "...#",
         "##..",
         "...#"]
```
Output

```
4
```


Largest land area (island) consists of 4 tiles.

## Example 2
Input

```
n = 2
m = 2
tiles = ["#.",
         ".#"]
```

Output

```
1
```
Explanation

Land tiles need to share a side in order to consider them adjacent in this task. On this map there are two island, each with area of 1.


