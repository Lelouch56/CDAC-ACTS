#include<iostream>
using namespace std;

class Array {
    int size;
    int *a;
public:
    Array(){
        size = 5;
        a = new int[size];
        for (int i = 0; i < size; i++) {
            cout << "Enter integer at index " << i << " : " << endl;
            cin >> a[i];
        }
    }

    Array(int l) : size(l){
        a = new int[size];
        for (int i = 0; i < size; i++) {
            cout << "Enter integer at index " << i << " : " << endl;
            cin >> a[i];
        }
    }

    void getter(){
        for (int i = 0; i < size; i++) {
            cout << "Integer at index " << i << " : " << a[i] << endl;
        }
    }

    int operator[](int i)const{
        return a[i];
    }

    int& operator[](int i){
        return a[i];
    }
};

int main(){
    Array num(6);
    // num.getter();
    int i;
    cout << "Enter i : " << endl;
    cin >> i;
    cout << num[i]<<endl;
    int n = 3;
    num[n] = 8;
    cout << num[n]<<endl;
    return 0;
}
