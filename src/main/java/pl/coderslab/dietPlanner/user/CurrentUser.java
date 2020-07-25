package pl.coderslab.dietPlanner.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import java.util.Collection;


public class CurrentUser extends User {
	private final pl.coderslab.dietPlanner.user.User user;
	public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
					   pl.coderslab.dietPlanner.user.User user) {
            super(username, password, authorities);
            this.user = user;
	}
	public pl.coderslab.dietPlanner.user.User getUser() {return user;}
}