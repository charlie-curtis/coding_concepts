#include <iostream>
using namespace std;

//returns 2^n
int exponential(int n) {
    
    if(n == 0) {
        return 1;
    }
    return 2*exponential(n-1);
}

//sums positive numbers from 0 to n
int recursiveSum(int n) {
    if(n<0) {
        return -1;
    }
    if(n ==0){
        return 0;
    }
    return n + recursiveSum(n-1);
}
// sums positive numbers from 0 to n
int fastSum(int n){
    return (n * (n+1)) / 2;   
}

int main() {
	
	cout << exponential(3) << endl;
	cout << recursiveSum(5) << endl;
	cout << fastSum(5) << endl;
    
	return 0;
}


