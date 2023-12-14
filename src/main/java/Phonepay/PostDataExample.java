package Phonepay;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PostDataExample {

    public static void postData(PomResultInfo pomResultInfo, String targetUrl) {
        try {
            URL url = new URL(targetUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setDoOutput(true);

            // Convert the PomResultInfo object to a JSON string
            String jsonInputString = "convertToJson(pomResultInfo)";

            // Get the output stream of the connection
            try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
                // Write the JSON data to the output stream
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                outputStream.write(input, 0, input.length);
            }

            // Check the response code
            int responseCode = httpURLConnection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Optionally, you can read the response from the server using an InputStream

            // Disconnect the connection
            httpURLConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
