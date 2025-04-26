package models;

public class Property {
    private int propertyID;
    private String description;
    private int propertyOwnerID; //foreign key

    public Property(int propertyID, String description, int propertyOwnerID) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerID = propertyOwnerID;
    }

    public Property() {}

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPropertyOwnerID() {
        return propertyOwnerID;
    }

    public void setPropertyOwnerID(int propertyOwnerID) {
        this.propertyOwnerID = propertyOwnerID;
    }
}
