#include <iostream>
#include <cstdlib> // For system() function

int main() {
    std::string ipAddress;
    std::cout << "Enter IP Address: ";
    std::cin >> ipAddress;

    while (true) {
        // Execute the ping command using system()
        std::string pingCommand = "ping -c 1 " + ipAddress;
        int result = system(pingCommand.c_str());

        if (result != 0) {
            std::cout << "Ping failed for " << ipAddress << std::endl;
        } else {
            std::cout << "Ping successful for " << ipAddress << std::endl;
        }
    }

    return 0;
}
