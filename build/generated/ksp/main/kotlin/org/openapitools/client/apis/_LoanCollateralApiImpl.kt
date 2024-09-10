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
import org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse
import org.openapitools.client.models.GetLoansLoanIdCollateralsResponse
import org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse
import org.openapitools.client.models.PostLoansLoanIdCollateralsRequest
import org.openapitools.client.models.PostLoansLoanIdCollateralsResponse
import org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse
import org.openapitools.client.models.PutLoansLoandIdCollateralsCollateralIdRequest

@OptIn(InternalKtorfitApi::class)
public class _LoanCollateralApiImpl : LoanCollateralApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun createCollateral(loanId: Long,
      postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest):
      PostLoansLoanIdCollateralsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/loans/${"$loanId".encodeURLPath()}/collaterals")
        }
        setBody(postLoansLoanIdCollateralsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostLoansLoanIdCollateralsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostLoansLoanIdCollateralsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostLoansLoanIdCollateralsResponse,
        org.openapitools.client.models.PostLoansLoanIdCollateralsResponse>(_typeData,_ext)!!
  }

  override suspend fun deleteCollateral(loanId: Long, collateralId: Long):
      DeleteLoansLoanIdCollateralsCollateralIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl +
            "v1/loans/${"$loanId".encodeURLPath()}/collaterals/${"$collateralId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse,
        org.openapitools.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse>(_typeData,_ext)!!
  }

  override suspend fun newCollateralTemplate(loanId: Long):
      GetLoansLoanIdCollateralsTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/loans/${"$loanId".encodeURLPath()}/collaterals/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse,
        org.openapitools.client.models.GetLoansLoanIdCollateralsTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveCollateralDetails(loanId: Long):
      List<GetLoansLoanIdCollateralsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/loans/${"$loanId".encodeURLPath()}/collaterals")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>,
        org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveCollateralDetails1(loanId: Long, collateralId: Long):
      GetLoansLoanIdCollateralsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/loans/${"$loanId".encodeURLPath()}/collaterals/${"$collateralId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetLoansLoanIdCollateralsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetLoansLoanIdCollateralsResponse,
        org.openapitools.client.models.GetLoansLoanIdCollateralsResponse>(_typeData,_ext)!!
  }

  override suspend fun updateCollateral(
    loanId: Long,
    collateralId: Long,
    putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest,
  ): PutLoansLoanIdCollateralsCollateralIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl +
            "v1/loans/${"$loanId".encodeURLPath()}/collaterals/${"$collateralId".encodeURLPath()}")
        }
        setBody(putLoansLoandIdCollateralsCollateralIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse",
    typeInfo =
        typeInfo<org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse,
        org.openapitools.client.models.PutLoansLoanIdCollateralsCollateralIdResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createLoanCollateralApi(): LoanCollateralApi =
    this.create(_LoanCollateralApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createLoanCollateralApi) })
