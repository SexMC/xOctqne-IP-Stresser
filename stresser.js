const exec = require("child_process").exec;;
const readline = require('node:readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question('Enter IP Address: ', address => {
    while(true) {
        exec('ping '+address, function(err,stdout,stderr){
            if(err) console.log(stderr);
            else console.log(stdout);
        });
    }
});

