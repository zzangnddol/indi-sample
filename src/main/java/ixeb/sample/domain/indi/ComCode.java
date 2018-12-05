package ixeb.sample.domain.indi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "COM_CODE")
public class ComCode implements Serializable {
    @Id
    @Column(name = "GRPCODE", length = 3)
    private String groupCode;   // 상위코드 값, 그룹일 경우에는 000
    @Id
    @Column(name = "STDCODE", length = 30)
    private String standardCode; // 코드 값
    @Column(name = "CODNAME", length = 50)
    private String codeName;    // 코드이름
    @Column(name = "USEYN", length = 1)
    private String useYn = "Y"; // 사용여부
    @Column(name = "PRT_SEQ", length = 3)
    private Integer printSequence = 0;
    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public Integer getPrintSequence() {
        return printSequence;
    }

    public void setPrintSequence(Integer printSequence) {
        this.printSequence = printSequence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
