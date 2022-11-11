# Course Schedule
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">There are a total of <strong style="user-select: auto;">n</strong> tasks you have to pick, labeled from 0 to n-1. Some tasks may have <strong style="user-select: auto;">prerequisites </strong>tasks, for example to pick task 0 you have to first finish tasks 1, which is expressed as a pair: [0, 1]<br style="user-select: auto;">
Given the total number of <strong style="user-select: auto;">n</strong> tasks and a list of prerequisite pairs of size <strong style="user-select: auto;">m</strong>. Find a ordering of tasks you should pick to finish all tasks.</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note: </strong>There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all tasks, return an empty array. Returning any correct order will give the output as <strong style="user-select: auto;">1</strong>, whereas any invalid order will give the output <strong style="user-select: auto;">0.</strong> </span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 2, m = 1
prerequisites = {{1, 0}}
<strong style="user-select: auto;">Output:
</strong>1<strong style="user-select: auto;">
Explanation:
</strong>The output 1 denotes that the order is
valid. So, if you have, implemented
your function correctly, then output
would be 1 for all test cases.</span>
<span style="font-size: 18px; user-select: auto;">One possible order is [0, 1].</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 4, m = 4
prerequisites = {{1, 0},
                 {2, 0},
                 {3, 1},
                 {3, 2}}
<strong style="user-select: auto;">Output:
</strong>1<strong style="user-select: auto;">
Explanation:
</strong>There are a total of 4 tasks to pick.
To pick task 3 you should have finished
both tasks 1 and 2. Both tasks 1 and 2
should be pick after you finished task 0.
So one correct task order is [0, 1, 2, 3].
Another correct ordering is [0, 2, 1, 3].
Returning any of these order will result in
a Output of 1.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
The task is to complete the function <strong style="user-select: auto;">findOrder</strong>() which takes two integers n, and m and a list of lists of size m*2 denoting the prerequisite pairs as input and returns any correct order to finish all the tasks. Return an empty array if it's impossible to finish all tasks.</span></p>

<div style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ n ≤ 10<sup style="user-select: auto;">4</sup></span>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 ≤ m ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
0 ≤&nbsp;prerequisites[0],&nbsp;prerequisites[1] ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
All prerequisite pairs are unique</span></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">prerequisites[0]&nbsp;≠&nbsp;prerequisites[1]</span></div>
</div>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n+m).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(n+m).</span></p>
</div>