package com.proofpoint.document;

import com.proofpoint.enums.DocumentType;
import com.proofpoint.enums.DocumentTypeCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Document(collection = "news")
public class News implements Serializable {

    @Id
    private String id;

    @Field
    private DocumentType type;

    @Field
    private DocumentTypeCategory category;

    @Field
    private String title;

    @Field
    private String description;

    @Field
    private String content;

    @Field
    private String author;

    private Transaction transaction;
}
