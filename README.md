# Spring Core - Annotation-Based Configuration (v2)

This branch demonstrates **Spring Core concepts** implemented using **Annotation-Based Configuration** — the modern approach used in real-world Spring and Spring Boot applications.

## 🧠 Key Concepts Covered
- **@Component** – Marks a class as a Spring-managed bean.
- **@Service**, **@Repository**, **@Controller** – Specialized stereotypes for different layers.
- **@Autowired** – Enables automatic dependency injection.
- **@ComponentScan** – Tells Spring where to look for components.
- **AnnotationConfigApplicationContext** – Used to bootstrap the Spring container without XML.

## ⚙️ Project Overview
- Eliminates XML configuration entirely.
- Replaces `AppConfig.java` and `applicationContext.xml` with annotation-driven wiring.
- Demonstrates dependency injection between `Company`, `Department`, and `EmployeeService` beans.
- Mimics the foundation of **Spring Boot’s auto-configuration** process.

## 🧰 Tech Stack
- Java 21
- Spring Framework 6+
- Maven
- IntelliJ IDEA (Community Edition)

## 🗂️ Branch Info
- **main branch:** XML + Java-Based Configuration (v1)
- **v2-annotation-config:** Annotation-Based Configuration (this branch)


✅ **Next Step:** Transition this structure into **Spring Boot (v3)** for auto-configuration, REST APIs, and real backend layering.
