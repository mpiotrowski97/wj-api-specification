package pl.michalpiotrowski.wjapispecification.dto.exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDto {
    private UUID id;
    private String name;
    private String description;
    private String category;
    private String type;
    private String videoUrl;
}
