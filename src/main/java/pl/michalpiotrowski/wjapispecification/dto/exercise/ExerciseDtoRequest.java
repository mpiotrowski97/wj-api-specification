package pl.michalpiotrowski.wjapispecification.dto.exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDtoRequest {

    @NotNull
    private String name;

    private String description;

    @NotNull
    private String category;

    @NotNull
    private String type;

    private String videoUrl;
}
