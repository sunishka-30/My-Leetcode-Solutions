# Smallest number on left
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 20px; user-select: auto;">Given an array <strong style="user-select: auto;">a&nbsp;</strong>of integers of length <strong style="user-select: auto;">n</strong>, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 20px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3
a = {1, 6, 2}
<strong style="user-select: auto;">Output:</strong> -1 1 1
<strong style="user-select: auto;">Explaination:</strong> There is no number at the 
left of 1. Smaller number than 6 and 2 is 1.</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 20px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6
a = {1, 5, 0, 3, 4, 5}
<strong style="user-select: auto;">Output:</strong> -1 1 -1 0 3 4
<strong style="user-select: auto;">Explaination:</strong> Upto 3 it is easy to see 
the smaller numbers. But for 4 the smaller 
numbers are 1, 0 and 3. But among them 3 
is closest. Similary for 5 it is 4.</span></pre>

<p style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">leftSmaller()</strong> which takes n and a as input parameters and returns the list of smaller numbers.</span></p>

<p style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(n)</span></p>

<p style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ n ≤ 10000<br style="user-select: auto;">
0 ≤ a[i] ≤ 10<sup style="user-select: auto;">4</sup>&nbsp;&nbsp;</span></p>
</div>