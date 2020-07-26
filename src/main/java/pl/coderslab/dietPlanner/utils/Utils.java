package pl.coderslab.dietPlanner.utils;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;
import pl.coderslab.dietPlanner.user.CurrentUser;

@Service
public class Utils {

    public String currentUser (@AuthenticationPrincipal CurrentUser customUser) {
        String currentUser = "-1";
        if (customUser != null) {
            currentUser = customUser.getUser().getFullname();
        }
        return currentUser;
    }
}
