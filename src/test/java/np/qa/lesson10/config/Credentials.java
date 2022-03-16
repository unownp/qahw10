package np.qa.lesson10.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
}