package com.resteasy.config;

import com.resteasy.controller.LibraryController;
import com.resteasy.controller.MovieCrudController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class RestEasyAppConfig extends Application {

    private Set<Object> singletons = new HashSet<>();

    public RestEasyAppConfig() {
        singletons.add(new MovieCrudController());
        singletons.add(new LibraryController());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
