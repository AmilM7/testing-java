#include <iostream>
using namespace std ;
bool iscomposite ( int a) {
    int counter = 0 ;
for (int i (2); i<=a ; i++) {
      if ( a % i == 0) counter++;
if ( counter >= 2) return true;
}
return false ;
}
int main () {
int a, b ;
cout << " Please enter two numbers ";
cin >> a >> b ;
bool kernel = false ;
cout << " Composite numbers between these numbers are: ";
for ( a; a<=b ; a++ ) {
    if (iscomposite (a) ) {
        cout << a << " ";
        kernel = true ;
    }
}
if ( !kernel) cout << " not ";
return 0;


}
