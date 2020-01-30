require tool installed: 
		-brew install allure
		-JAVA8
		-MAVEN3
		
Run API server mock: java -jar app/rest.jar --server.port-8080
Run: mvn clean install
Start allure report server: allure serve target/allure-results/

More Detail:
>>> For java 9 >>> java -jar --add-modules java.xml.bind rest.jar 
Kill Port 8080 
>>> lsof -n -i4TCP:8080 
>>> kill -9 <PID>

