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
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.DeleteProvisioningCriteriaResponse
import org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse
import org.openapitools.client.models.GetProvisioningCriteriaResponse
import org.openapitools.client.models.PostProvisioningCriteriaRequest
import org.openapitools.client.models.PostProvisioningCriteriaResponse
import org.openapitools.client.models.PutProvisioningCriteriaRequest
import org.openapitools.client.models.PutProvisioningCriteriaResponse

@OptIn(InternalKtorfitApi::class)
public class _ProvisioningCriteriaApiImpl : ProvisioningCriteriaApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend
      fun createProvisioningCriteria(postProvisioningCriteriaRequest: PostProvisioningCriteriaRequest):
      PostProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria")
        }
        setBody(postProvisioningCriteriaRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostProvisioningCriteriaResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostProvisioningCriteriaResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostProvisioningCriteriaResponse,
        org.openapitools.client.models.PostProvisioningCriteriaResponse>(_typeData,_ext)!!
  }

  override suspend fun deleteProvisioningCriteria(criteriaId: Long):
      DeleteProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.DeleteProvisioningCriteriaResponse",
    typeInfo = typeInfo<org.openapitools.client.models.DeleteProvisioningCriteriaResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.DeleteProvisioningCriteriaResponse,
        org.openapitools.client.models.DeleteProvisioningCriteriaResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveAllProvisioningCriterias(): List<GetProvisioningCriteriaResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetProvisioningCriteriaResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetProvisioningCriteriaResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetProvisioningCriteriaResponse>,
        org.openapitools.client.models.GetProvisioningCriteriaResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveProvisioningCriteria(criteriaId: Long):
      GetProvisioningCriteriaCriteriaIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse,
        org.openapitools.client.models.GetProvisioningCriteriaCriteriaIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate3(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun updateProvisioningCriteria(criteriaId: Long,
      putProvisioningCriteriaRequest: PutProvisioningCriteriaRequest):
      PutProvisioningCriteriaResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningcriteria/${"$criteriaId".encodeURLPath()}")
        }
        setBody(putProvisioningCriteriaRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutProvisioningCriteriaResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutProvisioningCriteriaResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutProvisioningCriteriaResponse,
        org.openapitools.client.models.PutProvisioningCriteriaResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createProvisioningCriteriaApi(): ProvisioningCriteriaApi =
    this.create(_ProvisioningCriteriaApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createProvisioningCriteriaApi) })
