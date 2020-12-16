package com.example.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.model.naming.NamingStrategies;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.ALWAYS)
@MappedEntity(namingStrategy = NamingStrategies.Raw.class)
public class CustomAttributeConfig
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @NotEmpty
    private String entityName;

    @NotEmpty
    private String attributeName;

    private String attributeDisplayName;

    private String uiAttributeType;

    private String attributeValue;
}
