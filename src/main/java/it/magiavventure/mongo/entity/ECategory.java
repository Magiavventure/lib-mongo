package it.magiavventure.mongo.entity;

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
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "category")
public class ECategory implements Serializable {
    @Id
    private UUID id;
    @NotNull
    @Indexed(unique = true)
    private String name;
    @NotNull
    private String background;
    private boolean active;
    @CreatedDate
    @Field("created_date")
    private LocalDateTime createdDate;
    @LastModifiedDate
    @Field("last_modified_date")
    private LocalDateTime lastModifiedDate;
    @Version
    private Long version;

}
