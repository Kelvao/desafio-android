package app.kelvao.javapop.domain.network.service

import app.kelvao.javapop.domain.network.response.PullRequestsResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface PullRequestsRestService {

    @GET("repos/{creator}/{repository}/pulls")
    fun getPullRequestsRepositories(
        @Path("creator") creator: String,
        @Path("repository") repository: String
    ): Observable<PullRequestsResponse>
}