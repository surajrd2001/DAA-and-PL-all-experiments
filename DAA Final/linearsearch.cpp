#include <bits/stdc++.h> 
using namespace std;
int linear_search(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
            return i;
    }
    return -1;
}
int main()
{
    int n;
    cout << "How many element\n";
    cin >> n;
    cout << "enter the element\n";
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cout << "Enter a key\n";
    int key;
    cin >> key;
    int ans = linear_search(arr, n, key);
    if (ans == -1)
        cout << "key is not present\n";
    else
        cout << "Key is present at index" << ans << "\n";
    return 0;
}
