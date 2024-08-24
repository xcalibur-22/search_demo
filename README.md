---

# Search Demo Project

## Setup Instructions

1. **Clone the Repository:**

   ```sh
   git clone https://github.com/yourusername/search_demo.git
   cd search_demo
   ```

2. **Create the Database:**

   ```sql
   CREATE DATABASE search_demo_db;
   ```

3. **Run the Schema and Sample Data:**

   The schema is set up using `src/main/resources/util/schema.sql` and sample data is in `src/main/resources/util/data.sql`. The application will automatically run these scripts on startup.

4. **Update Database Credentials:**

   Edit `src/main/resources/application.properties` with your MySQL credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/search_demo_db
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   ```

5. **Build and Run the Application:**

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

   The application will be available at `http://localhost:8080`.

---

