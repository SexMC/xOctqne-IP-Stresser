use std::io;

fn main() {
    let mut input = String::new();
    println!("Enter IP Address: ");
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let ip_address = input.trim();

    loop {
        let output = std::process::Command::new("ping")
            .arg("-c")
            .arg("1")
            .arg(ip_address)
            .output();

        match output {
            Ok(_) => println!("Ping successful for {}", ip_address),
            Err(_) => println!("Ping failed for {}", ip_address),
        }
    }
}
