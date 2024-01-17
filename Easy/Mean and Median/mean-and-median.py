#code

def calculate_mean(numbers): return sum(numbers) / len(numbers)

def calculate_median(numbers):
    n = len(numbers)
    sorted_numbers = sorted(numbers)

    if n % 2 == 0:
        middle1 = sorted_numbers[n // 2 - 1]
        middle2 = sorted_numbers[n // 2]
        return (middle1 + middle2) / 2
    else:
        return sorted_numbers[n // 2]
        
def absolute_difference_mean_median(numbers):
    mean = calculate_mean(numbers)
    median = calculate_median(numbers)
    return abs(mean - median)

t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))

    result = absolute_difference_mean_median(arr)
    print("{:.6f}".format(result))
