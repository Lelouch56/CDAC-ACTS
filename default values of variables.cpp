#include <iostream>
#include <string>

int globalInt;           // Zero-initialized
double globalDouble;     // Zero-initialized
std::string globalString; // Empty string-initialized
int* globalPtr;           // Null-initialized (pointer to int)

void printGlobal() {
    std::cout << "Global Int: " << globalInt << std::endl;
    std::cout << "Global Double: " << globalDouble << std::endl;
    std::cout << "Global String: " << globalString << std::endl;
    std::cout << "Global Pointer: " << globalPtr << std::endl;
}

int main() {
    int localInt;           // Uninitialized (contains garbage)
    double localDouble;     // Uninitialized (contains garbage)
    std::string localString; // Uninitialized (contains garbage)
    int* localPtr;           // Uninitialized (contains garbage)

    std::cout << "Local Int: " << localInt << std::endl;
    std::cout << "Local Double: " << localDouble << std::endl;
    std::cout << "Local String: " << localString << std::endl;
    std::cout << "Local Pointer: " << localPtr << std::endl;

    printGlobal();

    return 0;
}
