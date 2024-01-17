#code
t = int(input())
for _ in range(t):
    N = int(input())
    print("YES {}".format((2*N+1)//3) if N%3 == 1 else "NO")