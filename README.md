# 📘 System Design & Low-Level Design (LLD) — Java + BookMyShow Use Case

This repository contains my structured learning and practice of **Low-Level Design (LLD)** and **System Design concepts** using core Java, clean code, and UML diagrams.

It includes handwritten design diagrams, interview-level Java implementations of SOLID principles and design patterns, and object modeling for a BookMyShow-style seat booking flow.

---

## 🔧 Covered Topics

| Area                      | Status |
|---------------------------|--------|
| SOLID Principles (Java)   | ✅ Done |
| Design Patterns (3 core)  | ✅ Done |
| UML Class Diagram         | ✅ Done |
| UML Sequence Diagram      | ✅ Done |
| BookMyShow LLD Java Code  | ✅ Done |
| GitHub Upload             | ✅ Done |

---

## 🎬 Book Seat Flow – UML Class Diagram

**Key Classes:**

- `User` — who books the ticket  
- `Movie` — movie details  
- `Theatre` — location + name  
- `Show` — a movie at a theatre at a time  
- `Seat` — number, type, availability  
- `Booking` — user + show + seat list  
- `Payment` — amount + status

**Design Explanation:**  
Each class has a single responsibility (SRP), and the model is extendable to add new seat types, payment options, etc.

---

## 🧾 Booking Sequence – UML Sequence Diagram

User → ShowService : getShows()
User → SeatService : getAvailableSeats()
User → BookingService : bookSeats()
BookingService → PaymentService : makePayment()
PaymentService → BookingService : updateBookingStatus()

yaml
Copy
Edit

> ✅ Easily extendable to add CouponService or LoyaltyService  
> ♻️ Reusable for similar flows like food or travel booking

---

## 🧱 BookMyShow LLD Java Structure

- Implemented 7 core classes in pure Java (`User`, `Movie`, `Show`, etc.)
- Focused on class design, enums, and relationships
- Follows **Single Responsibility Principle** for all entities

---

## ⚙️ SOLID Principles – With Java Code

| Principle | Description                          |
|-----------|--------------------------------------|
| SRP       | Split Developer & Tester logic       |
| OCP       | Notification logic via interface     |
| LSP       | Bird → FlyingBird vs Ostrich         |
| ISP       | Minimal printer interface            |
| DIP       | GreetingApp via interface injection  |

Includes both **bad and good code** for interview comparison.

---

## 🧠 Design Patterns – Java Examples

| Pattern     | Example Description                    |
|-------------|----------------------------------------|
| Singleton   | Eager, Lazy, Synchronized versions     |
| Factory     | Employee object creation               |
| Strategy    | Dynamic Payment method switch          |

Each is kept clean and understandable.

---

## 🙋 Why This Repo Exists

This repo was built to:

- Practice and revise LLD concepts before interviews  
- Prepare answers for commonly asked LLD rounds  
- Organize my handwritten and code-based learning  
- Upload everything to GitHub for self-reference and sharing

> ⚠️ This is **not a deployable or runnable project** — only a **design practice repo** with theory, code examples, and UML modeling.




## 👨‍💻 Author

**Sidharth Kumar**

[![Email](https://img.shields.io/badge/Email-siddharth0161820@gmail.com-red?style=for-the-badge&logo=gmail)](mailto:siddharth0161820@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/siddharthkumar16)
[![GitHub](https://img.shields.io/badge/GitHub-Profile-black?style=for-the-badge&logo=github)](https://github.com/siddharth0161820)

🙏 Thank you for visiting this project.
Feel free to connect for collaboration, job opportunities, or tech discussions.
