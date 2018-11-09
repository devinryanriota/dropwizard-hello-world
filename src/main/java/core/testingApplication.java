package core;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import core.resources.HelloWorldResource;

public class testingApplication extends Application<testingConfiguration> {

    public static void main(final String[] args) throws Exception {
        new testingApplication().run(args);
    }

    @Override
    public String getName() {
        return "testing";
    }

    @Override
    public void initialize(final Bootstrap<testingConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final testingConfiguration configuration,
                    final Environment environment) {
    final HelloWorldResource resource = new HelloWorldResource(
        configuration.getTemplate(),
        configuration.getDefaultName()
    );
    environment.jersey().register(resource);
    }

}
