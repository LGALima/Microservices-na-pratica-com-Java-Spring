package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.geom.GeneralPath;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@Getter
@Setter
public class EmailModel implements Serializable {

    private static final long serialVersionUID = -5016739133114082176L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    @Override
    public String toString() {
        return "EmailModel{" +
                "emailId=" + emailId +
                ", userId=" + userId +
                ", emailFrom='" + emailFrom + '\'' +
                ", emailTo='" + emailTo + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", sendDateEmail=" + sendDateEmail +
                ", statusEmail=" + statusEmail +
                '}';
    }
}
