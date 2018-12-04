package ixeb.sample.domain.indi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ITGROUP")
public class UserFile implements Serializable {
    @Id
    @Column(name = "USER_ID", length = 10)
    private String userId;          // 사용자 ID
    @Column(name = "USER_PW", length = 16)
    private String userPassword;    // 사용자 비밀번호
    @Column(name = "USER_NM", length = 30)
    private String userName;        // 사용자 이름
    @Column(name = "CST_NBR", length = 10)
    private String customerNumber;  // 사업자 등록번호
    @Column(name = "CST_NM", length = 30)
    private String customerName;    // 사업자 명
    @Column(name = "CST_CLS")
    private String customerClass;   // 사용자 분류 - G: 그룹
    @Column(name = "TEAM_NM", length = 30)
    private String teamName;        // 부서(팀) 명
    @Column(name = "EMAIL_ADDR", length = 60)
    private String emailAddress;           // e-mail

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
