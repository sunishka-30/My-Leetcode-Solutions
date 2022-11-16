# Minimum Multiplications to reach End
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given <strong style="user-select: auto;">start</strong>, <strong style="user-select: auto;">end</strong> and an array <strong style="user-select: auto;">arr</strong> of <strong style="user-select: auto;">n</strong>&nbsp;numbers. At each step, <strong style="user-select: auto;">start</strong> is multiplied with any number in the array and then mod operation with <strong style="user-select: auto;">100000</strong> is done to get the new start. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your task is to find the minimum steps in which <strong style="user-select: auto;">end</strong> can be achieved starting from <strong style="user-select: auto;">start</strong>. If it is not possible to reach <strong style="user-select: auto;">end</strong>, then return <strong style="user-select: auto;">-1</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
arr[] = {2, 5, 7}
start = 3, end = 30
<strong style="user-select: auto;">Output:</strong>
2
<strong style="user-select: auto;">Explanation:</strong>
Step 1: 3*2 = 6 % 100000 = 6 
Step 2: 6*5 = 30 % 100000 = 30
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
arr[] = {3, 4, 65}
start = 7, end = 66175
<strong style="user-select: auto;">Output:</strong>
4
<strong style="user-select: auto;">Explanation:</strong>
Step 1: 7*3 = 21 % 100000 = 21&nbsp;
Step 2: 21*3 = 6 % 100000 = 63&nbsp;
Step 3: 63*65 = 4095 % 100000 = 4095&nbsp;
Step 4: 4095*65 = 266175 % 100000 = 66175
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to print or input anything. Complete the function <strong style="user-select: auto;">minimumMultiplications()</strong> which takes an integer array <strong style="user-select: auto;">arr</strong>, an integer <strong style="user-select: auto;">start</strong> and an integer<strong style="user-select: auto;"> end</strong> as the input parameters and returns an integer, denoting the minumum steps to reach in which <strong style="user-select: auto;">end</strong> can be achieved starting from <strong style="user-select: auto;">start</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(10<sup style="user-select: auto;">5</sup>)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong> O(10<sup style="user-select: auto;">5</sup>)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= n and n &lt;= 10<sup style="user-select: auto;">4</sup></span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= arr[i] and arr[i] &lt;= 10<sup style="user-select: auto;">4</sup></span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= start, end &lt;= 10<sup style="user-select: auto;">5</sup></span></li>
</ul>
</div>