# ATM-Service-Simulator
 ATM Service Simulator is a Java-based banking application built using Java Swing, AWT, and MySQL, developed in Apache NetBeans IDE. This project simulates real-world ATM functionalities, allowing users to perform secure banking transactions with a user-friendly graphical interface.

🔹 Features ✅ User Authentication – Secure login system with encrypted password validation ✅ Account Creation – Multi-step signup storing user details securely in MySQL ✅ Transactions – Withdraw, deposit, fast cash, and balance inquiry with real-time updates ✅ Mini Statement – Displays recent transactions securely fetched from MySQL ✅ PIN Management – Allows secure PIN change with encrypted storage ✅ Database Connectivity – Uses MySQL with JDBC for secure data handling ✅ Error Handling & Validation – Prevents invalid transactions and incorrect inputs

🔒 Security Features 🔹 Password Hashing & Encryption – Ensures secure authentication 🔹 SQL Injection Prevention – Uses prepared statements to avoid SQL attacks 🔹 Data Validation & Exception Handling – Prevents unauthorized access and transaction errors

🛠️ Tech Stack Java Swing & AWT – GUI development JDBC & MySQL – Database integration Apache NetBeans IDE – Development environment Prepared Statements – Secure database queries

📁 ATM-Service-Simulator
│── 📄 Login.java # Secure user authentication
│── 📄 SignupOne.java # User registration - Step 1
│── 📄 SignupTwo.java # User registration - Step 2
│── 📄 SignupThree.java # User registration - Step 3
│── 📄 Transactions.java # Handles ATM operations
│── 📄 MiniStatement.java # Fetches recent transactions
│── 📄 BalanceInquiry.java # Displays current account balance
│── 📄 Withdrawl.java # Withdraw cash
│── 📄 Deposite.java # Deposit cash
│── 📄 FastCash.java # Quick cash withdrawal
│── 📄 PinChange.java # Secure PIN update
│── 📄 Conn.java # MySQL database connection
