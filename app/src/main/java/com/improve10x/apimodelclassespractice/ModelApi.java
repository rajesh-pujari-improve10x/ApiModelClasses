package com.improve10x.apimodelclassespractice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelApi {

    public ModelApiService createModelApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ModelApiService modelApiService = retrofit.create(ModelApiService.class);
        return modelApiService;
    }
}
