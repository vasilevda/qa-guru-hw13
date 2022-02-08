package com.severstal.helpers;

import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {
    @Key("https.server.host")
    @DefaultValue("https://${server.host.login}:${server.host.password}@selenoid.autotests.cloud/wd/hub")
    String hostname();

    @Key("server.host.login")
    @DefaultValue("user1")
    String login();

    @Key("server.host.password")
    @DefaultValue("1234")
    String password();
}
