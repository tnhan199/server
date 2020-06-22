package SpringBoot.Converter;

import org.springframework.stereotype.Component;

import SpringBoot.dto.Group;

@Component
public class GroupConverter {
    public Group toDTO(SpringBoot.entity.Group entity) {
        return Group.newBuilder().setId(entity.getId()).setName(entity.getName()).setVersion(entity.getVersion()).build();
    }
}
