package de.uni_passau.studentcourse.person;

public class PersonDtoMapper {
    public static PersonDto toDTO(Person person) {
        PersonDto dto = new PersonDto();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setType(person.getClass().getSimpleName());
        return dto;
    }
}
