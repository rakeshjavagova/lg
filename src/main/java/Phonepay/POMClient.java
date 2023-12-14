package Phonepay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class POMClient {

   // private static final Logger logger = LoggerFactory.getLogger(POMClient.class);
//    private static final String POM_BASE_URL = "https://10.150.114.196:443";
//    private static final String CONTACT_LIST_ATTRIBUTE_VALUE_ENDPOINT = "/VP_POM_Service/v4/contactlists/%s/contacts/%s/attributes/%s";
//
//    public POMContactAttributeValueResponse getAttributeValueFromPOM(int contactListId, String userContactId,
//            String campaignName, String attributeName) throws IOException {
//        URL url = new URL(String.format(POM_BASE_URL + CONTACT_LIST_ATTRIBUTE_VALUE_ENDPOINT, contactListId, userContactId,
//                attributeName));
//
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("GET");
//
//        try {
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                String inputLine;
//                StringBuilder response = new StringBuilder();
//
//                while ((inputLine = in.readLine()) != null) {
//                    response.append(inputLine);
//                }
//
//                in.close();
//
//                ObjectMapper objectMapper = new ObjectMapper();
//                return objectMapper.readValue(response.toString(), POMContactAttributeValueResponse.class);
//            } else {
//                logger.error("Got non-success or null response while fetching {} for contactListId : {}, campaignName : {} and userContactId : {}",
//                        attributeName, contactListId, campaignName, userContactId);
//                return null;
//            }
//        } catch (IOException e) {
//            logger.error("Encountered exception while fetching {} for contactListId : {}, campaignName : {} and userContactId : {}",
//                    attributeName, contactListId, campaignName, userContactId);
//            throw new CustomPOMApplicationException(e.getLocalizedMessage());
//        } finally {
//            connection.disconnect();
//        }
//    }
}
