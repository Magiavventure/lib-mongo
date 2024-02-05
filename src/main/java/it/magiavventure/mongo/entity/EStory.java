package it.magiavventure.mongo.entity;

import it.magiavventure.mongo.model.Category;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "story")
public class EStory implements Serializable {
    @Id
    private UUID id;
    @NotNull
    @Indexed
    private String title;
    private String subtitle;
    @NotNull
    private String text;
    @NotNull
    @Indexed
    private String author;
    @NotEmpty
    @Indexed
    private List<Category> categories;
    private boolean active;
    private boolean verified;
    @CreatedDate
    @Field("created_date")
    private LocalDateTime createdDate;
    @LastModifiedDate
    @Field("last_modified_date")
    private LocalDateTime lastModifiedDate;
    @Version
    private Long version;
}
