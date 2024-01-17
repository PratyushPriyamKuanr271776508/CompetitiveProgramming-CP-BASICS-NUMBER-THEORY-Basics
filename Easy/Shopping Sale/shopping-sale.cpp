#include<bits/stdc++.h>
using namespace std;

void solve() {
    int n,k;
    cin>>n>>k;
    long long* arr = new long long[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    sort(arr, arr+n);
    long long ans = 0;
    int s=0,e = n;
    while(s+k<e) {
        s += k;
        e--;
    }
    for(int i=0;i<e;i++) ans+=arr[i];
    cout<<ans<<"\n";
    delete [] arr;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int t;
    cin>>t;
    while(t--) solve();
    return 0;
}