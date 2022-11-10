# Eventual Safe States
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A directed graph of <strong style="user-select: auto;">V</strong> vertices and <strong style="user-select: auto;">E</strong> edges is given in the form of an adjacency list <strong style="user-select: auto;">adj</strong>. Each node of the graph is labelled with a distinct integer in the range <strong style="user-select: auto;">0</strong> to <strong style="user-select: auto;">V - 1</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A node is a <strong style="user-select: auto;">terminal node</strong> if there are no outgoing edges. A node is a <strong style="user-select: auto;">safe node</strong> if every possible path starting from that node leads to a <strong style="user-select: auto;">terminal node</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You have to return an array containing all the <strong style="user-select: auto;">safe nodes</strong> of the graph. The answer should be sorted in <strong style="user-select: auto;">ascending</strong> order.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong>

<img alt="" src="https://media.geeksforgeeks.org/img-practice/booker1-1655493978.png" style="height: 348px; width: 386px; user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">2 4 5 6</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">The given graph is shown above.</span>
<span style="font-size: 18px; user-select: auto;">Nodes 5 and 6 are terminal nodes as there are no 
outgoing edges from either of them. </span>
<span style="font-size: 18px; user-select: auto;">Every path starting at nodes 2, 4, 5, and 6 all 
lead to either node 5 or 6.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong>

<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><img alt="" src="https://media.geeksforgeeks.org/img-practice/booker2-1655494315.png" style="user-select: auto;"></span></strong>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Output:</span></strong>
<span style="font-size: 18px; user-select: auto;">3</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation:</span></strong>
<span style="font-size: 18px; user-select: auto;">Only node 3 is a terminal node, and every path 
starting at node 3 leads to node 3.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">eventualSafeNodes</strong><strong style="user-select: auto;">()&nbsp;</strong>which takes an integer&nbsp;<strong style="user-select: auto;">V</strong> denoting no. of vertices and <strong style="user-select: auto;">adj</strong> denoting adjacency list of the graph and returns an array of <strong style="user-select: auto;">safe nodes</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(V + E)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong> O(V)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= V &lt;= 10<sup style="user-select: auto;">4</sup></span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 &lt;= E &lt;= 10<sup style="user-select: auto;">4</sup></span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The graph won't contain self loops.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Each node in the graph has a distinct value in the range 0 to V - 1.</span></li>
</ul>
</div>