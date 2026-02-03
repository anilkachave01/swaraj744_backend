# Swaraj 744 - Tractor Services Platform

A modern, full-stack web application for booking tractor equipment and agricultural services.

## 🚀 Features

### User Features
- **Browse Services**: View available tractor equipment and implements
- **Book Services**: Easy online booking with real-time price calculation
- **Email Confirmation**: Automatic email notifications upon successful booking
- **Multi-language Support**: English, Hindi, and Marathi

### Admin Features
- **Secure Login**: JWT-based authentication
- **Order Management**: View all bookings and customer details
- **Component Management**: Add, edit, delete equipment and update pricing
- **Dashboard Analytics**: Revenue tracking and order statistics

## 🛠️ Tech Stack

### Backend
- **Java 17** with **Spring Boot 4.0.2**
- **Spring Security** with JWT authentication
- **Spring Data JPA** with MySQL
- **Spring Mail** for email notifications
- **Maven** for dependency management

### Frontend
- **React 19** with **Vite**
- **React Router** for navigation
- **Axios** for API calls
- **Modern CSS** with custom design system
- **Responsive Design** for all devices

## 📦 Installation & Setup

### Prerequisites
- Java 17+
- Node.js 18+
- MySQL 8+
- Maven

### Backend Setup

1. Navigate to backend directory:
```bash
cd Swaraj744
```

2. Update `src/main/resources/application.properties`:
```properties
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

3. Run the application:
```bash
mvn spring-boot:run
```

Backend will run on `http://localhost:8081`

### Frontend Setup

1. Navigate to frontend directory:
```bash
cd Swaraj744_Frontend
```

2. Install dependencies:
```bash
npm install
```

3. Start development server:
```bash
npm run dev
```

Frontend will run on `http://localhost:5173`

## 🔐 Default Admin Credentials

- **Username**: `admin`
- **Password**: `admin123`

## 📚 API Endpoints

### Public Endpoints
- `GET /api/components` - Get all equipment
- `POST /api/registration` - Create booking
- `POST /api/auth/login` - Admin login

### Protected Endpoints (Admin Only)
- `GET /api/admin/orders` - Get all orders
- `POST /api/admin/components` - Add equipment
- `PUT /api/admin/components/{id}` - Update equipment
- `DELETE /api/admin/components/{id}` - Delete equipment

## 🎨 Design Features

- **Dark Theme**: Modern, eye-catching dark UI
- **Vibrant Colors**: Orange (#FF6B35) primary with blue accents
- **Smooth Animations**: Fade-ins, hover effects, and transitions
- **Glassmorphism**: Modern card designs with backdrop blur
- **Responsive**: Mobile-first design approach

## 📧 Email Configuration

The system uses Gmail SMTP. Email credentials are configured in `application.properties`:
- Confirmation emails sent automatically after booking
- Supports custom email templates

## 🗄️ Database Schema

### Tables
- `admin` - Admin users with encrypted passwords
- `user` - Customer information
- `component` - Equipment catalog with pricing
- `registration` - Booking records

## 🚦 Running in Production

### Backend
```bash
mvn clean package
java -jar target/Swaraj744-0.0.1-SNAPSHOT.jar
```

### Frontend
```bash
npm run build
# Deploy the 'dist' folder to your hosting service
```

## 📝 License

This project is private and proprietary.

## 👨‍💻 Developer

Built with ❤️ for Swaraj Tractor Services
