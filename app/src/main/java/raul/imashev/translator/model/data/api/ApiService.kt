package raul.imashev.translator.model.data.api

import kotlinx.coroutines.Deferred
import raul.imashev.translator.model.data.DataModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("words/search")
    fun searchAsync(@Query("search") wordToSearch: String): Deferred<List<DataModel>>
}
