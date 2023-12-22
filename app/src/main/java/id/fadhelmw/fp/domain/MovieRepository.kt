package id.fadhelmw.fp.domain

import id.fadhelmw.fp.data.AuthenticationResponse
import id.fadhelmw.fp.data.Movie

interface MovieRepository {
    suspend fun getAuthentication(): AuthenticationResponse
}
