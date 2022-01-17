package raul.imashev.translator.model.datasourse

import io.reactivex.Observable
import raul.imashev.translator.model.data.RetrofitDataModel

class RoomDataBaseImplementation : DataSource<List<RetrofitDataModel>> {
    override fun getData(word: String): Observable<List<RetrofitDataModel>> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.
    }
}