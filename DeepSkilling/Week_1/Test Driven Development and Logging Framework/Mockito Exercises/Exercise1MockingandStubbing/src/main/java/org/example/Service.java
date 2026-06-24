package org.example;
public class Service {
    private ExternalApi externalApi;
    public Service(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public String fetchData() {
        return externalApi.getData();
    }
}