package subclasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating sample data
        JsonItem jsonItem1 = new JsonItem(1011, "salary", null);
        JsonItem jsonItem2 = new JsonItem(1012, "Regular", null);
        JsonItem jsonItem3 = new JsonItem(1013, "salary plus", null);

        AccountType accountType = new AccountType(
                1,
                "AccountType",
                Arrays.asList(new JsonItem(11, "Savings", Arrays.asList(jsonItem1, jsonItem2, jsonItem3))),
                true,
                "2023-11-21T14:32:22.962Z",
                "string",
                "2023-11-21T14:32:22.962Z",
                "string"
        );

        // Accessing values
        System.out.println("Account Type Title: " + accountType.getTitle());
        System.out.println("Json Item 1 Title: " + accountType.getJsonItems().get(0).getTitle());
    }
}

