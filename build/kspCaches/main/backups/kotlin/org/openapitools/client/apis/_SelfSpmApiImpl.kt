// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.OptIn
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.SurveyData

@OptIn(InternalKtorfitApi::class)
public class _SelfSpmApiImpl(
  private val _ktorfit: Ktorfit,
) : SelfSpmApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun fetchAllSurveys(): List<SurveyData> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/surveys")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<SurveyData>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _SelfSpmApiProvider : ClassProvider<SelfSpmApi> {
  override fun create(_ktorfit: Ktorfit): SelfSpmApi = _SelfSpmApiImpl(_ktorfit)
}

public fun Ktorfit.createSelfSpmApi(): SelfSpmApi = _SelfSpmApiImpl(this)
