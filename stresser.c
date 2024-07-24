#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char ipAddress[100];
    printf("Enter IP Address: ");
    fgets(ipAddress, sizeof(ipAddress), stdin);
    ipAddress[strcspn(ipAddress, "\n")] = '\0'; // Remove trailing newline

    while (1) {
        char pingCommand[200];
        snprintf(pingCommand, sizeof(pingCommand), "ping -c 1 %s", ipAddress);
        int result = system(pingCommand);

        if (result == 0) {
            printf("Ping successful for %s\n", ipAddress);
        } else {
            printf("Ping failed for %s\n", ipAddress);
        }
    }

    return 0;
}
