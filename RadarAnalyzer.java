import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class RadarAnalyzer {
    public static void main(String[] args) {
        // REPLACE THE STRING BELOW WITH YOUR ACTUAL TOKEN
        String apiToken = "INSERT KEY HERE";    // omitted key for security reasons
        String url = "https://api.cloudflare.com/client/v4/radar/ranking/top?limit=5";

        System.out.println("Connecting to Cloudflare Radar API...");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + apiToken)
                .GET()
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    if (response.statusCode() == 200) {
                        return response.body();
                    } else {
                        return "Error: " + response.statusCode() + " - " + response.body();
                    }
                })
                .thenAccept(System.out::println)
                .join();
    }
}
