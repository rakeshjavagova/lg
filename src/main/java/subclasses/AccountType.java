package subclasses;

import java.util.List;

public class AccountType {
    private int id;
    private String title;
    private List<JsonItem> jsonItems;
    private boolean isActive;
    private String createdOn;
    private String createdBy;
    private String updatedOn;
    private String updatedBy;

    // Constructors
    public AccountType() {
    }

    public AccountType(int id, String title, List<JsonItem> jsonItems, boolean isActive,
                       String createdOn, String createdBy, String updatedOn, String updatedBy) {
        this.id = id;
        this.title = title;
        this.jsonItems = jsonItems;
        this.isActive = isActive;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<JsonItem> getJsonItems() {
        return jsonItems;
    }

    public void setJsonItems(List<JsonItem> jsonItems) {
        this.jsonItems = jsonItems;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    // You can add additional methods or constructors as needed
}

class JsonItem {
    private int id;
    private String title;
    private List<JsonItem> jsonItems;

    // Constructors
    public JsonItem() {
    }

    public JsonItem(int id, String title, List<JsonItem> jsonItems) {
        this.id = id;
        this.title = title;
        this.jsonItems = jsonItems;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<JsonItem> getJsonItems() {
        return jsonItems;
    }

    public void setJsonItems(List<JsonItem> jsonItems) {
        this.jsonItems = jsonItems;
    }

    // You can add additional methods or constructors as needed
}

