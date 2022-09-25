#include <iostream>
#include <math.h> 
using namespace std;

//finds if a number is prime by dividing by numbers less than n/2 bits
int computePowOfTwo(int n) {
    //This can be improved by using bitshift operations
    while((n & (n-1)) != 0) {
        n++;
    }
    return n;
}

bool isPrime(int n) {
    
    int stopAt = computePowOfTwo(n/2);
    
    for(int i = 2; i<= stopAt; i++) {
            
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
	
	int numbers [] = {3,5,8,9,23,43,28,39,40,50};
	string result = "";
	for(int i = 0; i < sizeof(numbers)/sizeof(numbers[0]); i++) {
	    result = isPrime(numbers[i]) ? "" : "NOT ";
	    cout<<"The number " << numbers[i] << " is " << result << "a prime number"<<endl;
	}
	return 0;
}


