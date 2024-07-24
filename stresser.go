package main

import (
	"fmt"
	"os/exec"
)

func main() {
	var ipAddress string
	fmt.Print("Enter IP Address: ")
	fmt.Scan(&ipAddress)

	for {
		cmd := exec.Command("ping", "-c", "1", ipAddress)
		err := cmd.Run()
		if err != nil {
			fmt.Printf("Ping failed for %s\n", ipAddress)
		} else {
			fmt.Printf("Ping successful for %s\n", ipAddress)
		}
	}
}
