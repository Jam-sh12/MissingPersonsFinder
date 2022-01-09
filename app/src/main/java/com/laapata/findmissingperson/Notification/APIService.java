package com.laapata.findmissingperson.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAwAFpIc4:APA91bFpLXcipBr60Toxmt-ZSb09nhD1O4DXZTfblV0kFHI9daC-l_4HRcs8iQjH_WehvlOvzB0txtWOtDl6Iieohty1DEJvpxsVxXZqvdqeo_xZ5fpDfj-dG5WZ6zmk-4xipk2XEX1U"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
