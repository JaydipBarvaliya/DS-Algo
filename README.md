Click [here](https://drive.google.com/drive/folders/1pPShHEJsQOXM57kCt965WVymMzHg_3KD?usp=sharing) go to DSA :books: Books :books:	 

-----
#  Top-Down DP :vs:	 Bottom-Up D
Anyone who is getting confused with Top-down and bottom up, Recursion memoization is always TOP-DOWN(and not bottom up),
as we take a bigger problem and recusively solve for the smaller subproblems. Whereas in tabular DP where we start filling
the table from top left to bottom right is actually BOTTOM-UP because we compute dp values of smaller subproblems first and
then using these values compute dp value of bigger problems.

Recursion + memoization is called Top-Down DP and Tabulation method  is called Bottom-Up DP.

PS: Top down and Bottom up is decided by the essence of methodology and not by whether we are filling table from top to bottom or vice versa!

-----
# Longest Common Subsequence Recursive Visualization
![alt text](https://github.com/JaydipBarvaliya/DS_ALGO/blob/80eb53241a30053b43381b1a753ae68079aceabc/DP/Longest%20common%20subsequence%20Recursive.png?raw=true)

-----
# Print any 2D matrix
```java
for (int[] row : matrix)
    System.out.println(Arrays.toString(row));
```

-----
# Reverse a string in efficient way
```java
StringBuilder reverseStr = new StringBuilder();
reverseStr.append(str).reverse();
```

-----
# Initialize any matrix with any specific value ( Here it is -1)

```java
int[][] matrix = new int[len][len];
for (int[] row : matrix)
    Arrays.fill(row, -1);     
```
-----
# String to Character Array
```java
char[] ch = str.toCharArray();
```

-----
# == :vs: equals()

If you are working with the Character class and want to compare two char values, then use equals() method

with primitive char values, you can simply use the == equal operator


-----
# If given key is exist in the map then it will return corrosponding value otherwise it return the default given value by us here it's 500

```java
              //(key, defaultValue)
map.getOrDefault(200, 500) + 1  
```
-----

