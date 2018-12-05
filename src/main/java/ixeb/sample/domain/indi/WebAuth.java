package ixeb.sample.domain.indi;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "WEBAUTH")
public class WebAuth implements Serializable {
    @EmbeddedId
    private WebAuthId id;
    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID")
    private UserFile userFile;
    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "MENU_ID")
    private WebMenu webMenu;

    public WebAuthId getId() {
        return id;
    }

    public void setId(WebAuthId id) {
        this.id = id;
    }

    public UserFile getUserFile() {
        return userFile;
    }

    public void setUserFile(UserFile userFile) {
        this.userFile = userFile;
    }

    public WebMenu getWebMenu() {
        return webMenu;
    }

    public void setWebMenu(WebMenu webMenu) {
        this.webMenu = webMenu;
    }
}
