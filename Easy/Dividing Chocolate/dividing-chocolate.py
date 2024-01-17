#code
t = int(input())
for _ in range(t):
    a, b, c = (int(x) for x in input().split())
    if c <= abs(a-b):
        print('{:.6f} {:.6f}'.format(a, b+c) if a > b else '{:.6f} {:.6f}'.format(a+c, b))
        continue
    m = max(a, b)
    c -= abs(a-b)
    print('{:6f} {:6f}'.format(m+c/2, m+c/2))