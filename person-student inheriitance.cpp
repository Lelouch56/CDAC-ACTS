//  Different type of persons - Student, Employee, Artist.
#include<iostream>
using namespace std;

class Person{
protected:
string name;
int age;
double mob_num;

public:
    Person(string a, int b, double c):name(a),age(b),mob_num(c){}
    void getter(){
        cout<<name<<endl<<age<<endl<<mob_num<<endl;
    }
    
};
class Student : public Person{
int roll;
string school;
public:
    Student(string a, int b, double c, int d, string e):Person(a,b,c),roll(d),school(e){  }
    void get(){
        getter();
        cout<<roll<<endl<<school<<endl;
    }

};
class Employee : public Person{
int id;
int department;
};
class Artist : public Person{
    string style;
    int products;

};

int main(){
    Student s("Aman",20,8986768,101,"UPS");
    s.get();
    return 0;
}
