package com.sibil.location;

import com.sibil.location.api.resources.LocationsResources;
import com.sibil.location.business.services.LocationService;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class LocationApplication extends Application<LocationConfiguration> {
    @Override
    public void run(LocationConfiguration configuration, Environment environment) throws Exception {
        final DBIFactory dbiFactory=new DBIFactory();
        final DBI dbi = dbiFactory.build(environment,configuration.getDataSourceFactory(),"mysql");
    environment.jersey().register(new LocationsResources(new LocationService()));
    }
    public static void main(String ...args) throws Exception{
        new LocationApplication().run(args);
    }
}
