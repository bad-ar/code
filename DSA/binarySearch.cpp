#include<bits/stdc++.h>
using namespace std;
class Search {
    public:
    //function to binary search
    void binarySearch(vector<int> &arr , int key){
        int low = 0;
        int high = arr.size() -1;
        while(low <= high){
            int mid = low + (high - low) / 2; // to avoid overflow
            if(arr[mid] == key){
                cout << "Element found at index: " << mid << endl;
                return; 
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        cout << "Element not found" << endl;
    }
};

int main(){
    Search obj1; //creating an object of Search class

    int key , n; // declaring variables
    cout << "Enter the number of elements in the array: "; //prompting user for input   
    cin >> n; // reading the number of elements
    vector<int> arr(n); // declaring a vector of size n
    cout << "Enter the elements of the array: "; //prompting user for input
    for(int i = 0; i < n; i++){ 
        cin >> arr[i]; // reading the elements of the array
    }
    cout << "Enter the element to search: "; //prompting user for input
    cin >> key; // reading the element to search
    obj1.binarySearch(arr, key);
}