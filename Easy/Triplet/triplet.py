#code
from collections import Counter
t = int(input())
for _ in range(t):
    N = int(input())
    lst = [int(x) for x in input().split()]
    count = Counter(lst)
    print("yes" if count.most_common(1)[0][1] >= 3 else "no")