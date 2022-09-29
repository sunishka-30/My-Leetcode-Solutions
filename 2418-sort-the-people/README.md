<h2><a href="https://leetcode.com/problems/sort-the-people/">2418. Sort the People</a></h2><h3>Easy</h3><hr><div style="user-select: auto;" data-read-aloud-multi-block="true"><p style="user-select: auto;">You are given an array of strings <code style="user-select: auto;">names</code>, and an array <code style="user-select: auto;">heights</code> that consists of <strong style="user-select: auto;">distinct</strong> positive integers. Both arrays are of length <code style="user-select: auto;">n</code>.</p>

<p style="user-select: auto;">For each index <code style="user-select: auto;">i</code>, <code style="user-select: auto;">names[i]</code> and <code style="user-select: auto;">heights[i]</code> denote the name and height of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person.</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">names</code><em style="user-select: auto;"> sorted in <strong style="user-select: auto;">descending</strong> order by the people's heights</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> names = ["Mary","John","Emma"], heights = [180,165,170]
<strong style="user-select: auto;">Output:</strong> ["Mary","Emma","John"]
<strong style="user-select: auto;">Explanation:</strong> Mary is the tallest, followed by Emma and John.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> names = ["Alice","Bob","Bob"], heights = [155,185,150]
<strong style="user-select: auto;">Output:</strong> ["Bob","Alice","Bob"]
<strong style="user-select: auto;">Explanation:</strong> The first Bob is the tallest, followed by Alice and the second Bob.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == names.length == heights.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">3</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= names[i].length &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= heights[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">names[i]</code> consists of lower and upper case English letters.</li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">heights</code> are distinct.</li>
</ul>
</div>