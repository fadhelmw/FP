package id.fadhelmw.fp.data

import id.fadhelmw.fp.domain.MovieRepository

class MovieRepositoryImp(private val movieApiService: MovieApiService) : MovieRepository {
    override suspend fun getAuthentication(): AuthenticationResponse {
        return movieApiService.getAuthentication()
    }
}
