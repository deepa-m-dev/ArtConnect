# 🎨 ArtConnect

ArtConnect is a **cloud-based art-sharing and exhibition platform** built with **Spring Boot**, **MongoDB Atlas**,**Thymeleaf**, **Boostrap** and **Cloudinary**.  
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

### Clone the Repository

     git clone https://github.com/deepa-m-dev/ArtConnect.git
     cd ArtConnect


### ▶️ Run the Application
 To start the Spring Boot application:
 
     mvn spring-boot:run
     
or, if you’ve packaged it:

    java -jar target/ArtConnect-0.0.1-SNAPSHOT.jar
Then open:

    http://localhost:8080

###🗂️ Project Structure

ArtConnect/ 

├── src/

│   ├── main/

│   │   ├── java/com/example/ArtConnect/

│   │   │   ├── controller/      # Spring MVC Controllers

│   │   │   ├── model/           # MongoDB data models (Artwork, User, Order)

│   │   │   ├── repository/      # MongoDB repositories

│   │   │   ├── service/         # Services (ArtworkService, OrderService, CloudinaryService)

│   │   │   └── ArtConnectApplication.java

│   │   └── resources/

│   │       ├── static/

│   │       │   ├── css/style.css

│   │       │   └── js/main.js

│   │       ├── templates/       # Thymeleaf templates

│   │       │   ├── fragments/header.html

│   │       │   ├── fragments/footer.html

│   │       │   ├── home.html

│   │       │   ├── gallery.html

│   │       │   ├── artist-dashboard.html

│   │       │   ├── buyer-dashboard.html

│   │       │   ├── artwork-details.html

│   │       │   ├── upload-artwork.html

│   │       │   ├── login.html

│   │       │   └── register.html

│   │       └── application.properties

├── pom.xml

└── README.md

## Usage

- **Home Page:** Click "Explore Gallery" on the landing page to browse artworks.

- **Register/Login:** Use the Register or Login buttons in the header to create an account or log in.

- **Gallery:** Click Gallery in the navigation bar to browse all artworks. Use tag filter buttons to refine results.

- **Artist Dashboard:** Click Artist in the navbar to access your dashboard and Upload New Artwork using the button.

- **Buyer Dashboard:** Click Buyer in the navbar to view artworks and Add to Cart / View Details via the buttons.

- **Artwork Details:** Click the View Details button on any artwork to see full details and Buy the artwork.

 - **Upload Artwork:** Click Upload Artwork button 

👩‍🎨 Author

Deepa M 
🌐 GitHub: https://github.com/deepa-m-dev





