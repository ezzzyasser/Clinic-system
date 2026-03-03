# 🏥 Clinic Management System

## 📖 Overview

The **Clinic Management System** is a Java-based desktop application designed to manage all core operations inside a medical clinic.
The system applies Object-Oriented Programming (OOP) principles and structured entity relationships to ensure clean architecture and maintainability.

It handles:

* Patient management
* Doctor & nurse management
* Appointment scheduling
* Reservation handling
* Medical supply inventory
* Orders management
* Administrative operations

The system is fully implemented and operates without errors under normal use cases.



## 🏗️ System Architecture

The project is built using:

* **Java**
* OOP Concepts (Encapsulation, Inheritance, Abstraction)
* Entity-based class structure
* Static ArrayLists for in-memory data management

Main Entities:

* `Person` (Base class)
* `Doctor`
* `Nurse`
* `Patient`
* `Admin`
* `TimeSlot`
* `Reservation`
* `MedicalSupply`
* `Order`

Each entity contains appropriate attributes, getters/setters, and operational methods.



## ⚙️ Features

### 👨‍⚕️ Doctor Management

* Add / Update / Delete Doctors
* Assign specializations
* Manage room numbers
* View appointments

### 👩‍⚕️ Nurse Management

* Add / Update Nurse data
* Assign to doctors
* View nurse details

### 🧑‍🤝‍🧑 Patient Management

* Register new patients
* Update patient information
* Assign membership type
* Manage reservations

### 📅 Appointment & Reservation System

* Create reservations
* Update reservations
* Cancel reservations
* Browse all reservations
* Manage available time slots

### 🏥 Medical Supply & Orders

* Add medical supplies
* Update supply details
* Create orders
* Track order dates
* Link supplies with orders

### 👨‍💼 Admin Panel

* Create new admin
* Add payments
* Generate reports
* Display system information



## 🧠 OOP Design

* `Person` acts as a parent class.
* Doctor, Nurse, Patient, and Admin inherit from Person.
* Relationships are structured using ArrayLists.
* Data encapsulation is maintained using private attributes and public getters/setters.
* Static collections are used to simulate a database.





