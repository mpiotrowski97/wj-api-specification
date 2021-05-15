package pl.michalpiotrowski.wjapispecification.dto.trainingplan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingPlanDtoRequest {

    @NotNull
    private String name;

    private String description;

    @NotNull
    private Collection<TrainingPlanDayDtoRequest> days;
}
