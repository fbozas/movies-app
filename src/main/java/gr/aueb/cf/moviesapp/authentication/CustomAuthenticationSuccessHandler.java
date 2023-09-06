package gr.aueb.cf.moviesapp.authentication;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    public static String REDIRECT_URL = "REDIRECT_URL";

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException{

        Object redirectUrlObject = request.getSession().getAttribute("REDIRECT_URL");

        if(redirectUrlObject != null){
            setDefaultTargetUrl(redirectUrlObject.toString());
        }else {
            setDefaultTargetUrl("/search");
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
