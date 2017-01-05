package container;

import java.io.Serializable;

/**
 * Created by pawel on 05.01.17.
 */
public class LoginContainer implements Serializable {
    private String nick;
    private String url;

    public LoginContainer(String nick, String url) {
        this.nick = nick;
        this.url = url;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
