<h2><a href="https://www.geeksforgeeks.org/batch/competitive-programming/track/cp-basic-problem-practice/problem/tribonacci-sequence">Tribonacci Sequence</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px"><strong>N<sup>th</sup></strong> Fibonacci number is defined by <strong>F(n) = F(n-1) + F(n-2)</strong>.<br>
Similarly,&nbsp;<strong>N<sup>th</sup></strong> Tribonacci number is defined by <strong>T(n) = T(n-1) + T(n-2) + T(n-3)</strong>.<br>
Given first three numbers of Tribonacci sequence, find the <strong>N<sup>th</sup></strong> Tribonacci number modulo 10<sup>9</sup> + 7.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Input:</strong><br>
1.&nbsp;The first line of the input contains a single integer<em> </em> <strong>T</strong> denoting the number of test cases. The description of&nbsp;<strong>T</strong> test cases follows.<br>
2.&nbsp;The first line of each test case contains an integer <strong>N</strong>.<br>
3.&nbsp;The second line of each test case contains three space-separated integers <strong>T[1]</strong>,<strong> T[2] </strong>and<strong> T[3]</strong>.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Output:</strong> For each test case, print the answer.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1. 1 ≤ T ≤ 100</span><br>
<span style="font-size:18px">2. 4&nbsp;≤ N&nbsp;≤ 10</span><sup>5&nbsp;</sup><br>
<span style="font-size:18px">3. 1&nbsp;≤ T[1]&nbsp;≤ T[2]&nbsp;≤ T[3]</span><span style="font-size:18px">&nbsp;≤ 10<sup>9</sup></span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
2
4 
1 2 3
38746
1 23 678
<strong>Output:</strong>
6
332683912
<strong>Explanation: </strong>
<strong>Test Case 1 :</strong> T[4] = T[3] + T[2] + T[1] 
= 3 + 2 + 1 = 4</span></pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;