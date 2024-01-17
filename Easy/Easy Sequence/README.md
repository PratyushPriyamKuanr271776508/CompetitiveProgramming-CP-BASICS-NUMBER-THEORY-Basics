<h2><a href="https://www.geeksforgeeks.org/batch/competitive-programming/track/cp-basic-problem-practice/problem/easy-sequence">Easy Sequence</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Geek recently started learning about sequences. He came across an easy sequence where <strong>N<sup>th</sup></strong> term is defined as :<br>
<strong>a(N) = a(N - 1) * a(N - 2) * a(N - 3) * ... * a(2) * a(1) * a(0) + 1</strong> where <strong>a(0) = 2</strong>.<br>
As you are his firend, he challenged you to find the <strong>N<sup>th</sup></strong> term of this sequence. If you do so, Geek will consider&nbsp;that you are an expert in mathematics.<br>
As answer can be very large, find it modulo 10<sup>9</sup> + 7.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Input:</strong><br>
1.&nbsp;The first line of the input contains a single integer<em> </em> <strong>T</strong> denoting the number of test cases. The description of&nbsp;<strong>T</strong> test cases follows.<br>
2.&nbsp;The first line of each test case contains one&nbsp;integer&nbsp;<strong>N</strong>.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Output:</strong> For each test case, print the answer.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1. 1 ≤ T ≤ 10<sup>5</sup><br>
2. 1&nbsp;≤ N&nbsp;≤ 10<sup>5</sup></span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
2
2
3749
<strong>Output:</strong>
7
317982199
<strong>Explanation:</strong>
<strong>Test Case 1 :</strong> a(0) = 2, 
a(1) = a(0) + 1 = 2 + 1 = 3
a(2) = a(1) * a(0) + 1 = 3 * 2 + 1 = 7</span>
</pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;