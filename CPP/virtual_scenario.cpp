#include<iostream>
using namespace std;

class A{
        int x;
    protected:
        int y;
    public:
        int a;
        A(){
            cout<<"A constructor"<<endl;
        }
       void getter(){
            cout<<"ENter A: "<<endl;
        }
      virtual void setter(){
            cout<<"Set A";
            
        } 
        virtual ~A(){
            cout<<"a destructor"<<endl;
        }
};

class B : public A{
    int z;
    public:
        int y;
        B(){
            cout<<"B constructor"<<endl;
        }
        void setter(){
                cout<<"Setter b";
                z=5;
        }
        void getter(){
            cout<<"Enter B: ";
            cout<<z;
        }
        ~B(){
            cout<<"b destructor"<<endl;
        }

};

int main(){
//     A obj1;
//     B obj2;
//     A*oobj;
//     B*oobj1;
// obj1.setter();
// obj2.setter();
// oobj=&obj1;
// oobj1=&obj2;
// oobj1->setter();
A * ptr=new B();
ptr->setter();

    delete ptr;
    return 0;
}

