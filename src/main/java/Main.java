import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Main {
    private static RequestConfig requestConfig;

    public Main() {
        requestConfig = RequestConfig.custom().build();
    }


    private HttpResponse getData(String url) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        HttpGet request = new HttpGet(url);
        return httpClient.execute(request);
    }

    public String sendRequest(String uri) {

        HttpResponse response;
        try {
            response = getData(uri);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        String access_token="access_token=";
        String start="https://api.vk.com/method/friends.get?user_id=139044814&";
        String itog=start+access_token+"&v=5.131";

        System.out.println(itog);

        String response = new Main().sendRequest(itog);
        System.out.println(response);

    }
}