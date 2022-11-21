# Unique partitions
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a positive integer <strong style="user-select: auto;">n</strong>, generate all possible unique ways to represent <strong style="user-select: auto;">n</strong> as sum of positive integers.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:&nbsp;</strong>The generated output is&nbsp;printed without partitions.&nbsp;Each partition must be&nbsp;in decreasing order. Printing of all the partitions is done in reverse sorted order.&nbsp;</span><br style="user-select: auto;">
<br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>n = 3
<strong style="user-select: auto;">Output: </strong>3 2 1 1 1 1
<strong style="user-select: auto;">Explanation: </strong>For n = 3, 
{3}, {2, 1} and {1, 1, 1}.</span>
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>n = 4 
<strong style="user-select: auto;">Output: </strong>4 3 1 2 2 2 1 1 1 1 1 1
<strong style="user-select: auto;">Explanation: </strong>For n = 4, 
{4}, {3, 1}, {2, 2}, {2, 1, 1}, {1, 1, 1, 1}.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">UniquePartitions()&nbsp;</strong>which takes n as input parameter and returns a list of all possible combinations in lexicographically decreasing order.&nbsp;</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(2^n)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(n)</span><br style="user-select: auto;">
<br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= n &lt;= 25</span></p>
</div>