package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    private final String description;

    HOME(description: "Home"),
    MOBILE(description: "Mobile"),
    COMMERCIAL(description: "Commercial");
}