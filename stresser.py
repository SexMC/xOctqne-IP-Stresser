import subprocess

address = input("Enter IP Address: ")

while True:
    subprocess.run(["ping", "-c", "1", address])
