
package hib.dto;

public class LenderVehicle{
  private String userId;
private String vehicleNO;
private String name;
private String vehicleModel;
private String rent;
private String condition;
private String selfstart;
private String vehicleType;
private String fuelType;
private String address;
private int pin;
private int contactNo;

    public LenderVehicle() {
    }

    public LenderVehicle(String userId, String vehicleNO, String name, String vehicleModel, String rent, String condition, String selfstart, String vehicleType, String fuelType, String address, int pin, int contactNo) {
        this.userId = userId;
        this.vehicleNO = vehicleNO;
        this.name = name;
        this.vehicleModel = vehicleModel;
        this.rent = rent;
        this.condition = condition;
        this.selfstart = selfstart;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.address = address;
        this.pin = pin;
        this.contactNo = contactNo;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the vehicleNO
     */
    public String getVehicleNO() {
        return vehicleNO;
    }

    /**
     * @param vehicleNO the vehicleNO to set
     */
    public void setVehicleNO(String vehicleNO) {
        this.vehicleNO = vehicleNO;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicleModel
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel the vehicleModel to set
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return the rent
     */
    public String getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    /**
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * @return the selfstart
     */
    public String getSelfstart() {
        return selfstart;
    }

    /**
     * @param selfstart the selfstart to set
     */
    public void setSelfstart(String selfstart) {
        this.selfstart = selfstart;
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return the contactNo
     */
    public int getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
    

}