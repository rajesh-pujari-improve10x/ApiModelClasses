package com.improve10x.apimodelclassespractice;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.improve10x.apimodelclassespractice.model.Shop;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getData() throws IOException {
        ModelApiService modelApiService = new ModelApi().createModelApiService();
        Call<List<Shop>> call = modelApiService.fetchData();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops.get(0).getLineItems().get(0).getTaxLines().get(0)));
    }
}