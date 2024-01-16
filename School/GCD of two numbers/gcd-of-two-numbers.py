#User function Template for python3

class Solution:
    def gcd(self, A, B):
        #code here
        # We are performing this solution by the division method
        while A != 0 and B != 0: # This means if get 0 for any of these 2 variables then the other one wil be the GCD
            if A > B: #This means there is a possibility of A dividing B
                A = A%B
            else: 
                B = B%A
        
        if A == 0: return B # As B here will give the GCD
        return A # This is when A is not zero


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        A,B = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.gcd(A,B))
# } Driver Code Ends