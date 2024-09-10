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
import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.GetExternalEventConfigurationsResponse
import org.openapitools.client.models.PutExternalEventConfigurationsRequest

@OptIn(InternalKtorfitApi::class)
public class _ExternalEventConfigurationApiImpl : ExternalEventConfigurationApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun retrieveExternalEventConfiguration():
      GetExternalEventConfigurationsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/externalevents/configuration")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetExternalEventConfigurationsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetExternalEventConfigurationsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetExternalEventConfigurationsResponse,
        org.openapitools.client.models.GetExternalEventConfigurationsResponse>(_typeData,_ext)!!
  }

  override suspend
      fun updateExternalEventConfigurationsDetails(putExternalEventConfigurationsRequest: PutExternalEventConfigurationsRequest):
      CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/externalevents/configuration")
        }
        setBody(putExternalEventConfigurationsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.CommandProcessingResult",
    typeInfo = typeInfo<org.openapitools.client.models.CommandProcessingResult>())

    return _converter.suspendRequest<org.openapitools.client.models.CommandProcessingResult,
        org.openapitools.client.models.CommandProcessingResult>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createExternalEventConfigurationApi(): ExternalEventConfigurationApi =
    this.create(_ExternalEventConfigurationApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createExternalEventConfigurationApi) })
