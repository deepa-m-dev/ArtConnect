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
| Deployment | Render |
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

---

## 🗂️ Project Structure

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

---

## Usage

- **Home Page:** Click "Explore Gallery" on the landing page to browse artworks.
  
<img width="1920" height="980" alt="00" src="https://github.com/user-attachments/assets/6b55105a-93a8-478c-a82f-3769feebc71f" />

- **Register/Login:** Use the Register or Login buttons in the header to create an account or log in.

  <img width="1920" height="1040" alt="9" src="https://github.com/user-attachments/assets/c9fe2bc8-8a33-414f-9280-3d0cc5455d77" />
<img width="1920" height="1040" alt="8" src="https://github.com/user-attachments/assets/e252455d-8acc-46ee-b60b-15bcfab7e0a4" />


- **Gallery:** Click Gallery in the navigation bar to browse all artworks. Use tag filter buttons to refine results.
  
<img width="1920" height="1038" alt="0" src="https://github.com/user-attachments/assets/040154dc-8518-46b7-8eb5-19329e729dfa" />

- **Artist Dashboard:** Click Artist in the navbar to access your dashboard and Upload New Artwork using the button.
  
<img width="1920" height="1041" alt="2" src="https://github.com/user-attachments/assets/8e83c469-1134-4a63-a75e-5fabfa9bf502" />

- **Upload Artwork:** Click “Upload New Artwork” in the Artist Dashboard and fill out the form with details and image.

<img width="1920" height="1041" alt="3" src="https://github.com/user-attachments/assets/63ba19f6-5ae1-4bfc-abcc-6f1ede4b606a" />

- **Buyer Dashboard:** Click Buyer in the navbar to view artworks and Add to Cart / View Details via the buttons.
  
<img width="1920" height="1041" alt="5" src="https://github.com/user-attachments/assets/c4a61428-4f60-435f-b3cb-84e07db8c254" />

- **Artwork Details:** Click the View Details button on any artwork to see full details and Buy the artwork.

  <img width="815" height="825" alt="image" src="https://github.com/user-attachments/assets/01aea033-2320-41bd-ad16-1f257d26098e" />

---

## Live Demo
- Check out the running app here: [ArtConnect](https://artconnect-1ivy.onrender.com)

---

👩‍🎨 Author

<a href="https://github.com/deepa-m-dev">Deepa M </a>





