package in.lr.base.api;


import in.lr.base.api.response.statewise.StateWiseResponse;
import io.reactivex.Single;
import retrofit2.http.GET;

public  interface BaseRouter {


    @GET("/data.json")
    public Single<StateWiseResponse> getSateWise();
}
