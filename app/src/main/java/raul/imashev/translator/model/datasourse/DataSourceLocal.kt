package raul.imashev.translator.model.datasourse

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel

class DataSourceLocal(private val remoteProvider: RoomDataBaseImplementation = RoomDataBaseImplementation()) :
    DataSource<List<RetrofitDataModel>> {

    override fun getData(word: String): Observable<List<RetrofitDataModel>> = remoteProvider.getData(word)
}