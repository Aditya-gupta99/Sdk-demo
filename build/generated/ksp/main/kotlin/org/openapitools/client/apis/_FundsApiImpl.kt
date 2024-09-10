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
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.GetFundsResponse
import org.openapitools.client.models.PostFundsRequest
import org.openapitools.client.models.PostFundsResponse
import org.openapitools.client.models.PutFundsFundIdRequest
import org.openapitools.client.models.PutFundsFundIdResponse

@OptIn(InternalKtorfitApi::class)
public class _FundsApiImpl : FundsApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun createFund(postFundsRequest: PostFundsRequest): PostFundsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/funds")
        }
        setBody(postFundsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostFundsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostFundsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostFundsResponse,
        org.openapitools.client.models.PostFundsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveFund(fundId: Long): GetFundsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/funds/${"$fundId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetFundsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetFundsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetFundsResponse,
        org.openapitools.client.models.GetFundsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveFunds(): List<GetFundsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/funds")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.collections.List<org.openapitools.client.models.GetFundsResponse>",
    typeInfo = typeInfo<kotlin.collections.List<org.openapitools.client.models.GetFundsResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetFundsResponse>,
        org.openapitools.client.models.GetFundsResponse>(_typeData,_ext)!!
  }

  override suspend fun updateFund(fundId: Long, putFundsFundIdRequest: PutFundsFundIdRequest):
      PutFundsFundIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/funds/${"$fundId".encodeURLPath()}")
        }
        setBody(putFundsFundIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutFundsFundIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutFundsFundIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutFundsFundIdResponse,
        org.openapitools.client.models.PutFundsFundIdResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createFundsApi(): FundsApi = this.create(_FundsApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createFundsApi) })
