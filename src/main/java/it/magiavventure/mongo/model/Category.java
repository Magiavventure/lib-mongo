package it.magiavventure.mongo.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @NotNull
    private UUID id;
    @NotNull
    private String name;
    @NotNull
    private String background;

}
