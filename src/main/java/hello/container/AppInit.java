package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit {
    void onStarUp(ServletContext servletContext);
}
