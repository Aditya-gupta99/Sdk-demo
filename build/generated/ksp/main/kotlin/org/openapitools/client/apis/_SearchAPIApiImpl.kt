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
import kotlin.Boolean
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.GetSearchResponse
import org.openapitools.client.models.PostAdhocQuerySearchRequest
import org.openapitools.client.models.PostAdhocQuerySearchResponse

@OptIn(InternalKtorfitApi::class)
public class _SearchAPIApiImpl(
  private val _ktorfit: Ktorfit,
) : SearchAPIApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun advancedSearch(postAdhocQuerySearchRequest: PostAdhocQuerySearchRequest):
      List<PostAdhocQuerySearchResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/search/advance")
        }
        setBody(postAdhocQuerySearchRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<PostAdhocQuerySearchResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAdHocSearchQueryTemplate(): GetSearchResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/search/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetSearchResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun searchData(
    query: String?,
    resource: String?,
    exactMatch: Boolean?,
  ): List<GetSearchResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/search")
        query?.let{ parameter("query", "$it") }
        resource?.let{ parameter("resource", "$it") }
        exactMatch?.let{ parameter("exactMatch", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetSearchResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _SearchAPIApiProvider : ClassProvider<SearchAPIApi> {
  override fun create(_ktorfit: Ktorfit): SearchAPIApi = _SearchAPIApiImpl(_ktorfit)
}

public fun Ktorfit.createSearchAPIApi(): SearchAPIApi = _SearchAPIApiImpl(this)
