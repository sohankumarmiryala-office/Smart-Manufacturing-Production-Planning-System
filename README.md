
📘 Smart Manufacturing & Production Planning System
🚀 Project Overview
The Smart Manufacturing & Production Planning System is a full-stack enterprise application designed to manage end-to-end shop-floor operations in a manufacturing environment.
This system follows a Spring Boot MVC (Model-View-Controller) architecture and manages core production activities such as:

Bill of Materials (BOM)
Production Planning & Scheduling
Machine Monitoring
Quality Inspection
Maintenance Management


🏭 Business Domain
Domain: Manufacturing
Purpose: Efficiently manage production lifecycle, machine usage, quality control, and maintenance workflows.

🧩 Key Modules
1️⃣ Bill of Materials (BOM) & Product Master

Manage product definitions and BOM hierarchy
Handle versioning and engineering updates

Features:

Create Product
Add BOM Components
Update BOM Version
View Product Structure


2️⃣ Production Order & Scheduling

Create and track manufacturing orders
Assign work centers and schedule production

Features:

Create Production Order
Schedule Work Centers
Release Orders
Track Progress


3️⃣ Machine Monitoring & Downtime Tracking

Monitor machine runtime and breakdowns
Analyze machine utilization

Features:

Record Machine Runtime
Log Downtime
Calculate OEE (Overall Equipment Effectiveness)
Track Machine Status


4️⃣ Quality Inspection & Defect Management

Perform quality checks and sampling
Manage defects and inspection results

Features:

Record Inspection
Log Defects
Approve/Reject Batches


5️⃣ Maintenance & Spare Parts Management

Handle preventive and breakdown maintenance
Track spare parts usage

Features:

Create Work Orders
Assign Technicians
Issue Spare Parts
Close Work Orders


🏗️ Project Architecture
This project follows a Layered MVC Architecture:
Controller  →  Handles HTTP Requests
Service     →  Business Logic
Repository  →  Database Access (JPA)
Model       →  Entity Classes
Exception   →  Custom Error Handling


📂 Project Structure
src/
└── main/
    ├── java/com/manufacturing/
    │   ├── bom/
    │   ├── production/
    │   ├── machine/
    │   ├── quality/
    │   ├── maintenance/
    │   ├── user/
    │   ├── common/
    │   └── config/
    │
    └── resources/
        ├── application.properties
        ├── static/
        └── templates/


🛠️ Technology Stack
Backend:

Java 17+
Spring Boot
Spring MVC
Spring Data JPA (Hibernate)

Database:

MySQL / SQL Server

Frontend:

HTML, CSS, JavaScript (Thymeleaf optional)

Tools:

Maven / Gradle
Postman (API Testing)
Git (Version Control)


👥 User Roles
The system supports multiple roles:

🧑‍💼 Admin
🏭 Production Planner
👨‍🏭 Shop Floor Supervisor
✅ Quality Inspector
🔧 Maintenance Engineer


🗄️ Database Entities





























ModuleEntityBOMFinishedProductProductionProductionOrderMachineMachineLogQualityQualityInspectionMaintenanceMaintenanceWorkOrder

⚙️ Setup & Installation
✅ Prerequisites

Java JDK 17 or higher
MySQL / SQL Server
Maven / Gradle
IDE (IntelliJ / Eclipse)


✅ Steps to Run


Clone Repository
Shellgit clone <repository-url>Show more lines


Configure Database

Update application.properties



Run SQL Scripts

Execute schema.sql in your database



Build Project
Shellmvn clean install``Show more lines


Run Application
Shellmvn spring-boot:run``Show more lines


Access Application


http://localhost:8080


🔐 Security

Basic authentication configured using Spring Security
Role-based access supported
Future scope: JWT Authentication


🔄 Future Enhancements

✅ REST API Versioning
✅ JWT-based Authentication
✅ Microservices Architecture
✅ Cloud Deployment (AWS/Azure)
✅ Real IoT Integration
✅ Dashboard with Analytics


🧪 Testing

Unit Testing: JUnit
API Testing: Postman
Integration Testing: Spring Boot Test


📦 Deployment

Local: Embedded Tomcat (Spring Boot)
Production: Docker + Cloud Platforms


🤝 Contribution

Fork the repository
Create a feature branch
Commit your changes
Push and create a Pull Request

