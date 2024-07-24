<?php
$ipAddress = readline("Enter IP Address: ");

while (true) {
    exec("ping -c 1 $ipAddress");
}
?>
