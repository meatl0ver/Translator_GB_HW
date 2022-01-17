package raul.imashev.translator.model.datasourse

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("words/search")
    fun search(@Query("search") wordToSearch: String): Observable<List<RetrofitDataModel>>
}