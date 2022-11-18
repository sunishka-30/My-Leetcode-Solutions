# City With the Smallest Number of Neighbors at a Threshold Distance
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">There are n&nbsp;cities numbered from 0&nbsp;to n-1. Given the array edges&nbsp;where <strong style="user-select: auto;">edges[i] = [from<sub style="user-select: auto;">i&nbsp;</sub>, to<sub style="user-select: auto;">i ,</sub>weight<sub style="user-select: auto;">i</sub>]<sub style="user-select: auto;">&nbsp;</sub></strong>&nbsp;represents a bidirectional and weighted edge between cities from<sub style="user-select: auto;">i</sub>&nbsp;and to<sub style="user-select: auto;">i</sub>, and given the integer distance Threshold. You need to find out a city&nbsp;with the smallest number of cities that are reachable through some path and whose distance is&nbsp;<strong style="user-select: auto;">at most</strong>&nbsp;Threshold Distance, If there are multiple such cities, our answer will&nbsp;be the city with the greatest number.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong> that the distance of a path connecting cities&nbsp;<em style="user-select: auto;"><strong style="user-select: auto;">i</strong></em>&nbsp;and&nbsp;<em style="user-select: auto;"><strong style="user-select: auto;">j</strong></em>&nbsp;is equal to the sum of the edges' weights along that path.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong>
<span style="font-size: 18px; user-select: auto;">N=4,M=4</span>
<span style="font-size: 18px; user-select: auto;">edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]]</span>
<span style="font-size: 18px; user-select: auto;">distanceThreshold = 4</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Output:</span></strong><span style="font-size: 18px; user-select: auto;">3</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explaination:</span></strong><span style="font-size: 18px; user-select: auto;">The neighboring cities at a distanceThreshold = 4 for each city are:
City 0 -&gt; [City 1, City 2]&nbsp;
City 1 -&gt; [City 0, City 2, City 3]&nbsp;
City 2 -&gt; [City 0, City 1, City 3]&nbsp;
City 3 -&gt; [City 1, City 2]&nbsp;
Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">findCity( )&nbsp;</strong>which takes a No of nodes N and vector of edges and ThresHold Distance. and Return the city with the smallest number of cities that are reachable through some path and whose distance is&nbsp;<strong style="user-select: auto;">at most</strong>&nbsp;Threshold Distance, If there are multiple such cities, return the city with the greatest number.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(V^2 + EVlogV)</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;&nbsp;</strong>O(N^3)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N≤ 100<br style="user-select: auto;">
1 &lt;= edges.length &lt;= n*(n-1)/2<br style="user-select: auto;">
edges[i].length == 3<br style="user-select: auto;">
0 &lt;= from<sub style="user-select: auto;">i&nbsp;</sub>&lt; to<sub style="user-select: auto;">i</sub>&nbsp;&lt; n<br style="user-select: auto;">
1 &lt;= weight<sub style="user-select: auto;">,&nbsp;</sub>distanceThreshold &lt;= 10^4<br style="user-select: auto;">
All pairs (from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>) are distinct</span></p>
</div>