package conekta.io.model;

import java.net.http.HttpResponse;

public interface ConektaModel {

    public HttpResponse get();
    public HttpResponse post();
    public HttpResponse update();
    public HttpResponse find();
    public HttpResponse delete();

}
