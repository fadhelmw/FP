package id.fadhelmw.fp.data

import retrofit2.http.GET

interface MovieApiService {
    @GET("authentication")
    suspend fun getAuthentication(): AuthenticationResponse
}