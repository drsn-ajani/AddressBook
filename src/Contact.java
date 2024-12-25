public class Contact {
    public String fname, lname, address, city, state, zip, phNo, email;

    public Contact(String fname, String lname, String address, String city, String state, String zip, String phNo, String email) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phNo = phNo;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Contact{ " +
                "firstName='" + fname + '\'' +
                ", lastName='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phNo + '\'' +
                ", email='" + email + '\'' +
                " }";
    }
}
