 Worker and Employer Agency System

Overview

The Worker and Employer Agency System is a Java application that connects workers with employers, allowing workers to view job details and apply for positions while employers can post job listings and hire candidates.

 Features

- User Management: Supports functionalities for workers and employers.
- Job Application: Workers can apply for jobs directly through the interface.
- Detailed Job Viewing: Workers can view detailed job listings.

 Getting Started

1. Clone the repository: git clone <repository-url>

2. Compile the Java files:javac d4.java
  
3. Run the main application: java d4.ConnectAgencyDemo


OOP Principles Applied

- Encapsulation: User data is encapsulated within the `User` class.
- Interface Segregation: Separate interfaces for workers and advanced workers for flexibility.
- Implementation: Concrete classes implement defined interfaces for specific behaviors.

 Design Patterns

- Adapter Pattern: The `WorkerAdapter` class adapts `SpecializedWorker` to fit the `Worker` interface, allowing for flexible interaction.

 Contact

For questions or feedback, please contact the author at: fedifekadu500@gmail.com.
