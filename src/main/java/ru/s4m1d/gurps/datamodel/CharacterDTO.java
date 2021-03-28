package ru.s4m1d.gurps.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CharacterDTO {
    private String characterName;
    private String imageName;
    private String iconName;

    private int strength;
    private int dexterity;
    private int iq;
    private int health;

    public CharacterDTO(){}
}
