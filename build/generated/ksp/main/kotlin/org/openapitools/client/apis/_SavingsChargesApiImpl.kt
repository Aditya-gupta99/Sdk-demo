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
import org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

@OptIn(InternalKtorfitApi::class)
public class _SavingsChargesApiImpl : SavingsChargesApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun addSavingsAccountCharge(savingsAccountId: Long,
      postSavingsAccountsSavingsAccountIdChargesRequest: PostSavingsAccountsSavingsAccountIdChargesRequest):
      PostSavingsAccountsSavingsAccountIdChargesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges")
        }
        setBody(postSavingsAccountsSavingsAccountIdChargesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse,
        org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse>(_typeData,_ext)!!
  }

  override suspend fun deleteSavingsAccountCharge(savingsAccountId: Long,
      savingsAccountChargeId: Long):
      DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges/${"$savingsAccountChargeId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse,
        org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>(_typeData,_ext)!!
  }

  override suspend fun payOrWaiveSavingsAccountCharge(
    savingsAccountId: Long,
    savingsAccountChargeId: Long,
    postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest,
    command: String?,
  ): PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges/${"$savingsAccountChargeId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse,
        org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveAllSavingsAccountCharges(savingsAccountId: Long,
      chargeStatus: String?): List<GetSavingsAccountsSavingsAccountIdChargesResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges")
        chargeStatus?.let{ parameter("chargeStatus", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse>,
        org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveSavingsAccountCharge(savingsAccountId: Long,
      savingsAccountChargeId: Long):
      GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges/${"$savingsAccountChargeId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse,
        org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate18(savingsAccountId: Long):
      GetSavingsAccountsSavingsAccountIdChargesTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse,
        org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun updateSavingsAccountCharge(
    savingsAccountId: Long,
    savingsAccountChargeId: Long,
    putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest,
  ): PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl +
            "v1/savingsaccounts/${"$savingsAccountId".encodeURLPath()}/charges/${"$savingsAccountChargeId".encodeURLPath()}")
        }
        setBody(putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse,
        org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createSavingsChargesApi(): SavingsChargesApi =
    this.create(_SavingsChargesApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createSavingsChargesApi) })
