# Cloudflare Radar API Analyzer

A lightweight Java utility designed to interface with the **Cloudflare Radar API** to monitor global internet traffic telemetry. This project was developed to demonstrate rapid API integration and asynchronous data handling.

### Key Technical Features
* **Real-time Data Ingestion:** Fetches live domain rankings and traffic metadata directly from Cloudflare's global network.
* **Asynchronous Networking:** Implemented using Java's native `HttpClient` with non-blocking logic to ensure efficient performance.
* **Secure Auth:** Uses industry-standard Bearer Token authentication for all API requests.

### Technical Stack
* **Language:** Java 11+
* **Frameworks:** Native Java HTTP/Client (no external dependencies for lightweight execution)
* **Data Format:** JSON

### Setup and Execution
1. Clone this repository.
2. Generate a Cloudflare API Token with "Radar" read permissions.
3. Replace the `apiToken` variable in `radaranalyzer.java` with your key.
4. Compile and run:
   ```bash
   java RadarAnalyzer.java
