

# Search Demo Project

## Setup Instructions

1. **Clone the Repository:**

   ```sh
   git clone https://github.com/xcalibur-22/search_demo
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

Here's the format for querying the API in your Spring Boot project:

### API Query Format

**Endpoint:** `/api/supplier/query`

**Method:** `POST`

**Parameters:**

- `location`: The city where the supplier is located.
- `natureOfBusiness`: The nature of the business (e.g., `small_scale`, `medium_scale`, `large_scale`).
- `manufacturingProcess`: The manufacturing process capabilities (e.g., `moulding`, `3d_printing`, `casting`, `coating`).
- `page`: The page number for pagination (default is 1).
- `size`: The number of results per page (default is 10).

**Example Request:**

```sh
curl -X POST "http://localhost:8080/api/supplier/query" \
     -H "Content-Type: application/json" \
     -d '{
           "location": "Mumbai",
           "natureOfBusiness": "small_scale",
           "manufacturingProcess": "moulding",
           "page": 1,
           "size": 10
         }'
```

**Request Body Format:**

```json
{
  "location": "string",
  "natureOfBusiness": "string",
  "manufacturingProcess": "string",
  "page": "integer",
  "size": "integer"
}
```

