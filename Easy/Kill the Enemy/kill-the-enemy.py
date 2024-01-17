#code
import math
t = int(input())
for _ in range(t):
    a, b, d, r, XP = (int(x) for x in input().split())
    # We have to check when a reaches 1
    i = 1
    A, B = a, b
    s = 0
    while i <= 100:
        s += A*B
        if s >= XP: 
            print(i)
            break
        A, B = A-d, B*r 
        i += 1
    if i == 101: print(-1)
        