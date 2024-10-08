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
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import org.openapitools.client.models.DeleteClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.GetClientsChargesPageItems
import org.openapitools.client.models.GetClientsClientIdChargesResponse
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdRequest
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.PostClientsClientIdChargesRequest
import org.openapitools.client.models.PostClientsClientIdChargesResponse

@OptIn(InternalKtorfitApi::class)
public class _ClientChargesApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientChargesApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun applyClientCharge(clientId: Long,
      postClientsClientIdChargesRequest: PostClientsClientIdChargesRequest):
      PostClientsClientIdChargesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/charges")
        }
        setBody(postClientsClientIdChargesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdChargesResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteClientCharge(clientId: Long, chargeId: Long):
      DeleteClientsClientIdChargesChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/charges/${"$chargeId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteClientsClientIdChargesChargeIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun payOrWaiveClientCharge(
    clientId: Long,
    chargeId: Long,
    postClientsClientIdChargesChargeIdRequest: PostClientsClientIdChargesChargeIdRequest,
    command: String?,
  ): PostClientsClientIdChargesChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/charges/${"$chargeId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postClientsClientIdChargesChargeIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdChargesChargeIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllClientCharges(
    clientId: Long,
    chargeStatus: String?,
    pendingPayment: Boolean?,
    limit: Int?,
    offset: Int?,
  ): GetClientsClientIdChargesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/charges")
        chargeStatus?.let{ parameter("chargeStatus", "$it") }
        pendingPayment?.let{ parameter("pendingPayment", "$it") }
        limit?.let{ parameter("limit", "$it") }
        offset?.let{ parameter("offset", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdChargesResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveClientCharge(clientId: Long, chargeId: Long):
      GetClientsChargesPageItems {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/charges/${"$chargeId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsChargesPageItems>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate4(clientId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/charges/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientChargesApiProvider : ClassProvider<ClientChargesApi> {
  override fun create(_ktorfit: Ktorfit): ClientChargesApi = _ClientChargesApiImpl(_ktorfit)
}

public fun Ktorfit.createClientChargesApi(): ClientChargesApi = _ClientChargesApiImpl(this)
