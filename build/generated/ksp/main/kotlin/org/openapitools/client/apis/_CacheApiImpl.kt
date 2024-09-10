// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.`internal`.KtorfitInterface
import de.jensklingenberg.ktorfit.`internal`.TypeData
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
import org.openapitools.client.models.GetCachesResponse
import org.openapitools.client.models.PutCachesRequest
import org.openapitools.client.models.PutCachesResponse

@OptIn(InternalKtorfitApi::class)
public class _CacheApiImpl : CacheApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun retrieveAll4(): List<GetCachesResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/caches")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.collections.List<org.openapitools.client.models.GetCachesResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetCachesResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetCachesResponse>,
        org.openapitools.client.models.GetCachesResponse>(_typeData,_ext)!!
  }

  override suspend fun switchCache(putCachesRequest: PutCachesRequest): PutCachesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/caches")
        }
        setBody(putCachesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutCachesResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutCachesResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutCachesResponse,
        org.openapitools.client.models.PutCachesResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createCacheApi(): CacheApi = this.create(_CacheApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createCacheApi) })
