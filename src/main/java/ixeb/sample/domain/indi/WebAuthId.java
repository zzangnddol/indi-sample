package ixeb.sample.domain.indi;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WebAuthId implements Serializable {
    @Column(name = "USER_ID", length = 10)
    private String userId;
    @Column(name = "MENU_ID", length = 10)
    private String menuId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
