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
public class _CreditBureauConfigurationApiImpl : CreditBureauConfigurationApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun addOrganisationCreditBureau(organisationCreditBureauId: Long, body: String?):
      String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/organisationCreditBureau/${"$organisationCreditBureauId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun createCreditBureauConfiguration(creditBureauId: Long, body: String?):
      String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/configuration/${"$creditBureauId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun createCreditBureauLoanProductMapping(organisationCreditBureauId: Long,
      body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/mappings/${"$organisationCreditBureauId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun fetchLoanProducts(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration/loanProduct")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun fetchMappingByLoanProductId(loanProductId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/loanProduct/${"$loanProductId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun getConfiguration(organisationCreditBureauId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/config/${"$organisationCreditBureauId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun getCreditBureau(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun getCreditBureauLoanProductMapping(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration/mappings")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun getOrganisationCreditBureau(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration/organisationCreditBureau")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun updateCreditBureau(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration/organisationCreditBureau")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun updateCreditBureauConfiguration(configurationId: Long, body: String?):
      String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl +
            "v1/CreditBureauConfiguration/configuration/${"$configurationId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun updateCreditBureauLoanProductMapping(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/CreditBureauConfiguration/mappings")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createCreditBureauConfigurationApi(): CreditBureauConfigurationApi =
    this.create(_CreditBureauConfigurationApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createCreditBureauConfigurationApi) })
