#include<iostream>
using namespace std;


class base{
    protected:
        int i;

    public:
        void set(int i){
           this->i=i;
        }
        void get(){
            cout<<i;
        }
};
class derived1:virtual public base{
    protected:
        int j;
};
class derived2:virtual public base{
    protected:
        int k;
};
class A: public derived1,derived2{
    protected:
    int p;
      
};

int main(){
    A dia;
    dia.set(5);
    dia.get();

    return 0;
}
