# mongoDB_JPA_Start01
MongoDB JPA 연동 연습 Act.01[Spring Boot + MongoDB RESTful API]

## Issues
- 복잡한 Query문들이 요구되는 MongoDB를 JPA를 기반으로 사용하기 쉽게 합니다.
- Repository, Service, Controller 단위를 나뉘어서 RESTful API를 구축을 합니다.
- Spring Boot에서 MongoDB를 연동하는 방법에 대해 설정하고 적용을 할 수 있습니다.

## Study Docs
스터디 자료는 현재 프로젝트의 `src > doc` 파일에 PDF 파일로 제공을 하였습니다.
 
스터디 자료는 향시에 수정이 될 수 있으니 이 점 참고하시길 바라겠습니다.

[스터디 자료 참고하기](https://github.com/tails5555/mongoDB_JPA_Start01/blob/master/src/doc/MongoDB%2BSpringJPA_01_REST_API.pdf)

## Maven pom.xml
`pom.xml` 를 기반으로 Maven Dependency를 구성하여 Update Maven은 필수입니다

```
<dependencies>
	<!-- 1. Spring Data JPA Starter -->
	<!-- 이는 실제로 RDBMS에서 하게 된다면 필요하지만, MongoDB Data에서는 MongoRepository를 따로 제공한다. -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
	<!-- 2. Spring Data MongoDB Starter -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-mongodb</artifactId>
	</dependency>
	<!-- 3. Spring Web MVC Starter -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<!-- 4. Lombok Project -->
	<!-- Lombok은 각 인스턴스들에 대해서 getter, setter, toString, equals, hashCode 등의 구현을 자동으로 해 주는 프로젝트이다. -->
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<optional>true</optional>
	</dependency>
	<!-- 5. Tomcat Starter -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-tomcat</artifactId>
		<scope>provided</scope>
	</dependency>
	<!-- 6. Spring Test Starter -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	<!-- 7. MongoDB JDBC Driver -->
	<dependency>
	    <groupId>org.mongodb</groupId>
	    <artifactId>mongo-java-driver</artifactId>
	    <version>3.6.3</version>
	</dependency>
</dependencies>
```

## Screenshot
![example01_result](/src/doc/example01_result.jpg "example01_result")