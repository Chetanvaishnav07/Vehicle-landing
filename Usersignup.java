
package hib.dto;


public class Usersignup {
      private String userId;
    private String name;
    private String pass;
    private int contactNo;
    private Long addharNo;
    private String email;
    private String address;
    public Usersignup() {
    }
    public Usersignup(String userId, String name, String pass, int contactNo, Long addharNo, String email, String address) {
        this.userId = userId;
        this.name = name;
        this.pass = pass;
        this.contactNo = contactNo;
        this.addharNo = addharNo;
        this.email = email;
        this.address = address;
    }



    public Usersignup(String userId, String name, String pass, int contactNo, int addharNo, String email, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usersignup(String userId, String name, int contactNo, int addharNo, String email, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usersignup(String userId, String name, int contactNo, long addharNo, String email, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
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

    /**
     * @return the addharNo
     */
    public Long getAddharNo() {
        return addharNo;
    }

    /**
     * @param addharNo the addharNo to set
     */
    public void setAddharNo(Long addharNo) {
        this.addharNo = addharNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    public void setPassword(String newPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}