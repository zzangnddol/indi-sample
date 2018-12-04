package ixeb.sample.domain.indi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "WEBMENU")
public class WebMenu implements Serializable {
    @Id
    @Column(name = "MENU_ID", length = 10)
    private String menuId;  // 메뉴(프로그램)ID
    @Column(name = "MENU_BM", length = 50)
    private String menuBm;  // 메뉴(프로그램)명
    @Column(name = "MENU_TYPE", length = 1)
    private String menuType;    // 메뉴 타입 - 0: 시스템코드, 1: 분류코드, 기타: 프로그램
    @Column(name = "PRT_SEQ", length = 4)
    private String printSequence; // 순서값
    @Column(name = "USEYN", length = 1)
    private String useYn = "Y";
    @ManyToOne
    @JoinColumn(name = "UP_MENU_ID")
    private WebMenu parent; // 상위 메뉴

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuBm() {
        return menuBm;
    }

    public void setMenuBm(String menuBm) {
        this.menuBm = menuBm;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getPrintSequence() {
        return printSequence;
    }

    public void setPrintSequence(String printSequence) {
        this.printSequence = printSequence;
    }

    public WebMenu getParent() {
        return parent;
    }

    public void setParent(WebMenu parent) {
        this.parent = parent;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
}
