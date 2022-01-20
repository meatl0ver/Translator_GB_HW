package raul.imashev.translator.model.data

import com.google.gson.annotations.SerializedName

class RetrofitDataModel(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<Meanings>?
)
