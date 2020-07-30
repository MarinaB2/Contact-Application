public class People {
public String fullName;
public String address;
public String mobileNumber;
public String workNumber;
public String dateOfBirth;

public People(String fullName, String address, String mobileNumber, String workNumber, String dateOfBirth){
    this.fullName = fullName;
    this.address = address;
    this.mobileNumber = mobileNumber;
    this.workNumber = workNumber;
    this.dateOfBirth= dateOfBirth;
}

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getWorkNumber() {
       return workNumber;
    }
}
