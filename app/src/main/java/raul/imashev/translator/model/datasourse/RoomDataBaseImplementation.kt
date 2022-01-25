package raul.imashev.translator.model.datasourse

import raul.imashev.translator.model.data.DataModel

class RoomDataBaseImplementation : DataSource<List<DataModel>> {
    override suspend fun getData(word: String): List<DataModel> {
        TODO("not implemented")
    }
}
