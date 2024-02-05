package it.magiavventure.mongo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Story implements Serializable {
    @NotNull
    private UUID id;
    @NotNull
    private String title;
    private String subtitle;
    @NotNull
    private String text;
    @NotNull
    private String author;
    @NotEmpty
    private List<Category> categories;
    @NotEmpty
    private int readTime;
}
