package conekta.io.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import conekta.io.config.CustomNextPageUrl;
import lombok.Data;

import java.util.List;

@Data
public class PaginatedConektaObject<T> {

    @JsonSerialize(using = CustomNextPageUrl.class)
    private String nextPageUrl;
    private boolean hasMore;
    private int total;
    private String object;
    private List<T> data;

}