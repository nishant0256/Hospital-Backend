# 🏥 Hospital Appointment System

A web-based application designed to simplify hospital appointment scheduling and management for patients, doctors, and administrators.

---

## 📋 Table of Contents
- [About the Project](#about-the-project)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Database Schema](#database-schema)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## 📖 About the Project
The **Hospital Appointment System** allows patients to register, book appointments with doctors, and view their medical schedules online.  
Administrators can manage doctors, patients, and appointment details from a centralized dashboard.

---

## ✨ Features
- 🧑‍⚕️ Doctor management (add, update, delete, view)
- 👨‍💻 Patient registration and login
- 🕒 Appointment booking and cancellation
- 📅 View doctor availability and appointment history
- 🔐 Role-based access (Admin / Patient)
- ⚙️ RESTful API endpoints
- 🗄️ Database integration with JPA/Hibernate

---

## 🛠️ Tech Stack
| Category | Technologies Used |
|-----------|------------------|
| **Language** | Java |
| **Framework** | Spring Boot |
| **Database** | MySQL / H2 (for testing) |
| **ORM** | Hibernate / JPA |
| **Build Tool** | Maven |
| **Testing** | JUnit |
| **Frontend (optional)** | React / HTML-CSS / Postman for testing |
| **Server Port** | 8760 (configurable) |

---

## 📁 Project Structure
```
Hospital-Appointment-System/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/hospital/
│   │   │   ├── controller/       # REST controllers
│   │   │   ├── model/            # Entity classes (Doctor, Patient, Appointment)
│   │   │   ├── repository/       # JPA repositories
│   │   │   ├── service/          # Business logic
│   │   │   └── HospitalApplication.java  # Main entry point
│   │   └── resources/
│   │       ├── application.properties    # DB & app configurations
│   │       └── data.sql / schema.sql     # Optional DB scripts
│   └── test/                             # Unit & Integration Tests
│
├── pom.xml                               # Maven dependencies
├── README.md                             # Documentation
└── .gitignore                            # Ignored files
```

---

## 🚀 Getting Started

### Prerequisites
- Java 17+  
- Maven 3.8+  
- MySQL Server (or H2 for local testing)  
- IDE: IntelliJ / Eclipse / VS Code  

### Installation
```bash
# Clone the repository
git clone https://github.com/nishant0256/Hospital-Appointment-System.git

# Navigate into the project folder
cd Hospital-Appointment-System

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The server will start at:  
👉 `http://localhost:8760`

---

## ⚙️ Configuration
Edit the `application.properties` file:
```properties
server.port=8760
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | `/api/doctors` | Get all doctors |
| POST | `/api/doctors` | Add new doctor |
| GET | `/api/patients` | Get all patients |
| POST | `/api/patients` | Register new patient |
| POST | `/api/appointment` | Book appointment |
| GET | `/api/appointment` | View all appointments |

Use **Postman** or any REST client for testing.

---

## 🧩 Database Schema
**Entities:**
- **Doctor** → `id`, `name`, `specialization`, `email`, `availability`
- **Patient** → `id`, `name`, `email`, `contact`, `password`
- **Appointment** → `id`, `doctor_id`, `patient_id`, `appointment_date`, `status`

**Relationships:**
- One Doctor → Many Appointments  
- One Patient → Many Appointments  

---

## 🔮 Future Enhancements
- Email/SMS notification system  
- JWT-based authentication  
- Doctor availability calendar view  
- React-based frontend dashboard  
- Docker deployment  

---

## 🤝 Contributing
Contributions are always welcome!  
1. Fork the repository  
2. Create your branch (`git checkout -b feature/new-feature`)  
3. Commit changes (`git commit -m "Add new feature"`)  
4. Push to your branch (`git push origin feature/new-feature`)  
5. Create a Pull Request  

---

## 📄 License
This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 📬 Contact
**Author:** Nishant Kumar  
**GitHub:** [nishant0256](https://github.com/nishant0256)  
**Email:** your-email@example.com  

---

> _“Efficient healthcare begins with smart appointment management.”_
