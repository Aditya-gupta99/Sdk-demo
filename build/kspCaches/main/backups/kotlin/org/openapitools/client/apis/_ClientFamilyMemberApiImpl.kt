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
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress

@OptIn(InternalKtorfitApi::class)
public class _ClientFamilyMemberApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientFamilyMemberApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun addClientFamilyMembers(clientId: Long, body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/familymembers")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteClientFamilyMembers(
    familyMemberId: Long,
    clientId: Long,
    body: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/familymembers/${"$familyMemberId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getFamilyMember(familyMemberId: Long, clientId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/familymembers/${"$familyMemberId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getFamilyMembers(clientId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/familymembers")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getTemplate2(clientId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/familymembers/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateClientFamilyMembers(
    familyMemberId: Long,
    clientId: Long,
    body: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/familymembers/${"$familyMemberId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientFamilyMemberApiProvider : ClassProvider<ClientFamilyMemberApi> {
  override fun create(_ktorfit: Ktorfit): ClientFamilyMemberApi =
      _ClientFamilyMemberApiImpl(_ktorfit)
}

public fun Ktorfit.createClientFamilyMemberApi(): ClientFamilyMemberApi =
    _ClientFamilyMemberApiImpl(this)
