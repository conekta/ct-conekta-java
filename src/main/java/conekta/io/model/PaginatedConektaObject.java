package conekta.io.model;

import lombok.Data;

import java.util.List;

@Data
public class PaginatedConektaObject<T> {

    private List<T> data;
    private boolean hasMore;
    private int total;
    private String object;

}