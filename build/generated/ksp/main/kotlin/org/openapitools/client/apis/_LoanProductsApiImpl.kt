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
import kotlin.Boolean
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.GetLoanProductsProductIdResponse
import org.openapitools.client.models.GetLoanProductsResponse
import org.openapitools.client.models.GetLoanProductsTemplateResponse
import org.openapitools.client.models.PostLoanProductsRequest
import org.openapitools.client.models.PostLoanProductsResponse
import org.openapitools.client.models.PutLoanProductsProductIdRequest
import org.openapitools.client.models.PutLoanProductsProductIdResponse

@OptIn(InternalKtorfitApi::class)
public class _LoanProductsApiImpl : LoanProductsApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun createLoanProduct(postLoanProductsRequest: PostLoanProductsRequest):
      PostLoanProductsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/loanproducts")
        }
        setBody(postLoanProductsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostLoanProductsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostLoanProductsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostLoanProductsResponse,
        org.openapitools.client.models.PostLoanProductsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveAllLoanProducts(): List<GetLoanProductsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/loanproducts")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetLoanProductsResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetLoanProductsResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetLoanProductsResponse>,
        org.openapitools.client.models.GetLoanProductsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveLoanProductDetails(productId: Long):
      GetLoanProductsProductIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/loanproducts/${"$productId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetLoanProductsProductIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetLoanProductsProductIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetLoanProductsProductIdResponse,
        org.openapitools.client.models.GetLoanProductsProductIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveLoanProductDetails1(externalProductId: String):
      GetLoanProductsProductIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/loanproducts/external-id/${"$externalProductId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetLoanProductsProductIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetLoanProductsProductIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetLoanProductsProductIdResponse,
        org.openapitools.client.models.GetLoanProductsProductIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate11(isProductMixTemplate: Boolean?):
      GetLoanProductsTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/loanproducts/template")
        isProductMixTemplate?.let{ parameter("isProductMixTemplate", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetLoanProductsTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetLoanProductsTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetLoanProductsTemplateResponse,
        org.openapitools.client.models.GetLoanProductsTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun updateLoanProduct(productId: Long,
      putLoanProductsProductIdRequest: PutLoanProductsProductIdRequest):
      PutLoanProductsProductIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/loanproducts/${"$productId".encodeURLPath()}")
        }
        setBody(putLoanProductsProductIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutLoanProductsProductIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutLoanProductsProductIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutLoanProductsProductIdResponse,
        org.openapitools.client.models.PutLoanProductsProductIdResponse>(_typeData,_ext)!!
  }

  override suspend fun updateLoanProduct1(externalProductId: String,
      putLoanProductsProductIdRequest: PutLoanProductsProductIdRequest):
      PutLoanProductsProductIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl +
            "v1/loanproducts/external-id/${"$externalProductId".encodeURLPath()}")
        }
        setBody(putLoanProductsProductIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutLoanProductsProductIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutLoanProductsProductIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutLoanProductsProductIdResponse,
        org.openapitools.client.models.PutLoanProductsProductIdResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createLoanProductsApi(): LoanProductsApi =
    this.create(_LoanProductsApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createLoanProductsApi) })
