package com.charuniverse.springconfigproperties.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private String name;
    private Integer version;
    private Boolean productionMode;

}
