package Phonepay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SambhaashanClient {

//    private static final Logger logger = LoggerFactory.getLogger(SambhaashanClient.class);
//    public static final String SAMBHAASHAN_BASE_URL = "http://10.150.114.134:8080/sambhaashan/api";
//    private static final String SAMBHAASHAN_INGEST_EVENT_ENDPOINT = "/v1/pom/ingest/event";
//    public static final String SAMBHAASHAN_ADD_CONTACT_ENDPOINT = "/v1/pom/contact/add";
//
//    public boolean sendPOMEvent(String campaignName, String ticketId, String userContactId)
//            throws IOException {
//        ObjectMapper objectMapper = RequestUtil.getObjectMapper();
//        String json = objectMapper.writeValueAsString(POMEventData.builder()
//                .campaignName(campaignName)
//                .ticketId(ticketId)
//                .build());
//
//        URL url = new URL(SAMBHAASHAN_BASE_URL + SAMBHAASHAN_INGEST_EVENT_ENDPOINT);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("POST");
//        connection.setRequestProperty("Content-Type", Constant.JSON);
//
//        connection.setDoOutput(true);
//        try (OutputStream os = connection.getOutputStream()) {
//            byte[] input = json.getBytes("utf-8");
//            os.write(input, 0, input.length);
//        }
//
//        try {
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                    return objectMapper.readValue(in.readLine(), boolean.class);
//                }
//            } else {
//                logger.error("Got non-success or null response while ingesting event for ticketId : {}, campaignName : {} and userContactId : {}",
//                        ticketId, campaignName, userContactId);
//                return false;
//            }
//        } catch (IOException e) {
//            logger.error("Encountered exception while ingesting event for campaignName {}, ticketId {} and userContactId : {}",
//                    campaignName, ticketId, userContactId);
//            throw new CustomPOMApplicationException(e.getLocalizedMessage());
//        } finally {
//            connection.disconnect();
//        }
//    }
//
//    public GenericResponse<String> addContactToPom(String campaignName, String ticketId, String userContactId,
//            POMContactAttributes pomContactAttributes) throws IOException {
//        ObjectMapper objectMapper = RequestUtil.getObjectMapper();
//        String json = objectMapper.writeValueAsString(pomContactAttributes);
//
//        URL url = new URL(SAMBHAASHAN_BASE_URL + SAMBHAASHAN_ADD_CONTACT_ENDPOINT);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("POST");
//        connection.setRequestProperty("Content-Type", Constant.JSON);
//
//        connection.setDoOutput(true);
//        try (OutputStream os = connection.getOutputStream()) {
//            byte[] input = json.getBytes("utf-8");
//            os.write(input, 0, input.length);
//        }
//
//        try {
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                    return objectMapper.readValue(in.readLine(), GenericResponse.class);
//                }
//            } else {
//                logger.error("Got non-success or null response while adding contact to pom for ticketId : {}, campaignName : {}, userContactId : {} and pomContactAttributes : {}",
//                        ticketId, campaignName, userContactId, pomContactAttributes);
//                return GenericResponse.<String>builder()
//                        .success(false)
//                        .build();
//            }
//        } catch (IOException e) {
//            logger.error("Encountered exception while while adding contact to pom for campaignName {}, ticketId {}, userContactId : {} and pomContactAttributes : {}",
//                    campaignName, ticketId, userContactId, pomContactAttributes);
//            throw new CustomPOMApplicationException(e.getLocalizedMessage());
//        } finally {
//            connection.disconnect();
//        }
//    }
}

