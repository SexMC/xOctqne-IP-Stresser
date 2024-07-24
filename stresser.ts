import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question('Enter IP Address: ', (ipAddress) => {
    const pingCommand = `ping -c 1 ${ipAddress}`;
    const { exec } = require('child_process');

    const pingProcess = exec(pingCommand);
    pingProcess.on('exit', (code) => {
        if (code === 0) {
            console.log(`Ping successful for ${ipAddress}`);
        } else {
            console.log(`Ping failed for ${ipAddress}`);
        }
        rl.close();
    });
});
