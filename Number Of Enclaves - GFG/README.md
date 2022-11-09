# Number Of Enclaves
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You are given an <strong style="user-select: auto;">n&nbsp;x m</strong>&nbsp;binary matrix <strong style="user-select: auto;">grid</strong>, where <strong style="user-select: auto;">0</strong> represents a sea cell and <strong style="user-select: auto;">1</strong> represents a land cell.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Find the number of land cells in <strong style="user-select: auto;">grid</strong> for which we cannot walk off the boundary of the grid in any number of moves.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;">grid[][] = {{0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">0 0 0 0
1 0 <strong style="user-select: auto;">1</strong> 0
0 <strong style="user-select: auto;">1</strong> <strong style="user-select: auto;">1</strong> 0
0 0 0 0</span>
<span style="font-size: 18px; user-select: auto;">The highlighted cells represents the land cells.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;">grid[][] = {{0, 0, 0, 1},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 1},
            {0, 1, 1, 0}}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">4</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">0 0 0 1
0 <strong style="user-select: auto;">1</strong> <strong style="user-select: auto;">1</strong> 0
0 <strong style="user-select: auto;">1</strong> <strong style="user-select: auto;">1</strong> 0
0 0 0 1
0 1 1 0</span>
<span style="font-size: 18px; user-select: auto;">The highlighted cells represents the land cells.</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to print or input anything. Complete the function <strong style="user-select: auto;">numberOfEnclaves()&nbsp;</strong>which takes a 2D integer matrix <strong style="user-select: auto;">grid&nbsp;</strong>as the input parameter and returns an integer, denoting the number of land cells.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n * m)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong> O(n * m)</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constraints:</span></strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= n, m &lt;= 500</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">grid[i][j] == 0 or 1</span></li>
</ul>
</div>