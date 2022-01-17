package raul.imashev.translator.model.datasourse

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel

class DataSourceRemote(private val remoteProvider: RetrofitImplementation = RetrofitImplementation()) :
    DataSource<List<RetrofitDataModel>> {

    override fun getData(word: String): Observable<List<RetrofitDataModel>> = remoteProvider.getData(word)
}
