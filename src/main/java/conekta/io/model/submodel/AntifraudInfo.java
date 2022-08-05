package conekta.io.model.submodel;

import lombok.Builder;
import lombok.Data;

@Data

public class AntifraudInfo {
    private Long firstPaidAt;
    private Long accountCreatedAt;
}
