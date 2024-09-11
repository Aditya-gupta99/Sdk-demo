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
import kotlin.Any
import kotlin.Long
import kotlin.OptIn
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.DeleteClientCollateralResponse
import org.openapitools.client.models.GetLoanCollateralManagementTemplate
import org.openapitools.client.models.PostClientCollateralRequest
import org.openapitools.client.models.PostClientCollateralResponse
import org.openapitools.client.models.PutClientCollateralRequest
import org.openapitools.client.models.PutClientCollateralResponse

@OptIn(InternalKtorfitApi::class)
public class _ClientCollateralManagementApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientCollateralManagementApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun addCollateral(clientId: Long,
      postClientCollateralRequest: PostClientCollateralRequest): PostClientCollateralResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/collaterals")
        }
        setBody(postClientCollateralRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientCollateralResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteCollateral1(clientId: Long, collateralId: Long):
      DeleteClientCollateralResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/collaterals/${"$collateralId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteClientCollateralResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getClientCollateral(clientId: Long, prodId: Long?): List<Any> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/collaterals")
        prodId?.let{ parameter("prodId", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<Any>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getClientCollateralData(clientId: Long, clientCollateralId: Long): Any {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/collaterals/${"$clientCollateralId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Any>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getClientCollateralTemplate(clientId: Long):
      List<GetLoanCollateralManagementTemplate> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/collaterals/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetLoanCollateralManagementTemplate>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateCollateral1(
    clientId: Long,
    collateralId: Long,
    putClientCollateralRequest: PutClientCollateralRequest,
  ): PutClientCollateralResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/collaterals/${"$collateralId".encodeURLPath()}")
        }
        setBody(putClientCollateralRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutClientCollateralResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientCollateralManagementApiProvider : ClassProvider<ClientCollateralManagementApi> {
  override fun create(_ktorfit: Ktorfit): ClientCollateralManagementApi =
      _ClientCollateralManagementApiImpl(_ktorfit)
}

public fun Ktorfit.createClientCollateralManagementApi(): ClientCollateralManagementApi =
    _ClientCollateralManagementApiImpl(this)
