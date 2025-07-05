#include <bits/stdc++.h> // include all header file  
using namespace std; // using standard namespace
class Search{
public:
    void liner_Search(vector<int>&arr , int key){
        size_t n = arr.size();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == key){
                cout << "Key found at index =" << i << endl;
                return;
            }
        }
        cout << "Key is not found in the array." << endl;
    }
};

int main(){
    Search obj1; // creating a object
    int key,n; //declaring variable
    cout << "Enter the size of the array: "; //promt user for the size of the array
    cin >> n; //read size of teh array

    vector<int>arr(n); // declare a vector with size n
    cout << "Enter array elements: "; // promt user to enter array elements
    for(int i = 0 ; i < n ; i++){ // for loop
        
        cin >> arr[i]; //read evrey element
    }

    cout << "Enter the key:"; //promt user to enter the key 
    cin >> key; //read key 
    
    obj1.liner_Search(arr , key); //function call
}