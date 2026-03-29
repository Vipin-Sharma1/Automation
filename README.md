# Selenium Automation - SignUp Form Test

![GitHub Actions](https://github.com/Vipin-Sharma1/Automation/actions/workflows/selenium-test.yml/badge.svg)

This project automates a **SignUp / Forgot Password form** using **Selenium WebDriver** and **Java**. The test runs automatically on **GitHub Actions** every time code is pushed to the repository.

---

## What Does This Test Do?

1. Opens the website — `rahulshettyacademy.com/locatorspractice/`
2. Enters username — `komal`
3. Enters password — `123456`
4. Clicks the **"Forgot your password?"** link
5. Fills in the new form:
   - Name → `jamali sahab`
   - Email → `vipin@gmail.com`
   - Phone → `63500`

---

## Technologies Used

| Technology | Version | Purpose |
|---|---|---|
| Java | 11 | Programming language |
| Selenium WebDriver | 4.18.1 | Browser automation |
| WebDriverManager | 5.7.0 | Auto ChromeDriver setup |
| Maven | 3.x | Dependency management |
| GitHub Actions | — | Automated CI/CD pipeline |

---

## Project Structure

```
selenium-project/
│
├── .github/
│   └── workflows/
│       └── selenium-test.yml        ← GitHub Actions pipeline
│
├── src/
│   └── main/
│       └── java/
│           └── RohitShatty_SignUp.java   ← Main Selenium test
│
├── pom.xml                           ← Maven dependencies
└── README.md                         ← This file
```

---

## How to Run Locally?

### Prerequisites
- Java 11 or above
- Maven installed
- Google Chrome installed

### Steps

```bash
# Clone the repository
git clone https://github.com/Vipin-Sharma1/Automation.git

# Navigate into the folder
cd Automation

# Run the test
mvn compile exec:java -Dexec.mainClass="RohitShatty_SignUp"
```

---

## How Does GitHub Actions Work?

Every time you push code to the `main` branch:

```
git push
    ↓
GitHub Actions gets triggered
    ↓
A free Ubuntu server starts
    ↓
Java + Chrome get installed
    ↓
Selenium test runs in headless mode
    ↓
Pass ✅ or Fail ❌ result appears
```

To view the result:
**GitHub Repo → Actions Tab → Latest Run**

---

## How to Push New Changes?

```bash
git add .
git commit -m "describe what you changed"
git push
```

Once pushed, GitHub Actions will automatically re-run the test.

---

## Author

**Vipin Sharma**
GitHub: [@Vipin-Sharma1](https://github.com/Vipin-Sharma1)
