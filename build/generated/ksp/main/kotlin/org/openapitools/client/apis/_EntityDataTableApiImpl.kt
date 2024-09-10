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
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse
import org.openapitools.client.models.GetEntityDatatableChecksResponse
import org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse
import org.openapitools.client.models.PostEntityDatatableChecksTemplateRequest
import org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse

@OptIn(InternalKtorfitApi::class)
public class _EntityDataTableApiImpl : EntityDataTableApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend
      fun createEntityDatatableCheck(postEntityDatatableChecksTemplateRequest: PostEntityDatatableChecksTemplateRequest):
      PostEntityDatatableChecksTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/entityDatatableChecks")
        }
        setBody(postEntityDatatableChecksTemplateRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse,
        org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun deleteDatatable1(entityDatatableCheckId: Long, body: String?):
      DeleteEntityDatatableChecksTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl +
            "v1/entityDatatableChecks/${"$entityDatatableCheckId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse,
        org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun getTemplate(): GetEntityDatatableChecksTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/entityDatatableChecks/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse,
        org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveAll6(
    status: Long?,
    entity: String?,
    productId: Long?,
    offset: Int?,
    limit: Int?,
  ): List<GetEntityDatatableChecksResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/entityDatatableChecks")
        status?.let{ parameter("status", "$it") }
        entity?.let{ parameter("entity", "$it") }
        productId?.let{ parameter("productId", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetEntityDatatableChecksResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetEntityDatatableChecksResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetEntityDatatableChecksResponse>,
        org.openapitools.client.models.GetEntityDatatableChecksResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createEntityDataTableApi(): EntityDataTableApi =
    this.create(_EntityDataTableApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createEntityDataTableApi) })
