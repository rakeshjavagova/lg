package post;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpURLConnectionExample {

    public static void main(String[] args) {
        try {
            // Specify the endpoint URL
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Enable input/output streams
            connection.setDoOutput(true);

            // Sample data to be sent
            String postData = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
            byte[] postDataBytes = postData.getBytes(StandardCharsets.UTF_8);

            // Set the content length of the request
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));

            // Set the content type
            connection.setRequestProperty("Content-Type", "application/json");

            // Get the output stream and write the data
            try (OutputStream os = connection.getOutputStream()) {
                os.write(postDataBytes);
            }

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // You can also read the response using an InputStream
            // InputStream inputStream = connection.getInputStream();
            // ... (read and process the response)

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
