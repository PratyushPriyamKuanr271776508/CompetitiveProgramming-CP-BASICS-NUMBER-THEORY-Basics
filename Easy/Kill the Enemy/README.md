<h2><a href="https://www.geeksforgeeks.org/batch/competitive-programming/track/cp-basic-problem-practice/problem/kill-the-enemy">Kill the Enemy</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Geek is playing a video game in which he has to kill the enemy before the enemy kills his character. Rules of the video game are as follows :&nbsp;<br>
1.&nbsp;Geek's character does damage to enemy every second. Whenever Geek does damage to enemy, enemy's <strong>XP</strong> decreases by that much amount. Enemy is assumed to be killed if his <strong>XP</strong> becomes zero or negative.<br>
2. Damage depends on two things - strength and anger. Initially i.e. in the first second strength of Geek's character is <strong>a</strong> and his anger is <strong>b</strong>. Damage done at any second is product of strength and anger at that time i.e. in the first second damage done is <strong>a * b</strong>.<br>
3. Every second strength decreases by <strong>d</strong> i.e. if strength in <strong>i<sup>th</sup></strong> second is <strong>x</strong> then in <strong>(i+1)<sup>th</sup></strong> second strength becomes <strong>x - d</strong>.<br>
4. Every second anger increases by <strong>r</strong> times&nbsp;i.e. if anger in <strong>i<sup>th</sup></strong>&nbsp;second is <strong>x</strong> then in <strong>(i+1)<sup>th</sup></strong> second anger becomes <strong>x * r</strong>.<br>
5. If enemy is not killed within 100 seconds then enemy will kill the Geek's character.<br>
You are given <strong>a</strong>, <strong>b</strong>, <strong>d</strong>, <strong>r</strong> and <strong>XP</strong> of the enemy before start of the game. You have to find out minimum time in seconds, Geek's character will take to kill the enemy or print <strong>"-1"</strong> if it is impossible to kill the enemy.<br>
It is guaranteed that damage done&nbsp;is positive at any point of time before enemy is killed.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Input:</strong><br>
1.&nbsp;The first line of the input contains a single integer<em> </em> <strong>T</strong> denoting the number of test cases. The description of&nbsp;<strong>T</strong> test cases follows.<br>
2.&nbsp;The first line of each test case contains five space-separated integers <strong>a</strong>, <strong>b</strong>, <strong>d</strong>, <strong>r</strong> and <strong>XP</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Output:</strong> For each test case, print the answer.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1. 1 ≤ T ≤ 10<sup>4</sup><br>
2. 1&nbsp;≤ a, b, d&nbsp;≤ 10<sup>9</sup><br>
3. 1&nbsp;≤ r&nbsp;≤ 9<br>
4. 1&nbsp;≤ XP&nbsp;≤ 10<sup>15</sup></span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
2
10 2 1 1 40
100 1 1 1 1000000
<strong>Output:</strong>
3
-1
<strong>Explanation:</strong>
<strong>Test Case 1 :</strong> Damage done in first three 
seconds is :
(10 - 0 * 1) * (2 * 1<sup>0</sup>) = 20,
(10 - 1 * 1) * (2 * 1<sup>1</sup>) = 18 
and (10 - 2 * 1) * (2 * 1<sup>2</sup>) = 16 respectively. 
Since 20 + 18 + 16 = 54 &gt; 40, enemy is killed 
in the third second.
<strong>Test Case 2 :</strong> Total damage done in 100 
seconds is less than the XP of the enemy.</span>
</pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;