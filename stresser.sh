#!/bin/bash

read -p "Enter IP Address: " id

while true; do
    ping -c 1 "$id"
done
