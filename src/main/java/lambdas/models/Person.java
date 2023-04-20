package lambdas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String address;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private Sex sex;
    private String telephoneNumber;
    private String mobileTelephoneNumber;
    private LocalDate dateOfBirth;
    private Integer age;
    private String company;
    private String companyEmail;
    private String nationalIdentityCardNumber;
    private String nationalIdentificationNumber;
    private String passportNumber;
    private String nationality;

}
