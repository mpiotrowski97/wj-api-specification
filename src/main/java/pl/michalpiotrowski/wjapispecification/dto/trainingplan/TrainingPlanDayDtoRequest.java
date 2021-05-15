package pl.michalpiotrowski.wjapispecification.dto.trainingplan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainingPlanDayDtoRequest {
    @NotNull
    private Collection<String> exercisesIds;
}
