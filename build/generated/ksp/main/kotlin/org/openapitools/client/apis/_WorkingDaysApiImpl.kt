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
import org.openapitools.client.models.GetWorkingDaysResponse
import org.openapitools.client.models.GetWorkingDaysTemplateResponse
import org.openapitools.client.models.PutWorkingDaysRequest
import org.openapitools.client.models.PutWorkingDaysResponse

@OptIn(InternalKtorfitApi::class)
public class _WorkingDaysApiImpl : WorkingDaysApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun retrieveAll17(): List<GetWorkingDaysResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/workingdays")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.GetWorkingDaysResponse>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.GetWorkingDaysResponse>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.GetWorkingDaysResponse>,
        org.openapitools.client.models.GetWorkingDaysResponse>(_typeData,_ext)!!
  }

  override suspend fun template4(): GetWorkingDaysTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/workingdays/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetWorkingDaysTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetWorkingDaysTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetWorkingDaysTemplateResponse,
        org.openapitools.client.models.GetWorkingDaysTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun update8(putWorkingDaysRequest: PutWorkingDaysRequest):
      PutWorkingDaysResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/workingdays")
        }
        setBody(putWorkingDaysRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutWorkingDaysResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutWorkingDaysResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutWorkingDaysResponse,
        org.openapitools.client.models.PutWorkingDaysResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createWorkingDaysApi(): WorkingDaysApi = this.create(_WorkingDaysApiImpl().apply
    { _converter= KtorfitConverterHelper(this@createWorkingDaysApi) })
