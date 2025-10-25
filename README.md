# 🎨 ArtConnect

ArtConnect is a **cloud-based art-sharing and exhibition platform** built with **Spring Boot**, **MongoDB Atlas**, and **Cloudinary**.  
It empowers artists to showcase their artwork online and enables buyers and art lovers to explore and connect through a modern, visual experience.

---

## 🚀 Features

- 🧑‍🎨 **Artist Dashboard** – Upload, view, and manage artworks easily.
- 🖼️ **Dynamic Gallery** – Displays all artworks beautifully with images stored in Cloudinary.
- 🔑 **User Login System** – Artists and Buyers can log in with credentials stored in MongoDB Atlas.
- 🌥️ **Cloud Storage** – All uploaded images are securely stored and served via Cloudinary.
- ☁️ **MongoDB Atlas Integration** – Data stored and retrieved from cloud-hosted MongoDB database.
- 💅 **Modern UI** – Built with Bootstrap, HTML5, CSS3, and Thymeleaf templates.
- 🔄 **Deployed Anywhere** – Runs smoothly locally or in cloud environments.

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Backend | Spring Boot (Java) |
| Frontend | HTML, CSS, Bootstrap, JavaScript, Thymeleaf |
| Database | MongoDB Atlas |
| Cloud Storage | Cloudinary |
| Build Tool | Maven |
| IDE | Eclipse / IntelliJ IDEA |
| Version Control | Git + GitHub |

---

## ⚙️ Project Setup (Local)

### 1️⃣ Clone the Repository
    ```bash
     git clone https://github.com/<your-username>/ArtConnect.git
     cd ArtConnect

###2️⃣ Configure Application Properties
   In src/main/resources/application.properties, set up your MongoDB Atlas and Cloudinary credentials:
    
    #MongoDB Atlas
    spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/artconnect?retryWrites=true&w=majority

    #Cloudinary
    cloudinary.cloud_name=your_cloud_name
    cloudinary.api_key=your_api_key
    cloudinary.api_secret=your_api_secret

    # Server Port
    server.port=8080


###▶️ Run the Application
 To start the Spring Boot application:
 
     mvn spring-boot:run
     
or, if you’ve packaged it:

    java -jar target/ArtConnect-0.0.1-SNAPSHOT.jar
Then open:

    http://localhost:8080

###🗂️ Project Structure
ArtConnect/
├── src/main/java/com/example/ArtConnect
│   ├── controller/         # Controllers (Artworks, Login, etc.)
│   ├── model/              # User & Artwork data models
│   ├── repository/         # MongoDB Repositories
│   └── ArtConnectApplication.java
├── src/main/resources/
│   ├── static/             # CSS, JS, images
│   ├── templates/          # Thymeleaf HTML templates
│   └── application.properties
└── pom.xml

###☁️ Deployment Steps
Generate a .jar file
mvn clean package


The .jar file will be located in:

target/ArtConnect-0.0.1-SNAPSHOT.jar

Deploy Options

Render / Railway / AWS / Azure / Heroku

Connect your GitHub repo directly and deploy automatically.


👩‍🎨 Author

Deepa M 
📧 Email: your-email@example.com

🌐 GitHub: https://github.com/your-username





