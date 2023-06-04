Make sure That Java JDK is well installed 
Spring Boot project ( command+shift+p )

We'll use SDKMAN, a tool that simplifies managing multiple software development kits, including Maven

Install SDKMAN
Open a terminal and run the following command to install SDKMAN:

curl -s "https://get.sdkman.io" | bash

Set up SDKMAN
Close and reopen your terminal, or run the following command to load SDKMAN into your current shell session:

source "$HOME/.sdkman/bin/sdkman-init.sh"

install Maven
Once SDKMAN is set up, you can install Maven by running the following command:

sdk install maven

Set up SDKMAN again
If SDKMAN is installed, but the mvn command is still not recognized, try setting up SDKMAN again by running the following command:

source "$HOME/.sdkman/bin/sdkman-init.sh"

Verify Maven installation with SDKMAN
After setting up SDKMAN, run the following command to verify the Maven installation:

sdk current maven

Open your shell configuration file (e.g., ~/.bashrc, ~/.bash_profile, or ~/.zshrc) in a text editor.
Add the following line to the file:

export PATH="$HOME/.sdkman/candidates/maven/current/bin:$PATH"

Run the following command to apply the changes:

source ~/.zshrc

Build your application
mvn clean package

Run your application
To run your Spring Boot application, use the following command in your terminal:

java -jar target/demo-0.0.1-SNAPSHOT.jar

http://localhost:8080/hello

Hania/>