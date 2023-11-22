package MyJavaProject.DemoJava.Entity.Dto;

import MyJavaProject.DemoJava.Entity.Candidate;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationDto {

    private long id;
    private String personName;
    private String personSurname;
    private String personCompany;
    private String recommendationText;
    private Candidate candidate;

}