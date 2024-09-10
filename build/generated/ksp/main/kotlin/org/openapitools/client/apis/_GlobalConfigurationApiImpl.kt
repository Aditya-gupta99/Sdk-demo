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
import org.openapitools.client.models.GetGlobalConfigurationsResponse
import org.openapitools.client.models.GlobalConfigurationPropertyData
import org.openapitools.client.models.PutGlobalConfigurationsRequest
import org.openapitools.client.models.PutGlobalConfigurationsResponse

@OptIn(InternalKtorfitApi::class)
public class _GlobalConfigurationApiImpl : GlobalConfigurationApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun retrieveConfiguration(survey: Boolean?): GetGlobalConfigurationsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/configurations")
        survey?.let{ parameter("survey", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetGlobalConfigurationsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetGlobalConfigurationsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetGlobalConfigurationsResponse,
        org.openapitools.client.models.GetGlobalConfigurationsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveOne3(configId: Long): GetGlobalConfigurationsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/configurations/${"$configId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetGlobalConfigurationsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetGlobalConfigurationsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetGlobalConfigurationsResponse,
        org.openapitools.client.models.GetGlobalConfigurationsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveOneByName(name: String): GlobalConfigurationPropertyData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/configurations/name/${"$name".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GlobalConfigurationPropertyData",
    typeInfo = typeInfo<org.openapitools.client.models.GlobalConfigurationPropertyData>())

    return _converter.suspendRequest<org.openapitools.client.models.GlobalConfigurationPropertyData,
        org.openapitools.client.models.GlobalConfigurationPropertyData>(_typeData,_ext)!!
  }

  override suspend fun updateConfiguration1(configId: Long,
      putGlobalConfigurationsRequest: PutGlobalConfigurationsRequest):
      PutGlobalConfigurationsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/configurations/${"$configId".encodeURLPath()}")
        }
        setBody(putGlobalConfigurationsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutGlobalConfigurationsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutGlobalConfigurationsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutGlobalConfigurationsResponse,
        org.openapitools.client.models.PutGlobalConfigurationsResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createGlobalConfigurationApi(): GlobalConfigurationApi =
    this.create(_GlobalConfigurationApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createGlobalConfigurationApi) })
