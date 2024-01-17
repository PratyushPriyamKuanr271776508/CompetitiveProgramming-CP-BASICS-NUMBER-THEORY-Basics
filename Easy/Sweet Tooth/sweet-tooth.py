def sweet_tooth(n):
    for i in range(n):
        N = input()
        arr = [int(j) for j in N]
        res = []
        for l in range(1, len(arr)):
            res.append(sum(arr[:len(arr) - l]) * sum(arr[len(arr) - l: len(arr)]))
        print(max(res))


n = int(input())
sweet_tooth(n)