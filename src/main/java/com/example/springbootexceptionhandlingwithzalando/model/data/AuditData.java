package com.example.springbootexceptionhandlingwithzalando.model.data;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AuditData {

    @CreatedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    Date createdDate;

    @LastModifiedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    Date lastMaintenanceDate;
}
