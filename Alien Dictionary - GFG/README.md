# Alien Dictionary
## Hard
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a sorted dictionary of an alien language having N words and&nbsp;k starting alphabets of standard dictionary. Find the order of characters in the alien language.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong>&nbsp;Many orders may be&nbsp;possible for a particular test case, thus&nbsp;you may return any valid order and&nbsp;output will be 1 if the order of string returned by the function is correct else 0 denoting incorrect string returned.</span><br style="user-select: auto;">
&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: 
</strong>N = 5, K = 4
dict = {"baa","abcd","abca","cab","cad"</span><span style="font-size: 18px; user-select: auto;">}
<strong style="user-select: auto;">Output:
</strong>1
<strong style="user-select: auto;">Explanation:
</strong>Here order of characters is 
'b', 'd', 'a', 'c' Note that words are sorted 
and in the given language "baa" comes before 
"abcd", therefore 'b' is before 'a' in output.
Similarly we can find other orders.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: 
</strong>N = 3, K = 3
dict = {"caa","aaa","aab"}
<strong style="user-select: auto;">Output:
</strong>1
<strong style="user-select: auto;">Explanation:
</strong>Here order of characters is
'c', 'a', 'b' Note that words are sorted
and in the given language "caa" comes before
"aaa", therefore 'c' is before 'a' in output.
Similarly we can find other orders.
</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">findOrder()&nbsp;</strong>which takes </span>&nbsp;<span style="font-size: 18px; user-select: auto;">the string array dict[], its size N&nbsp;and the integer K as input parameter&nbsp;and returns a string denoting the order of characters in the alien language.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N * |S| + K) , where |S| denotes maximum length.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Compelxity:&nbsp;</strong>O(K)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N, M ≤ 300<br style="user-select: auto;">
1 ≤ K&nbsp;≤ 26<br style="user-select: auto;">
1 ≤ Length of words&nbsp;≤ 50</span></p>
</div>