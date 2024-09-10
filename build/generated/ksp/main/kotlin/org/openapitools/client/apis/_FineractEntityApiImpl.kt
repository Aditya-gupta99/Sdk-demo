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

@OptIn(InternalKtorfitApi::class)
public class _FineractEntityApiImpl : FineractEntityApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun createMap(relId: Long, body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/entitytoentitymapping/${"$relId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun delete4(mapId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl + "v1/entitytoentitymapping/${"$mapId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun getEntityToEntityMappings(
    mapId: Long,
    fromId: Long,
    toId: Long,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/entitytoentitymapping/${"$mapId".encodeURLPath()}/${"$fromId".encodeURLPath()}/${"$toId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun retrieveAll7(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/entitytoentitymapping")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun retrieveOne4(mapId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/entitytoentitymapping/${"$mapId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun updateMap(mapId: Long, body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/entitytoentitymapping/${"$mapId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createFineractEntityApi(): FineractEntityApi =
    this.create(_FineractEntityApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createFineractEntityApi) })
